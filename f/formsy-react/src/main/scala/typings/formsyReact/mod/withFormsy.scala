package typings.formsyReact.mod

import typings.formsyReact.formsyReactStrings.errorMessage
import typings.formsyReact.formsyReactStrings.errorMessages
import typings.formsyReact.formsyReactStrings.hasValue
import typings.formsyReact.formsyReactStrings.isFormDisabled
import typings.formsyReact.formsyReactStrings.isFormSubmitted
import typings.formsyReact.formsyReactStrings.isPristine
import typings.formsyReact.formsyReactStrings.isRequired
import typings.formsyReact.formsyReactStrings.isValid
import typings.formsyReact.formsyReactStrings.isValidValue
import typings.formsyReact.formsyReactStrings.ref
import typings.formsyReact.formsyReactStrings.resetValue
import typings.formsyReact.formsyReactStrings.setValidations
import typings.formsyReact.formsyReactStrings.setValue
import typings.formsyReact.formsyReactStrings.showError
import typings.formsyReact.formsyReactStrings.showRequired
import typings.formsyReact.wrapperMod.PassDownProps
import typings.formsyReact.wrapperMod.WrapperProps
import typings.react.mod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react", "withFormsy")
@js.native
object withFormsy extends js.Object {
  def apply[T, V](WrappedComponent: ComponentType[T with PassDownProps[V]]): ComponentType[
    Omit[
      T with WrapperProps[V], 
      errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = js.native
}

