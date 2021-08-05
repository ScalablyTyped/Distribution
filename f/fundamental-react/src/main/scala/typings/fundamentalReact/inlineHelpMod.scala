package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineHelpMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/InlineHelp/InlineHelp", JSImport.Default)
  @js.native
  val default: FunctionComponent[InlineHelpProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.`bottom-right`
    - typings.fundamentalReact.fundamentalReactStrings.`bottom-left`
    - typings.fundamentalReact.fundamentalReactStrings.right
    - typings.fundamentalReact.fundamentalReactStrings.left
    - typings.fundamentalReact.fundamentalReactStrings.`bottom-center`
  */
  trait InlineHelpPlacement extends StObject
  object InlineHelpPlacement {
    
    inline def `bottom-center`: typings.fundamentalReact.fundamentalReactStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-center`]
    
    inline def `bottom-left`: typings.fundamentalReact.fundamentalReactStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.fundamentalReact.fundamentalReactStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-right`]
    
    inline def left: typings.fundamentalReact.fundamentalReactStrings.left = "left".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.left]
    
    inline def right: typings.fundamentalReact.fundamentalReactStrings.right = "right".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.right]
  }
  
  trait InlineHelpProps
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var placement: InlineHelpPlacement
  }
  object InlineHelpProps {
    
    inline def apply(placement: InlineHelpPlacement): InlineHelpProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineHelpProps]
    }
    
    extension [Self <: InlineHelpProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setPlacement(value: InlineHelpPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[InlineHelpProps]
  
  /* This means you don't have to write `default`, but can instead just say `inlineHelpMod.foo` */
  override def _to: FunctionComponent[InlineHelpProps] = default
}
