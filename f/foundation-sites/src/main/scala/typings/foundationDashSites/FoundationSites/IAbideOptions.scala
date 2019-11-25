package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbideOptions extends js.Object {
  var formErrorClass: js.UndefOr[String] = js.undefined
  var formErrorSelector: js.UndefOr[String] = js.undefined
  var inputErrorClass: js.UndefOr[String] = js.undefined
  var labelErrorClass: js.UndefOr[String] = js.undefined
  var liveValidate: js.UndefOr[Boolean] = js.undefined
  var validateOn: js.UndefOr[String] = js.undefined
  var validators: js.UndefOr[js.Any] = js.undefined
}

object IAbideOptions {
  @scala.inline
  def apply(
    formErrorClass: String = null,
    formErrorSelector: String = null,
    inputErrorClass: String = null,
    labelErrorClass: String = null,
    liveValidate: js.UndefOr[Boolean] = js.undefined,
    validateOn: String = null,
    validators: js.Any = null
  ): IAbideOptions = {
    val __obj = js.Dynamic.literal()
    if (formErrorClass != null) __obj.updateDynamic("formErrorClass")(formErrorClass.asInstanceOf[js.Any])
    if (formErrorSelector != null) __obj.updateDynamic("formErrorSelector")(formErrorSelector.asInstanceOf[js.Any])
    if (inputErrorClass != null) __obj.updateDynamic("inputErrorClass")(inputErrorClass.asInstanceOf[js.Any])
    if (labelErrorClass != null) __obj.updateDynamic("labelErrorClass")(labelErrorClass.asInstanceOf[js.Any])
    if (!js.isUndefined(liveValidate)) __obj.updateDynamic("liveValidate")(liveValidate.asInstanceOf[js.Any])
    if (validateOn != null) __obj.updateDynamic("validateOn")(validateOn.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbideOptions]
  }
}

