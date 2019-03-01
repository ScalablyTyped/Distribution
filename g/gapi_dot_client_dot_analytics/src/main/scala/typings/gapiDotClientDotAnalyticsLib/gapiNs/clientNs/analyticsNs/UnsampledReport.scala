package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReport extends js.Object {
  /** Account ID to which this unsampled report belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Download details for a file stored in Google Cloud Storage. */
  var cloudStorageDownloadDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_BucketId] = js.undefined
  /** Time this unsampled report was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** The dimensions for the unsampled report. */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of download you need to use for the report data file. Possible values include `GOOGLE_DRIVE` and `GOOGLE_CLOUD_STORAGE`. If the value is
    * `GOOGLE_DRIVE`, see the `driveDownloadDetails` field. If the value is `GOOGLE_CLOUD_STORAGE`, see the `cloudStorageDownloadDetails` field.
    */
  var downloadType: js.UndefOr[java.lang.String] = js.undefined
  /** Download details for a file stored in Google Drive. */
  var driveDownloadDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_DocumentId] = js.undefined
  /** The end date for the unsampled report. */
  var `end-date`: js.UndefOr[java.lang.String] = js.undefined
  /** The filters for the unsampled report. */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** Unsampled report ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for an Analytics unsampled report. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The metrics for the unsampled report. */
  var metrics: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) ID to which this unsampled report belongs. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  /** The segment for the unsampled report. */
  var segment: js.UndefOr[java.lang.String] = js.undefined
  /** Link for this unsampled report. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The start date for the unsampled report. */
  var `start-date`: js.UndefOr[java.lang.String] = js.undefined
  /** Status of this unsampled report. Possible values are PENDING, COMPLETED, or FAILED. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the unsampled report. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Time this unsampled report was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID to which this unsampled report belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object UnsampledReport {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    cloudStorageDownloadDetails: gapiDotClientDotAnalyticsLib.Anon_BucketId = null,
    created: java.lang.String = null,
    dimensions: java.lang.String = null,
    downloadType: java.lang.String = null,
    driveDownloadDetails: gapiDotClientDotAnalyticsLib.Anon_DocumentId = null,
    `end-date`: java.lang.String = null,
    filters: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    metrics: java.lang.String = null,
    profileId: java.lang.String = null,
    segment: java.lang.String = null,
    selfLink: java.lang.String = null,
    `start-date`: java.lang.String = null,
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
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[UnsampledReport]
  }
}

