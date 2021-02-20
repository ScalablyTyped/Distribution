package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def `bottom-center`: typings.fundamentalReact.fundamentalReactStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typings.fundamentalReact.fundamentalReactStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.fundamentalReact.fundamentalReactStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.`bottom-right`]
    
    @scala.inline
    def left: typings.fundamentalReact.fundamentalReactStrings.left = "left".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.left]
    
    @scala.inline
    def right: typings.fundamentalReact.fundamentalReactStrings.right = "right".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.right]
  }
  
  @js.native
  trait InlineHelpProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var contentClassName: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var placement: InlineHelpPlacement = js.native
  }
  object InlineHelpProps {
    
    @scala.inline
    def apply(placement: InlineHelpPlacement): InlineHelpProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineHelpProps]
    }
    
    @scala.inline
    implicit class InlineHelpPropsMutableBuilder[Self <: InlineHelpProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setPlacement(value: InlineHelpPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[InlineHelpProps]
  
  /* This means you don't have to write `default`, but can instead just say `inlineHelpMod.foo` */
  override def _to: FunctionComponent[InlineHelpProps] = default
}
