package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogMetricsResponse extends js.Object {
  /** A list of logs-based metrics. */
  var metrics: js.UndefOr[js.Array[LogMetric]] = js.native
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call this method again
    * using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListLogMetricsResponse {
  @scala.inline
  def apply(): ListLogMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogMetricsResponse]
  }
  @scala.inline
  implicit class ListLogMetricsResponseOps[Self <: ListLogMetricsResponse] (val x: Self) extends AnyVal {
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
    def setMetricsVarargs(value: LogMetric*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[LogMetric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

