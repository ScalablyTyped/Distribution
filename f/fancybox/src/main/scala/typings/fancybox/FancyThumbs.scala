package typings.fancybox

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
  var isActive: Boolean
  var isVisible: Boolean
  var opts: FancyThumbsOptions
  def create(): Unit
  def focus(duration: Double): Unit
  def hide(): Unit
  def init(instance: FancyBoxInstance): Unit
  def show(): Unit
  def toggle(): Unit
  def update(): Unit
}

object FancyThumbs {
  @scala.inline
  def apply(
    create: () => Unit,
    focus: Double => Unit,
    hide: () => Unit,
    init: FancyBoxInstance => Unit,
    instance: FancyBoxInstance,
    isActive: Boolean,
    isVisible: Boolean,
    opts: FancyThumbsOptions,
    show: () => Unit,
    toggle: () => Unit,
    update: () => Unit,
    $button: JQuery = null,
    $grid: JQuery = null,
    $list: JQuery = null
  ): FancyThumbs = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), focus = js.Any.fromFunction1(focus), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction1(init), instance = instance.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), update = js.Any.fromFunction0(update))
    if ($button != null) __obj.updateDynamic("$button")($button.asInstanceOf[js.Any])
    if ($grid != null) __obj.updateDynamic("$grid")($grid.asInstanceOf[js.Any])
    if ($list != null) __obj.updateDynamic("$list")($list.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyThumbs]
  }
}

