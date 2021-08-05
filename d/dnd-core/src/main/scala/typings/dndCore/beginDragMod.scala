package typings.dndCore

import typings.dndCore.interfacesMod.Action
import typings.dndCore.interfacesMod.BeginDragOptions
import typings.dndCore.interfacesMod.BeginDragPayload
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beginDragMod {
  
  @JSImport("dnd-core/lib/actions/dragDrop/beginDrag", JSImport.Namespace)
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
