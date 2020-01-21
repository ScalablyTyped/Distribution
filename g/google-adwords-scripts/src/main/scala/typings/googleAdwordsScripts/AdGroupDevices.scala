package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupDevices extends js.Object {
  def clearDesktopBidModifier(): Unit
  def clearMobileBidModifier(): Unit
  def clearTabletBidModifier(): Unit
  def getDesktopBidModifier(): Double
  def getMobileBidModifier(): Double
  def getTabletBidModifier(): Double
  def setDesktopBidModifier(modifier: Double): Unit
  def setMobileBidModifier(modifier: Double): Unit
  def setTabletBidModifier(modifier: Double): Unit
}

object AdGroupDevices {
  @scala.inline
  def apply(
    clearDesktopBidModifier: () => Unit,
    clearMobileBidModifier: () => Unit,
    clearTabletBidModifier: () => Unit,
    getDesktopBidModifier: () => Double,
    getMobileBidModifier: () => Double,
    getTabletBidModifier: () => Double,
    setDesktopBidModifier: Double => Unit,
    setMobileBidModifier: Double => Unit,
    setTabletBidModifier: Double => Unit
  ): AdGroupDevices = {
    val __obj = js.Dynamic.literal(clearDesktopBidModifier = js.Any.fromFunction0(clearDesktopBidModifier), clearMobileBidModifier = js.Any.fromFunction0(clearMobileBidModifier), clearTabletBidModifier = js.Any.fromFunction0(clearTabletBidModifier), getDesktopBidModifier = js.Any.fromFunction0(getDesktopBidModifier), getMobileBidModifier = js.Any.fromFunction0(getMobileBidModifier), getTabletBidModifier = js.Any.fromFunction0(getTabletBidModifier), setDesktopBidModifier = js.Any.fromFunction1(setDesktopBidModifier), setMobileBidModifier = js.Any.fromFunction1(setMobileBidModifier), setTabletBidModifier = js.Any.fromFunction1(setTabletBidModifier))
  
    __obj.asInstanceOf[AdGroupDevices]
  }
}

