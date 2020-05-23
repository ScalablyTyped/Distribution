package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSafebrowsing.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListUpdatesResource extends js.Object {
  /**
    * Fetches the most recent threat list updates. A client can request updates
    * for multiple lists at once.
    */
  def fetch(request: Alt): Request[FetchThreatListUpdatesResponse]
}

object ThreatListUpdatesResource {
  @scala.inline
  def apply(fetch: Alt => Request[FetchThreatListUpdatesResponse]): ThreatListUpdatesResource = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[ThreatListUpdatesResource]
  }
}

