package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSafebrowsing.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedFullHashesResource extends js.Object {
  def get(request: Anon_Accesstoken): Request[FindFullHashesResponse]
}

object EncodedFullHashesResource {
  @scala.inline
  def apply(get: Anon_Accesstoken => Request[FindFullHashesResponse]): EncodedFullHashesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[EncodedFullHashesResource]
  }
}

