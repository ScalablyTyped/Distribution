package typings.firefoxDashWebextDashBrowser.browser.extension

import typings.firefoxDashWebextDashBrowser.Anon_TabId
import typings.firefoxDashWebextDashBrowser.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.extension.getViews")
@js.native
object getViews extends js.Object {
  /**
    * Returns an array of the JavaScript 'window' objects for each of the pages running inside the current extension.
    * @returns Array of global objects
    */
  def apply(): js.Array[Window] = js.native
  def apply(fetchProperties: Anon_TabId): js.Array[Window] = js.native
}

