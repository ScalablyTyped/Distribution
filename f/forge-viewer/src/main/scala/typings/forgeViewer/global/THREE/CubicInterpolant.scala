package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.CubicInterpolant")
@js.native
open class CubicInterpolant protected ()
  extends StObject
     with typings.forgeViewer.THREE.CubicInterpolant {
  def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double) = this()
  def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double, resultBuffer: Any) = this()
  
  /* CompleteClass */
  override def evaluate(time: Double): Any = js.native
  
  /* CompleteClass */
  override def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): Any = js.native
  
  /* CompleteClass */
  var parameterPositions: Any = js.native
  
  /* CompleteClass */
  var resultBuffer: Any = js.native
  
  /* CompleteClass */
  var samplesValues: Any = js.native
  
  /* CompleteClass */
  var valueSize: Double = js.native
}
