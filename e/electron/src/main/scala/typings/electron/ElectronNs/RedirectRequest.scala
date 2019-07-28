package typings.electron.ElectronNs

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
    val __obj = js.Dynamic.literal(method = method, url = url)
    if (session != null) __obj.updateDynamic("session")(session)
    if (uploadData != null) __obj.updateDynamic("uploadData")(uploadData)
    __obj.asInstanceOf[RedirectRequest]
  }
}

