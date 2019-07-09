package typings
package dndDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/factories", JSImport.Namespace)
@js.native
object libFactoriesMod extends js.Object {
  def createDragDropManager(
    backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory,
    globalContext: js.Any,
    backendOptions: js.Any
  ): dndDashCoreLib.libInterfacesMod.DragDropManager = js.native
  def createDragDropManager(
    backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory,
    globalContext: js.Any,
    backendOptions: js.Any,
    debugMode: scala.Boolean
  ): dndDashCoreLib.libInterfacesMod.DragDropManager = js.native
}

