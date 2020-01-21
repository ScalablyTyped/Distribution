package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait canSetBidModifier extends js.Object {
  def getBidModifier(): Double
  def setBidModifier(modifier: Double): Unit
}

object canSetBidModifier {
  @scala.inline
  def apply(getBidModifier: () => Double, setBidModifier: Double => Unit): canSetBidModifier = {
    val __obj = js.Dynamic.literal(getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
  
    __obj.asInstanceOf[canSetBidModifier]
  }
}

