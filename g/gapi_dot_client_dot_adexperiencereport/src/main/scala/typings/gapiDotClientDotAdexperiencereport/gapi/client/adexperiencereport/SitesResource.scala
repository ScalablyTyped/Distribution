package typings.gapiDotClientDotAdexperiencereport.gapi.client.adexperiencereport

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexperiencereport.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets a summary of the ad experience rating of a site. */
  def get(request: Anon_Accesstoken): Request[SiteSummaryResponse]
}

object SitesResource {
  @scala.inline
  def apply(get: Anon_Accesstoken => Request[SiteSummaryResponse]): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SitesResource]
  }
}

