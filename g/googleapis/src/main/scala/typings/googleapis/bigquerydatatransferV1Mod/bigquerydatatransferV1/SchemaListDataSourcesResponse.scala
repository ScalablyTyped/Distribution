package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDataSourcesResponse extends StObject {
  
  /**
    * List of supported data sources and their transfer settings.
    */
  var dataSources: js.UndefOr[js.Array[SchemaDataSource]] = js.undefined
  
  /**
    * Output only. The next-pagination token. For multiple-page list results, this token can be used as the `ListDataSourcesRequest.page_token` to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDataSourcesResponse {
  
  inline def apply(): SchemaListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDataSourcesResponse]
  }
  
  extension [Self <: SchemaListDataSourcesResponse](x: Self) {
    
    inline def setDataSources(value: js.Array[SchemaDataSource]): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    inline def setDataSourcesVarargs(value: SchemaDataSource*): Self = StObject.set(x, "dataSources", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
