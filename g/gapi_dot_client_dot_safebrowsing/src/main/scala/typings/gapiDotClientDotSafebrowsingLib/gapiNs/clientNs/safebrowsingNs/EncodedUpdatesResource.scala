package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedUpdatesResource extends js.Object {
  def get(request: gapiDotClientDotSafebrowsingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[FetchThreatListUpdatesResponse]
}

object EncodedUpdatesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotSafebrowsingLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[FetchThreatListUpdatesResponse]
  ): EncodedUpdatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[EncodedUpdatesResource]
  }
}

