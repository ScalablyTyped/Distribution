package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUserActivityResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var sessions: js.UndefOr[js.Array[UserActivitySession]] = js.undefined
  var totalRows: js.UndefOr[Double] = js.undefined
}

object SearchUserActivityResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    sampleRate: Int | Double = null,
    sessions: js.Array[UserActivitySession] = null,
    totalRows: Int | Double = null
  ): SearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserActivityResponse]
  }
}

