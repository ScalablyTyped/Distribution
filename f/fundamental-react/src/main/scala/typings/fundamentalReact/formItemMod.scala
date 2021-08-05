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
    
    inline def apply(): FormItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemProps]
    }
    
    extension [Self <: FormItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setIsHorizontal(value: Boolean): Self = StObject.set(x, "isHorizontal", value.asInstanceOf[js.Any])
      
      inline def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      inline def setIsInlineUndefined: Self = StObject.set(x, "isInline", js.undefined)
    }
  }
  
  type _To = FunctionComponent[FormItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `formItemMod.foo` */
  override def _to: FunctionComponent[FormItemProps] = default
}
