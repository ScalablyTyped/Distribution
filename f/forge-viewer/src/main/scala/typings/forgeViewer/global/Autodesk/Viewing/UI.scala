package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.UI.ContentSize
import typings.forgeViewer.Autodesk.Viewing.UI.ControlOptions
import typings.forgeViewer.Autodesk.Viewing.UI.DockingPanelOptions
import typings.forgeViewer.Autodesk.Viewing.UI.MenuItem
import typings.forgeViewer.Autodesk.Viewing.UI.ResizeOptions
import typings.forgeViewer.Autodesk.Viewing.UI.ScrollContainerOptions
import typings.forgeViewer.forgeViewerStrings.ButtonDotStateChanged
import typings.forgeViewer.forgeViewerStrings.ControlDotCollapsedChanged
import typings.forgeViewer.forgeViewerStrings.ControlDotVisibilityChanged
import typings.forgeViewer.forgeViewerStrings.RadioButtonGroupDotActiveButtonChanged
import typings.forgeViewer.forgeViewerStrings.click
import typings.std.ClientRect
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UI {
  
  @JSGlobal("Autodesk.Viewing.UI.Button")
  @js.native
  class Button protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.Button {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  // NOTE: TypeScript doesn't support enum inside class. This seems to be commonly used workaround.
  object Button {
    
    @JSGlobal("Autodesk.Viewing.UI.Button.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.UI.Button.State & Double] = js.native
      
      /* 0 */ val ACTIVE: typings.forgeViewer.Autodesk.Viewing.UI.Button.State.ACTIVE & Double = js.native
      
      /* 2 */ val DISABLED: typings.forgeViewer.Autodesk.Viewing.UI.Button.State.DISABLED & Double = js.native
      
      /* 1 */ val INACTIVE: typings.forgeViewer.Autodesk.Viewing.UI.Button.State.INACTIVE & Double = js.native
    }
  }
  
  @JSGlobal("Autodesk.Viewing.UI.COLLAPSED_CHANGED")
  @js.native
  val COLLAPSED_CHANGED: /* "Control.VisibilityChanged" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.CONTROL_ADDED")
  @js.native
  val CONTROL_ADDED: /* "ControlGroup.ControlAdded" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.CONTROL_REMOVED")
  @js.native
  val CONTROL_REMOVED: /* "ControlGroup.ControlRemoved" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.ComboButton")
  @js.native
  class ComboButton protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ComboButton {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.Control")
  @js.native
  class Control ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.Control {
    def this(id: String) = this()
    def this(id: String, options: ControlOptions) = this()
    def this(id: Unit, options: ControlOptions) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.ControlEventArgs")
  @js.native
  class ControlEventArgs ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ControlEventArgs {
    
    /* CompleteClass */
    var ACTIVE_BUTTON_CHANGED: RadioButtonGroupDotActiveButtonChanged = js.native
    
    /* CompleteClass */
    var CLICK: click = js.native
    
    /* CompleteClass */
    var COLLAPSED_CHANGED: ControlDotCollapsedChanged = js.native
    
    /* CompleteClass */
    var STATE_CHANGED: ButtonDotStateChanged = js.native
    
    /* CompleteClass */
    var VISIBILITY_CHANGED: ControlDotVisibilityChanged = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.ControlGroup")
  @js.native
  class ControlGroup ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ControlGroup
  
  @JSGlobal("Autodesk.Viewing.UI.DockingPanel")
  @js.native
  class DockingPanel protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.DockingPanel {
    def this(parentContainer: HTMLElement, id: String, title: String) = this()
    def this(parentContainer: HTMLElement, id: String, title: String, options: DockingPanelOptions) = this()
    
    /* CompleteClass */
    override def addEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def addVisibilityListener(callback: js.Function1[/* state */ Boolean, Unit]): Unit = js.native
    
    /* CompleteClass */
    var closer: HTMLElement = js.native
    
    /* CompleteClass */
    var container: HTMLElement = js.native
    
    /* CompleteClass */
    var content: Node = js.native
    
    /* CompleteClass */
    override def createCloseButton(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createFooter(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createScrollContainer(options: ScrollContainerOptions): Unit = js.native
    
    /* CompleteClass */
    override def createTitleBar(title: String): HTMLElement = js.native
    
    /* CompleteClass */
    var footer: HTMLElement = js.native
    
    /* CompleteClass */
    override def getContainerBoundingRect(): ClientRect = js.native
    
    /* CompleteClass */
    override def getContentSize(): ContentSize = js.native
    
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def initializeCloseHandler(closer: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def initializeMoveHandlers(mover: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /* CompleteClass */
    override def onEndMove(event: MouseEvent, endX: Double, endY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onMove(event: MouseEvent, currentX: Double, currentY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onStartMove(event: MouseEvent, startX: Double, startY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onTitleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTitleDoubleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Boolean = js.native
    
    /* CompleteClass */
    override def resizeToContent(options: ResizeOptions): Unit = js.native
    
    /* CompleteClass */
    var scrollContainer: HTMLElement = js.native
    
    /* CompleteClass */
    override def setTitle(text: String, options: DockingPanelOptions): Unit = js.native
    
    /* CompleteClass */
    override def setVisible(show: Boolean): Unit = js.native
    
    /* CompleteClass */
    var title: HTMLElement = js.native
    
    /* CompleteClass */
    var titleLabel: String = js.native
    
    /* CompleteClass */
    override def uninitialize(): Unit = js.native
    
    /* CompleteClass */
    override def visibilityChanged(): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.LayersPanel")
  @js.native
  class LayersPanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.LayersPanel {
    
    /* CompleteClass */
    override def addEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def addVisibilityListener(callback: js.Function1[/* state */ Boolean, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def build(): Unit = js.native
    
    /* CompleteClass */
    var closer: HTMLElement = js.native
    
    /* CompleteClass */
    var container: HTMLElement = js.native
    
    /* CompleteClass */
    var content: Node = js.native
    
    /* CompleteClass */
    override def createCloseButton(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createFooter(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createNode(node: js.Object, parent: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def createScrollContainer(options: ScrollContainerOptions): Unit = js.native
    
    /* CompleteClass */
    override def createTitleBar(title: String): HTMLElement = js.native
    
    /* CompleteClass */
    var footer: HTMLElement = js.native
    
    /* CompleteClass */
    override def getContainerBoundingRect(): ClientRect = js.native
    
    /* CompleteClass */
    override def getContentSize(): ContentSize = js.native
    
    /* CompleteClass */
    override def getNodeClass(node: js.Object): String = js.native
    
    /* CompleteClass */
    override def getNodeLabel(node: js.Object): String = js.native
    
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def initializeCloseHandler(closer: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def initializeMoveHandlers(mover: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def isGroupCollapsed(node: js.Object): Boolean = js.native
    
    /* CompleteClass */
    override def isGroupNode(node: js.Object): Boolean = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /* CompleteClass */
    override def onClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onDoubleClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onEndMove(event: MouseEvent, endX: Double, endY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onIconClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onImageClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onMove(event: MouseEvent, currentX: Double, currentY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onRightClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onStartMove(event: MouseEvent, startX: Double, startY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onTitleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTitleDoubleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Boolean = js.native
    
    /* CompleteClass */
    override def resizeToContent(options: ResizeOptions): Unit = js.native
    
    /* CompleteClass */
    var scrollContainer: HTMLElement = js.native
    
    /* CompleteClass */
    override def setGroupCollapsed(node: js.Object, collapse: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setLayerVisible(node: js.Object, collapse: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setTitle(text: String, options: DockingPanelOptions): Unit = js.native
    
    /* CompleteClass */
    override def setVisible(show: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def shouldInclude(node: js.Object): Boolean = js.native
    
    /* CompleteClass */
    var title: HTMLElement = js.native
    
    /* CompleteClass */
    var titleLabel: String = js.native
    
    /* CompleteClass */
    override def uninitialize(): Unit = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* CompleteClass */
    override def visibilityChanged(): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.ModelStructurePanel")
  @js.native
  class ModelStructurePanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ModelStructurePanel {
    
    /* CompleteClass */
    override def addClass(id: String, className: String): Boolean = js.native
    
    /* CompleteClass */
    override def addEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def addVisibilityListener(callback: js.Function1[/* state */ Boolean, Unit]): Unit = js.native
    
    /* CompleteClass */
    var closer: HTMLElement = js.native
    
    /* CompleteClass */
    var container: HTMLElement = js.native
    
    /* CompleteClass */
    var content: Node = js.native
    
    /* CompleteClass */
    override def createCloseButton(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createFooter(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createScrollContainer(options: ScrollContainerOptions): Unit = js.native
    
    /* CompleteClass */
    override def createTitleBar(title: String): HTMLElement = js.native
    
    /* CompleteClass */
    var footer: HTMLElement = js.native
    
    /* CompleteClass */
    override def getContainerBoundingRect(): ClientRect = js.native
    
    /* CompleteClass */
    override def getContentSize(): ContentSize = js.native
    
    /* CompleteClass */
    override def getNodeClass(node: js.Object): String = js.native
    
    /* CompleteClass */
    override def getNodeLabel(node: js.Object): String = js.native
    
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def initializeCloseHandler(closer: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def initializeMoveHandlers(mover: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def isGroupCollapsed(node: js.Object): Boolean = js.native
    
    /* CompleteClass */
    override def isGroupNode(node: js.Object): Boolean = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /* CompleteClass */
    override def onClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onDoubleClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onEndMove(event: MouseEvent, endX: Double, endY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onHover(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onIconClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onMove(event: MouseEvent, currentX: Double, currentY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onRightClick(node: js.Object, event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onStartMove(event: MouseEvent, startX: Double, startY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onTitleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTitleDoubleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def removeClass(id: String, className: String): Boolean = js.native
    
    /* CompleteClass */
    override def removeEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Boolean = js.native
    
    /* CompleteClass */
    override def resizeToContent(options: ResizeOptions): Unit = js.native
    
    /* CompleteClass */
    var scrollContainer: HTMLElement = js.native
    
    /* CompleteClass */
    override def setGroupCollapsed(node: js.Object, collapsed: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setModel(instanceTree: js.Object, modelTitle: String): Unit = js.native
    
    /* CompleteClass */
    override def setSelection(nodes: js.Array[typings.forgeViewer.Autodesk.Viewing.Model]): Unit = js.native
    
    /* CompleteClass */
    override def setTitle(text: String, options: DockingPanelOptions): Unit = js.native
    
    /* CompleteClass */
    override def setVisible(show: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def shouldInclude(node: typings.forgeViewer.Autodesk.Viewing.Model): Boolean = js.native
    
    /* CompleteClass */
    var title: HTMLElement = js.native
    
    /* CompleteClass */
    var titleLabel: String = js.native
    
    /* CompleteClass */
    override def uninitialize(): Unit = js.native
    
    /* CompleteClass */
    override def visibilityChanged(): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.ObjectContextMenu")
  @js.native
  class ObjectContextMenu protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ObjectContextMenu {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
    
    /* CompleteClass */
    override def buildMenu(event: Event, status: js.Object): js.Array[MenuItem] = js.native
    
    /* CompleteClass */
    override def hide(): Boolean = js.native
    
    /* CompleteClass */
    override def show(event: Event): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.PropertyPanel")
  @js.native
  class PropertyPanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.PropertyPanel {
    
    /* CompleteClass */
    override def addEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def addVisibilityListener(callback: js.Function1[/* state */ Boolean, Unit]): Unit = js.native
    
    /* CompleteClass */
    var closer: HTMLElement = js.native
    
    /* CompleteClass */
    var container: HTMLElement = js.native
    
    /* CompleteClass */
    var content: Node = js.native
    
    /* CompleteClass */
    override def createCloseButton(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createFooter(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createScrollContainer(options: ScrollContainerOptions): Unit = js.native
    
    /* CompleteClass */
    override def createTitleBar(title: String): HTMLElement = js.native
    
    /* CompleteClass */
    var footer: HTMLElement = js.native
    
    /* CompleteClass */
    override def getContainerBoundingRect(): ClientRect = js.native
    
    /* CompleteClass */
    override def getContentSize(): ContentSize = js.native
    
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def initializeCloseHandler(closer: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def initializeMoveHandlers(mover: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /* CompleteClass */
    override def onEndMove(event: MouseEvent, endX: Double, endY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onMove(event: MouseEvent, currentX: Double, currentY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onStartMove(event: MouseEvent, startX: Double, startY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onTitleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTitleDoubleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Boolean = js.native
    
    /* CompleteClass */
    override def resizeToContent(options: ResizeOptions): Unit = js.native
    
    /* CompleteClass */
    var scrollContainer: HTMLElement = js.native
    
    /* CompleteClass */
    override def setTitle(text: String, options: DockingPanelOptions): Unit = js.native
    
    /* CompleteClass */
    override def setVisible(show: Boolean): Unit = js.native
    
    /* CompleteClass */
    var title: HTMLElement = js.native
    
    /* CompleteClass */
    var titleLabel: String = js.native
    
    /* CompleteClass */
    override def uninitialize(): Unit = js.native
    
    /* CompleteClass */
    override def visibilityChanged(): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.RadioButtonGroup")
  @js.native
  class RadioButtonGroup protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.RadioButtonGroup {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.SIZE_CHANGED")
  @js.native
  val SIZE_CHANGED: /* "ControlGroup.SizeChanged" */ String = js.native
  
  @JSGlobal("Autodesk.Viewing.UI.SettingsPanel")
  @js.native
  class SettingsPanel ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.SettingsPanel {
    
    /* CompleteClass */
    override def addEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def addVisibilityListener(callback: js.Function1[/* state */ Boolean, Unit]): Unit = js.native
    
    /* CompleteClass */
    var closer: HTMLElement = js.native
    
    /* CompleteClass */
    var container: HTMLElement = js.native
    
    /* CompleteClass */
    var content: Node = js.native
    
    /* CompleteClass */
    override def createCloseButton(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createFooter(): HTMLElement = js.native
    
    /* CompleteClass */
    override def createScrollContainer(options: ScrollContainerOptions): Unit = js.native
    
    /* CompleteClass */
    override def createTitleBar(title: String): HTMLElement = js.native
    
    /* CompleteClass */
    var footer: HTMLElement = js.native
    
    /* CompleteClass */
    override def getContainerBoundingRect(): ClientRect = js.native
    
    /* CompleteClass */
    override def getContentSize(): ContentSize = js.native
    
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def initializeCloseHandler(closer: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def initializeMoveHandlers(mover: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /* CompleteClass */
    override def onEndMove(event: MouseEvent, endX: Double, endY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onMove(event: MouseEvent, currentX: Double, currentY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onStartMove(event: MouseEvent, startX: Double, startY: Double): Unit = js.native
    
    /* CompleteClass */
    override def onTitleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onTitleDoubleClick(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(target: js.Object, eventId: String, callback: js.Function0[Unit]): Boolean = js.native
    
    /* CompleteClass */
    override def resizeToContent(options: ResizeOptions): Unit = js.native
    
    /* CompleteClass */
    var scrollContainer: HTMLElement = js.native
    
    /* CompleteClass */
    override def setTitle(text: String, options: DockingPanelOptions): Unit = js.native
    
    /* CompleteClass */
    override def setVisible(show: Boolean): Unit = js.native
    
    /* CompleteClass */
    var title: HTMLElement = js.native
    
    /* CompleteClass */
    var titleLabel: String = js.native
    
    /* CompleteClass */
    override def uninitialize(): Unit = js.native
    
    /* CompleteClass */
    override def visibilityChanged(): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.UI.ToolBar")
  @js.native
  class ToolBar protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.UI.ControlGroup {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.UI.VISIBILITY_CHANGED")
  @js.native
  val VISIBILITY_CHANGED: /* "Control.CollapsedChanged" */ String = js.native
}
