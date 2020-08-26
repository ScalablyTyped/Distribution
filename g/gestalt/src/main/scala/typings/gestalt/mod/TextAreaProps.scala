package typings.gestalt.mod

import typings.gestalt.anon.ValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var errorMessage: js.UndefOr[String] = js.native
  var helperText: js.UndefOr[String] = js.native
  var id: String = js.native
  var label: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[js.Function1[/* args */ ValueString, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* args */ ValueString, Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* args */ ValueString, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
  var value: js.UndefOr[String] = js.native
  def onChange(args: ValueString): Unit = js.native
}

object TextAreaProps {
  @scala.inline
  def apply(id: String, onChange: ValueString => Unit): TextAreaProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[TextAreaProps]
  }
  @scala.inline
  implicit class TextAreaPropsOps[Self <: TextAreaProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: ValueString => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setHelperText(value: String): Self = this.set("helperText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperText: Self = this.set("helperText", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: /* args */ ValueString => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnFocus(value: /* args */ ValueString => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* args */ ValueString => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

