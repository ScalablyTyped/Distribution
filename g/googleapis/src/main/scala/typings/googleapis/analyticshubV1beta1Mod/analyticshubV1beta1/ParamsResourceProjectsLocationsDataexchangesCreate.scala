package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDataexchangesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes.
    */
  var dataExchangeId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource path of the data exchange. e.g. `projects/myproject/locations/US`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDataExchange] = js.undefined
}
object ParamsResourceProjectsLocationsDataexchangesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDataexchangesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDataexchangesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDataexchangesCreate](x: Self) {
    
    inline def setDataExchangeId(value: String): Self = StObject.set(x, "dataExchangeId", value.asInstanceOf[js.Any])
    
    inline def setDataExchangeIdUndefined: Self = StObject.set(x, "dataExchangeId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaDataExchange): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
