package typings.firefoxWebextBrowser.browser.contextMenus

import typings.firefoxWebextBrowser.AnonBookmarkId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextMenus.overrideContext")
@js.native
object overrideContext extends js.Object {
  /**
    * Show the matching menu items from this extension instead of the default menu. This should be called during a
    * 'contextmenu' DOM event handler, and only applies to the menu that opens after this event.
    */
  def apply(contextOptions: AnonBookmarkId): Unit = js.native
}

