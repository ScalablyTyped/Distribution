package typings.dndCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateIdMod {
  
  @JSImport("dnd-core/lib/reducers/stateId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")().asInstanceOf[State]
  inline def reduce(state: State): State = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(state.asInstanceOf[js.Any]).asInstanceOf[State]
  
  type State = Double
}
