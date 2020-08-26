package typings.fundamentalReact.formInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormInputProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var validationState: js.UndefOr[State] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object FormInputProps {
  @scala.inline
  def apply(): FormInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormInputProps]
  }
  @scala.inline
  implicit class FormInputPropsOps[Self <: FormInputProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidationState(value: State): Self = this.set("validationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

