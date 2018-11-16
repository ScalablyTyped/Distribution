package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskbarEditingEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the field values of record being edited.
               */
  var editingFields: js.UndefOr[js.Any] = js.undefined
  /** Returns the Gantt model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns duration value will be round-off or not.
               */
  var roundOffDuration: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row object being edited.
               */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

