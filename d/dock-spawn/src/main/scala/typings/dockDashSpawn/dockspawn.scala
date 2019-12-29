package typings.dockDashSpawn

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dockspawn")
@js.native
object dockspawn extends js.Object {
  @js.native
  class Dialog protected () extends js.Object {
    def this(panel: PanelContainer, dockManager: DockManager) = this()
    def bringToFront(): Unit = js.native
    def resize(width: Double, height: Double): Unit = js.native
    def setPosition(x: Double, y: Double): Unit = js.native
    def setTitle(title: String): Unit = js.native
    def setTitleIcon(iconName: String): Unit = js.native
  }
  
  /**
    * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
    * It owns an HTMLDivElement inside which all panels are docked.
    * Initially the document manager takes up the central space and acts as the root node.
    */
  @js.native
  class DockManager protected () extends js.Object {
    def this(element: HTMLDivElement) = this()
    var context: DockManagerContext = js.native
    /** Dock the [dialog] below the [referenceNode] node */
    def dockDialogDown(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
    /** Dock the [dialog] as a tab inside the [referenceNode] node */
    def dockDialogFill(referenceNode: DockNode, container: PanelContainer): DockNode = js.native
    /** Dock the [dialog] to the left of the [referenceNode] node */
    def dockDialogLeft(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
    /** Dock the [dialog] to the right of the [referenceNode] node */
    def dockDialogRight(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
    /** Dock the [dialog] above the [referenceNode] node */
    def dockDialogUp(referenceNode: DockNode, dialog: Dialog): DockNode = js.native
    /** Dock the [container] below the [referenceNode] node */
    def dockDown(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
    /** Dock the [container] as a tab inside the [referenceNode] node */
    def dockFill(referenceNode: DockNode, container: PanelContainer): DockNode = js.native
    /** Dock the [container] to the left of the [referenceNode] node */
    def dockLeft(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
    /** Dock the [container] to the right of the [referenceNode] node */
    def dockRight(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
    /** Dock the [container] above the [referenceNode] node */
    def dockUp(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode = js.native
    def initialize(): Unit = js.native
    def invalidate(): Unit = js.native
    def loadState(state: String): Unit = js.native
    def rebuildLayout(node: DockNode): Unit = js.native
    def resize(width: Double, height: Double): Unit = js.native
    def resumeLayout(): Unit = js.native
    def saveState(): String = js.native
    /**
      * Reset the dock model. This happens when state is loaded from JSON.
      */
    def setModel(model: DockModel): Unit = js.native
    def setRootNode(node: DockNode): Unit = js.native
    def suspendLayout(): Unit = js.native
  }
  
  @js.native
  class DockManagerContext protected () extends js.Object {
    def this(dockManager: DockManager) = this()
    var dockManager: DockManager = js.native
    var documentManagerView: DocumentManagerContainer = js.native
    var model: DockModel = js.native
  }
  
  @js.native
  class DockModel () extends js.Object {
    var documentManagerNode: DockNode = js.native
    var rootNode: DockNode = js.native
  }
  
  @js.native
  class DockNode protected () extends js.Object {
    def this(container: PanelContainer) = this()
    def detachFromParent(): Unit = js.native
  }
  
  /**
    * The document manager is then central area of the dock layout hierarchy.
    * This is where more important panels are placed (e.g. the text editor in an IDE,
    * 3D view in a modelling package etc
    */
  @js.native
  class DocumentManagerContainer protected () extends FillDockContainer {
    def this(dockManager: DockManager) = this()
    var selectedTab: TabPage = js.native
    def saveState(state: String): Unit = js.native
  }
  
  @js.native
  class FillDockContainer protected () extends js.Object {
    def this(dockManager: DockManager) = this()
    def this(dockManager: DockManager, tabStripDirection: TabStripDirection) = this()
    var containerType: String = js.native
    var dockManager: DockManager = js.native
    var element: HTMLDivElement = js.native
    var minimumAllowedChildNodes: Double = js.native
    var name: String = js.native
    var tabHost: TabHost = js.native
    var tabOrientation: TabStripDirection = js.native
  }
  
  @js.native
  class PanelContainer protected () extends js.Object {
    def this(element: HTMLElement, dockManager: DockManager) = this()
    def this(element: HTMLElement, dockManager: DockManager, title: String) = this()
    var height: Double = js.native
    var width: Double = js.native
    def setTitle(title: String): Unit = js.native
    def setTitleIcon(iconName: String): Unit = js.native
  }
  
  /**
    * Tab Host control contains tabs known as TabPages.
    * The tab strip can be aligned in different orientations
    */
  @js.native
  class TabHost () extends js.Object {
    def this(tabStripDirection: TabStripDirection) = this()
    def this(tabStripDirection: TabStripDirection, displayCloseButton: Boolean) = this()
    var contentElement: HTMLDivElement = js.native
    var displayCloseButton: Boolean = js.native
    var hostElement: HTMLDivElement = js.native
    var pages: js.Array[TabPage] = js.native
    var separatorElement: HTMLDivElement = js.native
    var tabListElement: HTMLDivElement = js.native
    var tabStripDirection: TabStripDirection = js.native
    /** Set the selected TabPage. */
    def onTabPageSelected(page: TabPage): Unit = js.native
    def resize(width: Double, height: Double): Unit = js.native
    def setActiveTab(container: PanelContainer): Unit = js.native
  }
  
  @js.native
  class TabPage protected () extends js.Object {
    def this(host: TabHost, container: PanelContainer) = this()
  }
  
  @js.native
  sealed trait TabStripDirection extends js.Object
  
  /* static members */
  @js.native
  object Dialog extends js.Object {
    def fromElement(id: String, dockManager: DockManager): Dialog = js.native
  }
  
  @js.native
  object TabStripDirection extends js.Object {
    @js.native
    sealed trait DIRECTION_BOTTOM extends TabStripDirection
    
    @js.native
    sealed trait DIRECTION_LEFT extends TabStripDirection
    
    @js.native
    sealed trait DIRECTION_RIGHT extends TabStripDirection
    
    @js.native
    sealed trait DIRECTION_TOP extends TabStripDirection
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TabStripDirection with Double] = js.native
    /* 1 */ @js.native
    object DIRECTION_BOTTOM extends TopLevel[DIRECTION_BOTTOM with Double]
    
    /* 2 */ @js.native
    object DIRECTION_LEFT extends TopLevel[DIRECTION_LEFT with Double]
    
    /* 3 */ @js.native
    object DIRECTION_RIGHT extends TopLevel[DIRECTION_RIGHT with Double]
    
    /* 0 */ @js.native
    object DIRECTION_TOP extends TopLevel[DIRECTION_TOP with Double]
    
  }
  
}

