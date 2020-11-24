package typings.formsyReact

import typings.formsyReact.anon.Disabled
import typings.formsyReact.anon.PartialFormsyProps
import typings.formsyReact.formsyMod.Formsy
import typings.formsyReact.formsyMod.FormsyProps
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
import typings.formsyReact.interfacesMod.ValidationFunction
import typings.formsyReact.validationRulesMod.Validations
import typings.formsyReact.withFormsyMod.PassDownProps
import typings.formsyReact.withFormsyMod.WrapperProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formsy-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = js.native
  
  val validationRules: Validations[js.Any] = js.native
  
  def withFormsy[T, V](WrappedComponent: ComponentType[T with PassDownProps[V]]): ComponentType[
    Omit[
      T with WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = js.native
  
  @js.native
  class default protected () extends Formsy {
    def this(props: FormsyProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: PartialFormsyProps = js.native
    
    var displayName: String = js.native
    
    var propTypes: Disabled = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    
    var innerRef: Requireable[js.Function1[/* repeated */ _, _]] = js.native
    
    var name: Validator[String] = js.native
    
    var required: Requireable[String | Boolean | js.Object] = js.native
    
    var validations: Requireable[String | js.Object] = js.native
    
    var value: Requireable[_] = js.native
  }
}
