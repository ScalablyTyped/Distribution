package typings.firefoxDashWebextDashBrowser.browserNs.topSitesNs

import typings.firefoxDashWebextDashBrowser.Anon_IncludeBlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.topSites")
@js.native
object ^ extends js.Object {
  /* topSites functions */
  /** Gets a list of top sites. */
  def get(): js.Promise[js.Array[MostVisitedURL]] = js.native
  def get(options: Anon_IncludeBlocked): js.Promise[js.Array[MostVisitedURL]] = js.native
}

