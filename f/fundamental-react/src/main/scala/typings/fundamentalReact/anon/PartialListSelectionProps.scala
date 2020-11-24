package typings.fundamentalReact.anon

import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> */
@js.native
trait PartialListSelectionProps extends js.Object {
  
  var checkBoxAriaLabel: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[HTMLInputElement, Event], 
      /* checkedState */ Boolean, 
      Unit
    ]
  ] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
}
object PartialListSelectionProps {
  
  @scala.inline
  def apply(): PartialListSelectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListSelectionProps]
  }
  
  @scala.inline
  implicit class PartialListSelectionPropsOps[Self <: PartialListSelectionProps] (val x: Self) extends AnyVal {
    
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
    def setCheckBoxAriaLabel(value: String): Self = this.set("checkBoxAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBoxAriaLabel: Self = this.set("checkBoxAriaLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ SyntheticEvent[HTMLInputElement, Event], /* checkedState */ Boolean) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
