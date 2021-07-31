package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formItemMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Forms/FormItem", JSImport.Default)
  @js.native
  val default: FunctionComponent[FormItemProps] = js.native
  
  trait FormItemProps
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var isHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var isInline: js.UndefOr[Boolean] = js.undefined
  }
  object FormItemProps {
    
    @scala.inline
    def apply(): FormItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemProps]
    }
    
    @scala.inline
    implicit class FormItemPropsMutableBuilder[Self <: FormItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setIsHorizontal(value: Boolean): Self = StObject.set(x, "isHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInlineUndefined: Self = StObject.set(x, "isInline", js.undefined)
    }
  }
  
  type _To = FunctionComponent[FormItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `formItemMod.foo` */
  override def _to: FunctionComponent[FormItemProps] = default
}
