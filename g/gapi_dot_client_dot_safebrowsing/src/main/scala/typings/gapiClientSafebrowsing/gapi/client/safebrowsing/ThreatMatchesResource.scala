package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatMatchesResource extends js.Object {
  /** Finds the threat entries that match the Safe Browsing lists. */
  def find(request: AnonAlt): Request_[FindThreatMatchesResponse]
}

object ThreatMatchesResource {
  @scala.inline
  def apply(find: AnonAlt => Request_[FindThreatMatchesResponse]): ThreatMatchesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
  
    __obj.asInstanceOf[ThreatMatchesResource]
  }
}

