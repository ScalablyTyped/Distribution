package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyThumbs extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.native
  @JSName("$grid")
  var $grid: js.UndefOr[JQuery] = js.native
  @JSName("$list")
  var $list: js.UndefOr[JQuery] = js.native
  var instance: FancyBoxInstance = js.native
  var isActive: Boolean = js.native
  var isVisible: Boolean = js.native
  var opts: FancyThumbsOptions = js.native
  def create(): Unit = js.native
  def focus(duration: Double): Unit = js.native
  def hide(): Unit = js.native
  def init(instance: FancyBoxInstance): Unit = js.native
  def show(): Unit = js.native
  def toggle(): Unit = js.native
  def update(): Unit = js.native
}

