package typings.dndMultiBackend

import typings.dndCore.distInterfacesMod.BackendFactory
import typings.dndMultiBackend.distTypesMod.Transition
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dnd-multi-backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dnd-multi-backend", "HTML5DragTransition")
  @js.native
  val HTML5DragTransition: Transition = js.native
  
  @JSImport("dnd-multi-backend", "MouseTransition")
  @js.native
  val MouseTransition: Transition = js.native
  
  @JSImport("dnd-multi-backend", "MultiBackend")
  @js.native
  val MultiBackend: BackendFactory = js.native
  
  @JSImport("dnd-multi-backend", "PointerTransition")
  @js.native
  val PointerTransition: Transition = js.native
  
  @JSImport("dnd-multi-backend", "TouchTransition")
  @js.native
  val TouchTransition: Transition = js.native
  
  inline def createTransition(event: String, check: js.Function1[/* e */ Event, Boolean]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransition")(event.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Transition]
}
