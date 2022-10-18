package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("THREE.Interpolant")
@js.native
open class Interpolant protected ()
  extends StObject
     with typings.forgeViewer.THREE.Interpolant {
  def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double) = this()
  def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double, resultBuffer: Any) = this()
  
  /* CompleteClass */
  override def evaluate(time: Double): Any = js.native
  
  /* CompleteClass */
  var parameterPositions: Any = js.native
  
  /* CompleteClass */
  var resultBuffer: Any = js.native
  
  /* CompleteClass */
  var samplesValues: Any = js.native
  
  /* CompleteClass */
  var valueSize: Double = js.native
}
