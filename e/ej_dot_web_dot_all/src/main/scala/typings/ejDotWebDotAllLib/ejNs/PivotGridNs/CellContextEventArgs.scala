package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellContextEventArgs extends js.Object {
  /** returns the original event object.
               */
  var args: js.UndefOr[js.Any] = js.undefined
  /** returns the cell position (row index and column index) in table.
               */
  var cellPosition: js.UndefOr[java.lang.String] = js.undefined
  /** returns the type of the cell.
               */
  var cellType: js.UndefOr[java.lang.String] = js.undefined
  /** returns the content of the cell.
               */
  var cellValue: js.UndefOr[java.lang.String] = js.undefined
  /** returns JSON record corresponding to the selected cell.
               */
  var rawdata: js.UndefOr[js.Any] = js.undefined
  /** returns the role of the cell in PivotGrid.
               */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** returns the unique name of levels/members.
               */
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

