package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.ToolInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.ToolController")
@js.native
class ToolController ()
  extends StObject
     with typings.forgeViewer.Autodesk.Viewing.ToolController {
  
  /* CompleteClass */
  override def activateTool(name: String): Boolean = js.native
  
  /* CompleteClass */
  override def deactivateTool(name: String): Boolean = js.native
  
  /* CompleteClass */
  override def deregisterTool(tool: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def getActiveTool(): ToolInterface = js.native
  
  /* CompleteClass */
  override def getActiveToolName(): String = js.native
  
  /* CompleteClass */
  override def getDefaultTool(): ToolInterface = js.native
  
  /* CompleteClass */
  override def getIsLocked(): Boolean = js.native
  
  /* CompleteClass */
  override def getTool(name: String): ToolInterface = js.native
  
  /* CompleteClass */
  override def getToolNames(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def registerTool(tool: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def setIsLocked(state: Boolean): Boolean = js.native
}
