package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAudienceBidding extends canSetBidModifier {
  def clearBidModifier(): Unit
}

object SearchAudienceBidding {
  @scala.inline
  def apply(clearBidModifier: () => Unit, getBidModifier: () => Double, setBidModifier: Double => Unit): SearchAudienceBidding = {
    val __obj = js.Dynamic.literal(clearBidModifier = js.Any.fromFunction0(clearBidModifier), getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
  
    __obj.asInstanceOf[SearchAudienceBidding]
  }
}

