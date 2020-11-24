package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSendAsResponse extends js.Object {
  
  var sendAs: js.UndefOr[js.Array[SendAs]] = js.native
}
object ListSendAsResponse {
  
  @scala.inline
  def apply(): ListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSendAsResponse]
  }
  
  @scala.inline
  implicit class ListSendAsResponseOps[Self <: ListSendAsResponse] (val x: Self) extends AnyVal {
    
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
    def setSendAsVarargs(value: SendAs*): Self = this.set("sendAs", js.Array(value :_*))
    
    @scala.inline
    def setSendAs(value: js.Array[SendAs]): Self = this.set("sendAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendAs: Self = this.set("sendAs", js.undefined)
  }
}
