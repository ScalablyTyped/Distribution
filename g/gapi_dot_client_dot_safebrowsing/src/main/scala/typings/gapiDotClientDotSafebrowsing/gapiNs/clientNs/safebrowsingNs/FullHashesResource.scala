package typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotSafebrowsing.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullHashesResource extends js.Object {
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: Anon_AccesstokenAlt): Request[FindFullHashesResponse]
}

object FullHashesResource {
  @scala.inline
  def apply(find: Anon_AccesstokenAlt => Request[FindFullHashesResponse]): FullHashesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
  
    __obj.asInstanceOf[FullHashesResource]
  }
}

