package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait canSetBidModifier extends js.Object {
  def getBidModifier(): scala.Double
  def setBidModifier(modifier: scala.Double): scala.Unit
}

object canSetBidModifier {
  @scala.inline
  def apply(getBidModifier: () => scala.Double, setBidModifier: scala.Double => scala.Unit): canSetBidModifier = {
    val __obj = js.Dynamic.literal(getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
  
    __obj.asInstanceOf[canSetBidModifier]
  }
}

