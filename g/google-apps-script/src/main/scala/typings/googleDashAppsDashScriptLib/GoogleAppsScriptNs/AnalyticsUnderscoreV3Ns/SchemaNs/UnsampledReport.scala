package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReport extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var cloudStorageDownloadDetails: js.UndefOr[UnsampledReportCloudStorageDownloadDetails] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  var downloadType: js.UndefOr[java.lang.String] = js.undefined
  var driveDownloadDetails: js.UndefOr[UnsampledReportDriveDownloadDetails] = js.undefined
  var end_date: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var metrics: js.UndefOr[java.lang.String] = js.undefined
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  var segment: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var start_date: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object UnsampledReport {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    cloudStorageDownloadDetails: UnsampledReportCloudStorageDownloadDetails = null,
    created: java.lang.String = null,
    dimensions: java.lang.String = null,
    downloadType: java.lang.String = null,
    driveDownloadDetails: UnsampledReportDriveDownloadDetails = null,
    end_date: java.lang.String = null,
    filters: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    metrics: java.lang.String = null,
    profileId: java.lang.String = null,
    segment: java.lang.String = null,
    selfLink: java.lang.String = null,
    start_date: java.lang.String = null,
    status: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): UnsampledReport = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (cloudStorageDownloadDetails != null) __obj.updateDynamic("cloudStorageDownloadDetails")(cloudStorageDownloadDetails)
    if (created != null) __obj.updateDynamic("created")(created)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (downloadType != null) __obj.updateDynamic("downloadType")(downloadType)
    if (driveDownloadDetails != null) __obj.updateDynamic("driveDownloadDetails")(driveDownloadDetails)
    if (end_date != null) __obj.updateDynamic("end_date")(end_date)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (start_date != null) __obj.updateDynamic("start_date")(start_date)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[UnsampledReport]
  }
}

