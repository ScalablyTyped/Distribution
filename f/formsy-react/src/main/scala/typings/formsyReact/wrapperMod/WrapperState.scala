package typings.formsyReact.wrapperMod

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.interfacesMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperState[V]
  extends /* key */ StringDictionary[js.Any] {
  var formSubmitted: Boolean
  var isPristine: Boolean
  var isRequired: Boolean
  var isValid: Boolean
  var pristineValue: V
  var validationError: js.Array[ValidationError]
  var value: V
}

object WrapperState {
  @scala.inline
  def apply[V](
    formSubmitted: Boolean,
    isPristine: Boolean,
    isRequired: Boolean,
    isValid: Boolean,
    pristineValue: V,
    validationError: js.Array[ValidationError],
    value: V,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): WrapperState[V] = {
    val __obj = js.Dynamic.literal(formSubmitted = formSubmitted.asInstanceOf[js.Any], isPristine = isPristine.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], pristineValue = pristineValue.asInstanceOf[js.Any], validationError = validationError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[WrapperState[V]]
  }
}

