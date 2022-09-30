package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * WARNING: Undocumented feature!
	 */
trait GLTextureLike extends StObject {
  
  def bind(unit: Double): Double
  
  var shape: js.Tuple2[Double, Double]
}
object GLTextureLike {
  
  inline def apply(bind: Double => Double, shape: js.Tuple2[Double, Double]): GLTextureLike = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLTextureLike]
  }
  
  extension [Self <: GLTextureLike](x: Self) {
    
    inline def setBind(value: Double => Double): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
