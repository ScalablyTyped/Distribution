package typings.dndCore

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dnd-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dnd-core", "HandlerRole")
  @js.native
  object HandlerRole extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.dndCore.interfacesMod.HandlerRole & String] = js.native
    
    /* "SOURCE" */ val SOURCE: typings.dndCore.interfacesMod.HandlerRole.SOURCE & String = js.native
    
    /* "TARGET" */ val TARGET: typings.dndCore.interfacesMod.HandlerRole.TARGET & String = js.native
  }
  
  @scala.inline
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  @scala.inline
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
}
