package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.ClientRectObject
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareInlineMod {
  
  @JSImport("@floating-ui/core/src/middleware/inline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRectsByLine(rects: js.Array[ClientRectObject]): js.Array[ClientRectObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRectsByLine")(rects.asInstanceOf[js.Any]).asInstanceOf[js.Array[ClientRectObject]]
  
  inline def `inline`(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[Middleware]
  inline def `inline`(options: InlineOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def `inline`(options: Derivable[InlineOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /* Inlined std.Partial<{  x :number,   y :number,   padding :@floating-ui/core.@floating-ui/core/src/types.Padding}> */
  trait InlineOptions extends StObject {
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object InlineOptions {
    
    inline def apply(): InlineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineOptions] (val x: Self) extends AnyVal {
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
