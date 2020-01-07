package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.googleapis.Anon_ExcludeConditions
import typings.googleapis.Anon_IncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics remarketing audience.
  */
@js.native
trait Schema$RemarketingAudience extends js.Object {
  /**
    * Account ID to which this remarketing audience belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The simple audience definition that will cause a user to be added to an
    * audience.
    */
  var audienceDefinition: js.UndefOr[Anon_IncludeConditions] = js.native
  /**
    * The type of audience, either SIMPLE or STATE_BASED.
    */
  var audienceType: js.UndefOr[String] = js.native
  /**
    * Time this remarketing audience was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * The description of this remarketing audience.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Remarketing Audience ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Internal ID for the web property to which this remarketing audience
    * belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The linked ad accounts associated with this remarketing audience. A
    * remarketing audience can have only one linkedAdAccount currently.
    */
  var linkedAdAccounts: js.UndefOr[js.Array[Schema$LinkedForeignAccount]] = js.native
  /**
    * The views (profiles) that this remarketing audience is linked to.
    */
  var linkedViews: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of this remarketing audience.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A state based audience definition that will cause a user to be added or
    * removed from an audience.
    */
  var stateBasedAudienceDefinition: js.UndefOr[Anon_ExcludeConditions] = js.native
  /**
    * Time this remarketing audience was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Web property ID of the form UA-XXXXX-YY to which this remarketing
    * audience belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object Schema$RemarketingAudience {
  @scala.inline
  def apply(
    accountId: String = null,
    audienceDefinition: Anon_IncludeConditions = null,
    audienceType: String = null,
    created: String = null,
    description: String = null,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    linkedAdAccounts: js.Array[Schema$LinkedForeignAccount] = null,
    linkedViews: js.Array[String] = null,
    name: String = null,
    stateBasedAudienceDefinition: Anon_ExcludeConditions = null,
    updated: String = null,
    webPropertyId: String = null
  ): Schema$RemarketingAudience = {
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
    __obj.asInstanceOf[Schema$RemarketingAudience]
  }
}

