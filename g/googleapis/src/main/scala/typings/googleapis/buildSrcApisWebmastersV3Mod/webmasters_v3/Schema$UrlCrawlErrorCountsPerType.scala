package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Number of errors per day for a specific error type (defined by platform and
  * category).
  */
@js.native
trait Schema$UrlCrawlErrorCountsPerType extends js.Object {
  /**
    * The crawl error type.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The error count entries time series.
    */
  var entries: js.UndefOr[js.Array[Schema$UrlCrawlErrorCount]] = js.native
  /**
    * The general type of Googlebot that made the request (see list of
    * Googlebot user-agents for the user-agents used).
    */
  var platform: js.UndefOr[String] = js.native
}

object Schema$UrlCrawlErrorCountsPerType {
  @scala.inline
  def apply(
    category: String = null,
    entries: js.Array[Schema$UrlCrawlErrorCount] = null,
    platform: String = null
  ): Schema$UrlCrawlErrorCountsPerType = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlCrawlErrorCountsPerType]
  }
}

