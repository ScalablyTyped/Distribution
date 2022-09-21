package typings.forgeViewer.Autodesk.Viewing.UI

import typings.forgeViewer.Autodesk.Viewing.Model
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelStructurePanel
  extends StObject
     with DockingPanel {
  
  def addClass(id: String, className: String): Boolean = js.native
  
  def getNodeClass(node: js.Object): String = js.native
  
  def getNodeLabel(node: js.Object): String = js.native
  
  def isGroupCollapsed(node: js.Object): Boolean = js.native
  
  def isGroupNode(node: js.Object): Boolean = js.native
  
  def onClick(node: js.Object, event: Event): Unit = js.native
  
  def onDoubleClick(node: js.Object, event: Event): Unit = js.native
  
  def onHover(node: js.Object, event: Event): Unit = js.native
  
  def onIconClick(node: js.Object, event: Event): Unit = js.native
  
  def onRightClick(node: js.Object, event: Event): Unit = js.native
  
  def removeClass(id: String, className: String): Boolean = js.native
  
  def setGroupCollapsed(node: js.Object, collapsed: Boolean): Unit = js.native
  
  def setModel(instanceTree: js.Object, modelTitle: String): Unit = js.native
  
  def setSelection(nodes: js.Array[Model]): Unit = js.native
  
  def shouldInclude(node: Model): Boolean = js.native
}
