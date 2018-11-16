package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns current record object (JSON).
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the foreign key record object (JSON).
               */
  var foreignKeyData: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row element.
               */
  var prevRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row index.
               */
  var prevRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the current selected row.
               */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index of the selected row.
               */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns current record object (JSON).
               */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

