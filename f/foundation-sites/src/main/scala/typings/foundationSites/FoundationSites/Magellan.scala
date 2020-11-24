package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/magellan.html#javascript-reference
@js.native
trait Magellan extends js.Object {
  
  def calcPoints(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def reflow(): Unit = js.native
  
  def scrollToLoc(location: String): Unit = js.native
}
object Magellan {
  
  @scala.inline
  def apply(calcPoints: () => Unit, destroy: () => Unit, reflow: () => Unit, scrollToLoc: String => Unit): Magellan = {
    val __obj = js.Dynamic.literal(calcPoints = js.Any.fromFunction0(calcPoints), destroy = js.Any.fromFunction0(destroy), reflow = js.Any.fromFunction0(reflow), scrollToLoc = js.Any.fromFunction1(scrollToLoc))
    __obj.asInstanceOf[Magellan]
  }
  
  @scala.inline
  implicit class MagellanOps[Self <: Magellan] (val x: Self) extends AnyVal {
    
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
    def setCalcPoints(value: () => Unit): Self = this.set("calcPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReflow(value: () => Unit): Self = this.set("reflow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollToLoc(value: String => Unit): Self = this.set("scrollToLoc", js.Any.fromFunction1(value))
  }
}
