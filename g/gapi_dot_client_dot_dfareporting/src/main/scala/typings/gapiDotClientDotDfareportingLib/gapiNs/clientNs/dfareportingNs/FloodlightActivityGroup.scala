package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroup extends js.Object {
  /** Account ID of this floodlight activity group. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Advertiser ID of this floodlight activity group. If this field is left blank, the value will be copied over either from the floodlight configuration's
    * advertiser or from the existing activity group's advertiser.
    */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Floodlight configuration ID of this floodlight activity group. This is a required field. */
  var floodlightConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field. */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** ID of this floodlight activity group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of this floodlight activity group. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivityGroup". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this floodlight activity group. This is a required field. Must be less than 65 characters long and cannot contain quotes. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this floodlight activity group. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value of the type= parameter in the floodlight tag, which the ad servers use to identify the activity group that the activity belongs to. This is
    * optional: if empty, a new tag string will be generated for you. This string must be 1 to 8 characters long, with valid characters being
    * [a-z][A-Z][0-9][-][ _ ]. This tag string must also be unique among activity groups of the same floodlight configuration. This field is read-only after
    * insertion.
    */
  var tagString: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the floodlight activity group. This is a required field that is read-only after insertion. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightActivityGroup {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    floodlightConfigurationId: java.lang.String = null,
    floodlightConfigurationIdDimensionValue: DimensionValue = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    subaccountId: java.lang.String = null,
    tagString: java.lang.String = null,
    `type`: java.lang.String = null
  ): FloodlightActivityGroup = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId)
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (tagString != null) __obj.updateDynamic("tagString")(tagString)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FloodlightActivityGroup]
  }
}

