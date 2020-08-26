package typings.fundamentalReact.comboboxInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.State
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboboxInputProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[js.Object] = js.native
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[js.Object] = js.native
  var list: ReactNode = js.native
  /* An object containing a `Menu` component. */
  var menu: ReactElement = js.native
  var onClick: js.UndefOr[
    js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent], Unit]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[js.Object] = js.native
  var validationState: js.UndefOr[State] = js.native
}

object ComboboxInputProps {
  @scala.inline
  def apply(menu: ReactElement): ComboboxInputProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxInputProps]
  }
  @scala.inline
  implicit class ComboboxInputPropsOps[Self <: ComboboxInputProps] (val x: Self) extends AnyVal {
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
    def setMenu(value: ReactElement): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonProps(value: js.Object): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setInputProps(value: js.Object): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setList(value: ReactNode): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopoverProps(value: js.Object): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    @scala.inline
    def setValidationState(value: State): Self = this.set("validationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
  }
  
}

