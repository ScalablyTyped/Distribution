package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLStencilBuffer extends StObject {
  
  def reset(): Unit
  
  def setClear(stencil: Any): Unit
  
  def setFunc(stencilFunc: Any, stencilRef: Any, stencilMask: Double): Unit
  
  def setLocked(lock: Boolean): Unit
  
  def setMask(stencilMask: Double): Unit
  
  def setOp(stencilFail: Any, stencilZFail: Any, stencilZPass: Any): Unit
  
  def setTest(stencilTest: Boolean): Unit
}
object WebGLStencilBuffer {
  
  inline def apply(
    reset: () => Unit,
    setClear: Any => Unit,
    setFunc: (Any, Any, Double) => Unit,
    setLocked: Boolean => Unit,
    setMask: Double => Unit,
    setOp: (Any, Any, Any) => Unit,
    setTest: Boolean => Unit
  ): WebGLStencilBuffer = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setClear = js.Any.fromFunction1(setClear), setFunc = js.Any.fromFunction3(setFunc), setLocked = js.Any.fromFunction1(setLocked), setMask = js.Any.fromFunction1(setMask), setOp = js.Any.fromFunction3(setOp), setTest = js.Any.fromFunction1(setTest))
    __obj.asInstanceOf[WebGLStencilBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLStencilBuffer] (val x: Self) extends AnyVal {
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetClear(value: Any => Unit): Self = StObject.set(x, "setClear", js.Any.fromFunction1(value))
    
    inline def setSetFunc(value: (Any, Any, Double) => Unit): Self = StObject.set(x, "setFunc", js.Any.fromFunction3(value))
    
    inline def setSetLocked(value: Boolean => Unit): Self = StObject.set(x, "setLocked", js.Any.fromFunction1(value))
    
    inline def setSetMask(value: Double => Unit): Self = StObject.set(x, "setMask", js.Any.fromFunction1(value))
    
    inline def setSetOp(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "setOp", js.Any.fromFunction3(value))
    
    inline def setSetTest(value: Boolean => Unit): Self = StObject.set(x, "setTest", js.Any.fromFunction1(value))
  }
}
