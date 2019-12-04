package typings.dndDashCore

import typings.dndDashCore.libHandlerRegistryImplMod.HandlerRegistryImpl
import typings.dndDashCore.libInterfacesMod.DragSource
import typings.dndDashCore.libInterfacesMod.DropTarget
import typings.dndDashCore.libInterfacesMod.HandlerRegistry
import typings.dndDashCore.libInterfacesMod.Identifier
import typings.dndDashCore.libReducersMod.State
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/HandlerRegistryImpl", JSImport.Namespace)
@js.native
object libHandlerRegistryImplMod extends js.Object {
  @js.native
  trait HandlerRegistryImpl extends HandlerRegistry {
    var addHandler: js.Any = js.native
    var dragSources: js.Any = js.native
    var dropTargets: js.Any = js.native
    var pinnedSource: js.Any = js.native
    var pinnedSourceId: js.Any = js.native
    var store: js.Any = js.native
    var types: js.Any = js.native
    def getSource(sourceId: String): DragSource = js.native
    def getSource(sourceId: String, includePinned: Boolean): DragSource = js.native
    def getSourceType(sourceId: String): Identifier = js.native
    def getTarget(targetId: String): DropTarget = js.native
    def getTargetType(targetId: String): Identifier | js.Array[Identifier] = js.native
    def isSourceId(handlerId: String): Boolean = js.native
    def isTargetId(handlerId: String): Boolean = js.native
    def pinSource(sourceId: String): Unit = js.native
    def removeSource(sourceId: String): Unit = js.native
    def removeTarget(targetId: String): Unit = js.native
  }
  
  @js.native
  class default protected () extends HandlerRegistryImpl {
    def this(store: Store[State, AnyAction]) = this()
  }
  
}

