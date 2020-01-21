package typings.ejWebAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEventArgs extends js.Object {
  /** Element of the combobox popup list
    */
  var popup: js.UndefOr[js.Any] = js.undefined
}

object OpenEventArgs {
  @scala.inline
  def apply(popup: js.Any = null): OpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenEventArgs]
  }
}

