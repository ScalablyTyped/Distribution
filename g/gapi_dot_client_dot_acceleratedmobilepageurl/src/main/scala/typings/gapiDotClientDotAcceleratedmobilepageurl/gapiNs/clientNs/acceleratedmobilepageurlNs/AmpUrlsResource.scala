package typings.gapiDotClientDotAcceleratedmobilepageurl.gapiNs.clientNs.acceleratedmobilepageurlNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAcceleratedmobilepageurl.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpUrlsResource extends js.Object {
  /**
    * Returns AMP URL(s) and equivalent
    * [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
    */
  def batchGet(request: Anon_Accesstoken): Request[BatchGetAmpUrlsResponse]
}

object AmpUrlsResource {
  @scala.inline
  def apply(batchGet: Anon_Accesstoken => Request[BatchGetAmpUrlsResponse]): AmpUrlsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
  
    __obj.asInstanceOf[AmpUrlsResource]
  }
}

