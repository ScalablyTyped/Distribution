package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsWindowClosing extends js.Object {
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: Boolean
  /** The window whose tab is closed. */
  var windowId: Double
}

object IsWindowClosing {
  @scala.inline
  def apply(isWindowClosing: Boolean, windowId: Double): IsWindowClosing = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsWindowClosing]
  }
}

