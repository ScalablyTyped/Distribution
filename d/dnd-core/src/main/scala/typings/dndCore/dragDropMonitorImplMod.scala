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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragDropMonitorImplMod {
  
  @JSImport("dnd-core/dist/classes/DragDropMonitorImpl", "DragDropMonitorImpl")
  @js.native
  open class DragDropMonitorImpl protected ()
    extends StObject
       with DragDropMonitor {
    def this(store: Store[State, AnyAction], registry: HandlerRegistry) = this()
    
    def canDragSource(sourceId: String): Boolean = js.native
    
    def canDropOnTarget(targetId: String): Boolean = js.native
    
    def isDraggingSource(sourceId: String): Boolean = js.native
    
    def isOverTarget(targetId: String): Boolean = js.native
    def isOverTarget(targetId: String, options: Shallow): Boolean = js.native
    def isOverTarget(targetId: Unit, options: Shallow): Boolean = js.native
    
    val registry: HandlerRegistry = js.native
    
    /* private */ var store: Any = js.native
    
    def subscribeToStateChange(listener: Listener, options: HandlerIds): Unsubscribe = js.native
  }
}
