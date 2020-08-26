package typings.gapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebmasters.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchanalyticsResource extends js.Object {
  /**
    * Query your data with filters and parameters that you define. Returns zero or more rows grouped by the row keys that you define. You must define a date
    * range of one or more days.
    *
    * When date is one of the group by values, any days without data are omitted from the result list. If you need to know which days have data, issue a
    * broad date range query grouped by date for any metric, and see which day rows are returned.
    */
  def query(request: Alt): Request[SearchAnalyticsQueryResponse] = js.native
}

object SearchanalyticsResource {
  @scala.inline
  def apply(query: Alt => Request[SearchAnalyticsQueryResponse]): SearchanalyticsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[SearchanalyticsResource]
  }
  @scala.inline
  implicit class SearchanalyticsResourceOps[Self <: SearchanalyticsResource] (val x: Self) extends AnyVal {
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
    def setQuery(value: Alt => Request[SearchAnalyticsQueryResponse]): Self = this.set("query", js.Any.fromFunction1(value))
  }
  
}

