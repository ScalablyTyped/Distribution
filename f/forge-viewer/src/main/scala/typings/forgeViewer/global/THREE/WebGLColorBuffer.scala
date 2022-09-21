package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLColorBuffer")
@js.native
open class WebGLColorBuffer protected ()
  extends StObject
     with typings.forgeViewer.THREE.WebGLColorBuffer {
  def this(gl: Any, state: Any) = this()
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def setClear(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLocked(lock: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setMask(colorMask: Double): Unit = js.native
}
