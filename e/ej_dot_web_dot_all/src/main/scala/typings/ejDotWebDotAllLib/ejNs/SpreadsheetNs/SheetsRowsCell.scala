package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether to lock or unlock a particular cell.
    * @Default {false}
    */
  var isLocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the styles of a cell in Spreadsheet.
    * @Default {null}
    */
  var style: js.UndefOr[SheetsRowsCellsStyle] = js.undefined
  /** Specifies the value for a cell in Spreadsheet.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object SheetsRowsCell {
  @scala.inline
  def apply(
    comment: SheetsRowsCellsComment = null,
    format: SheetsRowsCellsFormat = null,
    hyperlink: SheetsRowsCellsHyperlink = null,
    index: scala.Int | scala.Double = null,
    isLocked: js.UndefOr[scala.Boolean] = js.undefined,
    style: SheetsRowsCellsStyle = null,
    value: java.lang.String = null
  ): SheetsRowsCell = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SheetsRowsCell]
  }
}

