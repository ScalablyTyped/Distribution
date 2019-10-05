package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPasteRequest extends js.Object {
  /**
    * The location to paste to. If the range covers a span that's
    * a multiple of the source's height or width, then the
    * data will be repeated to fill in the destination range.
    * If the range is smaller than the source range, the entire
    * source data will still be copied (beyond the end of the destination range).
    */
  var destination: js.UndefOr[GridRange] = js.undefined
  /** How that data should be oriented when pasting. */
  var pasteOrientation: js.UndefOr[String] = js.undefined
  /** What kind of data to paste. */
  var pasteType: js.UndefOr[String] = js.undefined
  /** The source range to copy. */
  var source: js.UndefOr[GridRange] = js.undefined
}

object CopyPasteRequest {
  @scala.inline
  def apply(
    destination: GridRange = null,
    pasteOrientation: String = null,
    pasteType: String = null,
    source: GridRange = null
  ): CopyPasteRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (pasteOrientation != null) __obj.updateDynamic("pasteOrientation")(pasteOrientation)
    if (pasteType != null) __obj.updateDynamic("pasteType")(pasteType)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CopyPasteRequest]
  }
}

