package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Text
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiInputMod {
  
  @JSImport("fundamental-react/lib/MultiInput/MultiInput", JSImport.Default)
  @js.native
  class default ()
    extends Component[MultiInputProps, js.Object, js.Any]
  
  type MultiInput = Component[MultiInputProps, js.Object, js.Any]
  
  trait MultiInputProps
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var buttonProps: js.UndefOr[js.Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var data: js.Array[js.Any]
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[js.Any] = js.undefined
    
    var listProps: js.UndefOr[js.Any] = js.undefined
    
    var onTagsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[js.Any] = js.undefined
    
    var tagProps: js.UndefOr[js.Any] = js.undefined
    
    var validationState: js.UndefOr[Text] = js.undefined
  }
  object MultiInputProps {
    
    @scala.inline
    def apply(data: js.Array[js.Any]): MultiInputProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiInputProps]
    }
    
    @scala.inline
    implicit class MultiInputPropsMutableBuilder[Self <: MultiInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: js.Any): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Any): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setListProps(value: js.Any): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      @scala.inline
      def setOnTagsUpdate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onTagsUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTagsUpdateUndefined: Self = StObject.set(x, "onTagsUpdate", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: js.Any): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setTagProps(value: js.Any): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      @scala.inline
      def setValidationState(value: Text): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
