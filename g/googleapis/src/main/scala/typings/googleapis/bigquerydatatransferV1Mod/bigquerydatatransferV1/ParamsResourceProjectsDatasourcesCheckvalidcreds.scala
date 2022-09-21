package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasourcesCheckvalidcreds
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The data source in the form: `projects/{project_id\}/dataSources/{data_source_id\}` or `projects/{project_id\}/locations/{location_id\}/dataSources/{data_source_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCheckValidCredsRequest] = js.undefined
}
object ParamsResourceProjectsDatasourcesCheckvalidcreds {
  
  inline def apply(): ParamsResourceProjectsDatasourcesCheckvalidcreds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasourcesCheckvalidcreds]
  }
  
  extension [Self <: ParamsResourceProjectsDatasourcesCheckvalidcreds](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaCheckValidCredsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
