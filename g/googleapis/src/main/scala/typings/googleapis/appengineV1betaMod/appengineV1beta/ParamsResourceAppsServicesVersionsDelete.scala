package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsServicesVersionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsServicesVersionsDelete {
  
  inline def apply(): ParamsResourceAppsServicesVersionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsServicesVersionsDelete]
  }
  
  extension [Self <: ParamsResourceAppsServicesVersionsDelete](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setServicesId(value: String): Self = StObject.set(x, "servicesId", value.asInstanceOf[js.Any])
    
    inline def setServicesIdUndefined: Self = StObject.set(x, "servicesId", js.undefined)
    
    inline def setVersionsId(value: String): Self = StObject.set(x, "versionsId", value.asInstanceOf[js.Any])
    
    inline def setVersionsIdUndefined: Self = StObject.set(x, "versionsId", js.undefined)
  }
}
