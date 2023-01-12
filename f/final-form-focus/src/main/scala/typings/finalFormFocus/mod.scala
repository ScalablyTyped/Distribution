package typings.finalFormFocus

import typings.finalForm.mod.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("final-form-focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FormValues, InitialFormValues](): Decorator[FormValues, InitialFormValues] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Decorator[FormValues, InitialFormValues]]
  inline def default[FormValues, InitialFormValues](getInputs: Unit, findInput: FindInput): Decorator[FormValues, InitialFormValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any], findInput.asInstanceOf[js.Any])).asInstanceOf[Decorator[FormValues, InitialFormValues]]
  inline def default[FormValues, InitialFormValues](getInputs: GetInputs): Decorator[FormValues, InitialFormValues] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any]).asInstanceOf[Decorator[FormValues, InitialFormValues]]
  inline def default[FormValues, InitialFormValues](getInputs: GetInputs, findInput: FindInput): Decorator[FormValues, InitialFormValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any], findInput.asInstanceOf[js.Any])).asInstanceOf[Decorator[FormValues, InitialFormValues]]
  
  inline def getFormInputs(formName: String): GetInputs = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormInputs")(formName.asInstanceOf[js.Any]).asInstanceOf[GetInputs]
  
  type FindInput = js.Function2[
    /* inputs */ js.Array[FocusableInput], 
    /* errors */ js.Object, 
    js.UndefOr[FocusableInput]
  ]
  
  trait FocusableInput extends StObject {
    
    def focus(): Unit
    
    var name: String
  }
  object FocusableInput {
    
    inline def apply(focus: () => Unit, name: String): FocusableInput = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusableInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusableInput] (val x: Self) extends AnyVal {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type GetInputs = js.Function0[js.Array[FocusableInput]]
}
