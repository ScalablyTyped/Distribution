package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics extends js.Object {
  var completionRatio: js.UndefOr[stdLib.Number] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  var extract: js.UndefOr[JobStatistics4] = js.undefined
  var load: js.UndefOr[JobStatistics3] = js.undefined
  var numChildJobs: js.UndefOr[java.lang.String] = js.undefined
  var parentJobId: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[JobStatistics2] = js.undefined
  var quotaDeferments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reservationUsage: js.UndefOr[js.Array[JobStatisticsReservationUsage]] = js.undefined
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  var totalBytesProcessed: js.UndefOr[java.lang.String] = js.undefined
  var totalSlotMs: js.UndefOr[java.lang.String] = js.undefined
}

object JobStatistics {
  @scala.inline
  def apply(
    completionRatio: stdLib.Number = null,
    creationTime: java.lang.String = null,
    endTime: java.lang.String = null,
    extract: JobStatistics4 = null,
    load: JobStatistics3 = null,
    numChildJobs: java.lang.String = null,
    parentJobId: java.lang.String = null,
    query: JobStatistics2 = null,
    quotaDeferments: js.Array[java.lang.String] = null,
    reservationUsage: js.Array[JobStatisticsReservationUsage] = null,
    startTime: java.lang.String = null,
    totalBytesProcessed: java.lang.String = null,
    totalSlotMs: java.lang.String = null
  ): JobStatistics = {
    val __obj = js.Dynamic.literal()
    if (completionRatio != null) __obj.updateDynamic("completionRatio")(completionRatio)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (extract != null) __obj.updateDynamic("extract")(extract)
    if (load != null) __obj.updateDynamic("load")(load)
    if (numChildJobs != null) __obj.updateDynamic("numChildJobs")(numChildJobs)
    if (parentJobId != null) __obj.updateDynamic("parentJobId")(parentJobId)
    if (query != null) __obj.updateDynamic("query")(query)
    if (quotaDeferments != null) __obj.updateDynamic("quotaDeferments")(quotaDeferments)
    if (reservationUsage != null) __obj.updateDynamic("reservationUsage")(reservationUsage)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed)
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs)
    __obj.asInstanceOf[JobStatistics]
  }
}

