package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSafebrowsing.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedUpdatesResource extends js.Object {
  def get(request: Anon_Accesstoken): Request[FetchThreatListUpdatesResponse]
}

object EncodedUpdatesResource {
  @scala.inline
  def apply(get: Anon_Accesstoken => Request[FetchThreatListUpdatesResponse]): EncodedUpdatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[EncodedUpdatesResource]
  }
}

