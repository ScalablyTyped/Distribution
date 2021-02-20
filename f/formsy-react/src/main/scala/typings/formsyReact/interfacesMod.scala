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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait ComponentWithStaticAttributes
    extends ComponentClass[js.Object, ComponentState] {
    
    var defaultValue: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  trait FormsyContextInterface extends StObject {
    
    def attachToForm(component: InputComponent[_]): Unit = js.native
    
    def detachFromForm(component: InputComponent[_]): Unit = js.native
    
    var isFormDisabled: Boolean = js.native
    
    def isValidValue(component: InputComponent[_], value: js.Any): Boolean = js.native
    
    def runValidation(component: InputComponent[_]): IsRequired = js.native
    
    def validate(component: InputComponent[_]): Unit = js.native
  }
  object FormsyContextInterface {
    
    @scala.inline
    def apply(
      attachToForm: InputComponent[_] => Unit,
      detachFromForm: InputComponent[_] => Unit,
      isFormDisabled: Boolean,
      isValidValue: (InputComponent[_], js.Any) => Boolean,
      runValidation: InputComponent[_] => IsRequired,
      validate: InputComponent[_] => Unit
    ): FormsyContextInterface = {
      val __obj = js.Dynamic.literal(attachToForm = js.Any.fromFunction1(attachToForm), detachFromForm = js.Any.fromFunction1(detachFromForm), isFormDisabled = isFormDisabled.asInstanceOf[js.Any], isValidValue = js.Any.fromFunction2(isValidValue), runValidation = js.Any.fromFunction1(runValidation), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[FormsyContextInterface]
    }
    
    @scala.inline
    implicit class FormsyContextInterfaceMutableBuilder[Self <: FormsyContextInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachToForm(value: InputComponent[_] => Unit): Self = StObject.set(x, "attachToForm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetachFromForm(value: InputComponent[_] => Unit): Self = StObject.set(x, "detachFromForm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFormDisabled(value: Boolean): Self = StObject.set(x, "isFormDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValidValue(value: (InputComponent[_], js.Any) => Boolean): Self = StObject.set(x, "isValidValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRunValidation(value: InputComponent[_] => IsRequired): Self = StObject.set(x, "runValidation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: InputComponent[_] => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
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
