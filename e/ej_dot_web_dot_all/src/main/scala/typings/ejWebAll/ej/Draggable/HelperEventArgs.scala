package typings.ejWebAll.ej.Draggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelperEventArgs extends js.Object {
  /** returns the draggable element object
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the event model values
    */
  var sender: js.UndefOr[js.Any] = js.undefined
}

object HelperEventArgs {
  @scala.inline
  def apply(element: js.Any = null, sender: js.Any = null): HelperEventArgs = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperEventArgs]
  }
}

