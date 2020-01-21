package typings.ejWebAll.ej.datavisualization.SymbolPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionChangeEventArgs extends js.Object {
  /** returns whether an element is selected or unselected
    */
  var changeType: js.UndefOr[String] = js.undefined
  /** returns the node or connector that is selected or unselected
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object SelectionChangeEventArgs {
  @scala.inline
  def apply(changeType: String = null, element: js.Any = null): SelectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangeEventArgs]
  }
}

