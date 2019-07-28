package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (audienceDefinition != null) __obj.updateDynamic("audienceDefinition")(audienceDefinition)
    if (audienceType != null) __obj.updateDynamic("audienceType")(audienceType)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (linkedAdAccounts != null) __obj.updateDynamic("linkedAdAccounts")(linkedAdAccounts)
    if (linkedViews != null) __obj.updateDynamic("linkedViews")(linkedViews)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stateBasedAudienceDefinition != null) __obj.updateDynamic("stateBasedAudienceDefinition")(stateBasedAudienceDefinition)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[RemarketingAudience]
  }
}

