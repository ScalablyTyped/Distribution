package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlSampleDetails extends js.Object {
  /** List of sitemaps pointing at this URL. */
  var containingSitemaps: js.UndefOr[js.Array[String]] = js.undefined
  /** A sample set of URLs linking to this URL. */
  var linkedFromUrls: js.UndefOr[js.Array[String]] = js.undefined
}

object UrlSampleDetails {
  @scala.inline
  def apply(containingSitemaps: js.Array[String] = null, linkedFromUrls: js.Array[String] = null): UrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    if (containingSitemaps != null) __obj.updateDynamic("containingSitemaps")(containingSitemaps.asInstanceOf[js.Any])
    if (linkedFromUrls != null) __obj.updateDynamic("linkedFromUrls")(linkedFromUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlSampleDetails]
  }
}

