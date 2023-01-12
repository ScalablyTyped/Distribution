package typings.dndCore

import typings.dndCore.anon.ClientOffset
import typings.dndCore.distInterfacesMod.Action
import typings.dndCore.distInterfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducersDragOffsetMod {
  
  @JSImport("dnd-core/dist/reducers/dragOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(state: Unit, action: Action[ClientOffset]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def reduce(state: State, action: Action[ClientOffset]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  
  trait State extends StObject {
    
    var clientOffset: XYCoord | Null
    
    var initialClientOffset: XYCoord | Null
    
    var initialSourceClientOffset: XYCoord | Null
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal(clientOffset = null, initialClientOffset = null, initialSourceClientOffset = null)
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
      
      inline def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
      
      inline def setInitialClientOffset(value: XYCoord): Self = StObject.set(x, "initialClientOffset", value.asInstanceOf[js.Any])
      
      inline def setInitialClientOffsetNull: Self = StObject.set(x, "initialClientOffset", null)
      
      inline def setInitialSourceClientOffset(value: XYCoord): Self = StObject.set(x, "initialSourceClientOffset", value.asInstanceOf[js.Any])
      
      inline def setInitialSourceClientOffsetNull: Self = StObject.set(x, "initialSourceClientOffset", null)
    }
  }
}
