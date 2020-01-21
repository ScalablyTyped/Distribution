package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReport extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var cloudStorageDownloadDetails: js.UndefOr[UnsampledReportCloudStorageDownloadDetails] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var dimensions: js.UndefOr[String] = js.undefined
  var downloadType: js.UndefOr[String] = js.undefined
  var driveDownloadDetails: js.UndefOr[UnsampledReportDriveDownloadDetails] = js.undefined
  var end_date: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var metrics: js.UndefOr[String] = js.undefined
  var profileId: js.UndefOr[String] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var start_date: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object UnsampledReport {
  @scala.inline
  def apply(
    accountId: String = null,
    cloudStorageDownloadDetails: UnsampledReportCloudStorageDownloadDetails = null,
    created: String = null,
    dimensions: String = null,
    downloadType: String = null,
    driveDownloadDetails: UnsampledReportDriveDownloadDetails = null,
    end_date: String = null,
    filters: String = null,
    id: String = null,
    kind: String = null,
    metrics: String = null,
    profileId: String = null,
    segment: String = null,
    selfLink: String = null,
    start_date: String = null,
    status: String = null,
    title: String = null,
    updated: String = null,
    webPropertyId: String = null
  ): UnsampledReport = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (cloudStorageDownloadDetails != null) __obj.updateDynamic("cloudStorageDownloadDetails")(cloudStorageDownloadDetails.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (downloadType != null) __obj.updateDynamic("downloadType")(downloadType.asInstanceOf[js.Any])
    if (driveDownloadDetails != null) __obj.updateDynamic("driveDownloadDetails")(driveDownloadDetails.asInstanceOf[js.Any])
    if (end_date != null) __obj.updateDynamic("end_date")(end_date.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (start_date != null) __obj.updateDynamic("start_date")(start_date.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsampledReport]
  }
}

