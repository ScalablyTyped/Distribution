package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.AccountId
import typings.gapiClientAnalytics.anon.Cols
import typings.gapiClientAnalytics.anon.ColumnType
import typings.gapiClientAnalytics.anon.Dimensions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaData extends js.Object {
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[ColumnType]] = js.native
  /** Determines if Analytics data contains samples. */
  var containsSampledData: js.UndefOr[Boolean] = js.native
  /** The last refreshed time in seconds for Analytics data. */
  var dataLastRefreshed: js.UndefOr[String] = js.native
  var dataTable: js.UndefOr[Cols] = js.native
  /** Unique ID for this data response. */
  var id: js.UndefOr[String] = js.native
  /**
    * The maximum number of rows the response can contain, regardless of the actual number of rows returned. Its value ranges from 1 to 10,000 with a value
    * of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** Link to next page for this Analytics data query. */
  var nextLink: js.UndefOr[String] = js.native
  /** Link to previous page for this Analytics data query. */
  var previousLink: js.UndefOr[String] = js.native
  /** Information for the view (profile), for which the Analytics data was requested. */
  var profileInfo: js.UndefOr[AccountId] = js.native
  /** Analytics data request query parameters. */
  var query: js.UndefOr[Dimensions] = js.native
  /**
    * Analytics data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as
    * specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /** The number of samples used to calculate the result. */
  var sampleSize: js.UndefOr[String] = js.native
  /** Total size of the sample space from which the samples were selected. */
  var sampleSpace: js.UndefOr[String] = js.native
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.native
  /** The total number of rows for the query, regardless of the number of rows in the response. */
  var totalResults: js.UndefOr[Double] = js.native
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as
    * the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[Record[String, String]] = js.native
}

object GaData {
  @scala.inline
  def apply(): GaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaData]
  }
  @scala.inline
  implicit class GaDataOps[Self <: GaData] (val x: Self) extends AnyVal {
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
    def setColumnHeadersVarargs(value: ColumnType*): Self = this.set("columnHeaders", js.Array(value :_*))
    @scala.inline
    def setColumnHeaders(value: js.Array[ColumnType]): Self = this.set("columnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeaders: Self = this.set("columnHeaders", js.undefined)
    @scala.inline
    def setContainsSampledData(value: Boolean): Self = this.set("containsSampledData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsSampledData: Self = this.set("containsSampledData", js.undefined)
    @scala.inline
    def setDataLastRefreshed(value: String): Self = this.set("dataLastRefreshed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLastRefreshed: Self = this.set("dataLastRefreshed", js.undefined)
    @scala.inline
    def setDataTable(value: Cols): Self = this.set("dataTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTable: Self = this.set("dataTable", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLink: Self = this.set("nextLink", js.undefined)
    @scala.inline
    def setPreviousLink(value: String): Self = this.set("previousLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousLink: Self = this.set("previousLink", js.undefined)
    @scala.inline
    def setProfileInfo(value: AccountId): Self = this.set("profileInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileInfo: Self = this.set("profileInfo", js.undefined)
    @scala.inline
    def setQuery(value: Dimensions): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSampleSize(value: String): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    @scala.inline
    def setSampleSpace(value: String): Self = this.set("sampleSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSpace: Self = this.set("sampleSpace", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
    @scala.inline
    def setTotalsForAllResults(value: Record[String, String]): Self = this.set("totalsForAllResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalsForAllResults: Self = this.set("totalsForAllResults", js.undefined)
  }
  
}

