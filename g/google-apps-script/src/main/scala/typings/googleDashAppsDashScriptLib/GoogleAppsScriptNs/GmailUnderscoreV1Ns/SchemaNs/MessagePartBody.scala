package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePartBody extends js.Object {
  var attachmentId: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object MessagePartBody {
  @scala.inline
  def apply(
    attachmentId: java.lang.String = null,
    data: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): MessagePartBody = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePartBody]
  }
}

