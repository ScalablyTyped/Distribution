package typings.dndCore

import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.HandlerRegistry
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.reducersMod.State
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerRegistryImplMod {
  
  @JSImport("dnd-core/lib/HandlerRegistryImpl", "HandlerRegistryImpl")
  @js.native
  class HandlerRegistryImpl protected ()
    extends StObject
       with HandlerRegistry {
    def this(store: Store[State, AnyAction]) = this()
    
    var addHandler: js.Any = js.native
    
    var dragSources: js.Any = js.native
    
    var dropTargets: js.Any = js.native
    
    def getSource(sourceId: String): DragSource = js.native
    def getSource(sourceId: String, includePinned: Boolean): DragSource = js.native
    
    def getSourceType(sourceId: String): Identifier = js.native
    
    def getTarget(targetId: String): DropTarget = js.native
    
    def getTargetType(targetId: String): Identifier | js.Array[Identifier] = js.native
    
    def isSourceId(handlerId: String): Boolean = js.native
    
    def isTargetId(handlerId: String): Boolean = js.native
    
    def pinSource(sourceId: String): Unit = js.native
    
    var pinnedSource: js.Any = js.native
    
    var pinnedSourceId: js.Any = js.native
    
    def removeSource(sourceId: String): Unit = js.native
    
    def removeTarget(targetId: String): Unit = js.native
    
    var store: js.Any = js.native
    
    var types: js.Any = js.native
  }
}
