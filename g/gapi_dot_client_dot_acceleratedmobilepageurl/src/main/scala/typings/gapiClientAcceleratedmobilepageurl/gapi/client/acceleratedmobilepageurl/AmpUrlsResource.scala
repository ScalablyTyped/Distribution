package typings.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAcceleratedmobilepageurl.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpUrlsResource extends js.Object {
  /**
    * Returns AMP URL(s) and equivalent
    * [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
    */
  def batchGet(request: Accesstoken): Request[BatchGetAmpUrlsResponse] = js.native
}

object AmpUrlsResource {
  @scala.inline
  def apply(batchGet: Accesstoken => Request[BatchGetAmpUrlsResponse]): AmpUrlsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[AmpUrlsResource]
  }
  @scala.inline
  implicit class AmpUrlsResourceOps[Self <: AmpUrlsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchGet(value: Accesstoken => Request[BatchGetAmpUrlsResponse]): Self = this.set("batchGet", js.Any.fromFunction1(value))
  }
  
}

