package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFormatRun extends js.Object {
  var format: js.UndefOr[TextFormat] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object TextFormatRun {
  @scala.inline
  def apply(format: TextFormat = null, startIndex: js.UndefOr[Double] = js.undefined): TextFormatRun = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFormatRun]
  }
}

