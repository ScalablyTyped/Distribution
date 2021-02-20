package typings.dndCore

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dnd-core", "HandlerRole")
  @js.native
  object HandlerRole extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.dndCore.interfacesMod.HandlerRole with String] = js.native
    
    /* "SOURCE" */ val SOURCE: typings.dndCore.interfacesMod.HandlerRole.SOURCE with String = js.native
    
    /* "TARGET" */ val TARGET: typings.dndCore.interfacesMod.HandlerRole.TARGET with String = js.native
  }
  
  @JSImport("dnd-core", "createDragDropManager")
  @js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = js.native
  @JSImport("dnd-core", "createDragDropManager")
  @js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = js.native
}
