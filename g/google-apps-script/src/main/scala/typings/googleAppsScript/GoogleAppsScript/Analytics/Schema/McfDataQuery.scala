package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfDataQuery extends js.Object {
  var dimensions: js.UndefOr[String] = js.native
  var end_date: js.UndefOr[String] = js.native
  var filters: js.UndefOr[String] = js.native
  var ids: js.UndefOr[String] = js.native
  var max_results: js.UndefOr[Double] = js.native
  var metrics: js.UndefOr[js.Array[String]] = js.native
  var samplingLevel: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
  var sort: js.UndefOr[js.Array[String]] = js.native
  var start_date: js.UndefOr[String] = js.native
  var start_index: js.UndefOr[Double] = js.native
}

object McfDataQuery {
  @scala.inline
  def apply(): McfDataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfDataQuery]
  }
  @scala.inline
  implicit class McfDataQueryOps[Self <: McfDataQuery] (val x: Self) extends AnyVal {
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
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setEnd_date(value: String): Self = this.set("end_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_date: Self = this.set("end_date", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setMax_results(value: Double): Self = this.set("max_results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_results: Self = this.set("max_results", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: String*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setSamplingLevel(value: String): Self = this.set("samplingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingLevel: Self = this.set("samplingLevel", js.undefined)
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    @scala.inline
    def setSortVarargs(value: String*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: js.Array[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStart_date(value: String): Self = this.set("start_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_date: Self = this.set("start_date", js.undefined)
    @scala.inline
    def setStart_index(value: Double): Self = this.set("start_index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_index: Self = this.set("start_index", js.undefined)
  }
  
}

