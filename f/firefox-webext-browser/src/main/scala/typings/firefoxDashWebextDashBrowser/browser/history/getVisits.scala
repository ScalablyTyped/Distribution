package typings.firefoxDashWebextDashBrowser.browser.history

import typings.firefoxDashWebextDashBrowser.Anon_Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history.getVisits")
@js.native
object getVisits extends js.Object {
  /** Retrieves information about visits to a URL. */
  def apply(details: Anon_Url): js.Promise[js.Array[VisitItem]] = js.native
}

