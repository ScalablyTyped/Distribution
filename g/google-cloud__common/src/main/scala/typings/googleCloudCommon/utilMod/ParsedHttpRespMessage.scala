package typings.googleCloudCommon.utilMod

import typings.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedHttpRespMessage extends js.Object {
  
  var err: js.UndefOr[ApiError] = js.native
  
  var resp: Response[_] = js.native
}
object ParsedHttpRespMessage {
  
  @scala.inline
  def apply(resp: Response[_]): ParsedHttpRespMessage = {
    val __obj = js.Dynamic.literal(resp = resp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpRespMessage]
  }
  
  @scala.inline
  implicit class ParsedHttpRespMessageOps[Self <: ParsedHttpRespMessage] (val x: Self) extends AnyVal {
    
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
    def setResp(value: Response[_]): Self = this.set("resp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: ApiError): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
  }
}
