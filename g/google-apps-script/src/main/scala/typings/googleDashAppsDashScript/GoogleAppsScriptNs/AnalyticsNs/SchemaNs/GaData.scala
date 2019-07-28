package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaData extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[GaDataColumnHeaders]] = js.undefined
  var containsSampledData: js.UndefOr[Boolean] = js.undefined
  var dataLastRefreshed: js.UndefOr[String] = js.undefined
  var dataTable: js.UndefOr[GaDataDataTable] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextLink: js.UndefOr[String] = js.undefined
  var previousLink: js.UndefOr[String] = js.undefined
  var profileInfo: js.UndefOr[GaDataProfileInfo] = js.undefined
  var query: js.UndefOr[GaDataQuery] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var sampleSize: js.UndefOr[String] = js.undefined
  var sampleSpace: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
  var totalsForAllResults: js.UndefOr[js.Object] = js.undefined
}

object GaData {
  @scala.inline
  def apply(
    columnHeaders: js.Array[GaDataColumnHeaders] = null,
    containsSampledData: js.UndefOr[Boolean] = js.undefined,
    dataLastRefreshed: String = null,
    dataTable: GaDataDataTable = null,
    id: String = null,
    itemsPerPage: Int | Double = null,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    profileInfo: GaDataProfileInfo = null,
    query: GaDataQuery = null,
    rows: js.Array[js.Array[String]] = null,
    sampleSize: String = null,
    sampleSpace: String = null,
    selfLink: String = null,
    totalResults: Int | Double = null,
    totalsForAllResults: js.Object = null
  ): GaData = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (!js.isUndefined(containsSampledData)) __obj.updateDynamic("containsSampledData")(containsSampledData)
    if (dataLastRefreshed != null) __obj.updateDynamic("dataLastRefreshed")(dataLastRefreshed)
    if (dataTable != null) __obj.updateDynamic("dataTable")(dataTable)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink)
    if (profileInfo != null) __obj.updateDynamic("profileInfo")(profileInfo)
    if (query != null) __obj.updateDynamic("query")(query)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize)
    if (sampleSpace != null) __obj.updateDynamic("sampleSpace")(sampleSpace)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (totalsForAllResults != null) __obj.updateDynamic("totalsForAllResults")(totalsForAllResults)
    __obj.asInstanceOf[GaData]
  }
}

