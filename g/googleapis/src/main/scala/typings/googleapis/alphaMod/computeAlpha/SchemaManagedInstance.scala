package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Managed Instance resource.
  */
@js.native
trait SchemaManagedInstance extends js.Object {
  /**
    * [Output Only] The current action that the managed instance group has
    * scheduled for the instance. Possible values:  - NONE The instance is
    * running, and the managed instance group does not have any scheduled
    * actions for this instance.  - CREATING The managed instance group is
    * creating this instance. If the group fails to create this instance, it
    * will try again until it is successful.  - CREATING_WITHOUT_RETRIES The
    * managed instance group is attempting to create this instance only once.
    * If the group fails to create this instance, it does not try again and the
    * group&#39;s targetSize value is decreased instead.  - RECREATING The
    * managed instance group is recreating this instance.  - DELETING The
    * managed instance group is permanently deleting this instance.  -
    * ABANDONING The managed instance group is abandoning this instance. The
    * instance will be removed from the instance group and from any target
    * pools that are associated with this group.  - RESTARTING The managed
    * instance group is restarting the instance.  - REFRESHING The managed
    * instance group is applying configuration changes to the instance without
    * stopping it. For example, the group can update the target pool list for
    * an instance without stopping that instance.  - VERIFYING The managed
    * instance group has created the instance and it is in the process of being
    * verified.
    */
  var currentAction: js.UndefOr[String] = js.native
  /**
    * [Output only] The unique identifier for this resource. This field is
    * empty when instance does not exist.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL of the instance. The URL can exist even if the
    * instance has not yet been created.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * [Output Only] Health state of the instance per health-check.
    */
  var instanceHealth: js.UndefOr[js.Array[SchemaManagedInstanceInstanceHealth]] = js.native
  /**
    * [Output Only] The status of the instance. This field is empty when the
    * instance does not exist.
    */
  var instanceStatus: js.UndefOr[String] = js.native
  /**
    * [Output Only] The intended template of the instance. This field is empty
    * when current_action is one of { DELETING, ABANDONING }.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  /**
    * [Output Only] Information about the last attempt to create or delete the
    * instance.
    */
  var lastAttempt: js.UndefOr[SchemaManagedInstanceLastAttempt] = js.native
  /**
    * [Output Only] Override defined for this instance.
    */
  var `override`: js.UndefOr[SchemaManagedInstanceOverride] = js.native
  /**
    * [Output Only] Preserved state applied from per-instance config for this
    * instance.
    */
  var preservedStateFromConfig: js.UndefOr[SchemaPreservedState] = js.native
  /**
    * [Output Only] Preserved state generated based on stateful policy for this
    * instance.
    */
  var preservedStateFromPolicy: js.UndefOr[SchemaPreservedState] = js.native
  /**
    * [Output Only] Tag describing the version.
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * [Output Only] Intended version of this instance.
    */
  var version: js.UndefOr[SchemaManagedInstanceVersion] = js.native
}

object SchemaManagedInstance {
  @scala.inline
  def apply(): SchemaManagedInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstance]
  }
  @scala.inline
  implicit class SchemaManagedInstanceOps[Self <: SchemaManagedInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentAction(value: String): Self = this.set("currentAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentAction: Self = this.set("currentAction", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setInstanceHealthVarargs(value: SchemaManagedInstanceInstanceHealth*): Self = this.set("instanceHealth", js.Array(value :_*))
    @scala.inline
    def setInstanceHealth(value: js.Array[SchemaManagedInstanceInstanceHealth]): Self = this.set("instanceHealth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceHealth: Self = this.set("instanceHealth", js.undefined)
    @scala.inline
    def setInstanceStatus(value: String): Self = this.set("instanceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceStatus: Self = this.set("instanceStatus", js.undefined)
    @scala.inline
    def setInstanceTemplate(value: String): Self = this.set("instanceTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTemplate: Self = this.set("instanceTemplate", js.undefined)
    @scala.inline
    def setLastAttempt(value: SchemaManagedInstanceLastAttempt): Self = this.set("lastAttempt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAttempt: Self = this.set("lastAttempt", js.undefined)
    @scala.inline
    def setOverride(value: SchemaManagedInstanceOverride): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    @scala.inline
    def setPreservedStateFromConfig(value: SchemaPreservedState): Self = this.set("preservedStateFromConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreservedStateFromConfig: Self = this.set("preservedStateFromConfig", js.undefined)
    @scala.inline
    def setPreservedStateFromPolicy(value: SchemaPreservedState): Self = this.set("preservedStateFromPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreservedStateFromPolicy: Self = this.set("preservedStateFromPolicy", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setVersion(value: SchemaManagedInstanceVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

