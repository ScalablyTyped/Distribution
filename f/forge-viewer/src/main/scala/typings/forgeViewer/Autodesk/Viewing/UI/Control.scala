package typings.forgeViewer.Autodesk.Viewing.UI

import typings.forgeViewer.Autodesk.Viewing.ViewerEvent
import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control extends StObject {
  
  var Event: ControlEventArgs = js.native
  
  def addClass(cssClass: String): Unit = js.native
  
  // Events
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: Unit, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, listener: ViewerEvent): Unit = js.native
  def addEventListener(`type`: String, listener: ViewerEvent, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: ViewerEvent, options: AddEventListenerOptions): Unit = js.native
  
  def dispatchEvent(evt: Event): Boolean = js.native
  
  def getDimensions(): Any = js.native
  
  def getId(): String = js.native
  
  def getPosition(): js.Object = js.native
  
  def getToolTip(): String = js.native
  
  def isCollapsed(): Boolean = js.native
  
  def isCollapsible(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def removeClass(cssClass: String): Unit = js.native
  
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: Unit, options: EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: ViewerEvent): Unit = js.native
  def removeEventListener(`type`: String, listener: ViewerEvent, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: ViewerEvent, options: EventListenerOptions): Unit = js.native
  
  def removeFromParent(): Unit = js.native
  
  def setCollapsed(collapsed: Boolean): Boolean = js.native
  
  def setDisplay(value: String): Unit = js.native
  
  def setToolTip(toolTipText: String): Boolean = js.native
  
  def setVisible(visible: Boolean): Boolean = js.native
}
