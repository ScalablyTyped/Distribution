package typings.dockSpawn

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dockspawn {
  
  @js.native
  sealed trait TabStripDirection extends StObject
  @JSGlobal("dockspawn.TabStripDirection")
  @js.native
  object TabStripDirection extends StObject {
    
    @js.native
    sealed trait DIRECTION_BOTTOM
      extends StObject
         with TabStripDirection
    
    @js.native
    sealed trait DIRECTION_LEFT
      extends StObject
         with TabStripDirection
    
    @js.native
    sealed trait DIRECTION_RIGHT
      extends StObject
         with TabStripDirection
    
    @js.native
    sealed trait DIRECTION_TOP
      extends StObject
         with TabStripDirection
  }
  
  trait Dialog extends StObject {
    
    def bringToFront(): Unit
    
    def resize(width: Double, height: Double): Unit
    
    def setPosition(x: Double, y: Double): Unit
    
    def setTitle(title: String): Unit
    
    def setTitleIcon(iconName: String): Unit
  }
  object Dialog {
    
    @scala.inline
    def apply(
      bringToFront: () => Unit,
      resize: (Double, Double) => Unit,
      setPosition: (Double, Double) => Unit,
      setTitle: String => Unit,
      setTitleIcon: String => Unit
    ): Dialog = {
      val __obj = js.Dynamic.literal(bringToFront = js.Any.fromFunction0(bringToFront), resize = js.Any.fromFunction2(resize), setPosition = js.Any.fromFunction2(setPosition), setTitle = js.Any.fromFunction1(setTitle), setTitleIcon = js.Any.fromFunction1(setTitleIcon))
      __obj.asInstanceOf[Dialog]
    }
    
    @scala.inline
    implicit class DialogMutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBringToFront(value: () => Unit): Self = StObject.set(x, "bringToFront", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResize(value: (Double, Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetPosition(value: (Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleIcon(value: String => Unit): Self = StObject.set(x, "setTitleIcon", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
    * It owns an HTMLDivElement inside which all panels are docked.
    * Initially the document manager takes up the central space and acts as the root node.
    */
  trait DockManager extends StObject {
    
    var context: DockManagerContext
    
    /** Dock the [dialog] below the [referenceNode] node */
    def dockDialogDown(referenceNode: DockNode, dialog: Dialog): DockNode
    
    /** Dock the [dialog] as a tab inside the [referenceNode] node */
    def dockDialogFill(referenceNode: DockNode, container: PanelContainer): DockNode
    
    /** Dock the [dialog] to the left of the [referenceNode] node */
    def dockDialogLeft(referenceNode: DockNode, dialog: Dialog): DockNode
    
    /** Dock the [dialog] to the right of the [referenceNode] node */
    def dockDialogRight(referenceNode: DockNode, dialog: Dialog): DockNode
    
    /** Dock the [dialog] above the [referenceNode] node */
    def dockDialogUp(referenceNode: DockNode, dialog: Dialog): DockNode
    
    /** Dock the [container] below the [referenceNode] node */
    def dockDown(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
    
    /** Dock the [container] as a tab inside the [referenceNode] node */
    def dockFill(referenceNode: DockNode, container: PanelContainer): DockNode
    
    /** Dock the [container] to the left of the [referenceNode] node */
    def dockLeft(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
    
    /** Dock the [container] to the right of the [referenceNode] node */
    def dockRight(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
    
    /** Dock the [container] above the [referenceNode] node */
    def dockUp(referenceNode: DockNode, container: PanelContainer, ratio: Double): DockNode
    
    def initialize(): Unit
    
    def invalidate(): Unit
    
    def loadState(state: String): Unit
    
    def rebuildLayout(node: DockNode): Unit
    
    def resize(width: Double, height: Double): Unit
    
    def resumeLayout(): Unit
    
    def saveState(): String
    
    /**
      * Reset the dock model. This happens when state is loaded from JSON.
      */
    def setModel(model: DockModel): Unit
    
    def setRootNode(node: DockNode): Unit
    
    def suspendLayout(): Unit
  }
  object DockManager {
    
    @scala.inline
    def apply(
      context: DockManagerContext,
      dockDialogDown: (DockNode, Dialog) => DockNode,
      dockDialogFill: (DockNode, PanelContainer) => DockNode,
      dockDialogLeft: (DockNode, Dialog) => DockNode,
      dockDialogRight: (DockNode, Dialog) => DockNode,
      dockDialogUp: (DockNode, Dialog) => DockNode,
      dockDown: (DockNode, PanelContainer, Double) => DockNode,
      dockFill: (DockNode, PanelContainer) => DockNode,
      dockLeft: (DockNode, PanelContainer, Double) => DockNode,
      dockRight: (DockNode, PanelContainer, Double) => DockNode,
      dockUp: (DockNode, PanelContainer, Double) => DockNode,
      initialize: () => Unit,
      invalidate: () => Unit,
      loadState: String => Unit,
      rebuildLayout: DockNode => Unit,
      resize: (Double, Double) => Unit,
      resumeLayout: () => Unit,
      saveState: () => String,
      setModel: DockModel => Unit,
      setRootNode: DockNode => Unit,
      suspendLayout: () => Unit
    ): DockManager = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], dockDialogDown = js.Any.fromFunction2(dockDialogDown), dockDialogFill = js.Any.fromFunction2(dockDialogFill), dockDialogLeft = js.Any.fromFunction2(dockDialogLeft), dockDialogRight = js.Any.fromFunction2(dockDialogRight), dockDialogUp = js.Any.fromFunction2(dockDialogUp), dockDown = js.Any.fromFunction3(dockDown), dockFill = js.Any.fromFunction2(dockFill), dockLeft = js.Any.fromFunction3(dockLeft), dockRight = js.Any.fromFunction3(dockRight), dockUp = js.Any.fromFunction3(dockUp), initialize = js.Any.fromFunction0(initialize), invalidate = js.Any.fromFunction0(invalidate), loadState = js.Any.fromFunction1(loadState), rebuildLayout = js.Any.fromFunction1(rebuildLayout), resize = js.Any.fromFunction2(resize), resumeLayout = js.Any.fromFunction0(resumeLayout), saveState = js.Any.fromFunction0(saveState), setModel = js.Any.fromFunction1(setModel), setRootNode = js.Any.fromFunction1(setRootNode), suspendLayout = js.Any.fromFunction0(suspendLayout))
      __obj.asInstanceOf[DockManager]
    }
    
    @scala.inline
    implicit class DockManagerMutableBuilder[Self <: DockManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: DockManagerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockDialogDown(value: (DockNode, Dialog) => DockNode): Self = StObject.set(x, "dockDialogDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDockDialogFill(value: (DockNode, PanelContainer) => DockNode): Self = StObject.set(x, "dockDialogFill", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDockDialogLeft(value: (DockNode, Dialog) => DockNode): Self = StObject.set(x, "dockDialogLeft", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDockDialogRight(value: (DockNode, Dialog) => DockNode): Self = StObject.set(x, "dockDialogRight", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDockDialogUp(value: (DockNode, Dialog) => DockNode): Self = StObject.set(x, "dockDialogUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDockDown(value: (DockNode, PanelContainer, Double) => DockNode): Self = StObject.set(x, "dockDown", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDockFill(value: (DockNode, PanelContainer) => DockNode): Self = StObject.set(x, "dockFill", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDockLeft(value: (DockNode, PanelContainer, Double) => DockNode): Self = StObject.set(x, "dockLeft", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDockRight(value: (DockNode, PanelContainer, Double) => DockNode): Self = StObject.set(x, "dockRight", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDockUp(value: (DockNode, PanelContainer, Double) => DockNode): Self = StObject.set(x, "dockUp", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadState(value: String => Unit): Self = StObject.set(x, "loadState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRebuildLayout(value: DockNode => Unit): Self = StObject.set(x, "rebuildLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResize(value: (Double, Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResumeLayout(value: () => Unit): Self = StObject.set(x, "resumeLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveState(value: () => String): Self = StObject.set(x, "saveState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetModel(value: DockModel => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRootNode(value: DockNode => Unit): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuspendLayout(value: () => Unit): Self = StObject.set(x, "suspendLayout", js.Any.fromFunction0(value))
    }
  }
  
  trait DockManagerContext extends StObject {
    
    var dockManager: DockManager
    
    var documentManagerView: DocumentManagerContainer
    
    var model: DockModel
  }
  object DockManagerContext {
    
    @scala.inline
    def apply(dockManager: DockManager, documentManagerView: DocumentManagerContainer, model: DockModel): DockManagerContext = {
      val __obj = js.Dynamic.literal(dockManager = dockManager.asInstanceOf[js.Any], documentManagerView = documentManagerView.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[DockManagerContext]
    }
    
    @scala.inline
    implicit class DockManagerContextMutableBuilder[Self <: DockManagerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDockManager(value: DockManager): Self = StObject.set(x, "dockManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentManagerView(value: DocumentManagerContainer): Self = StObject.set(x, "documentManagerView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: DockModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  trait DockModel extends StObject {
    
    var documentManagerNode: DockNode
    
    var rootNode: DockNode
  }
  object DockModel {
    
    @scala.inline
    def apply(documentManagerNode: DockNode, rootNode: DockNode): DockModel = {
      val __obj = js.Dynamic.literal(documentManagerNode = documentManagerNode.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[DockModel]
    }
    
    @scala.inline
    implicit class DockModelMutableBuilder[Self <: DockModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentManagerNode(value: DockNode): Self = StObject.set(x, "documentManagerNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNode(value: DockNode): Self = StObject.set(x, "rootNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait DockNode extends StObject {
    
    def detachFromParent(): Unit
  }
  object DockNode {
    
    @scala.inline
    def apply(detachFromParent: () => Unit): DockNode = {
      val __obj = js.Dynamic.literal(detachFromParent = js.Any.fromFunction0(detachFromParent))
      __obj.asInstanceOf[DockNode]
    }
    
    @scala.inline
    implicit class DockNodeMutableBuilder[Self <: DockNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetachFromParent(value: () => Unit): Self = StObject.set(x, "detachFromParent", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The document manager is then central area of the dock layout hierarchy.
    * This is where more important panels are placed (e.g. the text editor in an IDE,
    * 3D view in a modelling package etc
    */
  trait DocumentManagerContainer
    extends StObject
       with FillDockContainer {
    
    def saveState(state: String): Unit
    
    var selectedTab: TabPage
  }
  object DocumentManagerContainer {
    
    @scala.inline
    def apply(
      containerType: String,
      dockManager: DockManager,
      element: HTMLDivElement,
      minimumAllowedChildNodes: Double,
      name: String,
      saveState: String => Unit,
      selectedTab: TabPage,
      tabHost: TabHost,
      tabOrientation: TabStripDirection
    ): DocumentManagerContainer = {
      val __obj = js.Dynamic.literal(containerType = containerType.asInstanceOf[js.Any], dockManager = dockManager.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], minimumAllowedChildNodes = minimumAllowedChildNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], saveState = js.Any.fromFunction1(saveState), selectedTab = selectedTab.asInstanceOf[js.Any], tabHost = tabHost.asInstanceOf[js.Any], tabOrientation = tabOrientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentManagerContainer]
    }
    
    @scala.inline
    implicit class DocumentManagerContainerMutableBuilder[Self <: DocumentManagerContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSaveState(value: String => Unit): Self = StObject.set(x, "saveState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectedTab(value: TabPage): Self = StObject.set(x, "selectedTab", value.asInstanceOf[js.Any])
    }
  }
  
  trait FillDockContainer extends StObject {
    
    var containerType: String
    
    var dockManager: DockManager
    
    var element: HTMLDivElement
    
    var minimumAllowedChildNodes: Double
    
    var name: String
    
    var tabHost: TabHost
    
    var tabOrientation: TabStripDirection
  }
  object FillDockContainer {
    
    @scala.inline
    def apply(
      containerType: String,
      dockManager: DockManager,
      element: HTMLDivElement,
      minimumAllowedChildNodes: Double,
      name: String,
      tabHost: TabHost,
      tabOrientation: TabStripDirection
    ): FillDockContainer = {
      val __obj = js.Dynamic.literal(containerType = containerType.asInstanceOf[js.Any], dockManager = dockManager.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], minimumAllowedChildNodes = minimumAllowedChildNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabHost = tabHost.asInstanceOf[js.Any], tabOrientation = tabOrientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillDockContainer]
    }
    
    @scala.inline
    implicit class FillDockContainerMutableBuilder[Self <: FillDockContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerType(value: String): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockManager(value: DockManager): Self = StObject.set(x, "dockManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: HTMLDivElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumAllowedChildNodes(value: Double): Self = StObject.set(x, "minimumAllowedChildNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabHost(value: TabHost): Self = StObject.set(x, "tabHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabOrientation(value: TabStripDirection): Self = StObject.set(x, "tabOrientation", value.asInstanceOf[js.Any])
    }
  }
  
  trait PanelContainer extends StObject {
    
    var height: Double
    
    def setTitle(title: String): Unit
    
    def setTitleIcon(iconName: String): Unit
    
    var width: Double
  }
  object PanelContainer {
    
    @scala.inline
    def apply(height: Double, setTitle: String => Unit, setTitleIcon: String => Unit, width: Double): PanelContainer = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], setTitle = js.Any.fromFunction1(setTitle), setTitleIcon = js.Any.fromFunction1(setTitleIcon), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelContainer]
    }
    
    @scala.inline
    implicit class PanelContainerMutableBuilder[Self <: PanelContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleIcon(value: String => Unit): Self = StObject.set(x, "setTitleIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Tab Host control contains tabs known as TabPages.
    * The tab strip can be aligned in different orientations
    */
  trait TabHost extends StObject {
    
    var contentElement: HTMLDivElement
    
    var displayCloseButton: Boolean
    
    var hostElement: HTMLDivElement
    
    /** Set the selected TabPage. */
    def onTabPageSelected(page: TabPage): Unit
    
    var pages: js.Array[TabPage]
    
    def resize(width: Double, height: Double): Unit
    
    var separatorElement: HTMLDivElement
    
    def setActiveTab(container: PanelContainer): Unit
    
    var tabListElement: HTMLDivElement
    
    var tabStripDirection: TabStripDirection
  }
  object TabHost {
    
    @scala.inline
    def apply(
      contentElement: HTMLDivElement,
      displayCloseButton: Boolean,
      hostElement: HTMLDivElement,
      onTabPageSelected: TabPage => Unit,
      pages: js.Array[TabPage],
      resize: (Double, Double) => Unit,
      separatorElement: HTMLDivElement,
      setActiveTab: PanelContainer => Unit,
      tabListElement: HTMLDivElement,
      tabStripDirection: TabStripDirection
    ): TabHost = {
      val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], displayCloseButton = displayCloseButton.asInstanceOf[js.Any], hostElement = hostElement.asInstanceOf[js.Any], onTabPageSelected = js.Any.fromFunction1(onTabPageSelected), pages = pages.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), separatorElement = separatorElement.asInstanceOf[js.Any], setActiveTab = js.Any.fromFunction1(setActiveTab), tabListElement = tabListElement.asInstanceOf[js.Any], tabStripDirection = tabStripDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabHost]
    }
    
    @scala.inline
    implicit class TabHostMutableBuilder[Self <: TabHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentElement(value: HTMLDivElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayCloseButton(value: Boolean): Self = StObject.set(x, "displayCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostElement(value: HTMLDivElement): Self = StObject.set(x, "hostElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTabPageSelected(value: TabPage => Unit): Self = StObject.set(x, "onTabPageSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPages(value: js.Array[TabPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: TabPage*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setResize(value: (Double, Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeparatorElement(value: HTMLDivElement): Self = StObject.set(x, "separatorElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActiveTab(value: PanelContainer => Unit): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabListElement(value: HTMLDivElement): Self = StObject.set(x, "tabListElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStripDirection(value: TabStripDirection): Self = StObject.set(x, "tabStripDirection", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabPage extends StObject
}
