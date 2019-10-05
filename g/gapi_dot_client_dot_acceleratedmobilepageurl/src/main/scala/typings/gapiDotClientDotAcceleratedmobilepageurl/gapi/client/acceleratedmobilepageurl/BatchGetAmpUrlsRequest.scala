package typings.gapiDotClientDotAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetAmpUrlsRequest extends js.Object {
  /** The lookup_strategy being requested. */
  var lookupStrategy: js.UndefOr[String] = js.undefined
  /**
    * List of URLs to look up for the paired AMP URLs.
    * The URLs are case-sensitive. Up to 50 URLs per lookup
    * (see [Usage Limits](/amp/cache/reference/limits)).
    */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchGetAmpUrlsRequest {
  @scala.inline
  def apply(lookupStrategy: String = null, urls: js.Array[String] = null): BatchGetAmpUrlsRequest = {
    val __obj = js.Dynamic.literal()
    if (lookupStrategy != null) __obj.updateDynamic("lookupStrategy")(lookupStrategy)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[BatchGetAmpUrlsRequest]
  }
}

