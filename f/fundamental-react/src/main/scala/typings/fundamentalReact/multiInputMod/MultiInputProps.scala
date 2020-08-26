package typings.fundamentalReact.multiInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiInputProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var data: js.Array[_] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[js.Any] = js.native
  var listProps: js.UndefOr[js.Any] = js.native
  var onTagsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[js.Any] = js.native
  var tagProps: js.UndefOr[js.Any] = js.native
  var validationState: js.UndefOr[Text] = js.native
}

object MultiInputProps {
  @scala.inline
  def apply(data: js.Array[_]): MultiInputProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiInputProps]
  }
  @scala.inline
  implicit class MultiInputPropsOps[Self <: MultiInputProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonProps(value: js.Any): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInputProps(value: js.Any): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setListProps(value: js.Any): Self = this.set("listProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListProps: Self = this.set("listProps", js.undefined)
    @scala.inline
    def setOnTagsUpdate(value: /* repeated */ js.Any => _): Self = this.set("onTagsUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTagsUpdate: Self = this.set("onTagsUpdate", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopoverProps(value: js.Any): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    @scala.inline
    def setTagProps(value: js.Any): Self = this.set("tagProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagProps: Self = this.set("tagProps", js.undefined)
    @scala.inline
    def setValidationState(value: Text): Self = this.set("validationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
  }
  
}

