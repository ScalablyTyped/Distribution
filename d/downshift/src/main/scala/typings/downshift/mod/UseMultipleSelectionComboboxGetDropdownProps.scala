package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMultipleSelectionComboboxGetDropdownProps
  extends GetInputPropsOptions
     with GetPropsWithRefKey
     with UseMultipleSelectionGetDropdownProps {
  var preventKeyAction: js.UndefOr[Boolean] = js.native
}

object UseMultipleSelectionComboboxGetDropdownProps {
  @scala.inline
  def apply(): UseMultipleSelectionComboboxGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMultipleSelectionComboboxGetDropdownProps]
  }
  @scala.inline
  implicit class UseMultipleSelectionComboboxGetDropdownPropsOps[Self <: UseMultipleSelectionComboboxGetDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreventKeyAction(value: Boolean): Self = this.set("preventKeyAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventKeyAction: Self = this.set("preventKeyAction", js.undefined)
  }
  
}

