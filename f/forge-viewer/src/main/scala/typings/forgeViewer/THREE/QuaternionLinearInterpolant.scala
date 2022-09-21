package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuaternionLinearInterpolant
  extends StObject
     with Interpolant {
  
  def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): Any
}
object QuaternionLinearInterpolant {
  
  inline def apply(
    evaluate: Double => Any,
    interpolate_ : (Double, Double, Double, Double) => Any,
    parameterPositions: Any,
    resultBuffer: Any,
    samplesValues: Any,
    valueSize: Double
  ): QuaternionLinearInterpolant = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), interpolate_ = js.Any.fromFunction4(interpolate_), parameterPositions = parameterPositions.asInstanceOf[js.Any], resultBuffer = resultBuffer.asInstanceOf[js.Any], samplesValues = samplesValues.asInstanceOf[js.Any], valueSize = valueSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuaternionLinearInterpolant]
  }
  
  extension [Self <: QuaternionLinearInterpolant](x: Self) {
    
    inline def setInterpolate_(value: (Double, Double, Double, Double) => Any): Self = StObject.set(x, "interpolate_", js.Any.fromFunction4(value))
  }
}
