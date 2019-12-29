package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.DragDropMonitor
import typings.dndDashCore.libInterfacesMod.HandlerRegistry
import typings.dndDashCore.libInterfacesMod.Listener
import typings.dndDashCore.libInterfacesMod.Unsubscribe
import typings.dndDashCore.libReducersMod.State
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/DragDropMonitorImpl", JSImport.Namespace)
@js.native
object libDragDropMonitorImplMod extends js.Object {
  @js.native
  trait DragDropMonitorImpl extends DragDropMonitor {
    val registry: HandlerRegistry = js.native
    var store: js.Any = js.native
    def canDragSource(sourceId: String): Boolean = js.native
    def canDropOnTarget(targetId: String): Boolean = js.native
    def isDraggingSource(sourceId: String): Boolean = js.native
    def isOverTarget(targetId: js.UndefOr[scala.Nothing], options: Anon_Shallow): Boolean = js.native
    def isOverTarget(targetId: String): Boolean = js.native
    def isOverTarget(targetId: String, options: Anon_Shallow): Boolean = js.native
    def subscribeToStateChange(listener: Listener, options: Anon_HandlerIds): Unsubscribe = js.native
  }
  
  @js.native
  class default protected () extends DragDropMonitorImpl {
    def this(store: Store[State, AnyAction], registry: HandlerRegistry) = this()
  }
  
}

