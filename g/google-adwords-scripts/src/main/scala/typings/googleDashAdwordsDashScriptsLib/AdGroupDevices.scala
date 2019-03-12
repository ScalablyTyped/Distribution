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
    clearDesktopBidModifier: () => scala.Unit,
    clearMobileBidModifier: () => scala.Unit,
    clearTabletBidModifier: () => scala.Unit,
    getDesktopBidModifier: () => scala.Double,
    getMobileBidModifier: () => scala.Double,
    getTabletBidModifier: () => scala.Double,
    setDesktopBidModifier: scala.Double => scala.Unit,
    setMobileBidModifier: scala.Double => scala.Unit,
    setTabletBidModifier: scala.Double => scala.Unit
  ): AdGroupDevices = {
    val __obj = js.Dynamic.literal(clearDesktopBidModifier = js.Any.fromFunction0(clearDesktopBidModifier), clearMobileBidModifier = js.Any.fromFunction0(clearMobileBidModifier), clearTabletBidModifier = js.Any.fromFunction0(clearTabletBidModifier), getDesktopBidModifier = js.Any.fromFunction0(getDesktopBidModifier), getMobileBidModifier = js.Any.fromFunction0(getMobileBidModifier), getTabletBidModifier = js.Any.fromFunction0(getTabletBidModifier), setDesktopBidModifier = js.Any.fromFunction1(setDesktopBidModifier), setMobileBidModifier = js.Any.fromFunction1(setMobileBidModifier), setTabletBidModifier = js.Any.fromFunction1(setTabletBidModifier))
  
    __obj.asInstanceOf[AdGroupDevices]
  }
}

