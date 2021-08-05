package typings.forgeViewer.Autodesk.Viewing.UI

import typings.forgeViewer.Autodesk.Viewing.Model
import typings.std.ClientRect
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelStructurePanel
  extends StObject
     with DockingPanel {
  
  def addClass(id: String, className: String): Boolean
  
  def getNodeClass(node: js.Object): String
  
  def getNodeLabel(node: js.Object): String
  
  def isGroupCollapsed(node: js.Object): Boolean
  
  def isGroupNode(node: js.Object): Boolean
  
  def onClick(node: js.Object, event: Event): Unit
  
  def onDoubleClick(node: js.Object, event: Event): Unit
  
  def onHover(node: js.Object, event: Event): Unit
  
  def onIconClick(node: js.Object, event: Event): Unit
  
  def onRightClick(node: js.Object, event: Event): Unit
  
  def removeClass(id: String, className: String): Boolean
  
  def setGroupCollapsed(node: js.Object, collapsed: Boolean): Unit
  
  def setModel(instanceTree: js.Object, modelTitle: String): Unit
  
  def setSelection(nodes: js.Array[Model]): Unit
  
  def shouldInclude(node: Model): Boolean
}
object ModelStructurePanel {
  
  inline def apply(
    addClass: (String, String) => Boolean,
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
    getNodeClass: js.Object => String,
    getNodeLabel: js.Object => String,
    initialize: () => Unit,
    initializeCloseHandler: HTMLElement => Unit,
    initializeMoveHandlers: HTMLElement => Unit,
    isGroupCollapsed: js.Object => Boolean,
    isGroupNode: js.Object => Boolean,
    isVisible: () => Boolean,
    onClick: (js.Object, Event) => Unit,
    onDoubleClick: (js.Object, Event) => Unit,
    onEndMove: (MouseEvent, Double, Double) => Unit,
    onHover: (js.Object, Event) => Unit,
    onIconClick: (js.Object, Event) => Unit,
    onMove: (MouseEvent, Double, Double) => Unit,
    onRightClick: (js.Object, Event) => Unit,
    onStartMove: (MouseEvent, Double, Double) => Unit,
    onTitleClick: Event => Unit,
    onTitleDoubleClick: Event => Unit,
    removeClass: (String, String) => Boolean,
    removeEventListener: (js.Object, String, js.Function0[Unit]) => Boolean,
    resizeToContent: ResizeOptions => Unit,
    scrollContainer: HTMLElement,
    setGroupCollapsed: (js.Object, Boolean) => Unit,
    setModel: (js.Object, String) => Unit,
    setSelection: js.Array[Model] => Unit,
    setTitle: (String, DockingPanelOptions) => Unit,
    setVisible: Boolean => Unit,
    shouldInclude: Model => Boolean,
    title: HTMLElement,
    titleLabel: String,
    uninitialize: () => Unit,
    visibilityChanged: () => Unit
  ): ModelStructurePanel = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2(addClass), addEventListener = js.Any.fromFunction3(addEventListener), addVisibilityListener = js.Any.fromFunction1(addVisibilityListener), closer = closer.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], createCloseButton = js.Any.fromFunction0(createCloseButton), createFooter = js.Any.fromFunction0(createFooter), createScrollContainer = js.Any.fromFunction1(createScrollContainer), createTitleBar = js.Any.fromFunction1(createTitleBar), footer = footer.asInstanceOf[js.Any], getContainerBoundingRect = js.Any.fromFunction0(getContainerBoundingRect), getContentSize = js.Any.fromFunction0(getContentSize), getNodeClass = js.Any.fromFunction1(getNodeClass), getNodeLabel = js.Any.fromFunction1(getNodeLabel), initialize = js.Any.fromFunction0(initialize), initializeCloseHandler = js.Any.fromFunction1(initializeCloseHandler), initializeMoveHandlers = js.Any.fromFunction1(initializeMoveHandlers), isGroupCollapsed = js.Any.fromFunction1(isGroupCollapsed), isGroupNode = js.Any.fromFunction1(isGroupNode), isVisible = js.Any.fromFunction0(isVisible), onClick = js.Any.fromFunction2(onClick), onDoubleClick = js.Any.fromFunction2(onDoubleClick), onEndMove = js.Any.fromFunction3(onEndMove), onHover = js.Any.fromFunction2(onHover), onIconClick = js.Any.fromFunction2(onIconClick), onMove = js.Any.fromFunction3(onMove), onRightClick = js.Any.fromFunction2(onRightClick), onStartMove = js.Any.fromFunction3(onStartMove), onTitleClick = js.Any.fromFunction1(onTitleClick), onTitleDoubleClick = js.Any.fromFunction1(onTitleDoubleClick), removeClass = js.Any.fromFunction2(removeClass), removeEventListener = js.Any.fromFunction3(removeEventListener), resizeToContent = js.Any.fromFunction1(resizeToContent), scrollContainer = scrollContainer.asInstanceOf[js.Any], setGroupCollapsed = js.Any.fromFunction2(setGroupCollapsed), setModel = js.Any.fromFunction2(setModel), setSelection = js.Any.fromFunction1(setSelection), setTitle = js.Any.fromFunction2(setTitle), setVisible = js.Any.fromFunction1(setVisible), shouldInclude = js.Any.fromFunction1(shouldInclude), title = title.asInstanceOf[js.Any], titleLabel = titleLabel.asInstanceOf[js.Any], uninitialize = js.Any.fromFunction0(uninitialize), visibilityChanged = js.Any.fromFunction0(visibilityChanged))
    __obj.asInstanceOf[ModelStructurePanel]
  }
  
  extension [Self <: ModelStructurePanel](x: Self) {
    
    inline def setAddClass(value: (String, String) => Boolean): Self = StObject.set(x, "addClass", js.Any.fromFunction2(value))
    
    inline def setGetNodeClass(value: js.Object => String): Self = StObject.set(x, "getNodeClass", js.Any.fromFunction1(value))
    
    inline def setGetNodeLabel(value: js.Object => String): Self = StObject.set(x, "getNodeLabel", js.Any.fromFunction1(value))
    
    inline def setIsGroupCollapsed(value: js.Object => Boolean): Self = StObject.set(x, "isGroupCollapsed", js.Any.fromFunction1(value))
    
    inline def setIsGroupNode(value: js.Object => Boolean): Self = StObject.set(x, "isGroupNode", js.Any.fromFunction1(value))
    
    inline def setOnClick(value: (js.Object, Event) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnDoubleClick(value: (js.Object, Event) => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
    
    inline def setOnHover(value: (js.Object, Event) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
    
    inline def setOnIconClick(value: (js.Object, Event) => Unit): Self = StObject.set(x, "onIconClick", js.Any.fromFunction2(value))
    
    inline def setOnRightClick(value: (js.Object, Event) => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction2(value))
    
    inline def setRemoveClass(value: (String, String) => Boolean): Self = StObject.set(x, "removeClass", js.Any.fromFunction2(value))
    
    inline def setSetGroupCollapsed(value: (js.Object, Boolean) => Unit): Self = StObject.set(x, "setGroupCollapsed", js.Any.fromFunction2(value))
    
    inline def setSetModel(value: (js.Object, String) => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction2(value))
    
    inline def setSetSelection(value: js.Array[Model] => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction1(value))
    
    inline def setShouldInclude(value: Model => Boolean): Self = StObject.set(x, "shouldInclude", js.Any.fromFunction1(value))
  }
}
