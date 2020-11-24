package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResponseBodyResponse extends js.Object {
  
  /**
    * True, if content was sent as base64.
    */
  var base64Encoded: Boolean = js.native
  
  /**
    * Response body.
    */
  var body: String = js.native
}
object GetResponseBodyResponse {
  
  @scala.inline
  def apply(base64Encoded: Boolean, body: String): GetResponseBodyResponse = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseBodyResponse]
  }
  
  @scala.inline
  implicit class GetResponseBodyResponseOps[Self <: GetResponseBodyResponse] (val x: Self) extends AnyVal {
    
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
    def setBase64Encoded(value: Boolean): Self = this.set("base64Encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
  }
}
