package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRow extends js.Object {
  /** Specifies the cells of a row in Spreadsheet.
    * @Default {[]}
    */
  var cells: js.UndefOr[js.Array[SheetsRowsCell]] = js.undefined
  /** Gets or sets the height of a row in Spreadsheet.
    * @Default {20}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Gets or sets the index of a row in Spreadsheet.
    * @Default {0}
    */
  var index: js.UndefOr[Double] = js.undefined
}

object SheetsRow {
  @scala.inline
  def apply(
    cells: js.Array[SheetsRowsCell] = null,
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined
  ): SheetsRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsRow]
  }
}

