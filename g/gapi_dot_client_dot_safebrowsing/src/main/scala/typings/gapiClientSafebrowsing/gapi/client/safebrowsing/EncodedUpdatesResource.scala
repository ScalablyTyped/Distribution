package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSafebrowsing.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedUpdatesResource extends js.Object {
  def get(request: Accesstoken): Request[FetchThreatListUpdatesResponse]
}

object EncodedUpdatesResource {
  @scala.inline
  def apply(get: Accesstoken => Request[FetchThreatListUpdatesResponse]): EncodedUpdatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[EncodedUpdatesResource]
  }
}

