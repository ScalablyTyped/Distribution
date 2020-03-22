package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClientDfareporting.AnonActive
import typings.gapiClientDfareporting.AnonActivities
import typings.gapiClientDfareporting.AnonActivityFilters
import typings.gapiClientDfareporting.AnonBreakdown
import typings.gapiClientDfareporting.AnonCustomRichMediaEvents
import typings.gapiClientDfareporting.AnonDateRange
import typings.gapiClientDfareporting.AnonEmailOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  /** The account ID to which this report belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The report criteria for a report of type "STANDARD". */
  var criteria: js.UndefOr[AnonActivities] = js.undefined
  /** The report criteria for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachCriteria: js.UndefOr[AnonBreakdown] = js.undefined
  /** The report's email delivery settings. */
  var delivery: js.UndefOr[AnonEmailOwner] = js.undefined
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The filename used when generating report files for this report. */
  var fileName: js.UndefOr[String] = js.undefined
  /** The report criteria for a report of type "FLOODLIGHT". */
  var floodlightCriteria: js.UndefOr[AnonCustomRichMediaEvents] = js.undefined
  /**
    * The output format of the report. If not specified, default format is "CSV". Note that the actual format in the completed report file might differ if
    * for instance the report's size exceeds the format's capabilities. "CSV" will then be the fallback format.
    */
  var format: js.UndefOr[String] = js.undefined
  /** The unique ID identifying this report resource. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#report. */
  var kind: js.UndefOr[String] = js.undefined
  /** The timestamp (in milliseconds since epoch) of when this report was last modified. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  /** The name of the report. */
  var name: js.UndefOr[String] = js.undefined
  /** The user profile id of the owner of this report. */
  var ownerProfileId: js.UndefOr[String] = js.undefined
  /** The report criteria for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionCriteria: js.UndefOr[AnonActivityFilters] = js.undefined
  /** The report criteria for a report of type "REACH". */
  var reachCriteria: js.UndefOr[AnonDateRange] = js.undefined
  /** The report's schedule. Can only be set if the report's 'dateRange' is a relative date range and the relative date range is not "TODAY". */
  var schedule: js.UndefOr[AnonActive] = js.undefined
  /** The subaccount ID to which this report belongs if applicable. */
  var subAccountId: js.UndefOr[String] = js.undefined
  /** The type of the report. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    accountId: String = null,
    criteria: AnonActivities = null,
    crossDimensionReachCriteria: AnonBreakdown = null,
    delivery: AnonEmailOwner = null,
    etag: String = null,
    fileName: String = null,
    floodlightCriteria: AnonCustomRichMediaEvents = null,
    format: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedTime: String = null,
    name: String = null,
    ownerProfileId: String = null,
    pathToConversionCriteria: AnonActivityFilters = null,
    reachCriteria: AnonDateRange = null,
    schedule: AnonActive = null,
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

