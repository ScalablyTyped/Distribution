package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

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
  var measureCount: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the row headers corresponding to the selected value cells.
    */
  var rowheader: js.UndefOr[js.Any] = js.undefined
}

