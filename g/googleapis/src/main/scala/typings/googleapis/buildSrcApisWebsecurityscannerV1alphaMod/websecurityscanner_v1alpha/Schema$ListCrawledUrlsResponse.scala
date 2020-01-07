package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListCrawledUrls` method.
  */
@js.native
trait Schema$ListCrawledUrlsResponse extends js.Object {
  /**
    * The list of CrawledUrls returned.
    */
  var crawledUrls: js.UndefOr[js.Array[Schema$CrawledUrl]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListCrawledUrlsResponse {
  @scala.inline
  def apply(crawledUrls: js.Array[Schema$CrawledUrl] = null, nextPageToken: String = null): Schema$ListCrawledUrlsResponse = {
    val __obj = js.Dynamic.literal()
    if (crawledUrls != null) __obj.updateDynamic("crawledUrls")(crawledUrls.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCrawledUrlsResponse]
  }
}

