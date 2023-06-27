package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareArrowMod {
  
  @JSImport("@floating-ui/core/src/middleware/arrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrow(options: ArrowOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def arrow(options: Derivable[ArrowOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  trait ArrowOptions extends StObject {
    
    /**
      * The arrow element to be positioned.
      * @default undefined
      */
    var element: Any
    
    /**
      * The padding between the arrow element and the floating element edges.
      * Useful when the floating element has rounded corners.
      * @default 0
      */
    var padding: js.UndefOr[Padding] = js.undefined
  }
  object ArrowOptions {
    
    inline def apply(element: Any): ArrowOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowOptions] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
