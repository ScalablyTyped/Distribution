package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.topSites.MostVisitedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoftopSites extends js.Object {
  /* topSites functions */
  /** Gets a list of top sites. */
  def get(): js.Promise[js.Array[MostVisitedURL]] = js.native
  def get(options: IncludeBlocked): js.Promise[js.Array[MostVisitedURL]] = js.native
}

