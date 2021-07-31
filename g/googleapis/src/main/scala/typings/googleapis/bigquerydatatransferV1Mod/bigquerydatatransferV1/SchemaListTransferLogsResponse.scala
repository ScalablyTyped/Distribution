package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The returned list transfer run messages.
  */
trait SchemaListTransferLogsResponse extends StObject {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `GetTransferRunLogRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The stored pipeline transfer messages.
    */
  var transferMessages: js.UndefOr[js.Array[SchemaTransferMessage]] = js.undefined
}
object SchemaListTransferLogsResponse {
  
  @scala.inline
  def apply(): SchemaListTransferLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferLogsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTransferLogsResponseMutableBuilder[Self <: SchemaListTransferLogsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferMessages(value: js.Array[SchemaTransferMessage]): Self = StObject.set(x, "transferMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferMessagesUndefined: Self = StObject.set(x, "transferMessages", js.undefined)
    
    @scala.inline
    def setTransferMessagesVarargs(value: SchemaTransferMessage*): Self = StObject.set(x, "transferMessages", js.Array(value :_*))
  }
}
