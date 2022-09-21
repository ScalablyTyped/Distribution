package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBar extends StObject {
  
  var lastValue: Double
  
  def setPercent(pct: Double): Unit
}
object ProgressBar {
  
  inline def apply(lastValue: Double, setPercent: Double => Unit): ProgressBar = {
    val __obj = js.Dynamic.literal(lastValue = lastValue.asInstanceOf[js.Any], setPercent = js.Any.fromFunction1(setPercent))
    __obj.asInstanceOf[ProgressBar]
  }
  
  extension [Self <: ProgressBar](x: Self) {
    
    inline def setLastValue(value: Double): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setSetPercent(value: Double => Unit): Self = StObject.set(x, "setPercent", js.Any.fromFunction1(value))
  }
}
