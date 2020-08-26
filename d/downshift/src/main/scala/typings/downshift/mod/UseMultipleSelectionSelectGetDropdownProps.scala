package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMultipleSelectionSelectGetDropdownProps
  extends GetToggleButtonPropsOptions
     with GetPropsWithRefKey
     with UseMultipleSelectionGetDropdownProps {
  var preventKeyAction: js.UndefOr[Boolean] = js.native
}

object UseMultipleSelectionSelectGetDropdownProps {
  @scala.inline
  def apply(): UseMultipleSelectionSelectGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMultipleSelectionSelectGetDropdownProps]
  }
  @scala.inline
  implicit class UseMultipleSelectionSelectGetDropdownPropsOps[Self <: UseMultipleSelectionSelectGetDropdownProps] (val x: Self) extends AnyVal {
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

