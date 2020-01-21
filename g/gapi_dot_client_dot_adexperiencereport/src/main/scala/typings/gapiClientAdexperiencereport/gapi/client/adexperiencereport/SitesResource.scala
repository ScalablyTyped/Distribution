package typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexperiencereport.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets a summary of the ad experience rating of a site. */
  def get(request: AnonAccesstoken): Request_[SiteSummaryResponse]
}

object SitesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[SiteSummaryResponse]): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SitesResource]
  }
}

