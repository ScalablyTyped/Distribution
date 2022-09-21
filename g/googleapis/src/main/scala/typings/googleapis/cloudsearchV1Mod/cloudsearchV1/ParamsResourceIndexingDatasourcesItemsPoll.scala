package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIndexingDatasourcesItemsPoll
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the Data Source to poll items. Format: datasources/{source_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPollItemsRequest] = js.undefined
}
object ParamsResourceIndexingDatasourcesItemsPoll {
  
  inline def apply(): ParamsResourceIndexingDatasourcesItemsPoll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsPoll]
  }
  
  extension [Self <: ParamsResourceIndexingDatasourcesItemsPoll](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPollItemsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
