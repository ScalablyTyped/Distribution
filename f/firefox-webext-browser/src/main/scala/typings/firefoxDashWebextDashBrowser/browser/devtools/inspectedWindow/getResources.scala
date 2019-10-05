package typings.firefoxDashWebextDashBrowser.browser.devtools.inspectedWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.devtools.inspectedWindow.getResources")
@js.native
object getResources extends js.Object {
  /**
    * Retrieves the list of resources from the inspected page.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): js.Promise[js.Array[Resource]] = js.native
}

