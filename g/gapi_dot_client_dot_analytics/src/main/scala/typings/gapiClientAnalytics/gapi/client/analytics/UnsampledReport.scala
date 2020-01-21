package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.AnonBucketId
import typings.gapiClientAnalytics.AnonDocumentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReport extends js.Object {
  /** Account ID to which this unsampled report belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Download details for a file stored in Google Cloud Storage. */
  var cloudStorageDownloadDetails: js.UndefOr[AnonBucketId] = js.undefined
  /** Time this unsampled report was created. */
  var created: js.UndefOr[String] = js.undefined
  /** The dimensions for the unsampled report. */
  var dimensions: js.UndefOr[String] = js.undefined
  /**
    * The type of download you need to use for the report data file. Possible values include `GOOGLE_DRIVE` and `GOOGLE_CLOUD_STORAGE`. If the value is
    * `GOOGLE_DRIVE`, see the `driveDownloadDetails` field. If the value is `GOOGLE_CLOUD_STORAGE`, see the `cloudStorageDownloadDetails` field.
    */
  var downloadType: js.UndefOr[String] = js.undefined
  /** Download details for a file stored in Google Drive. */
  var driveDownloadDetails: js.UndefOr[AnonDocumentId] = js.undefined
  /** The end date for the unsampled report. */
  var `end-date`: js.UndefOr[String] = js.undefined
  /** The filters for the unsampled report. */
  var filters: js.UndefOr[String] = js.undefined
  /** Unsampled report ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for an Analytics unsampled report. */
  var kind: js.UndefOr[String] = js.undefined
  /** The metrics for the unsampled report. */
  var metrics: js.UndefOr[String] = js.undefined
  /** View (Profile) ID to which this unsampled report belongs. */
  var profileId: js.UndefOr[String] = js.undefined
  /** The segment for the unsampled report. */
  var segment: js.UndefOr[String] = js.undefined
  /** Link for this unsampled report. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The start date for the unsampled report. */
  var `start-date`: js.UndefOr[String] = js.undefined
  /** Status of this unsampled report. Possible values are PENDING, COMPLETED, or FAILED. */
  var status: js.UndefOr[String] = js.undefined
  /** Title of the unsampled report. */
  var title: js.UndefOr[String] = js.undefined
  /** Time this unsampled report was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  /** Web property ID to which this unsampled report belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object UnsampledReport {
  @scala.inline
  def apply(
    accountId: String = null,
    cloudStorageDownloadDetails: AnonBucketId = null,
    created: String = null,
    dimensions: String = null,
    downloadType: String = null,
    driveDownloadDetails: AnonDocumentId = null,
    `end-date`: String = null,
    filters: String = null,
    id: String = null,
    kind: String = null,
    metrics: String = null,
    profileId: String = null,
    segment: String = null,
    selfLink: String = null,
    `start-date`: String = null,
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
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsampledReport]
  }
}

