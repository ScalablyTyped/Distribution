package typings.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAcceleratedmobilepageurl.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpUrlsResource extends js.Object {
  /**
    * Returns AMP URL(s) and equivalent
    * [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
    */
  def batchGet(request: AnonAccesstoken): Request_[BatchGetAmpUrlsResponse]
}

object AmpUrlsResource {
  @scala.inline
  def apply(batchGet: AnonAccesstoken => Request_[BatchGetAmpUrlsResponse]): AmpUrlsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[AmpUrlsResource]
  }
}

