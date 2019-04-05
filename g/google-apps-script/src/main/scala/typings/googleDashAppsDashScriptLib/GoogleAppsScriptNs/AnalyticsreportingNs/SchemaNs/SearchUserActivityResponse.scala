package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUserActivityResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var sampleRate: js.UndefOr[stdLib.Number] = js.undefined
  var sessions: js.UndefOr[js.Array[UserActivitySession]] = js.undefined
  var totalRows: js.UndefOr[scala.Double] = js.undefined
}

object SearchUserActivityResponse {
  @scala.inline
  def apply(
    nextPageToken: java.lang.String = null,
    sampleRate: stdLib.Number = null,
    sessions: js.Array[UserActivitySession] = null,
    totalRows: scala.Int | scala.Double = null
  ): SearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate)
    if (sessions != null) __obj.updateDynamic("sessions")(sessions)
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserActivityResponse]
  }
}

