package typings.firefoxDashWebextDashBrowser.browser.topSites

import typings.firefoxDashWebextDashBrowser.Anon_IncludeBlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.topSites.get")
@js.native
object get extends js.Object {
  /* topSites functions */
  /** Gets a list of top sites. */
  def apply(): js.Promise[js.Array[MostVisitedURL]] = js.native
  def apply(options: Anon_IncludeBlocked): js.Promise[js.Array[MostVisitedURL]] = js.native
}

