package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstancegroupmanagersResize
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the managed instance group.
    */
  var instanceGroupManager: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of running instances that the managed instance group should maintain at any given time. The group automatically adds or removes instances to maintain the number of instances specified by this parameter.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the zone where the managed instance group is located.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstancegroupmanagersResize {
  
  inline def apply(): ParamsResourceInstancegroupmanagersResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancegroupmanagersResize]
  }
  
  extension [Self <: ParamsResourceInstancegroupmanagersResize](x: Self) {
    
    inline def setInstanceGroupManager(value: String): Self = StObject.set(x, "instanceGroupManager", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupManagerUndefined: Self = StObject.set(x, "instanceGroupManager", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
