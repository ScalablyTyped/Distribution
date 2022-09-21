package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Quaternion")
@js.native
open class Quaternion ()
  extends StObject
     with typings.forgeViewer.THREE.Quaternion {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
object Quaternion {
  
  @JSGlobal("THREE.Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def slerp(
    qa: typings.forgeViewer.THREE.Quaternion,
    qb: typings.forgeViewer.THREE.Quaternion,
    qm: typings.forgeViewer.THREE.Quaternion,
    t: Double
  ): typings.forgeViewer.THREE.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(qa.asInstanceOf[js.Any], qb.asInstanceOf[js.Any], qm.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.forgeViewer.THREE.Quaternion]
}
