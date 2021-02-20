package typings.finalFormFocus

import typings.finalForm.mod.Decorator
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("final-form-focus", JSImport.Default)
  @js.native
  def default[FormValues](): Decorator[FormValues, Partial[FormValues]] = js.native
  @JSImport("final-form-focus", JSImport.Default)
  @js.native
  def default[FormValues](getInputs: js.UndefOr[scala.Nothing], findInput: FindInput): Decorator[FormValues, Partial[FormValues]] = js.native
  @JSImport("final-form-focus", JSImport.Default)
  @js.native
  def default[FormValues](getInputs: GetInputs): Decorator[FormValues, Partial[FormValues]] = js.native
  @JSImport("final-form-focus", JSImport.Default)
  @js.native
  def default[FormValues](getInputs: GetInputs, findInput: FindInput): Decorator[FormValues, Partial[FormValues]] = js.native
  
  @JSImport("final-form-focus", "getFormInputs")
  @js.native
  def getFormInputs(formName: String): GetInputs = js.native
  
  type FindInput = js.Function2[
    /* inputs */ js.Array[FocusableInput], 
    /* errors */ js.Object, 
    js.UndefOr[FocusableInput]
  ]
  
  @js.native
  trait FocusableInput extends StObject {
    
    def focus(): Unit = js.native
    
    var name: String = js.native
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
