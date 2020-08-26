package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlCrawlErrorsCountsQueryResponse extends js.Object {
  /** The time series of the number of URL crawl errors per error category and platform. */
  var countPerTypes: js.UndefOr[js.Array[UrlCrawlErrorCountsPerType]] = js.native
}

object UrlCrawlErrorsCountsQueryResponse {
  @scala.inline
  def apply(): UrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlCrawlErrorsCountsQueryResponse]
  }
  @scala.inline
  implicit class UrlCrawlErrorsCountsQueryResponseOps[Self <: UrlCrawlErrorsCountsQueryResponse] (val x: Self) extends AnyVal {
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
    def setCountPerTypesVarargs(value: UrlCrawlErrorCountsPerType*): Self = this.set("countPerTypes", js.Array(value :_*))
    @scala.inline
    def setCountPerTypes(value: js.Array[UrlCrawlErrorCountsPerType]): Self = this.set("countPerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountPerTypes: Self = this.set("countPerTypes", js.undefined)
  }
  
}

