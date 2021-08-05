package typings.formsyReact

import org.scalablytyped.runtime.StringDictionary
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
import typings.formsyReact.interfacesMod.RequiredValidation
import typings.formsyReact.interfacesMod.ValidationError
import typings.formsyReact.interfacesMod.Validations
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFormsyMod {
  
  @JSImport("formsy-react/dist/withFormsy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, V](WrappedComponent: ComponentType[T & PassDownProps[V]]): ComponentType[
    Omit[
      T & WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    Omit[
      T & WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ]]
  
  object propTypes {
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.innerRef")
    @js.native
    def innerRef: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    inline def innerRef_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.name")
    @js.native
    def name: Validator[String] = js.native
    inline def name_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.required")
    @js.native
    def required: Requireable[String | Boolean | js.Object] = js.native
    inline def required_=(x: Requireable[String | Boolean | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.validations")
    @js.native
    def validations: Requireable[String | js.Object] = js.native
    inline def validations_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validations")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.value")
    @js.native
    def value: Requireable[js.Any] = js.native
    inline def value_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InjectedProps[V] extends StObject {
    
    var errorMessage: ValidationError = js.native
    
    var errorMessages: js.Array[ValidationError] = js.native
    
    var hasValue: Boolean = js.native
    
    var isFormDisabled: Boolean = js.native
    
    var isFormSubmitted: Boolean = js.native
    
    var isPristine: Boolean = js.native
    
    var isRequired: Boolean = js.native
    
    var isValid: Boolean = js.native
    
    def isValidValue(value: V): Boolean = js.native
    
    var ref: js.UndefOr[Ref[js.Any]] = js.native
    
    def resetValue(): Unit = js.native
    
    def setValidations(validations: Validations[V], required: RequiredValidation[V]): Unit = js.native
    
    def setValue(value: V): Unit = js.native
    def setValue(value: V, validate: Boolean): Unit = js.native
    
    var showError: Boolean = js.native
    
    var showRequired: Boolean = js.native
  }
  
  @js.native
  trait PassDownProps[V]
    extends StObject
       with WrapperProps[V]
       with InjectedProps[V]
  
  @js.native
  trait WrapperInstanceMethods[V] extends StObject {
    
    def getErrorMessage(): Null | ValidationError = js.native
    
    def getErrorMessages(): js.Array[ValidationError] = js.native
    
    def getValue(): V = js.native
    
    def isFormDisabled(): Boolean = js.native
    
    def isFormSubmitted(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def isValidValue(value: V): Boolean = js.native
    
    def setValue(value: V): Unit = js.native
    def setValue(value: V, validate: Boolean): Unit = js.native
  }
  
  trait WrapperProps[V] extends StObject {
    
    var innerRef: js.UndefOr[js.Function1[/* ref */ Ref[js.Any], Unit]] = js.undefined
    
    var name: String
    
    var required: js.UndefOr[RequiredValidation[V]] = js.undefined
    
    var validationError: js.UndefOr[ValidationError] = js.undefined
    
    var validationErrors: js.UndefOr[StringDictionary[ValidationError]] = js.undefined
    
    var validations: js.UndefOr[Validations[V]] = js.undefined
    
    var value: js.UndefOr[V] = js.undefined
  }
  object WrapperProps {
    
    inline def apply[V](name: String): WrapperProps[V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperProps[V]]
    }
    
    extension [Self <: WrapperProps[?], V](x: Self & WrapperProps[V]) {
      
      inline def setInnerRef(value: /* ref */ Ref[js.Any] => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: RequiredValidation[V]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidationError(value: ValidationError): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
      
      inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
      
      inline def setValidationErrors(value: StringDictionary[ValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
      
      inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
      
      inline def setValidations(value: Validations[V]): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
      
      inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait WrapperState[V]
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var formSubmitted: Boolean
    
    var isPristine: Boolean
    
    var isRequired: Boolean
    
    var isValid: Boolean
    
    var pristineValue: V
    
    var validationError: js.Array[ValidationError]
    
    var value: V
  }
  object WrapperState {
    
    inline def apply[V](
      formSubmitted: Boolean,
      isPristine: Boolean,
      isRequired: Boolean,
      isValid: Boolean,
      pristineValue: V,
      validationError: js.Array[ValidationError],
      value: V
    ): WrapperState[V] = {
      val __obj = js.Dynamic.literal(formSubmitted = formSubmitted.asInstanceOf[js.Any], isPristine = isPristine.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], pristineValue = pristineValue.asInstanceOf[js.Any], validationError = validationError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperState[V]]
    }
    
    extension [Self <: WrapperState[?], V](x: Self & WrapperState[V]) {
      
      inline def setFormSubmitted(value: Boolean): Self = StObject.set(x, "formSubmitted", value.asInstanceOf[js.Any])
      
      inline def setIsPristine(value: Boolean): Self = StObject.set(x, "isPristine", value.asInstanceOf[js.Any])
      
      inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setPristineValue(value: V): Self = StObject.set(x, "pristineValue", value.asInstanceOf[js.Any])
      
      inline def setValidationError(value: js.Array[ValidationError]): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
      
      inline def setValidationErrorVarargs(value: ValidationError*): Self = StObject.set(x, "validationError", js.Array(value :_*))
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
