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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFormsyMod {
  
  @JSImport("formsy-react/dist/withFormsy", JSImport.Default)
  @js.native
  def default[T, V](WrappedComponent: ComponentType[T with PassDownProps[V]]): ComponentType[
    Omit[
      T with WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = js.native
  
  object propTypes {
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.innerRef")
    @js.native
    def innerRef: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    @scala.inline
    def innerRef_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.name")
    @js.native
    def name: Validator[String] = js.native
    @scala.inline
    def name_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.required")
    @js.native
    def required: Requireable[String | Boolean | js.Object] = js.native
    @scala.inline
    def required_=(x: Requireable[String | Boolean | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.validations")
    @js.native
    def validations: Requireable[String | js.Object] = js.native
    @scala.inline
    def validations_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validations")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react/dist/withFormsy", "propTypes.value")
    @js.native
    def value: Requireable[js.Any] = js.native
    @scala.inline
    def value_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
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
    
    var ref: js.UndefOr[Ref[_]] = js.native
    
    def resetValue(): Unit = js.native
    
    def setValidations(validations: Validations[V], required: RequiredValidation[V]): Unit = js.native
    
    def setValue(value: V): Unit = js.native
    def setValue(value: V, validate: Boolean): Unit = js.native
    
    var showError: Boolean = js.native
    
    var showRequired: Boolean = js.native
  }
  
  type PassDownProps[V] = WrapperProps[V] with InjectedProps[V]
  
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
  
  @js.native
  trait WrapperProps[V] extends StObject {
    
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
    implicit class WrapperPropsMutableBuilder[Self <: WrapperProps[_], V] (val x: Self with WrapperProps[V]) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: /* ref */ Ref[_] => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: RequiredValidation[V]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setValidationError(value: ValidationError): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
      
      @scala.inline
      def setValidationErrors(value: StringDictionary[ValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
      
      @scala.inline
      def setValidations(value: Validations[V]): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait WrapperState[V]
    extends /* key */ StringDictionary[js.Any] {
    
    var formSubmitted: Boolean = js.native
    
    var isPristine: Boolean = js.native
    
    var isRequired: Boolean = js.native
    
    var isValid: Boolean = js.native
    
    var pristineValue: V = js.native
    
    var validationError: js.Array[ValidationError] = js.native
    
    var value: V = js.native
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
      value: V
    ): WrapperState[V] = {
      val __obj = js.Dynamic.literal(formSubmitted = formSubmitted.asInstanceOf[js.Any], isPristine = isPristine.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], pristineValue = pristineValue.asInstanceOf[js.Any], validationError = validationError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperState[V]]
    }
    
    @scala.inline
    implicit class WrapperStateMutableBuilder[Self <: WrapperState[_], V] (val x: Self with WrapperState[V]) extends AnyVal {
      
      @scala.inline
      def setFormSubmitted(value: Boolean): Self = StObject.set(x, "formSubmitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPristine(value: Boolean): Self = StObject.set(x, "isPristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristineValue(value: V): Self = StObject.set(x, "pristineValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationError(value: js.Array[ValidationError]): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationErrorVarargs(value: ValidationError*): Self = StObject.set(x, "validationError", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
