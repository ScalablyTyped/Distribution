package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpolant extends StObject {
  
  def evaluate(time: Double): Any
  
  var parameterPositions: Any
  
  var resultBuffer: Any
  
  var samplesValues: Any
  
  var valueSize: Double
}
object Interpolant {
  
  inline def apply(
    evaluate: Double => Any,
    parameterPositions: Any,
    resultBuffer: Any,
    samplesValues: Any,
    valueSize: Double
  ): Interpolant = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), parameterPositions = parameterPositions.asInstanceOf[js.Any], resultBuffer = resultBuffer.asInstanceOf[js.Any], samplesValues = samplesValues.asInstanceOf[js.Any], valueSize = valueSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interpolant] (val x: Self) extends AnyVal {
    
    inline def setEvaluate(value: Double => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setParameterPositions(value: Any): Self = StObject.set(x, "parameterPositions", value.asInstanceOf[js.Any])
    
    inline def setResultBuffer(value: Any): Self = StObject.set(x, "resultBuffer", value.asInstanceOf[js.Any])
    
    inline def setSamplesValues(value: Any): Self = StObject.set(x, "samplesValues", value.asInstanceOf[js.Any])
    
    inline def setValueSize(value: Double): Self = StObject.set(x, "valueSize", value.asInstanceOf[js.Any])
  }
}
