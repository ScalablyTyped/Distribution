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

object ChangeLog {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    action: java.lang.String = null,
    changeTime: java.lang.String = null,
    fieldName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    newValue: java.lang.String = null,
    objectId: java.lang.String = null,
    objectType: java.lang.String = null,
    oldValue: java.lang.String = null,
    subaccountId: java.lang.String = null,
    transactionId: java.lang.String = null,
    userProfileId: java.lang.String = null,
    userProfileName: java.lang.String = null
  ): ChangeLog = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (action != null) __obj.updateDynamic("action")(action)
    if (changeTime != null) __obj.updateDynamic("changeTime")(changeTime)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    if (userProfileId != null) __obj.updateDynamic("userProfileId")(userProfileId)
    if (userProfileName != null) __obj.updateDynamic("userProfileName")(userProfileName)
    __obj.asInstanceOf[ChangeLog]
  }
}

