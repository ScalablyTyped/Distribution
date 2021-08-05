package typings.dndCore

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropActions
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.HandlerRegistry
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragDropManagerImplMod {
  
  @JSImport("dnd-core/lib/DragDropManagerImpl", "DragDropManagerImpl")
  @js.native
  class DragDropManagerImpl ()
    extends StObject
       with DragDropManager {
    def this(debugMode: Boolean) = this()
    
    /* private */ var backend: js.Any = js.native
    
    /* CompleteClass */
    override def dispatch(action: js.Any): Unit = js.native
    def dispatch(action: Action[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def getActions(): DragDropActions = js.native
    
    /* CompleteClass */
    override def getBackend(): Backend = js.native
    
    /* CompleteClass */
    override def getMonitor(): DragDropMonitor = js.native
    
    /* CompleteClass */
    override def getRegistry(): HandlerRegistry = js.native
    
    /* private */ var handleRefCountChange: js.Any = js.native
    
    /* private */ var isSetUp: js.Any = js.native
    
    /* private */ var monitor: js.Any = js.native
    
    def receiveBackend(backend: Backend): Unit = js.native
    
    /* private */ var store: js.Any = js.native
  }
}
