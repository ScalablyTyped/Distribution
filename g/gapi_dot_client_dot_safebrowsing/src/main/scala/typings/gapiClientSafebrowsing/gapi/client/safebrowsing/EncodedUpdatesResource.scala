package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSafebrowsing.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedUpdatesResource extends js.Object {
  def get(request: AnonAccesstoken): Request_[FetchThreatListUpdatesResponse]
}

object EncodedUpdatesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[FetchThreatListUpdatesResponse]): EncodedUpdatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[EncodedUpdatesResource]
  }
}

