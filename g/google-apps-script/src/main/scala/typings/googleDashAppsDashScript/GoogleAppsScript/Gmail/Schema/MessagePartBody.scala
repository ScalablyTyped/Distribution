package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePartBody extends js.Object {
  var attachmentId: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object MessagePartBody {
  @scala.inline
  def apply(attachmentId: String = null, data: String = null, size: Int | Double = null): MessagePartBody = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePartBody]
  }
}

