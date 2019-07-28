package typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotSafebrowsing.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListUpdatesResource extends js.Object {
  /**
    * Fetches the most recent threat list updates. A client can request updates
    * for multiple lists at once.
    */
  def fetch(request: Anon_AccesstokenAlt): Request[FetchThreatListUpdatesResponse]
}

object ThreatListUpdatesResource {
  @scala.inline
  def apply(fetch: Anon_AccesstokenAlt => Request[FetchThreatListUpdatesResponse]): ThreatListUpdatesResource = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
  
    __obj.asInstanceOf[ThreatListUpdatesResource]
  }
}

