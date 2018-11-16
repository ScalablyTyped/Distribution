package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskbarEditedEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data of edited record.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns 'true' if taskbar is dragged.
               */
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the field values of record being edited.
               */
  var editingFields: js.UndefOr[js.Any] = js.undefined
  /** Returns 'true' if taskbar is left resized.
               */
  var leftResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Gantt model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous data value of edited record.
               */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns 'true' if taskbar is progress resized.
               */
  var progressResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns 'true' if taskbar is right resized.
               */
  var rightResizing: js.UndefOr[scala.Boolean] = js.undefined
}

