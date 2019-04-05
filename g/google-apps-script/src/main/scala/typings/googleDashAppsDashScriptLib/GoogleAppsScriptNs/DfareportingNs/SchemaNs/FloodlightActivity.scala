package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivity extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var cacheBustingType: js.UndefOr[java.lang.String] = js.undefined
  var countingMethod: js.UndefOr[java.lang.String] = js.undefined
  var defaultTags: js.UndefOr[js.Array[FloodlightActivityDynamicTag]] = js.undefined
  var expectedUrl: js.UndefOr[java.lang.String] = js.undefined
  var floodlightActivityGroupId: js.UndefOr[java.lang.String] = js.undefined
  var floodlightActivityGroupName: js.UndefOr[java.lang.String] = js.undefined
  var floodlightActivityGroupTagString: js.UndefOr[java.lang.String] = js.undefined
  var floodlightActivityGroupType: js.UndefOr[java.lang.String] = js.undefined
  var floodlightConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var floodlightTagType: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var publisherTags: js.UndefOr[js.Array[FloodlightActivityPublisherDynamicTag]] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var tagFormat: js.UndefOr[java.lang.String] = js.undefined
  var tagString: js.UndefOr[java.lang.String] = js.undefined
  var userDefinedVariableTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object FloodlightActivity {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    cacheBustingType: java.lang.String = null,
    countingMethod: java.lang.String = null,
    defaultTags: js.Array[FloodlightActivityDynamicTag] = null,
    expectedUrl: java.lang.String = null,
    floodlightActivityGroupId: java.lang.String = null,
    floodlightActivityGroupName: java.lang.String = null,
    floodlightActivityGroupTagString: java.lang.String = null,
    floodlightActivityGroupType: java.lang.String = null,
    floodlightConfigurationId: java.lang.String = null,
    floodlightConfigurationIdDimensionValue: DimensionValue = null,
    floodlightTagType: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    publisherTags: js.Array[FloodlightActivityPublisherDynamicTag] = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    sslCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    sslRequired: js.UndefOr[scala.Boolean] = js.undefined,
    subaccountId: java.lang.String = null,
    tagFormat: java.lang.String = null,
    tagString: java.lang.String = null,
    userDefinedVariableTypes: js.Array[java.lang.String] = null
  ): FloodlightActivity = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (cacheBustingType != null) __obj.updateDynamic("cacheBustingType")(cacheBustingType)
    if (countingMethod != null) __obj.updateDynamic("countingMethod")(countingMethod)
    if (defaultTags != null) __obj.updateDynamic("defaultTags")(defaultTags)
    if (expectedUrl != null) __obj.updateDynamic("expectedUrl")(expectedUrl)
    if (floodlightActivityGroupId != null) __obj.updateDynamic("floodlightActivityGroupId")(floodlightActivityGroupId)
    if (floodlightActivityGroupName != null) __obj.updateDynamic("floodlightActivityGroupName")(floodlightActivityGroupName)
    if (floodlightActivityGroupTagString != null) __obj.updateDynamic("floodlightActivityGroupTagString")(floodlightActivityGroupTagString)
    if (floodlightActivityGroupType != null) __obj.updateDynamic("floodlightActivityGroupType")(floodlightActivityGroupType)
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId)
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue)
    if (floodlightTagType != null) __obj.updateDynamic("floodlightTagType")(floodlightTagType)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (publisherTags != null) __obj.updateDynamic("publisherTags")(publisherTags)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (tagFormat != null) __obj.updateDynamic("tagFormat")(tagFormat)
    if (tagString != null) __obj.updateDynamic("tagString")(tagString)
    if (userDefinedVariableTypes != null) __obj.updateDynamic("userDefinedVariableTypes")(userDefinedVariableTypes)
    __obj.asInstanceOf[FloodlightActivity]
  }
}

