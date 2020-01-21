package typings.firefoxWebextBrowser.browser.contextMenus

import typings.firefoxWebextBrowser.AnonCheckedContexts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextMenus.update")
@js.native
object update extends js.Object {
  def apply(id: String, updateProperties: AnonCheckedContexts): js.Promise[Unit] = js.native
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    */
  def apply(id: Double, updateProperties: AnonCheckedContexts): js.Promise[Unit] = js.native
}

