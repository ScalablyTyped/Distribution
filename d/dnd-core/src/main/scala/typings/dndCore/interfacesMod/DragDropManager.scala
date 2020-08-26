package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropManager extends js.Object {
  def dispatch(action: js.Any): Unit = js.native
  def getActions(): DragDropActions = js.native
  def getBackend(): Backend = js.native
  def getMonitor(): DragDropMonitor = js.native
  def getRegistry(): HandlerRegistry = js.native
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
  @scala.inline
  implicit class DragDropManagerOps[Self <: DragDropManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispatch(value: js.Any => Unit): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActions(value: () => DragDropActions): Self = this.set("getActions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBackend(value: () => Backend): Self = this.set("getBackend", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMonitor(value: () => DragDropMonitor): Self = this.set("getMonitor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRegistry(value: () => HandlerRegistry): Self = this.set("getRegistry", js.Any.fromFunction0(value))
  }
  
}

