package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeLog extends js.Object {
  /** Account ID of the modified object. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Action which caused the change. */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Time when the object was modified. */
  var changeTime: js.UndefOr[java.lang.String] = js.undefined
  /** Field name of the object which changed. */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this change log. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLog". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** New value of the object field. */
  var newValue: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the object of this change log. The object could be a campaign, placement, ad, or other type. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** Object type of the change log. */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /** Old value of the object field. */
  var oldValue: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of the modified object. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Transaction ID of this change log. When a single API call results in many changes, each change will have a separate ID in the change log but will share
               * the same transactionId.
               */
  var transactionId: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user who modified the object. */
  var userProfileId: js.UndefOr[java.lang.String] = js.undefined
  /** User profile name of the user who modified the object. */
  var userProfileName: js.UndefOr[java.lang.String] = js.undefined
}

