package typings.dndDashCore.libDragDropManagerImplMod

import typings.dndDashCore.libInterfacesMod.Backend
import typings.dndDashCore.libInterfacesMod.DragDropActions
import typings.dndDashCore.libInterfacesMod.DragDropMonitor
import typings.dndDashCore.libInterfacesMod.HandlerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/DragDropManagerImpl", JSImport.Default)
@js.native
class default () extends DragDropManagerImpl {
  def this(debugMode: Boolean) = this()
  /* CompleteClass */
  override var backend: js.Any = js.native
  /* CompleteClass */
  override var handleRefCountChange: js.Any = js.native
  /* CompleteClass */
  override var isSetUp: js.Any = js.native
  /* CompleteClass */
  override var monitor: js.Any = js.native
  /* CompleteClass */
  override var store: js.Any = js.native
  /* CompleteClass */
  override def dispatch(action: js.Any): Unit = js.native
  /* CompleteClass */
  override def getActions(): DragDropActions = js.native
  /* CompleteClass */
  override def getBackend(): Backend = js.native
  /* CompleteClass */
  override def getMonitor(): DragDropMonitor = js.native
  /* CompleteClass */
  override def getRegistry(): HandlerRegistry = js.native
  /* CompleteClass */
  override def receiveBackend(backend: Backend): Unit = js.native
}

