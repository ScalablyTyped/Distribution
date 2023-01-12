package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolController extends StObject {
  
  def activateTool(name: String): Boolean
  
  def deactivateTool(name: String): Boolean
  
  def deregisterTool(tool: Any): Boolean
  
  def getActiveTool(): ToolInterface
  
  def getActiveToolName(): String
  
  def getDefaultTool(): ToolInterface
  
  def getIsLocked(): Boolean
  
  def getTool(name: String): ToolInterface
  
  def getToolNames(): js.Array[String]
  
  def recordHomeView(): Unit
  
  def registerTool(tool: Any): Boolean
  
  def setIsLocked(state: Boolean): Boolean
}
object ToolController {
  
  inline def apply(
    activateTool: String => Boolean,
    deactivateTool: String => Boolean,
    deregisterTool: Any => Boolean,
    getActiveTool: () => ToolInterface,
    getActiveToolName: () => String,
    getDefaultTool: () => ToolInterface,
    getIsLocked: () => Boolean,
    getTool: String => ToolInterface,
    getToolNames: () => js.Array[String],
    recordHomeView: () => Unit,
    registerTool: Any => Boolean,
    setIsLocked: Boolean => Boolean
  ): ToolController = {
    val __obj = js.Dynamic.literal(activateTool = js.Any.fromFunction1(activateTool), deactivateTool = js.Any.fromFunction1(deactivateTool), deregisterTool = js.Any.fromFunction1(deregisterTool), getActiveTool = js.Any.fromFunction0(getActiveTool), getActiveToolName = js.Any.fromFunction0(getActiveToolName), getDefaultTool = js.Any.fromFunction0(getDefaultTool), getIsLocked = js.Any.fromFunction0(getIsLocked), getTool = js.Any.fromFunction1(getTool), getToolNames = js.Any.fromFunction0(getToolNames), recordHomeView = js.Any.fromFunction0(recordHomeView), registerTool = js.Any.fromFunction1(registerTool), setIsLocked = js.Any.fromFunction1(setIsLocked))
    __obj.asInstanceOf[ToolController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolController] (val x: Self) extends AnyVal {
    
    inline def setActivateTool(value: String => Boolean): Self = StObject.set(x, "activateTool", js.Any.fromFunction1(value))
    
    inline def setDeactivateTool(value: String => Boolean): Self = StObject.set(x, "deactivateTool", js.Any.fromFunction1(value))
    
    inline def setDeregisterTool(value: Any => Boolean): Self = StObject.set(x, "deregisterTool", js.Any.fromFunction1(value))
    
    inline def setGetActiveTool(value: () => ToolInterface): Self = StObject.set(x, "getActiveTool", js.Any.fromFunction0(value))
    
    inline def setGetActiveToolName(value: () => String): Self = StObject.set(x, "getActiveToolName", js.Any.fromFunction0(value))
    
    inline def setGetDefaultTool(value: () => ToolInterface): Self = StObject.set(x, "getDefaultTool", js.Any.fromFunction0(value))
    
    inline def setGetIsLocked(value: () => Boolean): Self = StObject.set(x, "getIsLocked", js.Any.fromFunction0(value))
    
    inline def setGetTool(value: String => ToolInterface): Self = StObject.set(x, "getTool", js.Any.fromFunction1(value))
    
    inline def setGetToolNames(value: () => js.Array[String]): Self = StObject.set(x, "getToolNames", js.Any.fromFunction0(value))
    
    inline def setRecordHomeView(value: () => Unit): Self = StObject.set(x, "recordHomeView", js.Any.fromFunction0(value))
    
    inline def setRegisterTool(value: Any => Boolean): Self = StObject.set(x, "registerTool", js.Any.fromFunction1(value))
    
    inline def setSetIsLocked(value: Boolean => Boolean): Self = StObject.set(x, "setIsLocked", js.Any.fromFunction1(value))
  }
}
