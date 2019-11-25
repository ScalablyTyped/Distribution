package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics extends js.Object {
  var completionRatio: js.UndefOr[Double] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var endTime: js.UndefOr[String] = js.undefined
  var extract: js.UndefOr[JobStatistics4] = js.undefined
  var load: js.UndefOr[JobStatistics3] = js.undefined
  var numChildJobs: js.UndefOr[String] = js.undefined
  var parentJobId: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[JobStatistics2] = js.undefined
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.undefined
  var reservationUsage: js.UndefOr[js.Array[JobStatisticsReservationUsage]] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  var totalSlotMs: js.UndefOr[String] = js.undefined
}

object JobStatistics {
  @scala.inline
  def apply(
    completionRatio: Int | Double = null,
    creationTime: String = null,
    endTime: String = null,
    extract: JobStatistics4 = null,
    load: JobStatistics3 = null,
    numChildJobs: String = null,
    parentJobId: String = null,
    query: JobStatistics2 = null,
    quotaDeferments: js.Array[String] = null,
    reservationUsage: js.Array[JobStatisticsReservationUsage] = null,
    startTime: String = null,
    totalBytesProcessed: String = null,
    totalSlotMs: String = null
  ): JobStatistics = {
    val __obj = js.Dynamic.literal()
    if (completionRatio != null) __obj.updateDynamic("completionRatio")(completionRatio.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (extract != null) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (numChildJobs != null) __obj.updateDynamic("numChildJobs")(numChildJobs.asInstanceOf[js.Any])
    if (parentJobId != null) __obj.updateDynamic("parentJobId")(parentJobId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (quotaDeferments != null) __obj.updateDynamic("quotaDeferments")(quotaDeferments.asInstanceOf[js.Any])
    if (reservationUsage != null) __obj.updateDynamic("reservationUsage")(reservationUsage.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed.asInstanceOf[js.Any])
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatistics]
  }
}

