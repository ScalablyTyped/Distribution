package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextToColumnsRequest extends js.Object {
  /**
    * The delimiter to use. Used only if delimiterType is
    * CUSTOM.
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /** The delimiter type to use. */
  var delimiterType: js.UndefOr[String] = js.undefined
  /** The source data range.  This must span exactly one column. */
  var source: js.UndefOr[GridRange] = js.undefined
}

object TextToColumnsRequest {
  @scala.inline
  def apply(delimiter: String = null, delimiterType: String = null, source: GridRange = null): TextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (delimiterType != null) __obj.updateDynamic("delimiterType")(delimiterType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextToColumnsRequest]
  }
}

