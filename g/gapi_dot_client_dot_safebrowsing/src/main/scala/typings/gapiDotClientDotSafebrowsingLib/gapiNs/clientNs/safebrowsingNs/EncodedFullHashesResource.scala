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
    get: gapiDotClientDotSafebrowsingLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[FindFullHashesResponse]
  ): EncodedFullHashesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[EncodedFullHashesResource]
  }
}

