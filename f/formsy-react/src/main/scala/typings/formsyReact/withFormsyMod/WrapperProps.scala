package typings.formsyReact.withFormsyMod

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.interfacesMod.RequiredValidation
import typings.formsyReact.interfacesMod.ValidationError
import typings.formsyReact.interfacesMod.Validations
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperProps[V] extends js.Object {
  var innerRef: js.UndefOr[js.Function1[/* ref */ Ref[_], Unit]] = js.native
  var name: String = js.native
  var required: js.UndefOr[RequiredValidation[V]] = js.native
  var validationError: js.UndefOr[ValidationError] = js.native
  var validationErrors: js.UndefOr[StringDictionary[ValidationError]] = js.native
  var validations: js.UndefOr[Validations[V]] = js.native
  var value: js.UndefOr[V] = js.native
}

object WrapperProps {
  @scala.inline
  def apply[V](name: String): WrapperProps[V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps[V]]
  }
  @scala.inline
  implicit class WrapperPropsOps[Self <: WrapperProps[_], V] (val x: Self with WrapperProps[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerRef(value: /* ref */ Ref[_] => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setRequired(value: RequiredValidation[V]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setValidationError(value: ValidationError): Self = this.set("validationError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationError: Self = this.set("validationError", js.undefined)
    @scala.inline
    def setValidationErrors(value: StringDictionary[ValidationError]): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationErrors: Self = this.set("validationErrors", js.undefined)
    @scala.inline
    def setValidations(value: Validations[V]): Self = this.set("validations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidations: Self = this.set("validations", js.undefined)
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

