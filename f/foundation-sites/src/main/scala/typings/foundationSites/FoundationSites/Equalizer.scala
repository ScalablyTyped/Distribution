package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/equalizer.html#javascript-reference
trait Equalizer extends StObject {
  
  def applyHeight(heights: js.Array[js.Any]): Unit
  
  def applyHeightByRow(groups: js.Array[js.Any]): Unit
  
  def destroy(): Unit
  
  def getHeights(cb: js.Function): js.Array[js.Any]
  
  def getHeightsByRow(cb: js.Function): js.Array[js.Any]
}
object Equalizer {
  
  inline def apply(
    applyHeight: js.Array[js.Any] => Unit,
    applyHeightByRow: js.Array[js.Any] => Unit,
    destroy: () => Unit,
    getHeights: js.Function => js.Array[js.Any],
    getHeightsByRow: js.Function => js.Array[js.Any]
  ): Equalizer = {
    val __obj = js.Dynamic.literal(applyHeight = js.Any.fromFunction1(applyHeight), applyHeightByRow = js.Any.fromFunction1(applyHeightByRow), destroy = js.Any.fromFunction0(destroy), getHeights = js.Any.fromFunction1(getHeights), getHeightsByRow = js.Any.fromFunction1(getHeightsByRow))
    __obj.asInstanceOf[Equalizer]
  }
  
  extension [Self <: Equalizer](x: Self) {
    
    inline def setApplyHeight(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "applyHeight", js.Any.fromFunction1(value))
    
    inline def setApplyHeightByRow(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "applyHeightByRow", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetHeights(value: js.Function => js.Array[js.Any]): Self = StObject.set(x, "getHeights", js.Any.fromFunction1(value))
    
    inline def setGetHeightsByRow(value: js.Function => js.Array[js.Any]): Self = StObject.set(x, "getHeightsByRow", js.Any.fromFunction1(value))
  }
}
