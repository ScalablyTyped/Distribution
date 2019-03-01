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
  def apply(getBidModifier: js.Function0[scala.Double], setBidModifier: js.Function1[scala.Double, scala.Unit]): canSetBidModifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBidModifier")(getBidModifier)
    __obj.updateDynamic("setBidModifier")(setBidModifier)
    __obj.asInstanceOf[canSetBidModifier]
  }
}

