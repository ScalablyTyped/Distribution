package typings.firefoxWebextBrowser.browser.menus

import typings.firefoxWebextBrowser.AnonCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.menus.create")
@js.native
object create extends js.Object {
  /* menus functions */
  /**
    * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the
    * creation callback fires (the details will be in `runtime.lastError`).
    * @param [callback] Called when the item has been created in the browser. If there were any problems creating the
    *     item, details will be available in `runtime.lastError`.
    * @returns The ID of the newly created item.
    */
  def apply(createProperties: AnonCommand): Double | String = js.native
  def apply(createProperties: AnonCommand, callback: js.Function0[Unit]): Double | String = js.native
}

