package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Object3D")
@js.native
open class Object3D ()
  extends StObject
     with typings.forgeViewer.THREE.Object3D
object Object3D {
  
  @JSGlobal("THREE.Object3D")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("THREE.Object3D.DefaultMatrixAutoUpdate")
  @js.native
  def DefaultMatrixAutoUpdate: Boolean = js.native
  inline def DefaultMatrixAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixAutoUpdate")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("THREE.Object3D.DefaultUp")
  @js.native
  def DefaultUp: typings.forgeViewer.THREE.Vector3 = js.native
  inline def DefaultUp_=(x: typings.forgeViewer.THREE.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultUp")(x.asInstanceOf[js.Any])
}
