package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlCrawlErrorsSamplesListResponse extends js.Object {
  /** Information about the sample URL and its crawl error. */
  var urlCrawlErrorSample: js.UndefOr[js.Array[UrlCrawlErrorsSample]] = js.native
}

object UrlCrawlErrorsSamplesListResponse {
  @scala.inline
  def apply(): UrlCrawlErrorsSamplesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlCrawlErrorsSamplesListResponse]
  }
  @scala.inline
  implicit class UrlCrawlErrorsSamplesListResponseOps[Self <: UrlCrawlErrorsSamplesListResponse] (val x: Self) extends AnyVal {
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
    def setUrlCrawlErrorSampleVarargs(value: UrlCrawlErrorsSample*): Self = this.set("urlCrawlErrorSample", js.Array(value :_*))
    @scala.inline
    def setUrlCrawlErrorSample(value: js.Array[UrlCrawlErrorsSample]): Self = this.set("urlCrawlErrorSample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlCrawlErrorSample: Self = this.set("urlCrawlErrorSample", js.undefined)
  }
  
}

