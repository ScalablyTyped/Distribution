package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativeGroup extends js.Object {
  /** Account ID of this creative group. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this creative group. This is a required field on insertion. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
               * Subgroup of the creative group. Assign your creative groups to a subgroup in order to filter or manage them more easily. This field is required on
               * insertion and is read-only after insertion. Acceptable values are 1 to 2, inclusive.
               */
  var groupNumber: js.UndefOr[scala.Double] = js.undefined
  /** ID of this creative group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeGroup". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of this creative group. This is a required field and must be less than 256 characters long and unique among creative groups of the same
               * advertiser.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this creative group. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

