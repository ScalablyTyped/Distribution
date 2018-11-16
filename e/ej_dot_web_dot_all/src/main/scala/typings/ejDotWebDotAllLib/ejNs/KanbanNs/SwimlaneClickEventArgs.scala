package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SwimlaneClickEventArgs extends js.Object {
  /** Current Action name while swim lane clicked. Actions are "expand" or "collapse"
               */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the swim lane group data's.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the kanban model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current swim lane row index.
               */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns current target element.
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

