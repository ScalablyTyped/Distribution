package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLog extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var action: js.UndefOr[java.lang.String] = js.undefined
  var changeTime: js.UndefOr[java.lang.String] = js.undefined
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var newValue: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  var oldValue: js.UndefOr[java.lang.String] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var transactionId: js.UndefOr[java.lang.String] = js.undefined
  var userProfileId: js.UndefOr[java.lang.String] = js.undefined
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

