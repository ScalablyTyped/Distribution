package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRowsCell extends js.Object {
  /** Specifies the comment for a cell in Spreadsheet.
    * @Default {null}
    */
  var comment: js.UndefOr[SheetsRowsCellsComment] = js.undefined
  /** Specifies the format of a cell in Spreadsheet.
    * @Default {null}
    */
  var format: js.UndefOr[SheetsRowsCellsFormat] = js.undefined
  /** Specifies the hyperlink for a cell in Spreadsheet.
    * @Default {null}
    */
  var hyperlink: js.UndefOr[SheetsRowsCellsHyperlink] = js.undefined
  /** Specifies the index of a cell in Spreadsheet.
    * @Default {0}
    */
  var index: js.UndefOr[Double] = js.undefined
  /** Specifies whether to lock or unlock a particular cell.
    * @Default {false}
    */
  var isLocked: js.UndefOr[Boolean] = js.undefined
  /** Specifies the styles of a cell in Spreadsheet.
    * @Default {null}
    */
  var style: js.UndefOr[SheetsRowsCellsStyle] = js.undefined
  /** Specifies the value for a cell in Spreadsheet.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SheetsRowsCell {
  @scala.inline
  def apply(
    comment: SheetsRowsCellsComment = null,
    format: SheetsRowsCellsFormat = null,
    hyperlink: SheetsRowsCellsHyperlink = null,
    index: js.UndefOr[Double] = js.undefined,
    isLocked: js.UndefOr[Boolean] = js.undefined,
    style: SheetsRowsCellsStyle = null,
    value: String = null
  ): SheetsRowsCell = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsRowsCell]
  }
}

