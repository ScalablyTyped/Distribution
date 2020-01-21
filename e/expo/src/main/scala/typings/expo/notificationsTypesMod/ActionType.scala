package typings.expo.notificationsTypesMod

import typings.expo.AnonPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionType extends js.Object {
  var actionId: String
  var buttonTitle: String
  var doNotOpenInForeground: js.UndefOr[Boolean] = js.undefined
  var isAuthenticationRequired: js.UndefOr[Boolean] = js.undefined
  var isDestructive: js.UndefOr[Boolean] = js.undefined
  var textInput: js.UndefOr[AnonPlaceholder] = js.undefined
}

object ActionType {
  @scala.inline
  def apply(
    actionId: String,
    buttonTitle: String,
    doNotOpenInForeground: js.UndefOr[Boolean] = js.undefined,
    isAuthenticationRequired: js.UndefOr[Boolean] = js.undefined,
    isDestructive: js.UndefOr[Boolean] = js.undefined,
    textInput: AnonPlaceholder = null
  ): ActionType = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], buttonTitle = buttonTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotOpenInForeground)) __obj.updateDynamic("doNotOpenInForeground")(doNotOpenInForeground.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuthenticationRequired)) __obj.updateDynamic("isAuthenticationRequired")(isAuthenticationRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isDestructive)) __obj.updateDynamic("isDestructive")(isDestructive.asInstanceOf[js.Any])
    if (textInput != null) __obj.updateDynamic("textInput")(textInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
}

