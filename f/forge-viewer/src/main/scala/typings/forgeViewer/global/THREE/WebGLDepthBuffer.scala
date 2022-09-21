package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLDepthBuffer")
@js.native
open class WebGLDepthBuffer protected ()
  extends StObject
     with typings.forgeViewer.THREE.WebGLDepthBuffer {
  def this(gl: Any, state: Any) = this()
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def setClear(depth: Any): Unit = js.native
  
  /* CompleteClass */
  override def setFunc(depthFunc: Any): Unit = js.native
  
  /* CompleteClass */
  override def setLocked(lock: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setMask(depthMask: Double): Unit = js.native
  
  /* CompleteClass */
  override def setTest(depthTest: Boolean): Unit = js.native
}
