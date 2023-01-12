package typings.focusTrapReact

import typings.focusTrap.mod.Options
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-trap-react", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[Props, js.Object, Any]
  
  type FocusTrap = Component[Props, js.Object, Any]
  
  trait Props
    extends StObject
       with AllHTMLAttributes[Any] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var containerElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    var focusTrapOptions: js.UndefOr[Options] = js.undefined
    
    var paused: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setContainerElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "containerElements", value.asInstanceOf[js.Any])
      
      inline def setContainerElementsUndefined: Self = StObject.set(x, "containerElements", js.undefined)
      
      inline def setContainerElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "containerElements", js.Array(value*))
      
      inline def setFocusTrapOptions(value: Options): Self = StObject.set(x, "focusTrapOptions", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapOptionsUndefined: Self = StObject.set(x, "focusTrapOptions", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    }
  }
}
