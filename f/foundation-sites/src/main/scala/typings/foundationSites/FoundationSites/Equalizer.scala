package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/equalizer.html#javascript-reference
@js.native
trait Equalizer extends js.Object {
  
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
  implicit class EqualizerOps[Self <: Equalizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyHeight(value: js.Array[_] => Unit): Self = this.set("applyHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyHeightByRow(value: js.Array[_] => Unit): Self = this.set("applyHeightByRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeights(value: js.Function => js.Array[_]): Self = this.set("getHeights", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeightsByRow(value: js.Function => js.Array[_]): Self = this.set("getHeightsByRow", js.Any.fromFunction1(value))
  }
}
