package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupDevices extends js.Object {
  def clearDesktopBidModifier(): scala.Unit
  def clearMobileBidModifier(): scala.Unit
  def clearTabletBidModifier(): scala.Unit
  def getDesktopBidModifier(): scala.Double
  def getMobileBidModifier(): scala.Double
  def getTabletBidModifier(): scala.Double
  def setDesktopBidModifier(modifier: scala.Double): scala.Unit
  def setMobileBidModifier(modifier: scala.Double): scala.Unit
  def setTabletBidModifier(modifier: scala.Double): scala.Unit
}

object AdGroupDevices {
  @scala.inline
  def apply(
    clearDesktopBidModifier: js.Function0[scala.Unit],
    clearMobileBidModifier: js.Function0[scala.Unit],
    clearTabletBidModifier: js.Function0[scala.Unit],
    getDesktopBidModifier: js.Function0[scala.Double],
    getMobileBidModifier: js.Function0[scala.Double],
    getTabletBidModifier: js.Function0[scala.Double],
    setDesktopBidModifier: js.Function1[scala.Double, scala.Unit],
    setMobileBidModifier: js.Function1[scala.Double, scala.Unit],
    setTabletBidModifier: js.Function1[scala.Double, scala.Unit]
  ): AdGroupDevices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearDesktopBidModifier")(clearDesktopBidModifier)
    __obj.updateDynamic("clearMobileBidModifier")(clearMobileBidModifier)
    __obj.updateDynamic("clearTabletBidModifier")(clearTabletBidModifier)
    __obj.updateDynamic("getDesktopBidModifier")(getDesktopBidModifier)
    __obj.updateDynamic("getMobileBidModifier")(getMobileBidModifier)
    __obj.updateDynamic("getTabletBidModifier")(getTabletBidModifier)
    __obj.updateDynamic("setDesktopBidModifier")(setDesktopBidModifier)
    __obj.updateDynamic("setMobileBidModifier")(setMobileBidModifier)
    __obj.updateDynamic("setTabletBidModifier")(setTabletBidModifier)
    __obj.asInstanceOf[AdGroupDevices]
  }
}

