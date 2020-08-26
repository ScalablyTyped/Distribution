package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClientDfareporting.anon.Active
import typings.gapiClientDfareporting.anon.ActivityFilters
import typings.gapiClientDfareporting.anon.Breakdown
import typings.gapiClientDfareporting.anon.EmailOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  /** The account ID to which this report belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** The report criteria for a report of type "STANDARD". */
  var criteria: js.UndefOr[typings.gapiClientDfareporting.anon.Activities] = js.native
  /** The report criteria for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachCriteria: js.UndefOr[Breakdown] = js.native
  /** The report's email delivery settings. */
  var delivery: js.UndefOr[EmailOwner] = js.native
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The filename used when generating report files for this report. */
  var fileName: js.UndefOr[String] = js.native
  /** The report criteria for a report of type "FLOODLIGHT". */
  var floodlightCriteria: js.UndefOr[typings.gapiClientDfareporting.anon.CustomRichMediaEvents] = js.native
  /**
    * The output format of the report. If not specified, default format is "CSV". Note that the actual format in the completed report file might differ if
    * for instance the report's size exceeds the format's capabilities. "CSV" will then be the fallback format.
    */
  var format: js.UndefOr[String] = js.native
  /** The unique ID identifying this report resource. */
  var id: js.UndefOr[String] = js.native
  /** The kind of resource this is, in this case dfareporting#report. */
  var kind: js.UndefOr[String] = js.native
  /** The timestamp (in milliseconds since epoch) of when this report was last modified. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** The name of the report. */
  var name: js.UndefOr[String] = js.native
  /** The user profile id of the owner of this report. */
  var ownerProfileId: js.UndefOr[String] = js.native
  /** The report criteria for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionCriteria: js.UndefOr[ActivityFilters] = js.native
  /** The report criteria for a report of type "REACH". */
  var reachCriteria: js.UndefOr[typings.gapiClientDfareporting.anon.DateRange] = js.native
  /** The report's schedule. Can only be set if the report's 'dateRange' is a relative date range and the relative date range is not "TODAY". */
  var schedule: js.UndefOr[Active] = js.native
  /** The subaccount ID to which this report belongs if applicable. */
  var subAccountId: js.UndefOr[String] = js.native
  /** The type of the report. */
  var `type`: js.UndefOr[String] = js.native
}

object Report {
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
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
    def setCriteria(value: typings.gapiClientDfareporting.anon.Activities): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setCrossDimensionReachCriteria(value: Breakdown): Self = this.set("crossDimensionReachCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossDimensionReachCriteria: Self = this.set("crossDimensionReachCriteria", js.undefined)
    @scala.inline
    def setDelivery(value: EmailOwner): Self = this.set("delivery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelivery: Self = this.set("delivery", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFloodlightCriteria(value: typings.gapiClientDfareporting.anon.CustomRichMediaEvents): Self = this.set("floodlightCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightCriteria: Self = this.set("floodlightCriteria", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnerProfileId(value: String): Self = this.set("ownerProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerProfileId: Self = this.set("ownerProfileId", js.undefined)
    @scala.inline
    def setPathToConversionCriteria(value: ActivityFilters): Self = this.set("pathToConversionCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathToConversionCriteria: Self = this.set("pathToConversionCriteria", js.undefined)
    @scala.inline
    def setReachCriteria(value: typings.gapiClientDfareporting.anon.DateRange): Self = this.set("reachCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReachCriteria: Self = this.set("reachCriteria", js.undefined)
    @scala.inline
    def setSchedule(value: Active): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setSubAccountId(value: String): Self = this.set("subAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAccountId: Self = this.set("subAccountId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

