package typings.dndCore.dragDropManagerImplMod

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.DragDropActions
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.HandlerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropManagerImpl extends DragDropManager {
  var backend: js.Any
  var handleRefCountChange: js.Any
  var isSetUp: js.Any
  var monitor: js.Any
  var store: js.Any
  def receiveBackend(backend: Backend): Unit
}

object DragDropManagerImpl {
  @scala.inline
  def apply(
    backend: js.Any,
    dispatch: js.Any => Unit,
    getActions: () => DragDropActions,
    getBackend: () => Backend,
    getMonitor: () => DragDropMonitor,
    getRegistry: () => HandlerRegistry,
    handleRefCountChange: js.Any,
    isSetUp: js.Any,
    monitor: js.Any,
    receiveBackend: Backend => Unit,
    store: js.Any
  ): DragDropManagerImpl = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), getActions = js.Any.fromFunction0(getActions), getBackend = js.Any.fromFunction0(getBackend), getMonitor = js.Any.fromFunction0(getMonitor), getRegistry = js.Any.fromFunction0(getRegistry), handleRefCountChange = handleRefCountChange.asInstanceOf[js.Any], isSetUp = isSetUp.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], receiveBackend = js.Any.fromFunction1(receiveBackend), store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropManagerImpl]
  }
}

