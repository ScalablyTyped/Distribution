package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivity extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var cacheBustingType: js.UndefOr[String] = js.undefined
  var countingMethod: js.UndefOr[String] = js.undefined
  var defaultTags: js.UndefOr[js.Array[FloodlightActivityDynamicTag]] = js.undefined
  var expectedUrl: js.UndefOr[String] = js.undefined
  var floodlightActivityGroupId: js.UndefOr[String] = js.undefined
  var floodlightActivityGroupName: js.UndefOr[String] = js.undefined
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.undefined
  var floodlightActivityGroupType: js.UndefOr[String] = js.undefined
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var floodlightTagType: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var publisherTags: js.UndefOr[js.Array[FloodlightActivityPublisherDynamicTag]] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var tagFormat: js.UndefOr[String] = js.undefined
  var tagString: js.UndefOr[String] = js.undefined
  var userDefinedVariableTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object FloodlightActivity {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    cacheBustingType: String = null,
    countingMethod: String = null,
    defaultTags: js.Array[FloodlightActivityDynamicTag] = null,
    expectedUrl: String = null,
    floodlightActivityGroupId: String = null,
    floodlightActivityGroupName: String = null,
    floodlightActivityGroupTagString: String = null,
    floodlightActivityGroupType: String = null,
    floodlightConfigurationId: String = null,
    floodlightConfigurationIdDimensionValue: DimensionValue = null,
    floodlightTagType: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    kind: String = null,
    name: String = null,
    notes: String = null,
    publisherTags: js.Array[FloodlightActivityPublisherDynamicTag] = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    sslRequired: js.UndefOr[Boolean] = js.undefined,
    subaccountId: String = null,
    tagFormat: String = null,
    tagString: String = null,
    userDefinedVariableTypes: js.Array[String] = null
  ): FloodlightActivity = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (cacheBustingType != null) __obj.updateDynamic("cacheBustingType")(cacheBustingType.asInstanceOf[js.Any])
    if (countingMethod != null) __obj.updateDynamic("countingMethod")(countingMethod.asInstanceOf[js.Any])
    if (defaultTags != null) __obj.updateDynamic("defaultTags")(defaultTags.asInstanceOf[js.Any])
    if (expectedUrl != null) __obj.updateDynamic("expectedUrl")(expectedUrl.asInstanceOf[js.Any])
    if (floodlightActivityGroupId != null) __obj.updateDynamic("floodlightActivityGroupId")(floodlightActivityGroupId.asInstanceOf[js.Any])
    if (floodlightActivityGroupName != null) __obj.updateDynamic("floodlightActivityGroupName")(floodlightActivityGroupName.asInstanceOf[js.Any])
    if (floodlightActivityGroupTagString != null) __obj.updateDynamic("floodlightActivityGroupTagString")(floodlightActivityGroupTagString.asInstanceOf[js.Any])
    if (floodlightActivityGroupType != null) __obj.updateDynamic("floodlightActivityGroupType")(floodlightActivityGroupType.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue.asInstanceOf[js.Any])
    if (floodlightTagType != null) __obj.updateDynamic("floodlightTagType")(floodlightTagType.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (publisherTags != null) __obj.updateDynamic("publisherTags")(publisherTags.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.get.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (tagFormat != null) __obj.updateDynamic("tagFormat")(tagFormat.asInstanceOf[js.Any])
    if (tagString != null) __obj.updateDynamic("tagString")(tagString.asInstanceOf[js.Any])
    if (userDefinedVariableTypes != null) __obj.updateDynamic("userDefinedVariableTypes")(userDefinedVariableTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivity]
  }
}

