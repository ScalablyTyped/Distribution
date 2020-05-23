package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenu extends js.Object {
  /** Defines the collection of context menu items
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[ContextMenuItem]] = js.undefined
  /** To set whether to display the default context menu items or not
    * @Default {false}
    */
  var showCustomMenuItemsOnly: js.UndefOr[Boolean] = js.undefined
}

object ContextMenu {
  @scala.inline
  def apply(
    items: js.Array[ContextMenuItem] = null,
    showCustomMenuItemsOnly: js.UndefOr[Boolean] = js.undefined
  ): ContextMenu = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(showCustomMenuItemsOnly)) __obj.updateDynamic("showCustomMenuItemsOnly")(showCustomMenuItemsOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenu]
  }
}

