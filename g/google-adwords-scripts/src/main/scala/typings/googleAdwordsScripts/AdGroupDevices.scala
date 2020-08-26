package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupDevices extends js.Object {
  def clearDesktopBidModifier(): Unit = js.native
  def clearMobileBidModifier(): Unit = js.native
  def clearTabletBidModifier(): Unit = js.native
  def getDesktopBidModifier(): Double = js.native
  def getMobileBidModifier(): Double = js.native
  def getTabletBidModifier(): Double = js.native
  def setDesktopBidModifier(modifier: Double): Unit = js.native
  def setMobileBidModifier(modifier: Double): Unit = js.native
  def setTabletBidModifier(modifier: Double): Unit = js.native
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
  @scala.inline
  implicit class AdGroupDevicesOps[Self <: AdGroupDevices] (val x: Self) extends AnyVal {
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
    def setClearDesktopBidModifier(value: () => Unit): Self = this.set("clearDesktopBidModifier", js.Any.fromFunction0(value))
    @scala.inline
    def setClearMobileBidModifier(value: () => Unit): Self = this.set("clearMobileBidModifier", js.Any.fromFunction0(value))
    @scala.inline
    def setClearTabletBidModifier(value: () => Unit): Self = this.set("clearTabletBidModifier", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDesktopBidModifier(value: () => Double): Self = this.set("getDesktopBidModifier", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMobileBidModifier(value: () => Double): Self = this.set("getMobileBidModifier", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTabletBidModifier(value: () => Double): Self = this.set("getTabletBidModifier", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDesktopBidModifier(value: Double => Unit): Self = this.set("setDesktopBidModifier", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMobileBidModifier(value: Double => Unit): Self = this.set("setMobileBidModifier", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTabletBidModifier(value: Double => Unit): Self = this.set("setTabletBidModifier", js.Any.fromFunction1(value))
  }
  
}

