package typings.fancybox

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxFullScreen extends js.Object {
  def enabled(): Boolean
  def exit(): Unit
  def isFullscreen(): Boolean
  def request(elem: HTMLElement): Unit
  def toggle(elem: HTMLElement): Unit
}

object FancyBoxFullScreen {
  @scala.inline
  def apply(
    enabled: () => Boolean,
    exit: () => Unit,
    isFullscreen: () => Boolean,
    request: HTMLElement => Unit,
    toggle: HTMLElement => Unit
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal(enabled = js.Any.fromFunction0(enabled), exit = js.Any.fromFunction0(exit), isFullscreen = js.Any.fromFunction0(isFullscreen), request = js.Any.fromFunction1(request), toggle = js.Any.fromFunction1(toggle))
  
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
}

