package typings.formsyReact.mod

import typings.formsyReact.interfacesMod.FormsyContextInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsyState extends js.Object {
  var canChange: Boolean
  var contextValue: FormsyContextInterface
  var formSubmitted: js.UndefOr[Boolean] = js.undefined
  var isPristine: js.UndefOr[Boolean] = js.undefined
  var isSubmitting: Boolean
  var isValid: Boolean
}

object FormsyState {
  @scala.inline
  def apply(
    canChange: Boolean,
    contextValue: FormsyContextInterface,
    isSubmitting: Boolean,
    isValid: Boolean,
    formSubmitted: js.UndefOr[Boolean] = js.undefined,
    isPristine: js.UndefOr[Boolean] = js.undefined
  ): FormsyState = {
    val __obj = js.Dynamic.literal(canChange = canChange.asInstanceOf[js.Any], contextValue = contextValue.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    if (!js.isUndefined(formSubmitted)) __obj.updateDynamic("formSubmitted")(formSubmitted.asInstanceOf[js.Any])
    if (!js.isUndefined(isPristine)) __obj.updateDynamic("isPristine")(isPristine.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsyState]
  }
}

