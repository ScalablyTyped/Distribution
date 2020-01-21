package typings.firefoxWebextBrowser.browser.windows

import typings.firefoxWebextBrowser.AnonPopulateWindowTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.windows.getAll")
@js.native
object getAll extends js.Object {
  /**
    * Gets all windows.
    * @param [getInfo] Specifies properties used to filter the `windows.Window` returned and to determine whether they
    *     should contain a list of the `tabs.Tab` objects.
    */
  def apply(): js.Promise[js.Array[Window]] = js.native
  def apply(getInfo: AnonPopulateWindowTypes): js.Promise[js.Array[Window]] = js.native
}

