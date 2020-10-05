package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectRequest extends js.Object {
  var method: js.UndefOr[String] = js.native
  var session: js.UndefOr[Session_ | Null] = js.native
  var uploadData: js.UndefOr[ProtocolResponseUploadData] = js.native
  var url: String = js.native
}

object RedirectRequest {
  @scala.inline
  def apply(url: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
  @scala.inline
  implicit class RedirectRequestOps[Self <: RedirectRequest] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setSession(value: Session_): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSessionNull: Self = this.set("session", null)
    @scala.inline
    def setUploadData(value: ProtocolResponseUploadData): Self = this.set("uploadData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadData: Self = this.set("uploadData", js.undefined)
  }
  
}

