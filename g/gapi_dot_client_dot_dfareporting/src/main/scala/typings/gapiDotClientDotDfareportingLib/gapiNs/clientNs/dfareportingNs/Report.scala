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
  var floodlightCriteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_FloodlightConfigId] = js.undefined
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
  var pathToConversionCriteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_FloodlightConfigIdConversionDimensions] = js.undefined
  /** The report criteria for a report of type "REACH". */
  var reachCriteria: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_EnableAllDimensionCombinations] = js.undefined
  /** The report's schedule. Can only be set if the report's 'dateRange' is a relative date range and the relative date range is not "TODAY". */
  var schedule: js.UndefOr[gapiDotClientDotDfareportingLib.Anon_ExpirationDate] = js.undefined
  /** The subaccount ID to which this report belongs if applicable. */
  var subAccountId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the report. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

