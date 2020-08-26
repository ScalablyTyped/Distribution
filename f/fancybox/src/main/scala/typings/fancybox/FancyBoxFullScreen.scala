package typings.fancybox

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxFullScreen extends js.Object {
  def enabled(): Boolean = js.native
  def exit(): Unit = js.native
  def isFullscreen(): Boolean = js.native
  def request(elem: HTMLElement): Unit = js.native
  def toggle(elem: HTMLElement): Unit = js.native
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
  @scala.inline
  implicit class FancyBoxFullScreenOps[Self <: FancyBoxFullScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: () => Boolean): Self = this.set("enabled", js.Any.fromFunction0(value))
    @scala.inline
    def setExit(value: () => Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFullscreen(value: () => Boolean): Self = this.set("isFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def setRequest(value: HTMLElement => Unit): Self = this.set("request", js.Any.fromFunction1(value))
    @scala.inline
    def setToggle(value: HTMLElement => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
  }
  
}

