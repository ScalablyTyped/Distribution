package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time series of the number of URL crawl errors per error category and
  * platform.
  */
@js.native
trait Schema$UrlCrawlErrorsCountsQueryResponse extends js.Object {
  /**
    * The time series of the number of URL crawl errors per error category and
    * platform.
    */
  var countPerTypes: js.UndefOr[js.Array[Schema$UrlCrawlErrorCountsPerType]] = js.native
}

object Schema$UrlCrawlErrorsCountsQueryResponse {
  @scala.inline
  def apply(countPerTypes: js.Array[Schema$UrlCrawlErrorCountsPerType] = null): Schema$UrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (countPerTypes != null) __obj.updateDynamic("countPerTypes")(countPerTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlCrawlErrorsCountsQueryResponse]
  }
}

