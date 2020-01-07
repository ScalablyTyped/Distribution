package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details about the URL, set only when calling get().
  */
@js.native
trait Schema$UrlSampleDetails extends js.Object {
  /**
    * List of sitemaps pointing at this URL.
    */
  var containingSitemaps: js.UndefOr[js.Array[String]] = js.native
  /**
    * A sample set of URLs linking to this URL.
    */
  var linkedFromUrls: js.UndefOr[js.Array[String]] = js.native
}

object Schema$UrlSampleDetails {
  @scala.inline
  def apply(containingSitemaps: js.Array[String] = null, linkedFromUrls: js.Array[String] = null): Schema$UrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    if (containingSitemaps != null) __obj.updateDynamic("containingSitemaps")(containingSitemaps.asInstanceOf[js.Any])
    if (linkedFromUrls != null) __obj.updateDynamic("linkedFromUrls")(linkedFromUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlSampleDetails]
  }
}

