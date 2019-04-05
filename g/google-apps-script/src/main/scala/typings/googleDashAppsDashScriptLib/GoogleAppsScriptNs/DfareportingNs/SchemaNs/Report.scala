package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var criteria: js.UndefOr[ReportCriteria] = js.undefined
  var crossDimensionReachCriteria: js.UndefOr[ReportCrossDimensionReachCriteria] = js.undefined
  var delivery: js.UndefOr[ReportDelivery] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var floodlightCriteria: js.UndefOr[ReportFloodlightCriteria] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var ownerProfileId: js.UndefOr[java.lang.String] = js.undefined
  var pathToConversionCriteria: js.UndefOr[ReportPathToConversionCriteria] = js.undefined
  var reachCriteria: js.UndefOr[ReportReachCriteria] = js.undefined
  var schedule: js.UndefOr[ReportSchedule] = js.undefined
  var subAccountId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    criteria: ReportCriteria = null,
    crossDimensionReachCriteria: ReportCrossDimensionReachCriteria = null,
    delivery: ReportDelivery = null,
    etag: java.lang.String = null,
    fileName: java.lang.String = null,
    floodlightCriteria: ReportFloodlightCriteria = null,
    format: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedTime: java.lang.String = null,
    name: java.lang.String = null,
    ownerProfileId: java.lang.String = null,
    pathToConversionCriteria: ReportPathToConversionCriteria = null,
    reachCriteria: ReportReachCriteria = null,
    schedule: ReportSchedule = null,
    subAccountId: java.lang.String = null,
    `type`: java.lang.String = null
  ): Report = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (crossDimensionReachCriteria != null) __obj.updateDynamic("crossDimensionReachCriteria")(crossDimensionReachCriteria)
    if (delivery != null) __obj.updateDynamic("delivery")(delivery)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (floodlightCriteria != null) __obj.updateDynamic("floodlightCriteria")(floodlightCriteria)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerProfileId != null) __obj.updateDynamic("ownerProfileId")(ownerProfileId)
    if (pathToConversionCriteria != null) __obj.updateDynamic("pathToConversionCriteria")(pathToConversionCriteria)
    if (reachCriteria != null) __obj.updateDynamic("reachCriteria")(reachCriteria)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (subAccountId != null) __obj.updateDynamic("subAccountId")(subAccountId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Report]
  }
}

