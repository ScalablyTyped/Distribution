package typings.formsyReact

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.anon.IsRequired
import typings.formsyReact.withFormsyMod.WrapperProps
import typings.formsyReact.withFormsyMod.WrapperState
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait ComponentWithStaticAttributes
    extends StObject
       with ComponentClass[js.Object, ComponentState] {
    
    var defaultValue: js.UndefOr[js.Any] = js.native
  }
  
  trait FormsyContextInterface extends StObject {
    
    def attachToForm(component: InputComponent[js.Any]): Unit
    
    def detachFromForm(component: InputComponent[js.Any]): Unit
    
    var isFormDisabled: Boolean
    
    def isValidValue(component: InputComponent[js.Any], value: js.Any): Boolean
    
    def runValidation(component: InputComponent[js.Any]): IsRequired
    
    def validate(component: InputComponent[js.Any]): Unit
  }
  object FormsyContextInterface {
    
    @scala.inline
    def apply(
      attachToForm: InputComponent[js.Any] => Unit,
      detachFromForm: InputComponent[js.Any] => Unit,
      isFormDisabled: Boolean,
      isValidValue: (InputComponent[js.Any], js.Any) => Boolean,
      runValidation: InputComponent[js.Any] => IsRequired,
      validate: InputComponent[js.Any] => Unit
    ): FormsyContextInterface = {
      val __obj = js.Dynamic.literal(attachToForm = js.Any.fromFunction1(attachToForm), detachFromForm = js.Any.fromFunction1(detachFromForm), isFormDisabled = isFormDisabled.asInstanceOf[js.Any], isValidValue = js.Any.fromFunction2(isValidValue), runValidation = js.Any.fromFunction1(runValidation), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[FormsyContextInterface]
    }
    
    @scala.inline
    implicit class FormsyContextInterfaceMutableBuilder[Self <: FormsyContextInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachToForm(value: InputComponent[js.Any] => Unit): Self = StObject.set(x, "attachToForm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetachFromForm(value: InputComponent[js.Any] => Unit): Self = StObject.set(x, "detachFromForm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFormDisabled(value: Boolean): Self = StObject.set(x, "isFormDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValidValue(value: (InputComponent[js.Any], js.Any) => Boolean): Self = StObject.set(x, "isValidValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRunValidation(value: InputComponent[js.Any] => IsRequired): Self = StObject.set(x, "runValidation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: InputComponent[js.Any] => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type IModel = js.Any
  
  type IResetModel = js.Function1[/* model */ js.UndefOr[IModel], Unit]
  
  type IUpdateInputsWithError = js.Function2[
    /* errors */ StringDictionary[ValidationError], 
    /* invalidate */ js.UndefOr[Boolean], 
    Unit
  ]
  
  type IUpdateInputsWithValue[V] = js.Function2[/* values */ StringDictionary[V], /* validate */ js.UndefOr[Boolean], Unit]
  
  @js.native
  trait InputComponent[V]
    extends Component[WrapperProps[V], WrapperState[V], js.Any] {
    
    var requiredValidations: js.UndefOr[Validations[V]] = js.native
    
    var validations: js.UndefOr[Validations[V]] = js.native
  }
  
  type RequiredValidation[V] = Boolean | Validations[V]
  
  type Validation[V] = String | Boolean | ValidationFunction[V]
  
  type ValidationError = String | ReactNode
  
  type ValidationFunction[V] = js.Function3[
    /* values */ Values, 
    /* value */ V, 
    /* extra */ js.UndefOr[js.Any], 
    Boolean | ValidationError
  ]
  
  type Validations[V] = ValidationsStructure[V] | String | js.Object
  
  type ValidationsStructure[V] = StringDictionary[Validation[V]]
  
  type Values = StringDictionary[js.Any]
  
  type WrappedComponentClass = FC[js.Object] | ComponentWithStaticAttributes
}
