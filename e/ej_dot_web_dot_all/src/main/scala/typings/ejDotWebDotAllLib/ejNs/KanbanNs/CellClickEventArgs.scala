package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellClickEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the select cell index value.
               */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the kanban model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the edited row index.
               */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

