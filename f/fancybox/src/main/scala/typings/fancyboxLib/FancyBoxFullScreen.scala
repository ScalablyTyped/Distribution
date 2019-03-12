package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxFullScreen extends js.Object {
  def enabled(): scala.Boolean
  def exit(): scala.Unit
  def isFullscreen(): scala.Boolean
  def request(elem: stdLib.HTMLElement): scala.Unit
  def toggle(elem: stdLib.HTMLElement): scala.Unit
}

object FancyBoxFullScreen {
  @scala.inline
  def apply(
    enabled: () => scala.Boolean,
    exit: () => scala.Unit,
    isFullscreen: () => scala.Boolean,
    request: stdLib.HTMLElement => scala.Unit,
    toggle: stdLib.HTMLElement => scala.Unit
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal(enabled = js.Any.fromFunction0(enabled), exit = js.Any.fromFunction0(exit), isFullscreen = js.Any.fromFunction0(isFullscreen), request = js.Any.fromFunction1(request), toggle = js.Any.fromFunction1(toggle))
  
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
}

