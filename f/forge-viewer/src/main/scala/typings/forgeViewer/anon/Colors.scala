package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  
  var points: js.typedarray.Float32Array
  
  var scaleCallback: js.UndefOr[js.Function1[/* fraction */ Double, Double]] = js.undefined
}
object Colors {
  
  inline def apply(points: js.typedarray.Float32Array): Colors = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.typedarray.Float32Array): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setPoints(value: js.typedarray.Float32Array): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setScaleCallback(value: /* fraction */ Double => Double): Self = StObject.set(x, "scaleCallback", js.Any.fromFunction1(value))
    
    inline def setScaleCallbackUndefined: Self = StObject.set(x, "scaleCallback", js.undefined)
  }
}
