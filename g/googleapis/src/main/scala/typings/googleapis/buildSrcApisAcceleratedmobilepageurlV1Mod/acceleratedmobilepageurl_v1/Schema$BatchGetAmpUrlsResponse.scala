package typings.googleapis.buildSrcApisAcceleratedmobilepageurlV1Mod.acceleratedmobilepageurl_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Batch AMP URL response.
  */
@js.native
trait Schema$BatchGetAmpUrlsResponse extends js.Object {
  /**
    * For each URL in BatchAmpUrlsRequest, the URL response. The response might
    * not be in the same order as URLs in the batch request. If
    * BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated only
    * once.
    */
  var ampUrls: js.UndefOr[js.Array[Schema$AmpUrl]] = js.native
  /**
    * The errors for requested URLs that have no AMP URL.
    */
  var urlErrors: js.UndefOr[js.Array[Schema$AmpUrlError]] = js.native
}

object Schema$BatchGetAmpUrlsResponse {
  @scala.inline
  def apply(ampUrls: js.Array[Schema$AmpUrl] = null, urlErrors: js.Array[Schema$AmpUrlError] = null): Schema$BatchGetAmpUrlsResponse = {
    val __obj = js.Dynamic.literal()
    if (ampUrls != null) __obj.updateDynamic("ampUrls")(ampUrls.asInstanceOf[js.Any])
    if (urlErrors != null) __obj.updateDynamic("urlErrors")(urlErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchGetAmpUrlsResponse]
  }
}

