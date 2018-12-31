package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivity extends js.Object {
  /** Account ID of this floodlight activity. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Advertiser ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's advertiser or
    * the existing activity's advertiser.
    */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
    * Code type used for cache busting in the generated tag. Applicable only when floodlightActivityGroupType is COUNTER and countingMethod is
    * STANDARD_COUNTING or UNIQUE_COUNTING.
    */
  var cacheBustingType: js.UndefOr[java.lang.String] = js.undefined
  /** Counting method for conversions for this floodlight activity. This is a required field. */
  var countingMethod: js.UndefOr[java.lang.String] = js.undefined
  /** Dynamic floodlight tags. */
  var defaultTags: js.UndefOr[js.Array[FloodlightActivityDynamicTag]] = js.undefined
  /** URL where this tag will be deployed. If specified, must be less than 256 characters long. */
  var expectedUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Floodlight activity group ID of this floodlight activity. This is a required field. */
  var floodlightActivityGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupName: js.UndefOr[java.lang.String] = js.undefined
  /** Tag string of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupTagString: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the associated floodlight activity group. This is a read-only field. */
  var floodlightActivityGroupType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value will be copied over either from the activity group's
    * floodlight configuration or from the existing activity's floodlight configuration.
    */
  var floodlightConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field. */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this activity is archived. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of this floodlight activity. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether the image tag is enabled for this activity. */
  var imageTagEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivity". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this floodlight activity. This is a required field. Must be less than 129 characters long and cannot contain quotes. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** General notes or implementation instructions for the tag. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher dynamic floodlight tags. */
  var publisherTags: js.UndefOr[js.Array[FloodlightActivityPublisherDynamicTag]] = js.undefined
  /** Whether this tag should use SSL. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected by the system from the floodlight tags. */
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this floodlight activity must be SSL-compliant. */
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Subaccount ID of this floodlight activity. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Tag format type for the floodlight activity. If left blank, the tag format will default to HTML. */
  var tagFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the activity. This is optional: if empty, a new tag string will
    * be generated for you. This string must be 1 to 8 characters long, with valid characters being [a-z][A-Z][0-9][-][ _ ]. This tag string must also be
    * unique among activities of the same activity group. This field is read-only after insertion.
    */
  var tagString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in the tags. Each of these can have a user defined type.
    * Acceptable values are U1 to U100, inclusive.
    */
  var userDefinedVariableTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

