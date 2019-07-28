package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeData extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[RealtimeDataColumnHeaders]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var profileInfo: js.UndefOr[RealtimeDataProfileInfo] = js.undefined
  var query: js.UndefOr[RealtimeDataQuery] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
  var totalsForAllResults: js.UndefOr[js.Object] = js.undefined
}

object RealtimeData {
  @scala.inline
  def apply(
    columnHeaders: js.Array[RealtimeDataColumnHeaders] = null,
    id: String = null,
    kind: String = null,
    profileInfo: RealtimeDataProfileInfo = null,
    query: RealtimeDataQuery = null,
    rows: js.Array[js.Array[String]] = null,
    selfLink: String = null,
    totalResults: Int | Double = null,
    totalsForAllResults: js.Object = null
  ): RealtimeData = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profileInfo != null) __obj.updateDynamic("profileInfo")(profileInfo)
    if (query != null) __obj.updateDynamic("query")(query)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (totalsForAllResults != null) __obj.updateDynamic("totalsForAllResults")(totalsForAllResults)
    __obj.asInstanceOf[RealtimeData]
  }
}

