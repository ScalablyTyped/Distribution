package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListUpdatesResource extends js.Object {
  /**
    * Fetches the most recent threat list updates. A client can request updates
    * for multiple lists at once.
    */
  def fetch(request: AnonAlt): Request_[FetchThreatListUpdatesResponse]
}

object ThreatListUpdatesResource {
  @scala.inline
  def apply(fetch: AnonAlt => Request_[FetchThreatListUpdatesResponse]): ThreatListUpdatesResource = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
  
    __obj.asInstanceOf[ThreatListUpdatesResource]
  }
}

