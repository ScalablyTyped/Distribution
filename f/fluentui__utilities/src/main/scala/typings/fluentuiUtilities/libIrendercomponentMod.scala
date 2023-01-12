package typings.fluentuiUtilities

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIrendercomponentMod {
  
  trait IRenderComponent[TProps] extends StObject {
    
    /**
      * JSX.Element to return in this component's render() function.
      */
    def children(props: TProps): Element
  }
  object IRenderComponent {
    
    inline def apply[TProps](children: TProps => Element): IRenderComponent[TProps] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[IRenderComponent[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRenderComponent[?], TProps] (val x: Self & IRenderComponent[TProps]) extends AnyVal {
      
      inline def setChildren(value: TProps => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
