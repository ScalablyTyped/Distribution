package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersPanel
  extends StObject
     with DockingPanel {
  
  def build(): Unit = js.native
  
  def createNode(node: js.Object, parent: HTMLElement): Unit = js.native
  
  def getNodeClass(node: js.Object): String = js.native
  
  def getNodeLabel(node: js.Object): String = js.native
  
  def isGroupCollapsed(node: js.Object): Boolean = js.native
  
  def isGroupNode(node: js.Object): Boolean = js.native
  
  def onClick(node: js.Object, event: Event): Unit = js.native
  
  def onDoubleClick(node: js.Object, event: Event): Unit = js.native
  
  def onIconClick(node: js.Object, event: Event): Unit = js.native
  
  def onImageClick(node: js.Object, event: Event): Unit = js.native
  
  def onRightClick(node: js.Object, event: Event): Unit = js.native
  
  def setGroupCollapsed(node: js.Object, collapse: Boolean): Unit = js.native
  
  def setLayerVisible(node: js.Object, collapse: Boolean): Unit = js.native
  
  def shouldInclude(node: js.Object): Boolean = js.native
  
  def update(): Unit = js.native
}
