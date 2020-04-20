package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullHashesResource extends js.Object {
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: AnonAlt): Request_[FindFullHashesResponse]
}

object FullHashesResource {
  @scala.inline
  def apply(find: AnonAlt => Request_[FindFullHashesResponse]): FullHashesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[FullHashesResource]
  }
}

