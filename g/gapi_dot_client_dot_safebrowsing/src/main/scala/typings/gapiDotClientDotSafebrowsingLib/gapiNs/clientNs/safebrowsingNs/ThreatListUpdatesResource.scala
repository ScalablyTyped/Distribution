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

