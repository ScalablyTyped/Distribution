package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeData extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[RealtimeDataColumnHeaders]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var profileInfo: js.UndefOr[RealtimeDataProfileInfo] = js.undefined
  var query: js.UndefOr[RealtimeDataQuery] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var totalResults: js.UndefOr[scala.Double] = js.undefined
  var totalsForAllResults: js.UndefOr[js.Object] = js.undefined
}

object RealtimeData {
  @scala.inline
  def apply(
    columnHeaders: js.Array[RealtimeDataColumnHeaders] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    profileInfo: RealtimeDataProfileInfo = null,
    query: RealtimeDataQuery = null,
    rows: js.Array[js.Array[java.lang.String]] = null,
    selfLink: java.lang.String = null,
    totalResults: scala.Int | scala.Double = null,
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

