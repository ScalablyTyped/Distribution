package typings.floatingUiCore

import typings.floatingUiCore.anon.PartialOptionsOptionsBoundary
import typings.floatingUiCore.floatingUiCoreStrings.escaped
import typings.floatingUiCore.floatingUiCoreStrings.referenceHidden
import typings.floatingUiCore.srcTypesMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareHideMod {
  
  @JSImport("@floating-ui/core/src/middleware/hide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(options: PartialOptionsOptionsBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  trait Options extends StObject {
    
    /**
      * The strategy used to determine when to hide the floating element.
      */
    var strategy: referenceHidden | escaped
  }
  object Options {
    
    inline def apply(strategy: referenceHidden | escaped): Options = {
      val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStrategy(value: referenceHidden | escaped): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
}
