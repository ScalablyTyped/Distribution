package typings
package gapiDotClientDotAcceleratedmobilepageurlLib.gapiNs.clientNs.acceleratedmobilepageurlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpUrlsResource extends js.Object {
  /**
    * Returns AMP URL(s) and equivalent
    * [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
    */
  def batchGet(request: gapiDotClientDotAcceleratedmobilepageurlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetAmpUrlsResponse]
}

object AmpUrlsResource {
  @scala.inline
  def apply(
    batchGet: js.Function1[
      gapiDotClientDotAcceleratedmobilepageurlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchGetAmpUrlsResponse]
    ]
  ): AmpUrlsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchGet")(batchGet)
    __obj.asInstanceOf[AmpUrlsResource]
  }
}

