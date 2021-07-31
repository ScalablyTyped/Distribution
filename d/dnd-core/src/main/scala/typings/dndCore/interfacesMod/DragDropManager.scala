package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropManager extends StObject {
  
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
  
  @scala.inline
  implicit class DragDropManagerMutableBuilder[Self <: DragDropManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatch(value: js.Any => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActions(value: () => DragDropActions): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBackend(value: () => Backend): Self = StObject.set(x, "getBackend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonitor(value: () => DragDropMonitor): Self = StObject.set(x, "getMonitor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRegistry(value: () => HandlerRegistry): Self = StObject.set(x, "getRegistry", js.Any.fromFunction0(value))
  }
}
