package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectionEventArgs extends js.Object {
  /** returns the JSON records of the selected range of cells.
    */
  var JSONRecords: js.UndefOr[js.Any] = js.undefined
  /** Returns the column headers corresponding to the selected value cells.
    */
  var columnheader: js.UndefOr[js.Any] = js.undefined
  /** Returns the information about the measure associated with the selected cell.
    */
  var measureCount: js.UndefOr[String] = js.undefined
  /** Returns the row headers corresponding to the selected value cells.
    */
  var rowheader: js.UndefOr[js.Any] = js.undefined
}

object CellSelectionEventArgs {
  @scala.inline
  def apply(
    JSONRecords: js.Any = null,
    columnheader: js.Any = null,
    measureCount: String = null,
    rowheader: js.Any = null
  ): CellSelectionEventArgs = {
    val __obj = js.Dynamic.literal()
    if (JSONRecords != null) __obj.updateDynamic("JSONRecords")(JSONRecords)
    if (columnheader != null) __obj.updateDynamic("columnheader")(columnheader)
    if (measureCount != null) __obj.updateDynamic("measureCount")(measureCount)
    if (rowheader != null) __obj.updateDynamic("rowheader")(rowheader)
    __obj.asInstanceOf[CellSelectionEventArgs]
  }
}

