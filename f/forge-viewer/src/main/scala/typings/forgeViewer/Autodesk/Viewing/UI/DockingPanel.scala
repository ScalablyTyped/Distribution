package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.ClientRect
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockingPanel extends StObject {
  
  def addEventListener(target: js.Object, eventId: String, callback: js.Function1[/* event */ js.UndefOr[Any], Unit]): Unit = js.native
  
  def addVisibilityListener(callback: js.Function1[/* state */ Boolean, Unit]): Unit = js.native
  
  var closer: HTMLElement = js.native
  
  var container: Any = js.native
  
  var content: Any = js.native
  
  def createCloseButton(): HTMLElement = js.native
  
  def createFooter(): HTMLElement = js.native
  
  def createScrollContainer(options: ScrollContainerOptions): Unit = js.native
  
  def createTitleBar(title: String): HTMLElement = js.native
  
  var footer: HTMLElement = js.native
  
  def getContainerBoundingRect(): ClientRect = js.native
  
  def getContentSize(): ContentSize = js.native
  
  def initialize(): Unit = js.native
  
  def initializeCloseHandler(closer: HTMLElement): Unit = js.native
  
  def initializeMoveHandlers(mover: HTMLElement): Unit = js.native
  
  def isVisible(): Boolean = js.native
  
  def onEndMove(event: MouseEvent, endX: Double, endY: Double): Unit = js.native
  
  def onMove(event: MouseEvent, currentX: Double, currentY: Double): Unit = js.native
  
  def onStartMove(event: MouseEvent, startX: Double, startY: Double): Unit = js.native
  
  def onTitleClick(event: Event): Unit = js.native
  
  def onTitleDoubleClick(event: Event): Unit = js.native
  
  def removeEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Boolean = js.native
  
  def resizeToContent(): Unit = js.native
  def resizeToContent(options: ResizeOptions): Unit = js.native
  
  var scrollContainer: HTMLElement = js.native
  
  def setTitle(text: String, options: DockingPanelOptions): Unit = js.native
  
  def setVisible(show: Boolean): Unit = js.native
  
  var title: HTMLElement = js.native
  
  var titleLabel: String = js.native
  
  def uninitialize(): Unit = js.native
  
  def visibilityChanged(): Unit = js.native
}
