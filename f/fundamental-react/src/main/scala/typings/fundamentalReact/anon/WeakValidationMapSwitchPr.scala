package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> */
@js.native
trait WeakValidationMapSwitchPr extends js.Object {
  var checked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inputProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var internalLabels: js.UndefOr[Validator[js.UndefOr[Checked | Null]]] = js.native
  var labelProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  var semantic: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapSwitchPr {
  @scala.inline
  def apply(): WeakValidationMapSwitchPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSwitchPr]
  }
  @scala.inline
  implicit class WeakValidationMapSwitchPrOps[Self <: WeakValidationMapSwitchPr] (val x: Self) extends AnyVal {
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
    def setChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCompact(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setInternalLabels(value: Validator[js.UndefOr[Checked | Null]]): Self = this.set("internalLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalLabels: Self = this.set("internalLabels", js.undefined)
    @scala.inline
    def setLabelProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("labelProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelProps: Self = this.set("labelProps", js.undefined)
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setSemantic(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("semantic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemantic: Self = this.set("semantic", js.undefined)
  }
  
}

