package typings.firefoxWebextBrowser.browser.browserSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** After which mouse event context menus should popup. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown
*/
trait ContextMenuMouseEvent extends js.Object

object ContextMenuMouseEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mousedown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def mouseup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup = this.cast("mouseup")
}

