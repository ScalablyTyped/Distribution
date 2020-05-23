package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.anon.IncludeBlocked
import typings.firefoxWebextBrowser.browser.topSites.MostVisitedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
  *
  * Permissions: `topSites`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.topSites")
@js.native
object topSites extends js.Object {
  /* topSites functions */
  /** Gets a list of top sites. */
  def get(): js.Promise[js.Array[MostVisitedURL]] = js.native
  def get(options: IncludeBlocked): js.Promise[js.Array[MostVisitedURL]] = js.native
}

