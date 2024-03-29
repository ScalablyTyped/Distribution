package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsServicesVersionsInstancesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var instancesId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsServicesVersionsInstancesDelete {
  
  inline def apply(): ParamsResourceAppsServicesVersionsInstancesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsServicesVersionsInstancesDelete]
  }
  
  extension [Self <: ParamsResourceAppsServicesVersionsInstancesDelete](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setInstancesId(value: String): Self = StObject.set(x, "instancesId", value.asInstanceOf[js.Any])
    
    inline def setInstancesIdUndefined: Self = StObject.set(x, "instancesId", js.undefined)
    
    inline def setServicesId(value: String): Self = StObject.set(x, "servicesId", value.asInstanceOf[js.Any])
    
    inline def setServicesIdUndefined: Self = StObject.set(x, "servicesId", js.undefined)
    
    inline def setVersionsId(value: String): Self = StObject.set(x, "versionsId", value.asInstanceOf[js.Any])
    
    inline def setVersionsIdUndefined: Self = StObject.set(x, "versionsId", js.undefined)
  }
}
