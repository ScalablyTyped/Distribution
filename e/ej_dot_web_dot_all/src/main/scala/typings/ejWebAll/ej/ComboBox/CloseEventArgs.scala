package typings.ejWebAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventArgs extends js.Object {
  /** Element of the combobox popup list
    */
  var popup: js.UndefOr[js.Any] = js.undefined
}

object CloseEventArgs {
  @scala.inline
  def apply(popup: js.Any = null): CloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseEventArgs]
  }
}

