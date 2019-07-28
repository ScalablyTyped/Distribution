package typings.dndDashCore.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropManager extends js.Object {
  def dispatch(action: js.Any): Unit
  def getActions(): DragDropActions
  def getBackend(): Backend
  def getMonitor(): DragDropMonitor
  def getRegistry(): HandlerRegistry
}

object DragDropManager {
  @scala.inline
  def apply(
    dispatch: js.Any => Unit,
    getActions: () => DragDropActions,
    getBackend: () => Backend,
    getMonitor: () => DragDropMonitor,
    getRegistry: () => HandlerRegistry
  ): DragDropManager = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getActions = js.Any.fromFunction0(getActions), getBackend = js.Any.fromFunction0(getBackend), getMonitor = js.Any.fromFunction0(getMonitor), getRegistry = js.Any.fromFunction0(getRegistry))
  
    __obj.asInstanceOf[DragDropManager]
  }
}

