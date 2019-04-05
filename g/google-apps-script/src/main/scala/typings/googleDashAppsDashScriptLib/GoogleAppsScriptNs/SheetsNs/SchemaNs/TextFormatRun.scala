package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFormatRun extends js.Object {
  var format: js.UndefOr[TextFormat] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

object TextFormatRun {
  @scala.inline
  def apply(format: TextFormat = null, startIndex: scala.Int | scala.Double = null): TextFormatRun = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFormatRun]
  }
}

