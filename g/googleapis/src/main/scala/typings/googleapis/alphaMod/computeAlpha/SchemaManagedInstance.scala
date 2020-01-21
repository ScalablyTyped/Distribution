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
  def apply(
    currentAction: String = null,
    id: String = null,
    instance: String = null,
    instanceHealth: js.Array[SchemaManagedInstanceInstanceHealth] = null,
    instanceStatus: String = null,
    instanceTemplate: String = null,
    lastAttempt: SchemaManagedInstanceLastAttempt = null,
    `override`: SchemaManagedInstanceOverride = null,
    preservedStateFromConfig: SchemaPreservedState = null,
    preservedStateFromPolicy: SchemaPreservedState = null,
    tag: String = null,
    version: SchemaManagedInstanceVersion = null
  ): SchemaManagedInstance = {
    val __obj = js.Dynamic.literal()
    if (currentAction != null) __obj.updateDynamic("currentAction")(currentAction.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (instanceHealth != null) __obj.updateDynamic("instanceHealth")(instanceHealth.asInstanceOf[js.Any])
    if (instanceStatus != null) __obj.updateDynamic("instanceStatus")(instanceStatus.asInstanceOf[js.Any])
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate.asInstanceOf[js.Any])
    if (lastAttempt != null) __obj.updateDynamic("lastAttempt")(lastAttempt.asInstanceOf[js.Any])
    if (`override` != null) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (preservedStateFromConfig != null) __obj.updateDynamic("preservedStateFromConfig")(preservedStateFromConfig.asInstanceOf[js.Any])
    if (preservedStateFromPolicy != null) __obj.updateDynamic("preservedStateFromPolicy")(preservedStateFromPolicy.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedInstance]
  }
}

