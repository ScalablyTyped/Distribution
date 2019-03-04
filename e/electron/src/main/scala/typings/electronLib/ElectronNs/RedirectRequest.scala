package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequest extends js.Object {
  var method: java.lang.String
  var session: js.UndefOr[Session] = js.undefined
  var uploadData: js.UndefOr[UploadData] = js.undefined
  var url: java.lang.String
}

object RedirectRequest {
  @scala.inline
  def apply(
    method: java.lang.String,
    url: java.lang.String,
    session: Session = null,
    uploadData: UploadData = null
  ): RedirectRequest = {
    val __obj = js.Dynamic.literal(method = method, url = url)
    if (session != null) __obj.updateDynamic("session")(session)
    if (uploadData != null) __obj.updateDynamic("uploadData")(uploadData)
    __obj.asInstanceOf[RedirectRequest]
  }
}

