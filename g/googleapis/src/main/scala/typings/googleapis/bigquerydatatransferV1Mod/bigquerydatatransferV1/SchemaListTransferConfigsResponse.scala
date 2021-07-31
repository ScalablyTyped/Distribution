package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The returned list of pipelines in the project.
  */
trait SchemaListTransferConfigsResponse extends StObject {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `ListTransferConfigsRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The stored pipeline transfer configurations.
    */
  var transferConfigs: js.UndefOr[js.Array[SchemaTransferConfig]] = js.undefined
}
object SchemaListTransferConfigsResponse {
  
  @scala.inline
  def apply(): SchemaListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferConfigsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTransferConfigsResponseMutableBuilder[Self <: SchemaListTransferConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferConfigs(value: js.Array[SchemaTransferConfig]): Self = StObject.set(x, "transferConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferConfigsUndefined: Self = StObject.set(x, "transferConfigs", js.undefined)
    
    @scala.inline
    def setTransferConfigsVarargs(value: SchemaTransferConfig*): Self = StObject.set(x, "transferConfigs", js.Array(value :_*))
  }
}
