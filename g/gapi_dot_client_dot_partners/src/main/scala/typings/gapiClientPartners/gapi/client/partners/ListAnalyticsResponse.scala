package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAnalyticsResponse extends js.Object {
  /**
    * The list of analytics.
    * Sorted in ascending order of
    * Analytics.event_date.
    */
  var analytics: js.UndefOr[js.Array[Analytics]] = js.native
  /**
    * Aggregated information across the response's
    * analytics.
    */
  var analyticsSummary: js.UndefOr[AnalyticsSummary] = js.native
  /**
    * A token to retrieve next page of results.
    * Pass this value in the `ListAnalyticsRequest.page_token` field in the
    * subsequent call to
    * ListAnalytics to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
}

object ListAnalyticsResponse {
  @scala.inline
  def apply(): ListAnalyticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnalyticsResponse]
  }
  @scala.inline
  implicit class ListAnalyticsResponseOps[Self <: ListAnalyticsResponse] (val x: Self) extends AnyVal {
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
    def setAnalyticsVarargs(value: Analytics*): Self = this.set("analytics", js.Array(value :_*))
    @scala.inline
    def setAnalytics(value: js.Array[Analytics]): Self = this.set("analytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    @scala.inline
    def setAnalyticsSummary(value: AnalyticsSummary): Self = this.set("analyticsSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsSummary: Self = this.set("analyticsSummary", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
  }
  
}

