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
    get: js.Function1[
      gapiDotClientDotSafebrowsingLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[FetchThreatListUpdatesResponse]
    ]
  ): EncodedUpdatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[EncodedUpdatesResource]
  }
}

