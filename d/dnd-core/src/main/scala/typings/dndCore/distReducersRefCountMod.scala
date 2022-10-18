package typings.dndCore

import typings.dndCore.distInterfacesMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducersRefCountMod {
  
  @JSImport("dnd-core/dist/reducers/refCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(state: Double, action: Action[Any]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def reduce(state: Unit, action: Action[Any]): State = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type State = Double
}
