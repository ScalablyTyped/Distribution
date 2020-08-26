package typings.expo.dangerZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DangerZone extends js.Object {
  def Animated: js.Any = js.native
  def Branch: js.Any = js.native
  def DeviceMotion: js.Any = js.native
  def Easing: js.Any = js.native
  def Lottie: js.Any = js.native
  def Screen: js.Any = js.native
  def ScreenContainer: js.Any = js.native
  def Stripe: js.Any = js.native
}

object DangerZone {
  @scala.inline
  def apply(
    Animated: () => js.Any,
    Branch: () => js.Any,
    DeviceMotion: () => js.Any,
    Easing: () => js.Any,
    Lottie: () => js.Any,
    Screen: () => js.Any,
    ScreenContainer: () => js.Any,
    Stripe: () => js.Any
  ): DangerZone = {
    val __obj = js.Dynamic.literal(Animated = js.Any.fromFunction0(Animated), Branch = js.Any.fromFunction0(Branch), DeviceMotion = js.Any.fromFunction0(DeviceMotion), Easing = js.Any.fromFunction0(Easing), Lottie = js.Any.fromFunction0(Lottie), Screen = js.Any.fromFunction0(Screen), ScreenContainer = js.Any.fromFunction0(ScreenContainer), Stripe = js.Any.fromFunction0(Stripe))
    __obj.asInstanceOf[DangerZone]
  }
  @scala.inline
  implicit class DangerZoneOps[Self <: DangerZone] (val x: Self) extends AnyVal {
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
    def setAnimated(value: () => js.Any): Self = this.set("Animated", js.Any.fromFunction0(value))
    @scala.inline
    def setBranch(value: () => js.Any): Self = this.set("Branch", js.Any.fromFunction0(value))
    @scala.inline
    def setDeviceMotion(value: () => js.Any): Self = this.set("DeviceMotion", js.Any.fromFunction0(value))
    @scala.inline
    def setEasing(value: () => js.Any): Self = this.set("Easing", js.Any.fromFunction0(value))
    @scala.inline
    def setLottie(value: () => js.Any): Self = this.set("Lottie", js.Any.fromFunction0(value))
    @scala.inline
    def setScreen(value: () => js.Any): Self = this.set("Screen", js.Any.fromFunction0(value))
    @scala.inline
    def setScreenContainer(value: () => js.Any): Self = this.set("ScreenContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setStripe(value: () => js.Any): Self = this.set("Stripe", js.Any.fromFunction0(value))
  }
  
}

