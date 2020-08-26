package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  /** List of analytics dimensions. */
  var dimensions: js.UndefOr[String] = js.native
  /** End date. */
  var `end-date`: js.UndefOr[String] = js.native
  /** Comma-separated list of dimension or metric filters. */
  var filters: js.UndefOr[String] = js.native
  /** Unique table ID. */
  var ids: js.UndefOr[String] = js.native
  /** Maximum results per page. */
  var `max-results`: js.UndefOr[Double] = js.native
  /** List of analytics metrics. */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  /** Desired sampling level */
  var samplingLevel: js.UndefOr[String] = js.native
  /** Analytics advanced segment. */
  var segment: js.UndefOr[String] = js.native
  /** List of dimensions or metrics based on which Analytics data is sorted. */
  var sort: js.UndefOr[js.Array[String]] = js.native
  /** Start date. */
  var `start-date`: js.UndefOr[String] = js.native
  /** Start index. */
  var `start-index`: js.UndefOr[Double] = js.native
}

object Dimensions {
  @scala.inline
  def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  @scala.inline
  implicit class DimensionsOps[Self <: Dimensions] (val x: Self) extends AnyVal {
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
    def `setEnd-date`(value: String): Self = this.set("end-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnd-date`: Self = this.set("end-date", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def `setMax-results`(value: Double): Self = this.set("max-results", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
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
    def `setStart-date`(value: String): Self = this.set("start-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-date`: Self = this.set("start-date", js.undefined)
    @scala.inline
    def `setStart-index`(value: Double): Self = this.set("start-index", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-index`: Self = this.set("start-index", js.undefined)
  }
  
}

