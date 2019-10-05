package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.BackendFactory
import typings.dndDashCore.libInterfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core", JSImport.Namespace)
@js.native
object dndDashCoreMod extends js.Object {
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = js.native
  @js.native
  object HandlerRole extends js.Object {
    /* "SOURCE" */ val SOURCE: typings.dndDashCore.libInterfacesMod.HandlerRole.SOURCE with String = js.native
    /* "TARGET" */ val TARGET: typings.dndDashCore.libInterfacesMod.HandlerRole.TARGET with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.dndDashCore.libInterfacesMod.HandlerRole with String] = js.native
  }
  
}

