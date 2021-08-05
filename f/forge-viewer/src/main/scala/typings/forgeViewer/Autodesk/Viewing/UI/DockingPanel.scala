package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.ClientRect
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockingPanel extends StObject {
  
  def addEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Unit
  
  def addVisibilityListener(callback: js.Function1[/* state */ Boolean, Unit]): Unit
  
  var closer: HTMLElement
  
  var container: HTMLElement
  
  var content: Node
  
  def createCloseButton(): HTMLElement
  
  def createFooter(): HTMLElement
  
  def createScrollContainer(options: ScrollContainerOptions): Unit
  
  def createTitleBar(title: String): HTMLElement
  
  var footer: HTMLElement
  
  def getContainerBoundingRect(): ClientRect
  
  def getContentSize(): ContentSize
  
  def initialize(): Unit
  
  def initializeCloseHandler(closer: HTMLElement): Unit
  
  def initializeMoveHandlers(mover: HTMLElement): Unit
  
  def isVisible(): Boolean
  
  def onEndMove(event: MouseEvent, endX: Double, endY: Double): Unit
  
  def onMove(event: MouseEvent, currentX: Double, currentY: Double): Unit
  
  def onStartMove(event: MouseEvent, startX: Double, startY: Double): Unit
  
  def onTitleClick(event: Event): Unit
  
  def onTitleDoubleClick(event: Event): Unit
  
  def removeEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Boolean
  
  def resizeToContent(options: ResizeOptions): Unit
  
  var scrollContainer: HTMLElement
  
  def setTitle(text: String, options: DockingPanelOptions): Unit
  
  def setVisible(show: Boolean): Unit
  
  var title: HTMLElement
  
  var titleLabel: String
  
  def uninitialize(): Unit
  
  def visibilityChanged(): Unit
}
object DockingPanel {
  
