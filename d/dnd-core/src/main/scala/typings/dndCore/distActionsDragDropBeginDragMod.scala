package typings.dndCore

import typings.dndCore.distInterfacesMod.Action
import typings.dndCore.distInterfacesMod.BeginDragOptions
import typings.dndCore.distInterfacesMod.BeginDragPayload
import typings.dndCore.distInterfacesMod.DragDropManager
import typings.dndCore.distInterfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distActionsDragDropBeginDragMod {
  
  @JSImport("dnd-core/dist/actions/dragDrop/beginDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBeginDrag(manager: DragDropManager): js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[Identifier]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBeginDrag")(manager.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[Identifier]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ]]
}
