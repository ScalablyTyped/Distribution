package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLStencilBuffer")
@js.native
open class WebGLStencilBuffer protected ()
  extends StObject
     with typings.forgeViewer.THREE.WebGLStencilBuffer {
  def this(gl: Any, state: Any) = this()
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def setClear(stencil: Any): Unit = js.native
  
  /* CompleteClass */
  override def setFunc(stencilFunc: Any, stencilRef: Any, stencilMask: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLocked(lock: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setMask(stencilMask: Double): Unit = js.native
  
  /* CompleteClass */
  override def setOp(stencilFail: Any, stencilZFail: Any, stencilZPass: Any): Unit = js.native
  
  /* CompleteClass */
  override def setTest(stencilTest: Boolean): Unit = js.native
}
