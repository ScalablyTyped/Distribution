package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudience extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var audienceDefinition: js.UndefOr[RemarketingAudienceAudienceDefinition] = js.undefined
  var audienceType: js.UndefOr[String] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.undefined
  var linkedViews: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stateBasedAudienceDefinition: js.UndefOr[RemarketingAudienceStateBasedAudienceDefinition] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object RemarketingAudience {
  @scala.inline
  def apply(
    accountId: String = null,
    audienceDefinition: RemarketingAudienceAudienceDefinition = null,
    audienceType: String = null,
    created: String = null,
    description: String = null,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    linkedAdAccounts: js.Array[LinkedForeignAccount] = null,
    linkedViews: js.Array[String] = null,
    name: String = null,
    stateBasedAudienceDefinition: RemarketingAudienceStateBasedAudienceDefinition = null,
    updated: String = null,
    webPropertyId: String = null
  ): RemarketingAudience = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (audienceDefinition != null) __obj.updateDynamic("audienceDefinition")(audienceDefinition.asInstanceOf[js.Any])
    if (audienceType != null) __obj.updateDynamic("audienceType")(audienceType.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (linkedAdAccounts != null) __obj.updateDynamic("linkedAdAccounts")(linkedAdAccounts.asInstanceOf[js.Any])
    if (linkedViews != null) __obj.updateDynamic("linkedViews")(linkedViews.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stateBasedAudienceDefinition != null) __obj.updateDynamic("stateBasedAudienceDefinition")(stateBasedAudienceDefinition.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarketingAudience]
  }
}

