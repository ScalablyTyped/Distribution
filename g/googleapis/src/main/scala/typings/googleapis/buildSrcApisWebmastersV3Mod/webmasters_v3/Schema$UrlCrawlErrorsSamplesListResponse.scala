package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of crawl error samples.
  */
@js.native
trait Schema$UrlCrawlErrorsSamplesListResponse extends js.Object {
  /**
    * Information about the sample URL and its crawl error.
    */
  var urlCrawlErrorSample: js.UndefOr[js.Array[Schema$UrlCrawlErrorsSample]] = js.native
}

object Schema$UrlCrawlErrorsSamplesListResponse {
  @scala.inline
  def apply(urlCrawlErrorSample: js.Array[Schema$UrlCrawlErrorsSample] = null): Schema$UrlCrawlErrorsSamplesListResponse = {
    val __obj = js.Dynamic.literal()
    if (urlCrawlErrorSample != null) __obj.updateDynamic("urlCrawlErrorSample")(urlCrawlErrorSample.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlCrawlErrorsSamplesListResponse]
  }
}

