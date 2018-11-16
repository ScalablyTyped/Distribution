package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selected cell index value.
               */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selected cell element.
               */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell element.
               */
  var previousRowCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell index value.
               */
  var previousRowCellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns current record object (JSON).
               */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected row cell index values.
               */
  var selectedRowCellIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

