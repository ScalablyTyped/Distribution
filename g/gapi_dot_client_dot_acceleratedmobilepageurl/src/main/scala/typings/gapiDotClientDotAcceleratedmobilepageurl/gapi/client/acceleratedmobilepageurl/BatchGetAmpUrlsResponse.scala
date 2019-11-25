package typings.gapiDotClientDotAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetAmpUrlsResponse extends js.Object {
  /**
    * For each URL in BatchAmpUrlsRequest, the URL response. The response might
    * not be in the same order as URLs in the batch request.
    * If BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated
    * only once.
    */
  var ampUrls: js.UndefOr[js.Array[AmpUrl]] = js.undefined
  /** The errors for requested URLs that have no AMP URL. */
  var urlErrors: js.UndefOr[js.Array[AmpUrlError]] = js.undefined
}

object BatchGetAmpUrlsResponse {
  @scala.inline
  def apply(ampUrls: js.Array[AmpUrl] = null, urlErrors: js.Array[AmpUrlError] = null): BatchGetAmpUrlsResponse = {
    val __obj = js.Dynamic.literal()
    if (ampUrls != null) __obj.updateDynamic("ampUrls")(ampUrls.asInstanceOf[js.Any])
    if (urlErrors != null) __obj.updateDynamic("urlErrors")(urlErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAmpUrlsResponse]
  }
}

