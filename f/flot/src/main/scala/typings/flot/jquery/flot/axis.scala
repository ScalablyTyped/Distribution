package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait axis
  extends StObject
     with axisOptions {
  
  def c2p(canvasPoint: canvasPoint): point
  
  var options: axisOptions
  
  def p2c(point: point): canvasPoint
}
object axis {
  
  inline def apply(c2p: canvasPoint => point, options: axisOptions, p2c: point => canvasPoint): axis = {
    val __obj = js.Dynamic.literal(c2p = js.Any.fromFunction1(c2p), options = options.asInstanceOf[js.Any], p2c = js.Any.fromFunction1(p2c))
    __obj.asInstanceOf[axis]
  }
  
  extension [Self <: axis](x: Self) {
    
    inline def setC2p(value: canvasPoint => point): Self = StObject.set(x, "c2p", js.Any.fromFunction1(value))
    
    inline def setOptions(value: axisOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setP2c(value: point => canvasPoint): Self = StObject.set(x, "p2c", js.Any.fromFunction1(value))
  }
}
