package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsampledReport extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var cloudStorageDownloadDetails: js.UndefOr[UnsampledReportCloudStorageDownloadDetails] = js.native
  var created: js.UndefOr[String] = js.native
  var dimensions: js.UndefOr[String] = js.native
  var downloadType: js.UndefOr[String] = js.native
  var driveDownloadDetails: js.UndefOr[UnsampledReportDriveDownloadDetails] = js.native
  var end_date: js.UndefOr[String] = js.native
  var filters: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[String] = js.native
  var profileId: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var start_date: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var updated: js.UndefOr[String] = js.native
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
    def setCloudStorageDownloadDetails(value: UnsampledReportCloudStorageDownloadDetails): Self = this.set("cloudStorageDownloadDetails", value.asInstanceOf[js.Any])
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
    def setDriveDownloadDetails(value: UnsampledReportDriveDownloadDetails): Self = this.set("driveDownloadDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveDownloadDetails: Self = this.set("driveDownloadDetails", js.undefined)
    @scala.inline
    def setEnd_date(value: String): Self = this.set("end_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_date: Self = this.set("end_date", js.undefined)
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
    def setStart_date(value: String): Self = this.set("start_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_date: Self = this.set("start_date", js.undefined)
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

