package typings.dndCore

import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.SentinelAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endDragMod {
  
  @JSImport("dnd-core/dist/actions/dragDrop/endDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEndDrag(manager: DragDropManager): js.Function0[SentinelAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEndDrag")(manager.asInstanceOf[js.Any]).asInstanceOf[js.Function0[SentinelAction]]
}
