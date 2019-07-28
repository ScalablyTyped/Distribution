package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxSlideShow extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.undefined
  @JSName("$progress")
  var $progress: JQuery
  var instance: FancyBoxInstance
  var isActive: Boolean
  var timer: js.UndefOr[Double] = js.undefined
  def clear(): Unit
  def init(): Unit
  def set(force: Boolean): Unit
  def start(): Unit
  def stop(): Unit
  def toggle(): Unit
}

object FancyBoxSlideShow {
  @scala.inline
  def apply(
    $progress: JQuery,
    clear: () => Unit,
    init: () => Unit,
    instance: FancyBoxInstance,
    isActive: Boolean,
    set: Boolean => Unit,
    start: () => Unit,
    stop: () => Unit,
    toggle: () => Unit,
    $button: JQuery = null,
    timer: Int | Double = null
  ): FancyBoxSlideShow = {
    val __obj = js.Dynamic.literal($progress = $progress, clear = js.Any.fromFunction0(clear), init = js.Any.fromFunction0(init), instance = instance, isActive = isActive, set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
    if ($button != null) __obj.updateDynamic("$button")($button)
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlideShow]
  }
}

