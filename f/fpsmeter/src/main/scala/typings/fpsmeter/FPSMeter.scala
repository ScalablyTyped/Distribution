package typings.fpsmeter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FPSMeter extends js.Object {
  var options: FPSMeterOptions = js.native
  def destroy(): Unit = js.native
  def hide(): FPSMeter = js.native
  def pause(): FPSMeter = js.native
  def resume(): FPSMeter = js.native
  def set(name: String, value: js.Any): FPSMeter = js.native
  def show(): FPSMeter = js.native
  def showDuration(): FPSMeter = js.native
  def showFps(): FPSMeter = js.native
  def tick(): Unit = js.native
  def tickStart(): Unit = js.native
  def toggle(): FPSMeter = js.native
}

object FPSMeter {
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => FPSMeter,
    options: FPSMeterOptions,
    pause: () => FPSMeter,
    resume: () => FPSMeter,
    set: (String, js.Any) => FPSMeter,
    show: () => FPSMeter,
    showDuration: () => FPSMeter,
    showFps: () => FPSMeter,
    tick: () => Unit,
    tickStart: () => Unit,
    toggle: () => FPSMeter
  ): FPSMeter = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), options = options.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), set = js.Any.fromFunction2(set), show = js.Any.fromFunction0(show), showDuration = js.Any.fromFunction0(showDuration), showFps = js.Any.fromFunction0(showFps), tick = js.Any.fromFunction0(tick), tickStart = js.Any.fromFunction0(tickStart), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[FPSMeter]
  }
  @scala.inline
  implicit class FPSMeterOps[Self <: FPSMeter] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => FPSMeter): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: FPSMeterOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: () => FPSMeter): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => FPSMeter): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, js.Any) => FPSMeter): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setShow(value: () => FPSMeter): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setShowDuration(value: () => FPSMeter): Self = this.set("showDuration", js.Any.fromFunction0(value))
    @scala.inline
    def setShowFps(value: () => FPSMeter): Self = this.set("showFps", js.Any.fromFunction0(value))
    @scala.inline
    def setTick(value: () => Unit): Self = this.set("tick", js.Any.fromFunction0(value))
    @scala.inline
    def setTickStart(value: () => Unit): Self = this.set("tickStart", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => FPSMeter): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

