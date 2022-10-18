package typings.dndCore

import typings.dndCore.distInterfacesMod.DragDropManager
import typings.dndCore.distInterfacesMod.SentinelAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distActionsDragDropPublishDragSourceMod {
  
  @JSImport("dnd-core/dist/actions/dragDrop/publishDragSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPublishDragSource(manager: DragDropManager): js.Function0[js.UndefOr[SentinelAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublishDragSource")(manager.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.UndefOr[SentinelAction]]]
}
