package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTransferRunsResponse extends StObject {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results, this token can be used as the `ListTransferRunsRequest.page_token` to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The stored pipeline transfer runs.
    */
  var transferRuns: js.UndefOr[js.Array[SchemaTransferRun]] = js.undefined
}
object SchemaListTransferRunsResponse {
  
  inline def apply(): SchemaListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferRunsResponse]
  }
  
  extension [Self <: SchemaListTransferRunsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferRuns(value: js.Array[SchemaTransferRun]): Self = StObject.set(x, "transferRuns", value.asInstanceOf[js.Any])
    
    inline def setTransferRunsUndefined: Self = StObject.set(x, "transferRuns", js.undefined)
    
    inline def setTransferRunsVarargs(value: SchemaTransferRun*): Self = StObject.set(x, "transferRuns", js.Array(value*))
  }
}
