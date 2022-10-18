package typings.formsyReact

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.anon.IsRequired
import typings.formsyReact.distWithFormsyMod.WrapperProps
import typings.formsyReact.distWithFormsyMod.WrapperState
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesMod {
  
  @js.native
  trait ComponentWithStaticAttributes
    extends StObject
       with ComponentClass[js.Object, ComponentState] {
    
    var defaultValue: js.UndefOr[Any] = js.native
  }
  
  trait FormsyContextInterface extends StObject {
    
    def attachToForm(component: InputComponent[Any]): Unit
    
    def detachFromForm(component: InputComponent[Any]): Unit
    
    var isFormDisabled: Boolean
    
    def isValidValue(component: InputComponent[Any], value: Any): Boolean
    
    def runValidation(component: InputComponent[Any]): IsRequired
    
    def validate(component: InputComponent[Any]): Unit
  }
  object FormsyContextInterface {
    
    inline def apply(
      attachToForm: InputComponent[Any] => Unit,
      detachFromForm: InputComponent[Any] => Unit,
      isFormDisabled: Boolean,
      isValidValue: (InputComponent[Any], Any) => Boolean,
      runValidation: InputComponent[Any] => IsRequired,
      validate: InputComponent[Any] => Unit
    ): FormsyContextInterface = {
      val __obj = js.Dynamic.literal(attachToForm = js.Any.fromFunction1(attachToForm), detachFromForm = js.Any.fromFunction1(detachFromForm), isFormDisabled = isFormDisabled.asInstanceOf[js.Any], isValidValue = js.Any.fromFunction2(isValidValue), runValidation = js.Any.fromFunction1(runValidation), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[FormsyContextInterface]
    }
    
    extension [Self <: FormsyContextInterface](x: Self) {
      
      inline def setAttachToForm(value: InputComponent[Any] => Unit): Self = StObject.set(x, "attachToForm", js.Any.fromFunction1(value))
      
      inline def setDetachFromForm(value: InputComponent[Any] => Unit): Self = StObject.set(x, "detachFromForm", js.Any.fromFunction1(value))
      
      inline def setIsFormDisabled(value: Boolean): Self = StObject.set(x, "isFormDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsValidValue(value: (InputComponent[Any], Any) => Boolean): Self = StObject.set(x, "isValidValue", js.Any.fromFunction2(value))
      
      inline def setRunValidation(value: InputComponent[Any] => IsRequired): Self = StObject.set(x, "runValidation", js.Any.fromFunction1(value))
      
      inline def setValidate(value: InputComponent[Any] => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type IModel = Any
  
  type IResetModel = js.Function1[/* model */ js.UndefOr[IModel], Unit]
  
  type IUpdateInputsWithError = js.Function2[
    /* errors */ StringDictionary[ValidationError], 
    /* invalidate */ js.UndefOr[Boolean], 
    Unit
  ]
  
  type IUpdateInputsWithValue[V] = js.Function2[/* values */ StringDictionary[V], /* validate */ js.UndefOr[Boolean], Unit]
  
  @js.native
  trait InputComponent[V] extends Component[WrapperProps[V], WrapperState[V], Any] {
    
    var requiredValidations: js.UndefOr[Validations[V]] = js.native
    
    var validations: js.UndefOr[Validations[V]] = js.native
  }
  
  type RequiredValidation[V] = Boolean | Validations[V]
  
  type Validation[V] = String | Boolean | ValidationFunction[V]
  
  type ValidationError = String | ReactNode
  
  type ValidationFunction[V] = js.Function3[
    /* values */ Values, 
    /* value */ V, 
    /* extra */ js.UndefOr[Any], 
    Boolean | ValidationError
  ]
  
  type Validations[V] = ValidationsStructure[V] | String | js.Object
  
  type ValidationsStructure[V] = StringDictionary[Validation[V]]
  
  type Values = StringDictionary[Any]
  
  type WrappedComponentClass = FC[js.Object] | ComponentWithStaticAttributes
}
