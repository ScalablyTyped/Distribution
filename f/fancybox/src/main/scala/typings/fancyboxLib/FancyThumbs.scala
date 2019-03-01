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
    create: js.Function0[scala.Unit],
    focus: js.Function1[scala.Double, scala.Unit],
    hide: js.Function0[scala.Unit],
    init: js.Function1[FancyBoxInstance, scala.Unit],
    instance: FancyBoxInstance,
    isActive: scala.Boolean,
    isVisible: scala.Boolean,
    opts: FancyThumbsOptions,
    show: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit],
    $button: JQuery = null,
    $grid: JQuery = null,
    $list: JQuery = null
  ): FancyThumbs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("opts")(opts)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("update")(update)
    if ($button != null) __obj.updateDynamic("$button")($button)
    if ($grid != null) __obj.updateDynamic("$grid")($grid)
    if ($list != null) __obj.updateDynamic("$list")($list)
    __obj.asInstanceOf[FancyThumbs]
  }
}

