package typings.dndCore

import typings.dndCore.anon.ClientOffset
import typings.dndCore.interfacesMod.Action
import typings.dndCore.interfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragOffsetMod {
  
  @JSImport("dnd-core/lib/reducers/dragOffset", "reduce")
  @js.native
  def reduce(state: js.UndefOr[scala.Nothing], action: Action[ClientOffset]): State = js.native
  @JSImport("dnd-core/lib/reducers/dragOffset", "reduce")
  @js.native
  def reduce(state: State, action: Action[ClientOffset]): State = js.native
  
  @js.native
  trait State extends StObject {
    
    var clientOffset: XYCoord | Null = js.native
    
    var initialClientOffset: XYCoord | Null = js.native
    
    var initialSourceClientOffset: XYCoord | Null = js.native
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientOffsetNull: Self = StObject.set(x, "clientOffset", null)
      
      @scala.inline
      def setInitialClientOffset(value: XYCoord): Self = StObject.set(x, "initialClientOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialClientOffsetNull: Self = StObject.set(x, "initialClientOffset", null)
      
      @scala.inline
      def setInitialSourceClientOffset(value: XYCoord): Self = StObject.set(x, "initialSourceClientOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSourceClientOffsetNull: Self = StObject.set(x, "initialSourceClientOffset", null)
    }
  }
}
