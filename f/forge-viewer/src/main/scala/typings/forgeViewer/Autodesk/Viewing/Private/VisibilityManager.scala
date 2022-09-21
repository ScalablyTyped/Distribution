package typings.forgeViewer.Autodesk.Viewing.Private

import typings.forgeViewer.Autodesk.Viewing.InstanceTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisibilityManager extends StObject {
  
  def getHiddenNodes(): Any = js.native
  
  def getInstanceTree(): InstanceTree = js.native
  
  def getIsolatedNodes(): Any = js.native
  
  def hide(node: js.Object): Unit = js.native
  def hide(node: Double): Unit = js.native
  
  def isNodeVisible(dbId: Double): Boolean = js.native
  
  def isolate(node: js.Object): Unit = js.native
  def isolate(node: Double): Unit = js.native
  
  def isolateMultiple(nodeList: js.Array[Any]): Unit = js.native
  
  def isolateNone(): Unit = js.native
  
  def setAllVisibility(visible: Boolean): Unit = js.native
  
  def setNodeOff(node: js.Object, isOff: Boolean): Unit = js.native
  def setNodeOff(node: Double, isOff: Boolean): Unit = js.native
  
  def setVisibilityOnNode(node: js.Object, visible: Boolean): Unit = js.native
  def setVisibilityOnNode(node: Double, visible: Boolean): Unit = js.native
  
  def show(node: js.Object): Unit = js.native
  def show(node: Double): Unit = js.native
  
  def toggleVisibility(node: js.Object): Unit = js.native
  def toggleVisibility(node: Double): Unit = js.native
  
  def updateNodeVisibilityTracking(node: js.Object, visible: Boolean): Unit = js.native
  def updateNodeVisibilityTracking(node: Double, visible: Boolean): Unit = js.native
}
