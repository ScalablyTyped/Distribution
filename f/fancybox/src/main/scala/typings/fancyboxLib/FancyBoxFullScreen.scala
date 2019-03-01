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
    enabled: js.Function0[scala.Boolean],
    exit: js.Function0[scala.Unit],
    isFullscreen: js.Function0[scala.Boolean],
    request: js.Function1[stdLib.HTMLElement, scala.Unit],
    toggle: js.Function1[stdLib.HTMLElement, scala.Unit]
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("exit")(exit)
    __obj.updateDynamic("isFullscreen")(isFullscreen)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
}

