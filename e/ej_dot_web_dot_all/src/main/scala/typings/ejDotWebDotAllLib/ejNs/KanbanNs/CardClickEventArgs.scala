package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CardClickEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Header text of the column corresponding to the selected card.
               */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the current card to the Kanban.
               */
  var currentCard: js.UndefOr[java.lang.String] = js.undefined
  /** Returns current record object (JSON).
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns Kanban element.
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

