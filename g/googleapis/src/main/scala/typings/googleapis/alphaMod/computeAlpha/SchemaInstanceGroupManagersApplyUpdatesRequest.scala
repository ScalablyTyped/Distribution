package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InstanceGroupManagers.applyUpdatesToInstances
  */
@js.native
trait SchemaInstanceGroupManagersApplyUpdatesRequest extends StObject {
  
  /**
    * The list of URLs of one or more instances for which we want to apply
    * updates on this managed instance group. This can be a full URL or a
    * partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The maximal action that should be performed on the instances. By default
    * REPLACE. This field is deprecated, please use
    * most_disruptive_allowed_action.
    */
  var maximalAction: js.UndefOr[String] = js.native
  
  /**
    * The minimal action that should be perfomed on the instances. By default
    * NONE.
    */
  var minimalAction: js.UndefOr[String] = js.native
  
  /**
    * The most disruptive action that allowed to be performed on the instances.
    * By default REPLACE.
    */
  var mostDisruptiveAllowedAction: js.UndefOr[String] = js.native
}
object SchemaInstanceGroupManagersApplyUpdatesRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersApplyUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersApplyUpdatesRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersApplyUpdatesRequestMutableBuilder[Self <: SchemaInstanceGroupManagersApplyUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setMaximalAction(value: String): Self = StObject.set(x, "maximalAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximalActionUndefined: Self = StObject.set(x, "maximalAction", js.undefined)
    
    @scala.inline
    def setMinimalAction(value: String): Self = StObject.set(x, "minimalAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimalActionUndefined: Self = StObject.set(x, "minimalAction", js.undefined)
    
    @scala.inline
    def setMostDisruptiveAllowedAction(value: String): Self = StObject.set(x, "mostDisruptiveAllowedAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostDisruptiveAllowedActionUndefined: Self = StObject.set(x, "mostDisruptiveAllowedAction", js.undefined)
  }
}
