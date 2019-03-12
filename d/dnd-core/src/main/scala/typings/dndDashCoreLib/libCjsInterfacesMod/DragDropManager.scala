package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropManager[Context] extends js.Object {
  def dispatch(action: js.Any): scala.Unit
  def getActions(): DragDropActions
  def getBackend(): Backend
  def getContext(): Context
  def getMonitor(): DragDropMonitor
  def getRegistry(): HandlerRegistry
}

object DragDropManager {
  @scala.inline
  def apply[Context](
    dispatch: js.Any => scala.Unit,
    getActions: () => DragDropActions,
    getBackend: () => Backend,
    getContext: () => Context,
    getMonitor: () => DragDropMonitor,
    getRegistry: () => HandlerRegistry
  ): DragDropManager[Context] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getActions = js.Any.fromFunction0(getActions), getBackend = js.Any.fromFunction0(getBackend), getContext = js.Any.fromFunction0(getContext), getMonitor = js.Any.fromFunction0(getMonitor), getRegistry = js.Any.fromFunction0(getRegistry))
  
    __obj.asInstanceOf[DragDropManager[Context]]
  }
}

