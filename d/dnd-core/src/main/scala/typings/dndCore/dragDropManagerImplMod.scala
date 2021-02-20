package typings.dndCore

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropManager
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragDropManagerImplMod {
  
  @JSImport("dnd-core/lib/DragDropManagerImpl", "DragDropManagerImpl")
  @js.native
  class DragDropManagerImpl () extends DragDropManager {
    def this(debugMode: Boolean) = this()
    
    var backend: js.Any = js.native
    
    def dispatch(action: Action[_]): Unit = js.native
    
    var handleRefCountChange: js.Any = js.native
    
    var isSetUp: js.Any = js.native
    
    var monitor: js.Any = js.native
    
    def receiveBackend(backend: Backend): Unit = js.native
    
    var store: js.Any = js.native
  }
}
