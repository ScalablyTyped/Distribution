package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> */
@js.native
trait PartialSwitchProps extends js.Object {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inputProps: js.UndefOr[js.Any] = js.native
  
  var internalLabels: js.UndefOr[Checked] = js.native
  
  var labelProps: js.UndefOr[js.Any] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var semantic: js.UndefOr[Boolean] = js.native
}
object PartialSwitchProps {
  
  @scala.inline
  def apply(): PartialSwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwitchProps]
  }
  
  @scala.inline
  implicit class PartialSwitchPropsOps[Self <: PartialSwitchProps] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
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
    def setInputProps(value: js.Any): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setInternalLabels(value: Checked): Self = this.set("internalLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalLabels: Self = this.set("internalLabels", js.undefined)
    
    @scala.inline
    def setLabelProps(value: js.Any): Self = this.set("labelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelProps: Self = this.set("labelProps", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* repeated */ js.Any => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setSemantic(value: Boolean): Self = this.set("semantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemantic: Self = this.set("semantic", js.undefined)
  }
}
