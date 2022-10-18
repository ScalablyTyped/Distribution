package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetViewportDimensionsMod {
  
  inline def apply(): ViewportDimensions = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ViewportDimensions]
  
  @JSImport("fbjs/lib/getViewportDimensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withoutScrollbars(): ViewportDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("withoutScrollbars")().asInstanceOf[ViewportDimensions]
  
  trait ViewportDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ViewportDimensions {
    
    inline def apply(height: Double, width: Double): ViewportDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportDimensions]
    }
    
    extension [Self <: ViewportDimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
