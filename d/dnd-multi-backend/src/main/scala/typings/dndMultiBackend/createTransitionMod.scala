package typings.dndMultiBackend

import typings.dndMultiBackend.typesMod.Transition
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTransitionMod {
  
  @JSImport("dnd-multi-backend/dist/cjs/createTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTransition(event: String, check: js.Function1[/* e */ Event, Boolean]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransition")(event.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Transition]
}
