package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsRepair
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the application to repair. Example: apps/myapp
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRepairApplicationRequest] = js.undefined
}
object ParamsResourceAppsRepair {
  
  inline def apply(): ParamsResourceAppsRepair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsRepair]
  }
  
  extension [Self <: ParamsResourceAppsRepair](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setRequestBody(value: SchemaRepairApplicationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
