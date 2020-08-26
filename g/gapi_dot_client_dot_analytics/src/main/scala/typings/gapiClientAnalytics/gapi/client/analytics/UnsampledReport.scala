package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.BucketId
import typings.gapiClientAnalytics.anon.DocumentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsampledReport extends js.Object {
  /** Account ID to which this unsampled report belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** Download details for a file stored in Google Cloud Storage. */
  var cloudStorageDownloadDetails: js.UndefOr[BucketId] = js.native
  /** Time this unsampled report was created. */
  var created: js.UndefOr[String] = js.native
  /** The dimensions for the unsampled report. */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * The type of download you need to use for the report data file. Possible values include `GOOGLE_DRIVE` and `GOOGLE_CLOUD_STORAGE`. If the value is
    * `GOOGLE_DRIVE`, see the `driveDownloadDetails` field. If the value is `GOOGLE_CLOUD_STORAGE`, see the `cloudStorageDownloadDetails` field.
    */
  var downloadType: js.UndefOr[String] = js.native
  /** Download details for a file stored in Google Drive. */
  var driveDownloadDetails: js.UndefOr[DocumentId] = js.native
  /** The end date for the unsampled report. */
  var `end-date`: js.UndefOr[String] = js.native
  /** The filters for the unsampled report. */
  var filters: js.UndefOr[String] = js.native
  /** Unsampled report ID. */
  var id: js.UndefOr[String] = js.native
  /** Resource type for an Analytics unsampled report. */
  var kind: js.UndefOr[String] = js.native
  /** The metrics for the unsampled report. */
  var metrics: js.UndefOr[String] = js.native
  /** View (Profile) ID to which this unsampled report belongs. */
  var profileId: js.UndefOr[String] = js.native
  /** The segment for the unsampled report. */
  var segment: js.UndefOr[String] = js.native
  /** Link for this unsampled report. */
  var selfLink: js.UndefOr[String] = js.native
  /** The start date for the unsampled report. */
  var `start-date`: js.UndefOr[String] = js.native
  /** Status of this unsampled report. Possible values are PENDING, COMPLETED, or FAILED. */
  var status: js.UndefOr[String] = js.native
  /** Title of the unsampled report. */
  var title: js.UndefOr[String] = js.native
  /** Time this unsampled report was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Web property ID to which this unsampled report belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object UnsampledReport {
  @scala.inline
  def apply(): UnsampledReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsampledReport]
  }
  @scala.inline
  implicit class UnsampledReportOps[Self <: UnsampledReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setCloudStorageDownloadDetails(value: BucketId): Self = this.set("cloudStorageDownloadDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudStorageDownloadDetails: Self = this.set("cloudStorageDownloadDetails", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setDownloadType(value: String): Self = this.set("downloadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadType: Self = this.set("downloadType", js.undefined)
    @scala.inline
    def setDriveDownloadDetails(value: DocumentId): Self = this.set("driveDownloadDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveDownloadDetails: Self = this.set("driveDownloadDetails", js.undefined)
    @scala.inline
    def `setEnd-date`(value: String): Self = this.set("end-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnd-date`: Self = this.set("end-date", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetrics(value: String): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def `setStart-date`(value: String): Self = this.set("start-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-date`: Self = this.set("start-date", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

