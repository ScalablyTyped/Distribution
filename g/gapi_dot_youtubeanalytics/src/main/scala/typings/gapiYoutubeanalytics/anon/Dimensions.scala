package typings.gapiYoutubeanalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as views or ageGroup,gender.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * The end date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
    */
  var `end-date`: String = js.native
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * A list of filters that should be applied when retrieving YouTube Analytics data. The Available Reports document identifies the dimensions that can be used to filter each report, and the Dimensions document defines those dimensions. If a request uses multiple filters, join them together with a semicolon (;), and the returned result table will satisfy both filters.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Identifies the YouTube channel or content owner for which you are retrieving YouTube Analytics data. - To request data for a YouTube user, set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID specifies the unique YouTube channel ID. - To request data for a YouTube CMS content owner, set the ids parameter value to contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content owner.
    */
  var ids: String = js.native
  /**
    * The maximum number of rows to include in the response.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of YouTube Analytics metrics, such as views or likes,dislikes.
    */
  var metrics: String = js.native
  /**
    * A comma-separated list of dimensions or metrics that determine the sort order for YouTube Analytics data. By default the sort order is ascending. The '-' prefix causes descending sort order.
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * The start date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
    */
  var `start-date`: String = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter (one-based, inclusive).
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object Dimensions {
  @scala.inline
  def apply(`end-date`: String, ids: String, metrics: String, `start-date`: String): Dimensions = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
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
    def `setEnd-date`(value: String): Self = this.set("end-date", value.asInstanceOf[js.Any])
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetrics(value: String): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def `setStart-date`(value: String): Self = this.set("start-date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def `setMax-results`(value: Double): Self = this.set("max-results", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def `setStart-index`(value: Double): Self = this.set("start-index", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-index`: Self = this.set("start-index", js.undefined)
  }
  
}

