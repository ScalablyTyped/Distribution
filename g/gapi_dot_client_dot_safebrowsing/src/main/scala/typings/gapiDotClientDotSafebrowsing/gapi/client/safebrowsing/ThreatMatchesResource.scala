package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSafebrowsing.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatMatchesResource extends js.Object {
  /** Finds the threat entries that match the Safe Browsing lists. */
  def find(request: Anon_AccesstokenAlt): Request[FindThreatMatchesResponse]
}

object ThreatMatchesResource {
  @scala.inline
  def apply(find: Anon_AccesstokenAlt => Request[FindThreatMatchesResponse]): ThreatMatchesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
  
    __obj.asInstanceOf[ThreatMatchesResource]
  }
}

