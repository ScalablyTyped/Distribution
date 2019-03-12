package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyThumbs extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.undefined
  @JSName("$grid")
  var $grid: js.UndefOr[JQuery] = js.undefined
  @JSName("$list")
  var $list: js.UndefOr[JQuery] = js.undefined
  var instance: FancyBoxInstance
  var isActive: scala.Boolean
  var isVisible: scala.Boolean
  var opts: FancyThumbsOptions
  def create(): scala.Unit
  def focus(duration: scala.Double): scala.Unit
  def hide(): scala.Unit
  def init(instance: FancyBoxInstance): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
  def update(): scala.Unit
}

object FancyThumbs {
  @scala.inline
  def apply(
    create: () => scala.Unit,
    focus: scala.Double => scala.Unit,
    hide: () => scala.Unit,
    init: FancyBoxInstance => scala.Unit,
    instance: FancyBoxInstance,
    isActive: scala.Boolean,
    isVisible: scala.Boolean,
    opts: FancyThumbsOptions,
    show: () => scala.Unit,
    toggle: () => scala.Unit,
    update: () => scala.Unit,
    $button: JQuery = null,
    $grid: JQuery = null,
    $list: JQuery = null
  ): FancyThumbs = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), focus = js.Any.fromFunction1(focus), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction1(init), instance = instance, isActive = isActive, isVisible = isVisible, opts = opts, show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), update = js.Any.fromFunction0(update))
    if ($button != null) __obj.updateDynamic("$button")($button)
    if ($grid != null) __obj.updateDynamic("$grid")($grid)
    if ($list != null) __obj.updateDynamic("$list")($list)
    __obj.asInstanceOf[FancyThumbs]
  }
}

