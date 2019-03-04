package typings
package dndDashCoreLib.libInterfacesMod

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
    dispatch: js.Function1[js.Any, scala.Unit],
    getActions: js.Function0[DragDropActions],
    getBackend: js.Function0[Backend],
    getContext: js.Function0[Context],
    getMonitor: js.Function0[DragDropMonitor],
    getRegistry: js.Function0[HandlerRegistry]
  ): DragDropManager[Context] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch, getActions = getActions, getBackend = getBackend, getContext = getContext, getMonitor = getMonitor, getRegistry = getRegistry)
  
    __obj.asInstanceOf[DragDropManager[Context]]
  }
}

