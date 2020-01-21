package typings.firefoxWebextBrowser.browser.history

import typings.firefoxWebextBrowser.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history.getVisits")
@js.native
object getVisits extends js.Object {
  /** Retrieves information about visits to a URL. */
  def apply(details: AnonUrl): js.Promise[js.Array[VisitItem]] = js.native
}

