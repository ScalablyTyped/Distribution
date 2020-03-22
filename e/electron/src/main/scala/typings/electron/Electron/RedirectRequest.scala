package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequest extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[Session_ | Null] = js.undefined
  var uploadData: js.UndefOr[ProtocolResponseUploadData] = js.undefined
  var url: String
}

object RedirectRequest {
  @scala.inline
  def apply(
    url: String,
    method: String = null,
    session: Session_ = null,
    uploadData: ProtocolResponseUploadData = null
  ): RedirectRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (uploadData != null) __obj.updateDynamic("uploadData")(uploadData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
}

