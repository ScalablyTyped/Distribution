package typings.gestalt.mod

import typings.gestalt.anon.Checked
import typings.gestalt.anon.CheckedEvent
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var hasError: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var indeterminate: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* args */ CheckedEvent, Unit]] = js.native
  var size: js.UndefOr[sm | md] = js.native
  def onChange(args: Checked): Unit = js.native
}

object CheckboxProps {
  @scala.inline
  def apply(id: String, onChange: Checked => Unit): CheckboxProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[CheckboxProps]
  }
  @scala.inline
  implicit class CheckboxPropsOps[Self <: CheckboxProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: Checked => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHasError(value: Boolean): Self = this.set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasError: Self = this.set("hasError", js.undefined)
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnClick(value: /* args */ CheckedEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSize(value: sm | md): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

