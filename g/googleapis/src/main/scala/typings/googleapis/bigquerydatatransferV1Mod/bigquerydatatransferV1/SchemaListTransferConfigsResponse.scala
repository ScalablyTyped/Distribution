package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The returned list of pipelines in the project.
  */
@js.native
trait SchemaListTransferConfigsResponse extends js.Object {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `ListTransferConfigsRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Output only. The stored pipeline transfer configurations.
    */
  var transferConfigs: js.UndefOr[js.Array[SchemaTransferConfig]] = js.native
}
object SchemaListTransferConfigsResponse {
  
  @scala.inline
  def apply(): SchemaListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferConfigsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTransferConfigsResponseOps[Self <: SchemaListTransferConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferConfigsVarargs(value: SchemaTransferConfig*): Self = this.set("transferConfigs", js.Array(value :_*))
    
    @scala.inline
    def setTransferConfigs(value: js.Array[SchemaTransferConfig]): Self = this.set("transferConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferConfigs: Self = this.set("transferConfigs", js.undefined)
  }
}
