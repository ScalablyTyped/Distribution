package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsWindowClosing extends js.Object {
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: Boolean
  /** The window whose tab is closed. */
  var windowId: Double
}

object AnonIsWindowClosing {
  @scala.inline
  def apply(isWindowClosing: Boolean, windowId: Double): AnonIsWindowClosing = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsWindowClosing]
  }
}

