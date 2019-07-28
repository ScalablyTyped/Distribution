package typings.dndDashCore

import typings.dndDashCore.libInterfacesMod.BackendFactory
import typings.dndDashCore.libInterfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/factories", JSImport.Namespace)
@js.native
object libFactoriesMod extends js.Object {
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = js.native
}

