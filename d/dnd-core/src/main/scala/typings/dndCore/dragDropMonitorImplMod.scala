package typings.dndCore

import typings.dndCore.anon.HandlerIds
import typings.dndCore.anon.Shallow
import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.HandlerRegistry
import typings.dndCore.interfacesMod.Listener
import typings.dndCore.interfacesMod.Unsubscribe
import typings.dndCore.reducersMod.State
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/DragDropMonitorImpl", JSImport.Namespace)
@js.native
object dragDropMonitorImplMod extends js.Object {
  
  @js.native
  class DragDropMonitorImpl protected () extends DragDropMonitor {
    def this(store: Store[State, AnyAction], registry: HandlerRegistry) = this()
    
    def canDragSource(sourceId: String): Boolean = js.native
    
    def canDropOnTarget(targetId: String): Boolean = js.native
    
    def isDraggingSource(sourceId: String): Boolean = js.native
    
    def isOverTarget(targetId: js.UndefOr[scala.Nothing], options: Shallow): Boolean = js.native
    def isOverTarget(targetId: String): Boolean = js.native
    def isOverTarget(targetId: String, options: Shallow): Boolean = js.native
    
    val registry: HandlerRegistry = js.native
    
    var store: js.Any = js.native
    
    def subscribeToStateChange(listener: Listener, options: HandlerIds): Unsubscribe = js.native
  }
}
