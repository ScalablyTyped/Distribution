package typings.dndCore

import typings.dndCore.distInterfacesMod.BackendFactory
import typings.dndCore.distInterfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateDragDropManagerMod {
  
  @JSImport("dnd-core/dist/createDragDropManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDragDropManager(backendFactory: BackendFactory): DragDropManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any]).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any, backendOptions: Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any, backendOptions: Any, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any, backendOptions: Unit, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Unit, backendOptions: Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Unit, backendOptions: Any, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Unit, backendOptions: Unit, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
}
