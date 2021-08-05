package typings.focusTrapReact

import typings.focusTrap.mod.Options
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-trap-react", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[Props, js.Object, js.Any]
  
  type FocusTrap = Component[Props, js.Object, js.Any]
  
  trait Props
    extends StObject
       with AllHTMLAttributes[js.Any] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    @JSName("children")
    var children_Props: ReactElement
    
    var focusTrapOptions: js.UndefOr[Options] = js.undefined
    
    var paused: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(children: ReactElement): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapOptions(value: Options): Self = StObject.set(x, "focusTrapOptions", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapOptionsUndefined: Self = StObject.set(x, "focusTrapOptions", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    }
  }
}
