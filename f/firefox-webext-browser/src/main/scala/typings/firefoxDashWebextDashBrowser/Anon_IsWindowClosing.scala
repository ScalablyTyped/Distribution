package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsWindowClosing extends js.Object {
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: Boolean
  /** The window whose tab is closed. */
  var windowId: Double
}

object Anon_IsWindowClosing {
  @scala.inline
  def apply(isWindowClosing: Boolean, windowId: Double): Anon_IsWindowClosing = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing, windowId = windowId)
  
    __obj.asInstanceOf[Anon_IsWindowClosing]
  }
}

