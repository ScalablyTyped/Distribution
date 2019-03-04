package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsWindowClosing extends js.Object {
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: scala.Boolean
  /** The window whose tab is closed. */
  var windowId: scala.Double
}

object Anon_IsWindowClosing {
  @scala.inline
  def apply(isWindowClosing: scala.Boolean, windowId: scala.Double): Anon_IsWindowClosing = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing, windowId = windowId)
  
    __obj.asInstanceOf[Anon_IsWindowClosing]
  }
}

