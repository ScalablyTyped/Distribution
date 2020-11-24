package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait canSetBidModifier extends js.Object {
  
  def getBidModifier(): Double = js.native
  
  def setBidModifier(modifier: Double): Unit = js.native
}
object canSetBidModifier {
  
  @scala.inline
  def apply(getBidModifier: () => Double, setBidModifier: Double => Unit): canSetBidModifier = {
    val __obj = js.Dynamic.literal(getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[canSetBidModifier]
  }
  
  @scala.inline
  implicit class canSetBidModifierOps[Self <: canSetBidModifier] (val x: Self) extends AnyVal {
    
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
    def setGetBidModifier(value: () => Double): Self = this.set("getBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBidModifier(value: Double => Unit): Self = this.set("setBidModifier", js.Any.fromFunction1(value))
  }
}
