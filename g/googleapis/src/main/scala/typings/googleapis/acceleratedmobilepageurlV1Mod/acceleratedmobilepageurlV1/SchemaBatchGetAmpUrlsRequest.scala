package typings.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AMP URL request for a batch of URLs.
  */
@js.native
trait SchemaBatchGetAmpUrlsRequest extends js.Object {
  /**
    * The lookup_strategy being requested.
    */
  var lookupStrategy: js.UndefOr[String] = js.native
  /**
    * List of URLs to look up for the paired AMP URLs. The URLs are
    * case-sensitive. Up to 50 URLs per lookup (see [Usage
    * Limits](/amp/cache/reference/limits)).
    */
  var urls: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBatchGetAmpUrlsRequest {
  @scala.inline
  def apply(lookupStrategy: String = null, urls: js.Array[String] = null): SchemaBatchGetAmpUrlsRequest = {
    val __obj = js.Dynamic.literal()
    if (lookupStrategy != null) __obj.updateDynamic("lookupStrategy")(lookupStrategy.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetAmpUrlsRequest]
  }
}

