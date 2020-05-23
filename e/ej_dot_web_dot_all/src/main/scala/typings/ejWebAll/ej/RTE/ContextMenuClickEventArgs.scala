package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuClickEventArgs extends js.Object {
  /** returns clicked menu item element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the selected item.
    */
  var selectedItem: js.UndefOr[Double] = js.undefined
  /** returns clicked menu item text.
    */
  var text: js.UndefOr[String] = js.undefined
}

object ContextMenuClickEventArgs {
  @scala.inline
  def apply(element: js.Any = null, selectedItem: js.UndefOr[Double] = js.undefined, text: String = null): ContextMenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedItem)) __obj.updateDynamic("selectedItem")(selectedItem.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuClickEventArgs]
  }
}

