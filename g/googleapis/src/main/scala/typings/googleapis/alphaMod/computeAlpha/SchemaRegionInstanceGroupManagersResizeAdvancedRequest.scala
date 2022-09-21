package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersResizeAdvancedRequest extends StObject {
  
  /**
    * If this flag is true, the managed instance group attempts to create all instances initiated by this resize request only once. If there is an error during creation, the managed instance group does not retry create this instance, and we will decrease the targetSize of the request instead. If the flag is false, the group attempts to recreate each instance continuously until it succeeds. This flag matters only in the first attempt of creation of an instance. After an instance is successfully created while this flag is enabled, the instance behaves the same way as all the other instances created with a regular resize request. In particular, if a running instance dies unexpectedly at a later time and needs to be recreated, this mode does not affect the recreation behavior in that scenario. This flag is applicable only to the current resize request. It does not influence other resize requests in any way. You can see which instances ar being created in which mode by calling the get or listManagedInstances API.
    */
  var noCreationRetries: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The number of running instances that the managed instance group should maintain at any given time. The group automatically adds or removes instances to maintain the number of instances specified by this parameter.
    */
  var targetSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRegionInstanceGroupManagersResizeAdvancedRequest {
  
  inline def apply(): SchemaRegionInstanceGroupManagersResizeAdvancedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersResizeAdvancedRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersResizeAdvancedRequest](x: Self) {
    
    inline def setNoCreationRetries(value: Boolean): Self = StObject.set(x, "noCreationRetries", value.asInstanceOf[js.Any])
    
    inline def setNoCreationRetriesNull: Self = StObject.set(x, "noCreationRetries", null)
    
    inline def setNoCreationRetriesUndefined: Self = StObject.set(x, "noCreationRetries", js.undefined)
    
    inline def setTargetSize(value: Double): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeNull: Self = StObject.set(x, "targetSize", null)
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
