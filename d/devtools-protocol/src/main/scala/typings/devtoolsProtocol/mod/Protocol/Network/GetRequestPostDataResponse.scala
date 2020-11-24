package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRequestPostDataResponse extends js.Object {
  
  /**
    * Request body string, omitting files from multipart requests
    */
  var postData: String = js.native
}
object GetRequestPostDataResponse {
  
  @scala.inline
  def apply(postData: String): GetRequestPostDataResponse = {
    val __obj = js.Dynamic.literal(postData = postData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestPostDataResponse]
  }
  
  @scala.inline
  implicit class GetRequestPostDataResponseOps[Self <: GetRequestPostDataResponse] (val x: Self) extends AnyVal {
    
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
    def setPostData(value: String): Self = this.set("postData", value.asInstanceOf[js.Any])
  }
}
