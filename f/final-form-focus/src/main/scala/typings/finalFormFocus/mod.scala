package typings.finalFormFocus

import typings.finalForm.mod.Decorator
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("final-form-focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[FormValues](): Decorator[FormValues, Partial[FormValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Decorator[FormValues, Partial[FormValues]]]
  @scala.inline
  def default[FormValues](getInputs: Unit, findInput: FindInput): Decorator[FormValues, Partial[FormValues]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any], findInput.asInstanceOf[js.Any])).asInstanceOf[Decorator[FormValues, Partial[FormValues]]]
  @scala.inline
  def default[FormValues](getInputs: GetInputs): Decorator[FormValues, Partial[FormValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any]).asInstanceOf[Decorator[FormValues, Partial[FormValues]]]
  @scala.inline
  def default[FormValues](getInputs: GetInputs, findInput: FindInput): Decorator[FormValues, Partial[FormValues]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any], findInput.asInstanceOf[js.Any])).asInstanceOf[Decorator[FormValues, Partial[FormValues]]]
  
  @scala.inline
  def getFormInputs(formName: String): GetInputs = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormInputs")(formName.asInstanceOf[js.Any]).asInstanceOf[GetInputs]
  
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
    
    @scala.inline
    def apply(focus: () => Unit, name: String): FocusableInput = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusableInput]
    }
    
    @scala.inline
    implicit class FocusableInputMutableBuilder[Self <: FocusableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type GetInputs = js.Function0[js.Array[FocusableInput]]
}
