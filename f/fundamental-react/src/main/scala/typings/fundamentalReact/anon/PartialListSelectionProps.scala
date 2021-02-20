package typings.fundamentalReact.anon

import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> */
@js.native
trait PartialListSelectionProps extends StObject {
  
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
  implicit class PartialListSelectionPropsMutableBuilder[Self <: PartialListSelectionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckBoxAriaLabel(value: String): Self = StObject.set(x, "checkBoxAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBoxAriaLabelUndefined: Self = StObject.set(x, "checkBoxAriaLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ SyntheticEvent[HTMLInputElement, Event], /* checkedState */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
