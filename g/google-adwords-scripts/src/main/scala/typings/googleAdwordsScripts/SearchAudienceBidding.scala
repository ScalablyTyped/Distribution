package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
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
  implicit class SearchAudienceBiddingMutableBuilder[Self <: SearchAudienceBidding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearBidModifier(value: () => Unit): Self = StObject.set(x, "clearBidModifier", js.Any.fromFunction0(value))
  }
}
