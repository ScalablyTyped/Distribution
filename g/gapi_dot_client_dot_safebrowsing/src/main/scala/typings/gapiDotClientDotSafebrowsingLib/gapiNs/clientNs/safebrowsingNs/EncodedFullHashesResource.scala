package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedFullHashesResource extends js.Object {
  def get(request: gapiDotClientDotSafebrowsingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[FindFullHashesResponse]
}

object EncodedFullHashesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotSafebrowsingLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[FindFullHashesResponse]
    ]
  ): EncodedFullHashesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[EncodedFullHashesResource]
  }
}

