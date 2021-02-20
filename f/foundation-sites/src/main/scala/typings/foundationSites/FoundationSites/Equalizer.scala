package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/equalizer.html#javascript-reference
@js.native
trait Equalizer extends StObject {
  
  def applyHeight(heights: js.Array[_]): Unit = js.native
  
  def applyHeightByRow(groups: js.Array[_]): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getHeights(cb: js.Function): js.Array[_] = js.native
  
  def getHeightsByRow(cb: js.Function): js.Array[_] = js.native
}
object Equalizer {
  
  @scala.inline
  def apply(
    applyHeight: js.Array[_] => Unit,
    applyHeightByRow: js.Array[_] => Unit,
    destroy: () => Unit,
    getHeights: js.Function => js.Array[_],
    getHeightsByRow: js.Function => js.Array[_]
  ): Equalizer = {
    val __obj = js.Dynamic.literal(applyHeight = js.Any.fromFunction1(applyHeight), applyHeightByRow = js.Any.fromFunction1(applyHeightByRow), destroy = js.Any.fromFunction0(destroy), getHeights = js.Any.fromFunction1(getHeights), getHeightsByRow = js.Any.fromFunction1(getHeightsByRow))
    __obj.asInstanceOf[Equalizer]
  }
  
  @scala.inline
  implicit class EqualizerMutableBuilder[Self <: Equalizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyHeight(value: js.Array[_] => Unit): Self = StObject.set(x, "applyHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyHeightByRow(value: js.Array[_] => Unit): Self = StObject.set(x, "applyHeightByRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeights(value: js.Function => js.Array[_]): Self = StObject.set(x, "getHeights", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeightsByRow(value: js.Function => js.Array[_]): Self = StObject.set(x, "getHeightsByRow", js.Any.fromFunction1(value))
  }
}
