package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advancedDetails != null) __obj.updateDynamic("advancedDetails")(advancedDetails.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (excludeDetails != null) __obj.updateDynamic("excludeDetails")(excludeDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (includeDetails != null) __obj.updateDynamic("includeDetails")(includeDetails.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lowercaseDetails != null) __obj.updateDynamic("lowercaseDetails")(lowercaseDetails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (searchAndReplaceDetails != null) __obj.updateDynamic("searchAndReplaceDetails")(searchAndReplaceDetails.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (uppercaseDetails != null) __obj.updateDynamic("uppercaseDetails")(uppercaseDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

