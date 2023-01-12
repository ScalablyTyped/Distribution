package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLDepthBuffer extends StObject {
  
  def reset(): Unit
  
  def setClear(depth: Any): Unit
  
  def setFunc(depthFunc: Any): Unit
  
  def setLocked(lock: Boolean): Unit
  
  def setMask(depthMask: Double): Unit
  
  def setTest(depthTest: Boolean): Unit
}
object WebGLDepthBuffer {
  
  inline def apply(
    reset: () => Unit,
    setClear: Any => Unit,
    setFunc: Any => Unit,
    setLocked: Boolean => Unit,
    setMask: Double => Unit,
    setTest: Boolean => Unit
  ): WebGLDepthBuffer = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setClear = js.Any.fromFunction1(setClear), setFunc = js.Any.fromFunction1(setFunc), setLocked = js.Any.fromFunction1(setLocked), setMask = js.Any.fromFunction1(setMask), setTest = js.Any.fromFunction1(setTest))
    __obj.asInstanceOf[WebGLDepthBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLDepthBuffer] (val x: Self) extends AnyVal {
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetClear(value: Any => Unit): Self = StObject.set(x, "setClear", js.Any.fromFunction1(value))
    
    inline def setSetFunc(value: Any => Unit): Self = StObject.set(x, "setFunc", js.Any.fromFunction1(value))
    
    inline def setSetLocked(value: Boolean => Unit): Self = StObject.set(x, "setLocked", js.Any.fromFunction1(value))
    
    inline def setSetMask(value: Double => Unit): Self = StObject.set(x, "setMask", js.Any.fromFunction1(value))
    
    inline def setSetTest(value: Boolean => Unit): Self = StObject.set(x, "setTest", js.Any.fromFunction1(value))
  }
}
