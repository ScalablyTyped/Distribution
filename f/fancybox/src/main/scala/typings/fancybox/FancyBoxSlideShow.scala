package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxSlideShow extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.native
  @JSName("$progress")
  var $progress: JQuery = js.native
  var instance: FancyBoxInstance = js.native
  var isActive: Boolean = js.native
  var timer: js.UndefOr[Double] = js.native
  def clear(): Unit = js.native
  def init(): Unit = js.native
  def set(force: Boolean): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def toggle(): Unit = js.native
}

