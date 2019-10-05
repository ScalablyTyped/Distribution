package typings.firefoxDashWebextDashBrowser.browser.browsingData

import typings.firefoxDashWebextDashBrowser.Anon_DataRemovalPermitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browsingData.settings")
@js.native
object settings extends js.Object {
  /* browsingData functions */
  /**
    * Reports which types of data are currently selected in the 'Clear browsing data' settings UI. Note: some of the
    * data types included in this API are not available in the settings UI, and some UI settings control more than one
    * data type listed here.
    */
  def apply(): js.Promise[Anon_DataRemovalPermitted] = js.native
}

