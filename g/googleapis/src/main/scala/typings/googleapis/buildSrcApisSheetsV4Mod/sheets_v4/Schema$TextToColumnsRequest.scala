package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Splits a column of text into multiple columns, based on a delimiter in each
  * cell.
  */
@js.native
trait Schema$TextToColumnsRequest extends js.Object {
  /**
    * The delimiter to use. Used only if delimiterType is CUSTOM.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * The delimiter type to use.
    */
  var delimiterType: js.UndefOr[String] = js.native
  /**
    * The source data range.  This must span exactly one column.
    */
  var source: js.UndefOr[Schema$GridRange] = js.native
}

object Schema$TextToColumnsRequest {
  @scala.inline
  def apply(delimiter: String = null, delimiterType: String = null, source: Schema$GridRange = null): Schema$TextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (delimiterType != null) __obj.updateDynamic("delimiterType")(delimiterType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextToColumnsRequest]
  }
}

