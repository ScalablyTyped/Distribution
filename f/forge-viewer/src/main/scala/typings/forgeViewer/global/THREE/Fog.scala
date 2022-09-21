package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Fog")
@js.native
open class Fog protected ()
  extends StObject
     with typings.forgeViewer.THREE.Fog {
  def this(hex: Double) = this()
  def this(hex: Double, near: Double) = this()
  def this(hex: Double, near: Double, far: Double) = this()
  def this(hex: Double, near: Unit, far: Double) = this()
  
  /* CompleteClass */
  var color: typings.forgeViewer.THREE.Color = js.native
  
  /* CompleteClass */
  var far: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var near: Double = js.native
}
