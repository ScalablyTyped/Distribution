package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree extends StObject {
  
  def addClass(node: js.Object, className: String): Boolean = js.native
  def addClass(node: Double, className: String): Boolean = js.native
  
  def addToSelection(nodes: js.Array[js.Object]): Unit = js.native
  
  def clear(): Unit = js.native
  
  def clearSelection(): Unit = js.native
  
  def delegate(): TreeDelegate = js.native
  
  def getElementForNode(node: Any): HTMLElement = js.native
  
  def getRootContainer(): String = js.native
  
  def hasClass(node: js.Object, className: String): Boolean = js.native
  def hasClass(node: Double, className: String): Boolean = js.native
  
  def isCollapsed(group: js.Object): Boolean = js.native
  
  def isSelected(node: js.Object): Boolean = js.native
  
  def iterate(node: js.Object, callback: js.Function2[/* node */ js.Object, /* elem */ HTMLElement, Unit]): Unit = js.native
  
  def removeClass(node: js.Object, className: String): Boolean = js.native
  def removeClass(node: Double, className: String): Boolean = js.native
  
  def removeFromSelection(nodes: js.Array[js.Object]): Unit = js.native
  
  def scrollTo(node: Any): Unit = js.native
  
  def setAllCollapsed(collapsed: Boolean): Unit = js.native
  
  def setCollapsed(group: js.Object, collapsed: Boolean): Unit = js.native
  def setCollapsed(group: js.Object, collapsed: Boolean, recursive: Boolean): Unit = js.native
  
  def setSelection(nodes: js.Object): Unit = js.native
  
  def show(show: Boolean): Unit = js.native
}
