package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advancedDetails: js.UndefOr[FilterAdvancedDetails] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var excludeDetails: js.UndefOr[FilterExpression] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var includeDetails: js.UndefOr[FilterExpression] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lowercaseDetails: js.UndefOr[FilterLowercaseDetails] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[FilterParentLink] = js.undefined
  var searchAndReplaceDetails: js.UndefOr[FilterSearchAndReplaceDetails] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var uppercaseDetails: js.UndefOr[FilterUppercaseDetails] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    accountId: String = null,
    advancedDetails: FilterAdvancedDetails = null,
    created: String = null,
    excludeDetails: FilterExpression = null,
    id: String = null,
    includeDetails: FilterExpression = null,
    kind: String = null,
    lowercaseDetails: FilterLowercaseDetails = null,
    name: String = null,
    parentLink: FilterParentLink = null,
    searchAndReplaceDetails: FilterSearchAndReplaceDetails = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    uppercaseDetails: FilterUppercaseDetails = null
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

