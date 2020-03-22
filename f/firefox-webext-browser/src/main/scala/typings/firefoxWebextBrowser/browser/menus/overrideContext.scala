package typings.firefoxWebextBrowser.browser.menus

import typings.firefoxWebextBrowser.AnonContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.menus.overrideContext")
@js.native
object overrideContext extends js.Object {
  /**
    * Show the matching menu items from this extension instead of the default menu. This should be called during a
    * 'contextmenu' DOM event handler, and only applies to the menu that opens after this event.
    */
  def apply(contextOptions: AnonContext): Unit = js.native
}

