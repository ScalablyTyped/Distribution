package typings.firefoxDashWebextDashBrowser.browser.browserSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** After which mouse event context menus should popup. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.mouseup
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.mousedown
*/
trait ContextMenuMouseEvent extends js.Object

object ContextMenuMouseEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mousedown: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def mouseup: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.mouseup = this.cast("mouseup")
}

