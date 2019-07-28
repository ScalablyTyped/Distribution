package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRowsCellsHyperlink extends js.Object {
  /** Specifies the cell address for the hyperlink of a cell.
    */
  var cellAddr: js.UndefOr[String] = js.undefined
  /** Specifies the sheet index to which the cell is referred.
    * @Default {1}
    */
  var sheetIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the web address for the hyperlink of a cell.
    */
  var webAddr: js.UndefOr[String] = js.undefined
}

object SheetsRowsCellsHyperlink {
  @scala.inline
  def apply(cellAddr: String = null, sheetIndex: Int | Double = null, webAddr: String = null): SheetsRowsCellsHyperlink = {
    val __obj = js.Dynamic.literal()
    if (cellAddr != null) __obj.updateDynamic("cellAddr")(cellAddr)
    if (sheetIndex != null) __obj.updateDynamic("sheetIndex")(sheetIndex.asInstanceOf[js.Any])
    if (webAddr != null) __obj.updateDynamic("webAddr")(webAddr)
    __obj.asInstanceOf[SheetsRowsCellsHyperlink]
  }
}

