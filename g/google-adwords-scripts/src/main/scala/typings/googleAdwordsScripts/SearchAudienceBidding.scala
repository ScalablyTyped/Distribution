package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAudienceBidding extends canSetBidModifier {
  
  def clearBidModifier(): Unit = js.native
}
object SearchAudienceBidding {
  
  @scala.inline
  def apply(clearBidModifier: () => Unit, getBidModifier: () => Double, setBidModifier: Double => Unit): SearchAudienceBidding = {
    val __obj = js.Dynamic.literal(clearBidModifier = js.Any.fromFunction0(clearBidModifier), getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[SearchAudienceBidding]
  }
  
  @scala.inline
  implicit class SearchAudienceBiddingOps[Self <: SearchAudienceBidding] (val x: Self) extends AnyVal {
    
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
    def setClearBidModifier(value: () => Unit): Self = this.set("clearBidModifier", js.Any.fromFunction0(value))
  }
}
