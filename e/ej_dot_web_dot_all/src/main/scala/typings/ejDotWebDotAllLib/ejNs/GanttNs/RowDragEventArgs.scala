package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowDragEventArgs extends js.Object {
  /** Returns that we can drop over that record or not.
               */
  var canDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row which we start to drag.
               */
  var draggedRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we start to drag.
               */
  var draggedRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the drop position value on current target row.
               */
  var dropPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Gantt model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
               */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Duration is rounded off when it is set true.
               */
  var roundOffDuration: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row on which we are dragging.
               */
  var targetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index on which we are dragging.
               */
  var targetRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

