package typings.fpsmeter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FPSMeter extends js.Object {
  var options: FPSMeterOptions
  def destroy(): Unit
  def hide(): FPSMeter
  def pause(): FPSMeter
  def resume(): FPSMeter
  def set(name: String, value: js.Any): FPSMeter
  def show(): FPSMeter
  def showDuration(): FPSMeter
  def showFps(): FPSMeter
  def tick(): Unit
  def tickStart(): Unit
  def toggle(): FPSMeter
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
}