  inline def apply(
    addEventListener: (js.Object, String, js.Function0[Unit]) => Unit,
    addVisibilityListener: js.Function1[/* state */ Boolean, Unit] => Unit,
    closer: HTMLElement,
    container: HTMLElement,
    content: Node,
    createCloseButton: () => HTMLElement,
    createFooter: () => HTMLElement,
    createScrollContainer: ScrollContainerOptions => Unit,
    createTitleBar: String => HTMLElement,
    footer: HTMLElement,
    getContainerBoundingRect: () => ClientRect,
    getContentSize: () => ContentSize,
    initialize: () => Unit,
    initializeCloseHandler: HTMLElement => Unit,
    initializeMoveHandlers: HTMLElement => Unit,
    isVisible: () => Boolean,
    onEndMove: (MouseEvent, Double, Double) => Unit,
    onMove: (MouseEvent, Double, Double) => Unit,
    onStartMove: (MouseEvent, Double, Double) => Unit,
    onTitleClick: Event => Unit,
    onTitleDoubleClick: Event => Unit,
    removeEventListener: (js.Object, String, js.Function0[Unit]) => Boolean,
    resizeToContent: ResizeOptions => Unit,
    scrollContainer: HTMLElement,
    setTitle: (String, DockingPanelOptions) => Unit,
    setVisible: Boolean => Unit,
    title: HTMLElement,
    titleLabel: String,
    uninitialize: () => Unit,
    visibilityChanged: () => Unit
  ): DockingPanel = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), addVisibilityListener = js.Any.fromFunction1(addVisibilityListener), closer = closer.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], createCloseButton = js.Any.fromFunction0(createCloseButton), createFooter = js.Any.fromFunction0(createFooter), createScrollContainer = js.Any.fromFunction1(createScrollContainer), createTitleBar = js.Any.fromFunction1(createTitleBar), footer = footer.asInstanceOf[js.Any], getContainerBoundingRect = js.Any.fromFunction0(getContainerBoundingRect), getContentSize = js.Any.fromFunction0(getContentSize), initialize = js.Any.fromFunction0(initialize), initializeCloseHandler = js.Any.fromFunction1(initializeCloseHandler), initializeMoveHandlers = js.Any.fromFunction1(initializeMoveHandlers), isVisible = js.Any.fromFunction0(isVisible), onEndMove = js.Any.fromFunction3(onEndMove), onMove = js.Any.fromFunction3(onMove), onStartMove = js.Any.fromFunction3(onStartMove), onTitleClick = js.Any.fromFunction1(onTitleClick), onTitleDoubleClick = js.Any.fromFunction1(onTitleDoubleClick), removeEventListener = js.Any.fromFunction3(removeEventListener), resizeToContent = js.Any.fromFunction1(resizeToContent), scrollContainer = scrollContainer.asInstanceOf[js.Any], setTitle = js.Any.fromFunction2(setTitle), setVisible = js.Any.fromFunction1(setVisible), title = title.asInstanceOf[js.Any], titleLabel = titleLabel.asInstanceOf[js.Any], uninitialize = js.Any.fromFunction0(uninitialize), visibilityChanged = js.Any.fromFunction0(visibilityChanged))
    __obj.asInstanceOf[DockingPanel]
  }
  
  extension [Self <: DockingPanel](x: Self) {
    
    inline def setAddEventListener(value: (js.Object, String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    inline def setAddVisibilityListener(value: js.Function1[/* state */ Boolean, Unit] => Unit): Self = StObject.set(x, "addVisibilityListener", js.Any.fromFunction1(value))
    
    inline def setCloser(value: HTMLElement): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCreateCloseButton(value: () => HTMLElement): Self = StObject.set(x, "createCloseButton", js.Any.fromFunction0(value))
    
    inline def setCreateFooter(value: () => HTMLElement): Self = StObject.set(x, "createFooter", js.Any.fromFunction0(value))
    
    inline def setCreateScrollContainer(value: ScrollContainerOptions => Unit): Self = StObject.set(x, "createScrollContainer", js.Any.fromFunction1(value))
    
    inline def setCreateTitleBar(value: String => HTMLElement): Self = StObject.set(x, "createTitleBar", js.Any.fromFunction1(value))
    
    inline def setFooter(value: HTMLElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerBoundingRect(value: () => ClientRect): Self = StObject.set(x, "getContainerBoundingRect", js.Any.fromFunction0(value))
    
    inline def setGetContentSize(value: () => ContentSize): Self = StObject.set(x, "getContentSize", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setInitializeCloseHandler(value: HTMLElement => Unit): Self = StObject.set(x, "initializeCloseHandler", js.Any.fromFunction1(value))
    
    inline def setInitializeMoveHandlers(value: HTMLElement => Unit): Self = StObject.set(x, "initializeMoveHandlers", js.Any.fromFunction1(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setOnEndMove(value: (MouseEvent, Double, Double) => Unit): Self = StObject.set(x, "onEndMove", js.Any.fromFunction3(value))
    
    inline def setOnMove(value: (MouseEvent, Double, Double) => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction3(value))
    
    inline def setOnStartMove(value: (MouseEvent, Double, Double) => Unit): Self = StObject.set(x, "onStartMove", js.Any.fromFunction3(value))
    
    inline def setOnTitleClick(value: Event => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
    
    inline def setOnTitleDoubleClick(value: Event => Unit): Self = StObject.set(x, "onTitleDoubleClick", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: (js.Object, String, js.Function0[Unit]) => Boolean): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
    
    inline def setResizeToContent(value: ResizeOptions => Unit): Self = StObject.set(x, "resizeToContent", js.Any.fromFunction1(value))
    
    inline def setScrollContainer(value: HTMLElement): Self = StObject.set(x, "scrollContainer", value.asInstanceOf[js.Any])
    
    inline def setSetTitle(value: (String, DockingPanelOptions) => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction2(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    inline def setTitle(value: HTMLElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleLabel(value: String): Self = StObject.set(x, "titleLabel", value.asInstanceOf[js.Any])
    
    inline def setUninitialize(value: () => Unit): Self = StObject.set(x, "uninitialize", js.Any.fromFunction0(value))
    
    inline def setVisibilityChanged(value: () => Unit): Self = StObject.set(x, "visibilityChanged", js.Any.fromFunction0(value))
  }
}
