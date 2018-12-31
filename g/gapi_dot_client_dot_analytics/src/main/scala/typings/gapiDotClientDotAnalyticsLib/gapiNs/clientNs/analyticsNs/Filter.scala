package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** Account ID to which this filter belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the filter of the type ADVANCED. */
  var advancedDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_OutputToField] = js.undefined
  /** Time this filter was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the filter of the type EXCLUDE. */
  var excludeDetails: js.UndefOr[FilterExpression] = js.undefined
  /** Filter ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the filter of the type INCLUDE. */
  var includeDetails: js.UndefOr[FilterExpression] = js.undefined
  /** Resource type for Analytics filter. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the filter of the type LOWER. */
  var lowercaseDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Field] = js.undefined
  /** Name of this filter. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for this filter. Points to the account to which this filter belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Type] = js.undefined
  /** Details for the filter of the type SEARCH_AND_REPLACE. */
  var searchAndReplaceDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_FieldIndex] = js.undefined
  /** Link for this filter. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE, SEARCH_AND_REPLACE and ADVANCED. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time this filter was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the filter of the type UPPER. */
  var uppercaseDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Field] = js.undefined
}

