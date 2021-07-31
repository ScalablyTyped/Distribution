package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Managed Instance resource.
  */
trait SchemaManagedInstance extends StObject {
  
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
  var currentAction: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The unique identifier for this resource. This field is
    * empty when instance does not exist.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The URL of the instance. The URL can exist even if the
    * instance has not yet been created.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Health state of the instance per health-check.
    */
  var instanceHealth: js.UndefOr[js.Array[SchemaManagedInstanceInstanceHealth]] = js.undefined
  
  /**
    * [Output Only] The status of the instance. This field is empty when the
    * instance does not exist.
    */
  var instanceStatus: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The intended template of the instance. This field is empty
    * when current_action is one of { DELETING, ABANDONING }.
    */
  var instanceTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Information about the last attempt to create or delete the
    * instance.
    */
  var lastAttempt: js.UndefOr[SchemaManagedInstanceLastAttempt] = js.undefined
  
  /**
    * [Output Only] Override defined for this instance.
    */
  var `override`: js.UndefOr[SchemaManagedInstanceOverride] = js.undefined
  
  /**
    * [Output Only] Preserved state applied from per-instance config for this
    * instance.
    */
  var preservedStateFromConfig: js.UndefOr[SchemaPreservedState] = js.undefined
  
  /**
    * [Output Only] Preserved state generated based on stateful policy for this
    * instance.
    */
  var preservedStateFromPolicy: js.UndefOr[SchemaPreservedState] = js.undefined
  
  /**
    * [Output Only] Tag describing the version.
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Intended version of this instance.
    */
  var version: js.UndefOr[SchemaManagedInstanceVersion] = js.undefined
}
object SchemaManagedInstance {
  
  @scala.inline
  def apply(): SchemaManagedInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstance]
  }
  
  @scala.inline
  implicit class SchemaManagedInstanceMutableBuilder[Self <: SchemaManagedInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceHealth(value: js.Array[SchemaManagedInstanceInstanceHealth]): Self = StObject.set(x, "instanceHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceHealthUndefined: Self = StObject.set(x, "instanceHealth", js.undefined)
    
    @scala.inline
    def setInstanceHealthVarargs(value: SchemaManagedInstanceInstanceHealth*): Self = StObject.set(x, "instanceHealth", js.Array(value :_*))
    
    @scala.inline
    def setInstanceStatus(value: String): Self = StObject.set(x, "instanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStatusUndefined: Self = StObject.set(x, "instanceStatus", js.undefined)
    
    @scala.inline
    def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setLastAttempt(value: SchemaManagedInstanceLastAttempt): Self = StObject.set(x, "lastAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAttemptUndefined: Self = StObject.set(x, "lastAttempt", js.undefined)
    
    @scala.inline
    def setOverride(value: SchemaManagedInstanceOverride): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    @scala.inline
    def setPreservedStateFromConfig(value: SchemaPreservedState): Self = StObject.set(x, "preservedStateFromConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservedStateFromConfigUndefined: Self = StObject.set(x, "preservedStateFromConfig", js.undefined)
    
    @scala.inline
    def setPreservedStateFromPolicy(value: SchemaPreservedState): Self = StObject.set(x, "preservedStateFromPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservedStateFromPolicyUndefined: Self = StObject.set(x, "preservedStateFromPolicy", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setVersion(value: SchemaManagedInstanceVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
