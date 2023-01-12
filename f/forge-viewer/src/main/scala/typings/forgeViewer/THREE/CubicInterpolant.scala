package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CubicInterpolant
  extends StObject
     with Interpolant {
  
  def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): Any
}
object CubicInterpolant {
  
  inline def apply(
    evaluate: Double => Any,
    interpolate_ : (Double, Double, Double, Double) => Any,
    parameterPositions: Any,
    resultBuffer: Any,
    samplesValues: Any,
    valueSize: Double
  ): CubicInterpolant = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), interpolate_ = js.Any.fromFunction4(interpolate_), parameterPositions = parameterPositions.asInstanceOf[js.Any], resultBuffer = resultBuffer.asInstanceOf[js.Any], samplesValues = samplesValues.asInstanceOf[js.Any], valueSize = valueSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubicInterpolant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CubicInterpolant] (val x: Self) extends AnyVal {
    
    inline def setInterpolate_(value: (Double, Double, Double, Double) => Any): Self = StObject.set(x, "interpolate_", js.Any.fromFunction4(value))
  }
}
