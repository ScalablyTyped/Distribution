package typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexperiencereport.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets a summary of the ad experience rating of a site. */
  def get(request: Accesstoken): Request[SiteSummaryResponse]
}

object SitesResource {
  @scala.inline
  def apply(get: Accesstoken => Request[SiteSummaryResponse]): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SitesResource]
  }
}

