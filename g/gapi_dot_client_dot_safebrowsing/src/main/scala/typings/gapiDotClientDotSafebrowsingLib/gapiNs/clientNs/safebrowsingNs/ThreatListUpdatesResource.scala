package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListUpdatesResource extends js.Object {
  /**
    * Fetches the most recent threat list updates. A client can request updates
    * for multiple lists at once.
    */
  def fetch(request: gapiDotClientDotSafebrowsingLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[FetchThreatListUpdatesResponse]
}

object ThreatListUpdatesResource {
  @scala.inline
  def apply(
    fetch: js.Function1[
      gapiDotClientDotSafebrowsingLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[FetchThreatListUpdatesResponse]
    ]
  ): ThreatListUpdatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(fetch)
    __obj.asInstanceOf[ThreatListUpdatesResource]
  }
}

