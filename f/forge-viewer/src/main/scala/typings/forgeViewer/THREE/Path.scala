package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  def lineTo(x: Double, y: Double): Unit
  
  def moveTo(x: Double, y: Double): Unit
}
object Path {
  
  inline def apply(lineTo: (Double, Double) => Unit, moveTo: (Double, Double) => Unit): Path = {
    val __obj = js.Dynamic.literal(lineTo = js.Any.fromFunction2(lineTo), moveTo = js.Any.fromFunction2(moveTo))
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setLineTo(value: (Double, Double) => Unit): Self = StObject.set(x, "lineTo", js.Any.fromFunction2(value))
    
    inline def setMoveTo(value: (Double, Double) => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
  }
}
