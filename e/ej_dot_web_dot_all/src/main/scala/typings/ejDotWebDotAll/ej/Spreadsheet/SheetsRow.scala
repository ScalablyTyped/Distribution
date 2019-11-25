package typings.ejDotWebDotAll.ej.Spreadsheet

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
  def apply(cells: js.Array[SheetsRowsCell] = null, height: Int | Double = null, index: Int | Double = null): SheetsRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsRow]
  }
}

