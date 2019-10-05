package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLog extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var changeTime: js.UndefOr[String] = js.undefined
  var fieldName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var newValue: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var objectType: js.UndefOr[String] = js.undefined
  var oldValue: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var transactionId: js.UndefOr[String] = js.undefined
  var userProfileId: js.UndefOr[String] = js.undefined
  var userProfileName: js.UndefOr[String] = js.undefined
}

object ChangeLog {
  @scala.inline
  def apply(
    accountId: String = null,
    action: String = null,
    changeTime: String = null,
    fieldName: String = null,
    id: String = null,
    kind: String = null,
    newValue: String = null,
    objectId: String = null,
    objectType: String = null,
    oldValue: String = null,
    subaccountId: String = null,
    transactionId: String = null,
    userProfileId: String = null,
    userProfileName: String = null
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

