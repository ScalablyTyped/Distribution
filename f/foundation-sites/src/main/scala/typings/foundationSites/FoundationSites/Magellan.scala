package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/magellan.html#javascript-reference
trait Magellan extends StObject {
  
  def calcPoints(): Unit
  
  def reflow(): Unit
  
  def scrollToLoc(location: String): Unit
}
object Magellan {
  
  inline def apply(calcPoints: () => Unit, reflow: () => Unit, scrollToLoc: String => Unit): Magellan = {
    val __obj = js.Dynamic.literal(calcPoints = js.Any.fromFunction0(calcPoints), reflow = js.Any.fromFunction0(reflow), scrollToLoc = js.Any.fromFunction1(scrollToLoc))
    __obj.asInstanceOf[Magellan]
  }
  
  extension [Self <: Magellan](x: Self) {
    
    inline def setCalcPoints(value: () => Unit): Self = StObject.set(x, "calcPoints", js.Any.fromFunction0(value))
    
    inline def setReflow(value: () => Unit): Self = StObject.set(x, "reflow", js.Any.fromFunction0(value))
    
    inline def setScrollToLoc(value: String => Unit): Self = StObject.set(x, "scrollToLoc", js.Any.fromFunction1(value))
  }
}
