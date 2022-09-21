package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstancegroupmanagerresizerequestsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the managed instance group. Name should conform to RFC1035 or be a resource ID.
    */
  var instanceGroupManager: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resize request. Name should conform to RFC1035 or be a resource ID.
    */
  var resizeRequest: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone where the managed instance group and the resize request are located. Name should conform to RFC1035.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstancegroupmanagerresizerequestsGet {
  
  inline def apply(): ParamsResourceInstancegroupmanagerresizerequestsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancegroupmanagerresizerequestsGet]
  }
  
  extension [Self <: ParamsResourceInstancegroupmanagerresizerequestsGet](x: Self) {
    
    inline def setInstanceGroupManager(value: String): Self = StObject.set(x, "instanceGroupManager", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupManagerUndefined: Self = StObject.set(x, "instanceGroupManager", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setResizeRequest(value: String): Self = StObject.set(x, "resizeRequest", value.asInstanceOf[js.Any])
    
    inline def setResizeRequestUndefined: Self = StObject.set(x, "resizeRequest", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
