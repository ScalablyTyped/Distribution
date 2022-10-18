package typings.floatingUiCore

import typings.floatingUiCore.anon.PartialOptionsPadding
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareInlineMod {
  
  @JSImport("@floating-ui/core/src/middleware/inline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `inline`(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[Middleware]
  inline def `inline`(options: PartialOptionsPadding): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  trait Options extends StObject {
    
    /**
      * @experimental
      * @default 2
      */
    var padding: Padding
    
    /**
      * Viewport-relative `x` coordinate to choose a `ClientRect`.
      * @default undefined
      */
    var x: Double
    
    /**
      * Viewport-relative `y` coordinate to choose a `ClientRect`.
      * @default undefined
      */
    var y: Double
  }
  object Options {
    
    inline def apply(padding: Padding, x: Double, y: Double): Options = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
