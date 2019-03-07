package typings
package dndDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/cjs/factories", JSImport.Namespace)
@js.native
object libCjsFactoriesMod extends js.Object {
  def createDragDropManager[C](backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory, context: C): dndDashCoreLib.libCjsInterfacesMod.DragDropManager[C] = js.native
  def createDragDropManager[C](backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory, context: C, debugMode: scala.Boolean): dndDashCoreLib.libCjsInterfacesMod.DragDropManager[C] = js.native
}

