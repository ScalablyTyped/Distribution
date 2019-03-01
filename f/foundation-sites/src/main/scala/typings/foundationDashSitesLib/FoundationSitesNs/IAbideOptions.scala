package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbideOptions extends js.Object {
  var formErrorClass: js.UndefOr[java.lang.String] = js.undefined
  var formErrorSelector: js.UndefOr[java.lang.String] = js.undefined
  var inputErrorClass: js.UndefOr[java.lang.String] = js.undefined
  var labelErrorClass: js.UndefOr[java.lang.String] = js.undefined
  var liveValidate: js.UndefOr[scala.Boolean] = js.undefined
  var validateOn: js.UndefOr[java.lang.String] = js.undefined
  var validators: js.UndefOr[js.Any] = js.undefined
}

object IAbideOptions {
  @scala.inline
  def apply(
    formErrorClass: java.lang.String = null,
    formErrorSelector: java.lang.String = null,
    inputErrorClass: java.lang.String = null,
    labelErrorClass: java.lang.String = null,
    liveValidate: js.UndefOr[scala.Boolean] = js.undefined,
    validateOn: java.lang.String = null,
    validators: js.Any = null
  ): IAbideOptions = {
    val __obj = js.Dynamic.literal()
    if (formErrorClass != null) __obj.updateDynamic("formErrorClass")(formErrorClass)
    if (formErrorSelector != null) __obj.updateDynamic("formErrorSelector")(formErrorSelector)
    if (inputErrorClass != null) __obj.updateDynamic("inputErrorClass")(inputErrorClass)
    if (labelErrorClass != null) __obj.updateDynamic("labelErrorClass")(labelErrorClass)
    if (!js.isUndefined(liveValidate)) __obj.updateDynamic("liveValidate")(liveValidate)
    if (validateOn != null) __obj.updateDynamic("validateOn")(validateOn)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[IAbideOptions]
  }
}

