package typings.forgeViewer.Autodesk.Viewing.UI

import typings.forgeViewer.anon.DisplayName
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyPanel
  extends StObject
     with DockingPanel {
  
  def addProperty(name: String, value: String, category: String): Boolean = js.native
  def addProperty(name: String, value: String, category: String, options: AddPropertyOptions): Boolean = js.native
  
  def areDefaultPropertiesShown(): Unit = js.native
  
  def displayCategory(category: js.Object, parent: HTMLElement, options: DisplayCategoryOptions): js.Array[HTMLElement] = js.native
  
  def displayProperty(property: js.Object, parent: HTMLElement, options: DisplayCategoryOptions): js.Array[HTMLElement] = js.native
  
  def getCategoryClass(category: js.Object): String = js.native
  
  def getPropertyClass(property: js.Object): String = js.native
  
  def hasProperties(): Boolean = js.native
  
  def highlight(text: String, options: js.Object): Unit = js.native
  
  def isCategoryCollapsed(category: js.Object): Boolean = js.native
  
  def onCategoryClick(category: js.Object, event: Event): Unit = js.native
  
  def onCategoryDoubleClick(category: js.Object, event: Event): Unit = js.native
  
  def onCategoryIconClick(category: js.Object, event: Event): Unit = js.native
  
  def onCategoryRightClick(category: js.Object, event: Event): Unit = js.native
  
  def onPropertyClick(property: js.Object, event: Event): Unit = js.native
  
  def onPropertyDoubleClick(property: js.Object, event: Event): Unit = js.native
  
  def onPropertyIconClick(property: js.Object, event: Event): Unit = js.native
  
  def onPropertyRightClick(property: js.Object, event: Event): Unit = js.native
  
  def removeAllProperties(): Unit = js.native
  
  def removeProperty(name: String, value: String, category: String): Boolean = js.native
  def removeProperty(name: String, value: String, category: String, options: js.Object): Boolean = js.native
  
  def setCategoryCollapsed(category: js.Object, collapsed: Boolean): Unit = js.native
  
  def setProperties(properties: js.Array[DisplayName]): Unit = js.native
  def setProperties(properties: js.Array[DisplayName], options: js.Object): Unit = js.native
  
  def showDefaultProperties(): Unit = js.native
  
  def showNoProperties(): Unit = js.native
}
