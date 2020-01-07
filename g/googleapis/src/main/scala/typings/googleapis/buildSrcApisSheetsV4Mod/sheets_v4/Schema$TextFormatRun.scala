package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A run of a text format. The format of this run continues until the start
  * index of the next run. When updating, all fields must be set.
  */
@js.native
trait Schema$TextFormatRun extends js.Object {
  /**
    * The format of this run.  Absent values inherit the cell&#39;s format.
    */
  var format: js.UndefOr[Schema$TextFormat] = js.native
  /**
    * The character index where this run starts.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object Schema$TextFormatRun {
  @scala.inline
  def apply(format: Schema$TextFormat = null, startIndex: Int | Double = null): Schema$TextFormatRun = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextFormatRun]
  }
}

