package typings.formsyReact.wrapperMod

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.interfacesMod.RequiredValidation
import typings.formsyReact.interfacesMod.ValidationError
import typings.formsyReact.interfacesMod.Validations
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperProps[V] extends js.Object {
  var innerRef: js.UndefOr[js.Function1[/* ref */ Ref[_], Unit]] = js.undefined
  var name: String
  var required: js.UndefOr[RequiredValidation[V]] = js.undefined
  var validationError: js.UndefOr[ValidationError] = js.undefined
  var validationErrors: js.UndefOr[StringDictionary[ValidationError]] = js.undefined
  var validations: js.UndefOr[Validations[V]] = js.undefined
  var value: js.UndefOr[V] = js.undefined
}

object WrapperProps {
  @scala.inline
  def apply[V](
    name: String,
    innerRef: /* ref */ Ref[_] => Unit = null,
    required: RequiredValidation[V] = null,
    validationError: ValidationError = null,
    validationErrors: StringDictionary[ValidationError] = null,
    validations: Validations[V] = null,
    value: V = null
  ): WrapperProps[V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validations != null) __obj.updateDynamic("validations")(validations.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps[V]]
  }
}

