package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlCrawlErrorsSample extends js.Object {
  /** The time the error was first detected, in RFC 3339 format. */
  var first_detected: js.UndefOr[String] = js.native
  /** The time when the URL was last crawled, in RFC 3339 format. */
  var last_crawled: js.UndefOr[String] = js.native
  /** The URL of an error, relative to the site. */
  var pageUrl: js.UndefOr[String] = js.native
  /** The HTTP response code, if any. */
  var responseCode: js.UndefOr[Double] = js.native
  /** Additional details about the URL, set only when calling get(). */
  var urlDetails: js.UndefOr[UrlSampleDetails] = js.native
}

object UrlCrawlErrorsSample {
  @scala.inline
  def apply(): UrlCrawlErrorsSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlCrawlErrorsSample]
  }
  @scala.inline
  implicit class UrlCrawlErrorsSampleOps[Self <: UrlCrawlErrorsSample] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirst_detected(value: String): Self = this.set("first_detected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_detected: Self = this.set("first_detected", js.undefined)
    @scala.inline
    def setLast_crawled(value: String): Self = this.set("last_crawled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_crawled: Self = this.set("last_crawled", js.undefined)
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    @scala.inline
    def setResponseCode(value: Double): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
    @scala.inline
    def setUrlDetails(value: UrlSampleDetails): Self = this.set("urlDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlDetails: Self = this.set("urlDetails", js.undefined)
  }
  
}

