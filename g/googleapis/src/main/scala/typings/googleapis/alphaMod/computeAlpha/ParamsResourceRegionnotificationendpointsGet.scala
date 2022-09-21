package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionnotificationendpointsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the NotificationEndpoint resource to return.
    */
  var notificationEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionnotificationendpointsGet {
  
  inline def apply(): ParamsResourceRegionnotificationendpointsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionnotificationendpointsGet]
  }
  
  extension [Self <: ParamsResourceRegionnotificationendpointsGet](x: Self) {
    
    inline def setNotificationEndpoint(value: String): Self = StObject.set(x, "notificationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setNotificationEndpointUndefined: Self = StObject.set(x, "notificationEndpoint", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
