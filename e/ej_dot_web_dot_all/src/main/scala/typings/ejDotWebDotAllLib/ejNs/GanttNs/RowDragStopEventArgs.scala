package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowDragStopEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row which we start to drag.
               */
  var draggedRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we start to drag.
               */
  var draggedRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the Gantt model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
               */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the row which we are dropped to row.
               */
  var targetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we are dropped to row.
               */
  var targetRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

