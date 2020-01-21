package typings.firefoxWebextBrowser.browser.topSites

import typings.firefoxWebextBrowser.AnonIncludeBlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.topSites.get")
@js.native
object get extends js.Object {
  /* topSites functions */
  /** Gets a list of top sites. */
  def apply(): js.Promise[js.Array[MostVisitedURL]] = js.native
  def apply(options: AnonIncludeBlocked): js.Promise[js.Array[MostVisitedURL]] = js.native
}

