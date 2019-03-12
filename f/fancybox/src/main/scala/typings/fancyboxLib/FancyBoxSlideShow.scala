package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxSlideShow extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.undefined
  @JSName("$progress")
  var $progress: JQuery
  var instance: FancyBoxInstance
  var isActive: scala.Boolean
  var timer: js.UndefOr[scala.Double] = js.undefined
  def clear(): scala.Unit
  def init(): scala.Unit
  def set(force: scala.Boolean): scala.Unit
  def start(): scala.Unit
  def stop(): scala.Unit
  def toggle(): scala.Unit
}

object FancyBoxSlideShow {
  @scala.inline
  def apply(
    $progress: JQuery,
    clear: () => scala.Unit,
    init: () => scala.Unit,
    instance: FancyBoxInstance,
    isActive: scala.Boolean,
    set: scala.Boolean => scala.Unit,
    start: () => scala.Unit,
    stop: () => scala.Unit,
    toggle: () => scala.Unit,
    $button: JQuery = null,
    timer: scala.Int | scala.Double = null
  ): FancyBoxSlideShow = {
    val __obj = js.Dynamic.literal($progress = $progress, clear = js.Any.fromFunction0(clear), init = js.Any.fromFunction0(init), instance = instance, isActive = isActive, set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
    if ($button != null) __obj.updateDynamic("$button")($button)
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlideShow]
  }
}

