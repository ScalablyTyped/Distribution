package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  /** The account ID to which this report belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The report criteria for a report of type "STANDARD". */
  var criteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_Activities] = js.undefined
  /** The report criteria for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachCriteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_Breakdown] = js.undefined
  /** The report's email delivery settings. */
  var delivery: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_EmailOwner] = js.undefined
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The filename used when generating report files for this report. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** The report criteria for a report of type "FLOODLIGHT". */
  var floodlightCriteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_CustomRichMediaEvents] = js.undefined
  /**
    * The output format of the report. If not specified, default format is "CSV". Note that the actual format in the completed report file might differ if
    * for instance the report's size exceeds the format's capabilities. "CSV" will then be the fallback format.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID identifying this report resource. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#report. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp (in milliseconds since epoch) of when this report was last modified. */
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the report. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The user profile id of the owner of this report. */
  var ownerProfileId: js.UndefOr[java.lang.String] = js.undefined
  /** The report criteria for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionCriteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_ActivityFilters] = js.undefined
  /** The report criteria for a report of type "REACH". */
  var reachCriteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_ActivitiesCustomRichMediaEvents] = js.undefined
  /** The report's schedule. Can only be set if the report's 'dateRange' is a relative date range and the relative date range is not "TODAY". */
  var schedule: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_Active] = js.undefined
  /** The subaccount ID to which this report belongs if applicable. */
  var subAccountId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the report. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    criteria: gapiDotClientDotDfareportingLib.Anon_Activities = null,
    crossDimensionReachCriteria: gapiDotClientDotDfareportingLib.Anon_Breakdown = null,
    delivery: gapiDotClientDotDfareportingLib.Anon_EmailOwner = null,
    etag: java.lang.String = null,
    fileName: java.lang.String = null,
    floodlightCriteria: gapiDotClientDotDfareportingLib.Anon_CustomRichMediaEvents = null,
    format: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedTime: java.lang.String = null,
    name: java.lang.String = null,
    ownerProfileId: java.lang.String = null,
    pathToConversionCriteria: gapiDotClientDotDfareportingLib.Anon_ActivityFilters = null,
    reachCriteria: gapiDotClientDotDfareportingLib.Anon_ActivitiesCustomRichMediaEvents = null,
    schedule: gapiDotClientDotDfareportingLib.Anon_Active = null,
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

