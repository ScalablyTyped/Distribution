package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivity extends js.Object {
  /** Account ID of this floodlight activity. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /**
    * Advertiser ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's advertiser or
    * the existing activity's advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
    * Code type used for cache busting in the generated tag. Applicable only when floodlightActivityGroupType is COUNTER and countingMethod is
    * STANDARD_COUNTING or UNIQUE_COUNTING.
    */
  var cacheBustingType: js.UndefOr[String] = js.undefined
  /** Counting method for conversions for this floodlight activity. This is a required field. */
  var countingMethod: js.UndefOr[String] = js.undefined
  /** Dynamic floodlight tags. */
  var defaultTags: js.UndefOr[js.Array[FloodlightActivityDynamicTag]] = js.undefined
  /** URL where this tag will be deployed. If specified, must be less than 256 characters long. */
  var expectedUrl: js.UndefOr[String] = js.undefined
  /** Floodlight activity group ID of this floodlight activity. This is a required field. */
  var floodlightActivityGroupId: js.UndefOr[String] = js.undefined
  /** Name of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupName: js.UndefOr[String] = js.undefined
  /** Tag string of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.undefined
  /** Type of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupType: js.UndefOr[String] = js.undefined
  /**
    * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's
    * floodlight configuration or from the existing activity's floodlight configuration.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field. */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this activity is archived. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** ID of this floodlight activity. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether the image tag is enabled for this activity. */
  var imageTagEnabled: js.UndefOr[Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivity". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this floodlight activity. This is a required field. Must be less than 129 characters long and cannot contain quotes. */
  var name: js.UndefOr[String] = js.undefined
  /** General notes or implementation instructions for the tag. */
  var notes: js.UndefOr[String] = js.undefined
  /** Publisher dynamic floodlight tags. */
  var publisherTags: js.UndefOr[js.Array[FloodlightActivityPublisherDynamicTag]] = js.undefined
  /** Whether this tag should use SSL. */
  var secure: js.UndefOr[Boolean] = js.undefined
  /** Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected by the system from the floodlight tags. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  /** Whether this floodlight activity must be SSL-compliant. */
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  /** Subaccount ID of this floodlight activity. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Tag format type for the floodlight activity. If left blank, the tag format will default to HTML. */
  var tagFormat: js.UndefOr[String] = js.undefined
  /**
    * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the activity. This is optional: if empty, a new tag string will
    * be generated for you. This string must be 1 to 8 characters long, with valid characters being [a-z][A-Z][0-9][-][ _ ]. This tag string must also be
    * unique among activities of the same activity group. This field is read-only after insertion.
    */
  var tagString: js.UndefOr[String] = js.undefined
  /**
    * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in the tags. Each of these can have a user defined type.
    * Acceptable values are U1 to U100, inclusive.
    */
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
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    imageTagEnabled: js.UndefOr[Boolean] = js.undefined,
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
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(imageTagEnabled)) __obj.updateDynamic("imageTagEnabled")(imageTagEnabled.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (publisherTags != null) __obj.updateDynamic("publisherTags")(publisherTags.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (tagFormat != null) __obj.updateDynamic("tagFormat")(tagFormat.asInstanceOf[js.Any])
    if (tagString != null) __obj.updateDynamic("tagString")(tagString.asInstanceOf[js.Any])
    if (userDefinedVariableTypes != null) __obj.updateDynamic("userDefinedVariableTypes")(userDefinedVariableTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivity]
  }
}

