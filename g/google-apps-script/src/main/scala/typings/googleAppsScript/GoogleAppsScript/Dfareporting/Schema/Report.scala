package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var criteria: js.UndefOr[ReportCriteria] = js.undefined
  var crossDimensionReachCriteria: js.UndefOr[ReportCrossDimensionReachCriteria] = js.undefined
  var delivery: js.UndefOr[ReportDelivery] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var floodlightCriteria: js.UndefOr[ReportFloodlightCriteria] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ownerProfileId: js.UndefOr[String] = js.undefined
  var pathToConversionCriteria: js.UndefOr[ReportPathToConversionCriteria] = js.undefined
  var reachCriteria: js.UndefOr[ReportReachCriteria] = js.undefined
  var schedule: js.UndefOr[ReportSchedule] = js.undefined
  var subAccountId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    accountId: String = null,
    criteria: ReportCriteria = null,
    crossDimensionReachCriteria: ReportCrossDimensionReachCriteria = null,
    delivery: ReportDelivery = null,
    etag: String = null,
    fileName: String = null,
    floodlightCriteria: ReportFloodlightCriteria = null,
    format: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedTime: String = null,
    name: String = null,
    ownerProfileId: String = null,
    pathToConversionCriteria: ReportPathToConversionCriteria = null,
    reachCriteria: ReportReachCriteria = null,
    schedule: ReportSchedule = null,
    subAccountId: String = null,
    `type`: String = null
  ): Report = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (crossDimensionReachCriteria != null) __obj.updateDynamic("crossDimensionReachCriteria")(crossDimensionReachCriteria.asInstanceOf[js.Any])
    if (delivery != null) __obj.updateDynamic("delivery")(delivery.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (floodlightCriteria != null) __obj.updateDynamic("floodlightCriteria")(floodlightCriteria.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerProfileId != null) __obj.updateDynamic("ownerProfileId")(ownerProfileId.asInstanceOf[js.Any])
    if (pathToConversionCriteria != null) __obj.updateDynamic("pathToConversionCriteria")(pathToConversionCriteria.asInstanceOf[js.Any])
    if (reachCriteria != null) __obj.updateDynamic("reachCriteria")(reachCriteria.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (subAccountId != null) __obj.updateDynamic("subAccountId")(subAccountId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
}

