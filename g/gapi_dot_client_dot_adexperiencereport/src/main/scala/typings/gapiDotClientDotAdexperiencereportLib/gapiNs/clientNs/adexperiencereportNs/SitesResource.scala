package typings
package gapiDotClientDotAdexperiencereportLib.gapiNs.clientNs.adexperiencereportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets a summary of the ad experience rating of a site. */
  def get(request: gapiDotClientDotAdexperiencereportLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SiteSummaryResponse]
}

object SitesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAdexperiencereportLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[SiteSummaryResponse]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SitesResource]
  }
}

