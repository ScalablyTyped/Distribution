package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Forms/FormLabel", JSImport.Default)
  @js.native
  val default: FunctionComponent[FormLabelProps] = js.native
  
  @js.native
  trait FormLabelProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isInlineHelp: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
  }
  object FormLabelProps {
    
    @scala.inline
    def apply(): FormLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormLabelProps]
    }
    
    @scala.inline
    implicit class FormLabelPropsMutableBuilder[Self <: FormLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsInlineHelp(value: Boolean): Self = StObject.set(x, "isInlineHelp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInlineHelpUndefined: Self = StObject.set(x, "isInlineHelp", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  type _To = FunctionComponent[FormLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelMod.foo` */
  override def _to: FunctionComponent[FormLabelProps] = default
}
