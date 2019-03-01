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
    clear: js.Function0[scala.Unit],
    init: js.Function0[scala.Unit],
    instance: FancyBoxInstance,
    isActive: scala.Boolean,
    set: js.Function1[scala.Boolean, scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit],
    $button: JQuery = null,
    timer: scala.Int | scala.Double = null
  ): FancyBoxSlideShow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$progress")($progress)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("toggle")(toggle)
    if ($button != null) __obj.updateDynamic("$button")($button)
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlideShow]
  }
}

