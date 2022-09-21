package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsOperationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. The name of the operation resource.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var operationsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsOperationsGet {
  
  inline def apply(): ParamsResourceAppsOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsOperationsGet]
  }
  
  extension [Self <: ParamsResourceAppsOperationsGet](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setOperationsId(value: String): Self = StObject.set(x, "operationsId", value.asInstanceOf[js.Any])
    
    inline def setOperationsIdUndefined: Self = StObject.set(x, "operationsId", js.undefined)
  }
}
