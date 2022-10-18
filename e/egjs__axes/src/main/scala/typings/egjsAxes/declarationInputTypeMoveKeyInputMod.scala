package typings.egjsAxes

import typings.egjsAxes.declarationInputTypeInputTypeMod.InputType
import typings.egjsAxes.declarationInputTypeInputTypeMod.InputTypeObserver
import typings.egjsAxes.declarationTypesMod.ElementType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationInputTypeMoveKeyInputMod {
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_A")
  @js.native
  val KEY_A: /* 65 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_D")
  @js.native
  val KEY_D: /* 68 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_DOWN_ARROW")
  @js.native
  val KEY_DOWN_ARROW: /* 40 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_LEFT_ARROW")
  @js.native
  val KEY_LEFT_ARROW: /* 37 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_RIGHT_ARROW")
  @js.native
  val KEY_RIGHT_ARROW: /* 39 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_S")
  @js.native
  val KEY_S: /* 83 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_UP_ARROW")
  @js.native
  val KEY_UP_ARROW: /* 38 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "KEY_W")
  @js.native
  val KEY_W: /* 87 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/MoveKeyInput", "MoveKeyInput")
  @js.native
  open class MoveKeyInput protected ()
    extends StObject
       with InputType {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: MoveKeyInputOption) = this()
    
    /* private */ var _attachEvent: Any = js.native
    
    /* private */ var _detachEvent: Any = js.native
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _holding: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _onKeydown: Any = js.native
    
    /* private */ var _onKeyup: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /* CompleteClass */
    var axes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def connect(observer: InputTypeObserver): InputType = js.native
    
    /* CompleteClass */
    override def destroy(): Any = js.native
    
    @JSName("disable")
    def disable_MMoveKeyInput(): this.type = js.native
    
    /* CompleteClass */
    override def disconnect(): Any = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    @JSName("enable")
    def enable_MMoveKeyInput(): this.type = js.native
    
    def isEnabled(): Boolean = js.native
    
    /* CompleteClass */
    override def mapAxes(axes: js.Array[String]): Any = js.native
    
    var options: MoveKeyInputOption = js.native
  }
  
  trait MoveKeyInputOption extends StObject {
    
    var scale: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object MoveKeyInputOption {
    
    inline def apply(): MoveKeyInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveKeyInputOption]
    }
    
    extension [Self <: MoveKeyInputOption](x: Self) {
      
      inline def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
    }
  }
}
