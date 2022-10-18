package typings.egjsAxes

import typings.egjsAxes.declarationInputTypePanInputMod.PanInput
import typings.egjsAxes.declarationInputTypePanInputMod.PanInputOption
import typings.egjsAxes.declarationTypesMod.ElementType
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationInputTypeRotatePanInputMod {
  
  @JSImport("@egjs/axes/declaration/inputType/RotatePanInput", "RotatePanInput")
  @js.native
  open class RotatePanInput protected () extends PanInput {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: PanInputOption) = this()
    
    /* private */ var _coefficientForDistanceToAngle: Any = js.native
    
    /* private */ var _getDifference: Any = js.native
    
    /* private */ var _getPosFromOrigin: Any = js.native
    
    /* private */ var _getQuadrant: Any = js.native
    
    /* private */ var _lastDiff: Any = js.native
    
    /* protected */ def _onPanend(event: MouseEvent): Unit = js.native
    
    /* protected */ def _onPanmove(event: MouseEvent): Unit = js.native
    
    /* protected */ def _onPanstart(event: MouseEvent): Unit = js.native
    
    /* private */ var _prevAngle: Any = js.native
    
    /* private */ var _prevQuadrant: Any = js.native
    
    /* private */ var _rotateOrigin: Any = js.native
    
    /* private */ var _triggerChange: Any = js.native
  }
}
