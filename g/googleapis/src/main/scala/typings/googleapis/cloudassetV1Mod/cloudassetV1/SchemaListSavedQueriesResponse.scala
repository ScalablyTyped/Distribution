package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSavedQueriesResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of savedQueries.
    */
  var savedQueries: js.UndefOr[js.Array[SchemaSavedQuery]] = js.undefined
}
object SchemaListSavedQueriesResponse {
  
  inline def apply(): SchemaListSavedQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSavedQueriesResponse]
  }
  
  extension [Self <: SchemaListSavedQueriesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSavedQueries(value: js.Array[SchemaSavedQuery]): Self = StObject.set(x, "savedQueries", value.asInstanceOf[js.Any])
    
    inline def setSavedQueriesUndefined: Self = StObject.set(x, "savedQueries", js.undefined)
    
    inline def setSavedQueriesVarargs(value: SchemaSavedQuery*): Self = StObject.set(x, "savedQueries", js.Array(value*))
  }
}
