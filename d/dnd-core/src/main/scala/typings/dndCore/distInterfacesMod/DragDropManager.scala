package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropManager extends StObject {
  
  def dispatch(action: Any): Unit
  
  def getActions(): DragDropActions
  
  def getBackend(): Backend
  
  def getMonitor(): DragDropMonitor
  
  def getRegistry(): HandlerRegistry
}
object DragDropManager {
  
  inline def apply(
    dispatch: Any => Unit,
    getActions: () => DragDropActions,
    getBackend: () => Backend,
    getMonitor: () => DragDropMonitor,
    getRegistry: () => HandlerRegistry
  ): DragDropManager = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getActions = js.Any.fromFunction0(getActions), getBackend = js.Any.fromFunction0(getBackend), getMonitor = js.Any.fromFunction0(getMonitor), getRegistry = js.Any.fromFunction0(getRegistry))
    __obj.asInstanceOf[DragDropManager]
  }
  
  extension [Self <: DragDropManager](x: Self) {
    
    inline def setDispatch(value: Any => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    inline def setGetActions(value: () => DragDropActions): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
    
    inline def setGetBackend(value: () => Backend): Self = StObject.set(x, "getBackend", js.Any.fromFunction0(value))
    
    inline def setGetMonitor(value: () => DragDropMonitor): Self = StObject.set(x, "getMonitor", js.Any.fromFunction0(value))
    
    inline def setGetRegistry(value: () => HandlerRegistry): Self = StObject.set(x, "getRegistry", js.Any.fromFunction0(value))
  }
}
