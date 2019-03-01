package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** Account ID to which this filter belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the filter of the type ADVANCED. */
  var advancedDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_CaseSensitive] = js.undefined
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
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Details for the filter of the type SEARCH_AND_REPLACE. */
  var searchAndReplaceDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_CaseSensitiveField] = js.undefined
  /** Link for this filter. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE, SEARCH_AND_REPLACE and ADVANCED. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time this filter was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Details for the filter of the type UPPER. */
  var uppercaseDetails: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Field] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advancedDetails: gapiDotClientDotAnalyticsLib.Anon_CaseSensitive = null,
    created: java.lang.String = null,
    excludeDetails: FilterExpression = null,
    id: java.lang.String = null,
    includeDetails: FilterExpression = null,
    kind: java.lang.String = null,
    lowercaseDetails: gapiDotClientDotAnalyticsLib.Anon_Field = null,
    name: java.lang.String = null,
    parentLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    searchAndReplaceDetails: gapiDotClientDotAnalyticsLib.Anon_CaseSensitiveField = null,
    selfLink: java.lang.String = null,
    `type`: java.lang.String = null,
    updated: java.lang.String = null,
    uppercaseDetails: gapiDotClientDotAnalyticsLib.Anon_Field = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advancedDetails != null) __obj.updateDynamic("advancedDetails")(advancedDetails)
    if (created != null) __obj.updateDynamic("created")(created)
    if (excludeDetails != null) __obj.updateDynamic("excludeDetails")(excludeDetails)
    if (id != null) __obj.updateDynamic("id")(id)
    if (includeDetails != null) __obj.updateDynamic("includeDetails")(includeDetails)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lowercaseDetails != null) __obj.updateDynamic("lowercaseDetails")(lowercaseDetails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (searchAndReplaceDetails != null) __obj.updateDynamic("searchAndReplaceDetails")(searchAndReplaceDetails)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (uppercaseDetails != null) __obj.updateDynamic("uppercaseDetails")(uppercaseDetails)
    __obj.asInstanceOf[Filter]
  }
}

