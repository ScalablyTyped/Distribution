package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFormatRun extends js.Object {
  /** The format of this run.  Absent values inherit the cell's format. */
  var format: js.UndefOr[TextFormat] = js.undefined
  /** The character index where this run starts. */
  var startIndex: js.UndefOr[Double] = js.undefined
}

object TextFormatRun {
  @scala.inline
  def apply(format: TextFormat = null, startIndex: Int | Double = null): TextFormatRun = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFormatRun]
  }
}

