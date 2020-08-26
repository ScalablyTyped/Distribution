package typings.gaeaModel.anon

import typings.gaeaModel.FitGaea.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewValue extends js.Object {
  var newValue: ComponentProps = js.native
  var oldValue: ComponentProps = js.native
}

object NewValue {
  @scala.inline
  def apply(newValue: ComponentProps, oldValue: ComponentProps): NewValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue]
  }
  @scala.inline
  implicit class NewValueOps[Self <: NewValue] (val x: Self) extends AnyVal {
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
    def setNewValue(value: ComponentProps): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: ComponentProps): Self = this.set("oldValue", value.asInstanceOf[js.Any])
  }
  
}

