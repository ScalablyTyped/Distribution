package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListOrgDataExchangesResponse extends StObject {
  
  /**
    * The list of data exchanges.
    */
  var dataExchanges: js.UndefOr[js.Array[SchemaDataExchange]] = js.undefined
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListOrgDataExchangesResponse {
  
  inline def apply(): SchemaListOrgDataExchangesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOrgDataExchangesResponse]
  }
  
  extension [Self <: SchemaListOrgDataExchangesResponse](x: Self) {
    
    inline def setDataExchanges(value: js.Array[SchemaDataExchange]): Self = StObject.set(x, "dataExchanges", value.asInstanceOf[js.Any])
    
    inline def setDataExchangesUndefined: Self = StObject.set(x, "dataExchanges", js.undefined)
    
    inline def setDataExchangesVarargs(value: SchemaDataExchange*): Self = StObject.set(x, "dataExchanges", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
