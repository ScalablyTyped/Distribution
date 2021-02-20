package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The returned list of pipelines in the project.
  */
@js.native
trait SchemaListTransferRunsResponse extends StObject {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `ListTransferRunsRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Output only. The stored pipeline transfer runs.
    */
  var transferRuns: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}
object SchemaListTransferRunsResponse {
  
  @scala.inline
  def apply(): SchemaListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferRunsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTransferRunsResponseMutableBuilder[Self <: SchemaListTransferRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferRuns(value: js.Array[SchemaTransferRun]): Self = StObject.set(x, "transferRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferRunsUndefined: Self = StObject.set(x, "transferRuns", js.undefined)
    
    @scala.inline
    def setTransferRunsVarargs(value: SchemaTransferRun*): Self = StObject.set(x, "transferRuns", js.Array(value :_*))
  }
}
