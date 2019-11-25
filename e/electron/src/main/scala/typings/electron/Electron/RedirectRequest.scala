package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequest extends js.Object {
  var method: String
  var session: js.UndefOr[Session] = js.undefined
  var uploadData: js.UndefOr[UploadData] = js.undefined
  var url: String
}

object RedirectRequest {
  @scala.inline
  def apply(method: String, url: String, session: Session = null, uploadData: UploadData = null): RedirectRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (uploadData != null) __obj.updateDynamic("uploadData")(uploadData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
}

