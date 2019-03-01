package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudience extends js.Object {
  /** Account ID to which this remarketing audience belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The simple audience definition that will cause a user to be added to an audience. */
  var audienceDefinition: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_IncludeConditions] = js.undefined
  /** The type of audience, either SIMPLE or STATE_BASED. */
  var audienceType: js.UndefOr[java.lang.String] = js.undefined
  /** Time this remarketing audience was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** The description of this remarketing audience. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Remarketing Audience ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this remarketing audience belongs. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The linked ad accounts associated with this remarketing audience. A remarketing audience can have only one linkedAdAccount currently. */
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.undefined
  /** The views (profiles) that this remarketing audience is linked to. */
  var linkedViews: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The name of this remarketing audience. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A state based audience definition that will cause a user to be added or removed from an audience. */
  var stateBasedAudienceDefinition: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_ExcludeConditions] = js.undefined
  /** Time this remarketing audience was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this remarketing audience belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object RemarketingAudience {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    audienceDefinition: gapiDotClientDotAnalyticsLib.Anon_IncludeConditions = null,
    audienceType: java.lang.String = null,
    created: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    linkedAdAccounts: js.Array[LinkedForeignAccount] = null,
    linkedViews: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    stateBasedAudienceDefinition: gapiDotClientDotAnalyticsLib.Anon_ExcludeConditions = null,
    updated: java.lang.String = null,
    webPropertyId: java.lang.String = null
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

