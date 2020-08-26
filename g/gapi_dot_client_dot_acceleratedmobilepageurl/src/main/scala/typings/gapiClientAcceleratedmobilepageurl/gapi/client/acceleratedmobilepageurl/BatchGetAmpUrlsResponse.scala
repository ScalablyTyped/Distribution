package typings.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetAmpUrlsResponse extends js.Object {
  /**
    * For each URL in BatchAmpUrlsRequest, the URL response. The response might
    * not be in the same order as URLs in the batch request.
    * If BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated
    * only once.
    */
  var ampUrls: js.UndefOr[js.Array[AmpUrl]] = js.native
  /** The errors for requested URLs that have no AMP URL. */
  var urlErrors: js.UndefOr[js.Array[AmpUrlError]] = js.native
}

object BatchGetAmpUrlsResponse {
  @scala.inline
  def apply(): BatchGetAmpUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAmpUrlsResponse]
  }
  @scala.inline
  implicit class BatchGetAmpUrlsResponseOps[Self <: BatchGetAmpUrlsResponse] (val x: Self) extends AnyVal {
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
    def setAmpUrlsVarargs(value: AmpUrl*): Self = this.set("ampUrls", js.Array(value :_*))
    @scala.inline
    def setAmpUrls(value: js.Array[AmpUrl]): Self = this.set("ampUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmpUrls: Self = this.set("ampUrls", js.undefined)
    @scala.inline
    def setUrlErrorsVarargs(value: AmpUrlError*): Self = this.set("urlErrors", js.Array(value :_*))
    @scala.inline
    def setUrlErrors(value: js.Array[AmpUrlError]): Self = this.set("urlErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlErrors: Self = this.set("urlErrors", js.undefined)
  }
  
}

