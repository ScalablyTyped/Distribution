package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTransferLogsResponse extends StObject {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results, this token can be used as the `GetTransferRunLogRequest.page_token` to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The stored pipeline transfer messages.
    */
  var transferMessages: js.UndefOr[js.Array[SchemaTransferMessage]] = js.undefined
}
object SchemaListTransferLogsResponse {
  
  inline def apply(): SchemaListTransferLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferLogsResponse]
  }
  
  extension [Self <: SchemaListTransferLogsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferMessages(value: js.Array[SchemaTransferMessage]): Self = StObject.set(x, "transferMessages", value.asInstanceOf[js.Any])
    
    inline def setTransferMessagesUndefined: Self = StObject.set(x, "transferMessages", js.undefined)
    
    inline def setTransferMessagesVarargs(value: SchemaTransferMessage*): Self = StObject.set(x, "transferMessages", js.Array(value*))
  }
}
