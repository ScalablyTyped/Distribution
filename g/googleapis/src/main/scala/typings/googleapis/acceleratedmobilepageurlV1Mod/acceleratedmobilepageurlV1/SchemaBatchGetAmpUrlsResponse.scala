package typings.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Batch AMP URL response.
  */
@js.native
trait SchemaBatchGetAmpUrlsResponse extends js.Object {
  /**
    * For each URL in BatchAmpUrlsRequest, the URL response. The response might
    * not be in the same order as URLs in the batch request. If
    * BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated only
    * once.
    */
  var ampUrls: js.UndefOr[js.Array[SchemaAmpUrl]] = js.native
  /**
    * The errors for requested URLs that have no AMP URL.
    */
  var urlErrors: js.UndefOr[js.Array[SchemaAmpUrlError]] = js.native
}

object SchemaBatchGetAmpUrlsResponse {
  @scala.inline
  def apply(ampUrls: js.Array[SchemaAmpUrl] = null, urlErrors: js.Array[SchemaAmpUrlError] = null): SchemaBatchGetAmpUrlsResponse = {
    val __obj = js.Dynamic.literal()
    if (ampUrls != null) __obj.updateDynamic("ampUrls")(ampUrls.asInstanceOf[js.Any])
    if (urlErrors != null) __obj.updateDynamic("urlErrors")(urlErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetAmpUrlsResponse]
  }
}

