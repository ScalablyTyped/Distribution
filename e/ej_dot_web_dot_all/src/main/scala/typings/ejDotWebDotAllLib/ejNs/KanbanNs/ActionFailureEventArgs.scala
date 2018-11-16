package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActionFailureEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns current filtering column field name.
               */
  var currentFilteringColumn: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the card object (JSON).
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the error return by server.
               */
  var error: js.UndefOr[js.Any] = js.undefined
  /** Returns filter details.
               */
  var filterCollection: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current action event type.
               */
  var originalEventType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns primary key value.
               */
  var primaryKeyValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns request type.
               */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns Kanban element.
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

