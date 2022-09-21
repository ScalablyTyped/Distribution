package typings.fontCarrier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<{  path :string,   width :number,   height :number,   skipViewport :string}> */
  trait Partialpathstringwidthnum extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var skipViewport: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Partialpathstringwidthnum {
    
    inline def apply(): Partialpathstringwidthnum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialpathstringwidthnum]
    }
    
    extension [Self <: Partialpathstringwidthnum](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSkipViewport(value: String): Self = StObject.set(x, "skipViewport", value.asInstanceOf[js.Any])
      
      inline def setSkipViewportUndefined: Self = StObject.set(x, "skipViewport", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
