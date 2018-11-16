package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetableRemarketingList extends js.Object {
  /** Account ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this targetable remarketing list is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Dimension value for the advertiser ID that owns this targetable remarketing list. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Targetable remarketing list description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Targetable remarketing list ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetableRemarketingList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Number of days that a user should remain in the targetable remarketing list without an impression. */
  var lifeSpan: js.UndefOr[java.lang.String] = js.undefined
  /** Number of users currently in the list. This is a read-only field. */
  var listSize: js.UndefOr[java.lang.String] = js.undefined
  /** Product from which this targetable remarketing list was originated. */
  var listSource: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the targetable remarketing list. Is no greater than 128 characters long. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

