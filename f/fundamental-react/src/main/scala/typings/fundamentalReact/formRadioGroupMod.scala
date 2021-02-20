package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formRadioGroupMod {
  
  @JSImport("fundamental-react/lib/Forms/FormRadioGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[FormRadioGroupProps, js.Object, js.Any]
  
  type FormRadioGroup = Component[FormRadioGroupProps, js.Object, js.Any]
  
  @js.native
  trait FormRadioGroupProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  }
  object FormRadioGroupProps {
    
    @scala.inline
    def apply(): FormRadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormRadioGroupProps]
    }
    
    @scala.inline
    implicit class FormRadioGroupPropsMutableBuilder[Self <: FormRadioGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
