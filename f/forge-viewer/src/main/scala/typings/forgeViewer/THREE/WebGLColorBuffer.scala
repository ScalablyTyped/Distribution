package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLColorBuffer extends StObject {
  
  def reset(): Unit
  
  def setClear(r: Double, g: Double, b: Double, a: Double): Unit
  
  def setLocked(lock: Boolean): Unit
  
  def setMask(colorMask: Double): Unit
}
object WebGLColorBuffer {
  
  inline def apply(
    reset: () => Unit,
    setClear: (Double, Double, Double, Double) => Unit,
    setLocked: Boolean => Unit,
    setMask: Double => Unit
  ): WebGLColorBuffer = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setClear = js.Any.fromFunction4(setClear), setLocked = js.Any.fromFunction1(setLocked), setMask = js.Any.fromFunction1(setMask))
    __obj.asInstanceOf[WebGLColorBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLColorBuffer] (val x: Self) extends AnyVal {
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetClear(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setClear", js.Any.fromFunction4(value))
    
    inline def setSetLocked(value: Boolean => Unit): Self = StObject.set(x, "setLocked", js.Any.fromFunction1(value))
    
    inline def setSetMask(value: Double => Unit): Self = StObject.set(x, "setMask", js.Any.fromFunction1(value))
  }
}
