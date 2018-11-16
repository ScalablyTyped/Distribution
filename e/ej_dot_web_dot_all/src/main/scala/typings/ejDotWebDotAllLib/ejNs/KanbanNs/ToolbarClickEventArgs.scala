package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ToolbarClickEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current item.
               */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** Returns the item id of that current element.
               */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the item index of that current element.
               */
  var itemIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the item name of that current element.
               */
  var itemName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the item text of that current element.
               */
  var itemText: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Kanban model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the toolbar object of the Kanban.
               */
  var toolbarData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

