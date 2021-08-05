package typings.dndCore

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoriesMod {
  
  @JSImport("dnd-core/lib/factories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
}
