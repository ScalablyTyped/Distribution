package typings
package gapiDotClientDotAcceleratedmobilepageurlLib.gapiNs.clientNs.acceleratedmobilepageurlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetAmpUrlsRequest extends js.Object {
  /** The lookup_strategy being requested. */
  var lookupStrategy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of URLs to look up for the paired AMP URLs.
    * The URLs are case-sensitive. Up to 50 URLs per lookup
    * (see [Usage Limits](/amp/cache/reference/limits)).
    */
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BatchGetAmpUrlsRequest {
  @scala.inline
  def apply(lookupStrategy: java.lang.String = null, urls: js.Array[java.lang.String] = null): BatchGetAmpUrlsRequest = {
    val __obj = js.Dynamic.literal()
    if (lookupStrategy != null) __obj.updateDynamic("lookupStrategy")(lookupStrategy)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[BatchGetAmpUrlsRequest]
  }
}

