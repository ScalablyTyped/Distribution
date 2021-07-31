package typings.dockSpawn

import typings.dockSpawn.dockspawn.TabStripDirection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dockspawn {
    
    @JSGlobal("dockspawn.Dialog")
    @js.native
    class Dialog protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.Dialog {
      def this(
        panel: typings.dockSpawn.dockspawn.PanelContainer,
        dockManager: typings.dockSpawn.dockspawn.DockManager
      ) = this()
      
      /* CompleteClass */
      override def bringToFront(): Unit = js.native
      
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      
      /* CompleteClass */
      override def setPosition(x: Double, y: Double): Unit = js.native
      
      /* CompleteClass */
      override def setTitle(title: String): Unit = js.native
      
      /* CompleteClass */
      override def setTitleIcon(iconName: String): Unit = js.native
    }
    object Dialog {
      
      @JSGlobal("dockspawn.Dialog")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @scala.inline
      def fromElement(id: String, dockManager: typings.dockSpawn.dockspawn.DockManager): typings.dockSpawn.dockspawn.Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(id.asInstanceOf[js.Any], dockManager.asInstanceOf[js.Any])).asInstanceOf[typings.dockSpawn.dockspawn.Dialog]
    }
    
    /**
      * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
      * It owns an HTMLDivElement inside which all panels are docked.
      * Initially the document manager takes up the central space and acts as the root node.
      */
    @JSGlobal("dockspawn.DockManager")
    @js.native
    class DockManager protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.DockManager {
      def this(element: HTMLDivElement) = this()
      
      /* CompleteClass */
      var context: typings.dockSpawn.dockspawn.DockManagerContext = js.native
      
      /** Dock the [dialog] below the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogDown(referenceNode: typings.dockSpawn.dockspawn.DockNode, dialog: typings.dockSpawn.dockspawn.Dialog): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] as a tab inside the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogFill(
        referenceNode: typings.dockSpawn.dockspawn.DockNode,
        container: typings.dockSpawn.dockspawn.PanelContainer
      ): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] to the left of the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogLeft(referenceNode: typings.dockSpawn.dockspawn.DockNode, dialog: typings.dockSpawn.dockspawn.Dialog): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] to the right of the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogRight(referenceNode: typings.dockSpawn.dockspawn.DockNode, dialog: typings.dockSpawn.dockspawn.Dialog): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] above the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogUp(referenceNode: typings.dockSpawn.dockspawn.DockNode, dialog: typings.dockSpawn.dockspawn.Dialog): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] below the [referenceNode] node */
      /* CompleteClass */
      override def dockDown(
        referenceNode: typings.dockSpawn.dockspawn.DockNode,
        container: typings.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] as a tab inside the [referenceNode] node */
      /* CompleteClass */
      override def dockFill(
        referenceNode: typings.dockSpawn.dockspawn.DockNode,
        container: typings.dockSpawn.dockspawn.PanelContainer
      ): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] to the left of the [referenceNode] node */
      /* CompleteClass */
      override def dockLeft(
        referenceNode: typings.dockSpawn.dockspawn.DockNode,
        container: typings.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] to the right of the [referenceNode] node */
      /* CompleteClass */
      override def dockRight(
        referenceNode: typings.dockSpawn.dockspawn.DockNode,
        container: typings.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] above the [referenceNode] node */
      /* CompleteClass */
      override def dockUp(
        referenceNode: typings.dockSpawn.dockspawn.DockNode,
        container: typings.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typings.dockSpawn.dockspawn.DockNode = js.native
      
      /* CompleteClass */
      override def initialize(): Unit = js.native
      
      /* CompleteClass */
      override def invalidate(): Unit = js.native
      
      /* CompleteClass */
      override def loadState(state: String): Unit = js.native
      
      /* CompleteClass */
      override def rebuildLayout(node: typings.dockSpawn.dockspawn.DockNode): Unit = js.native
      
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      
      /* CompleteClass */
      override def resumeLayout(): Unit = js.native
      
      /* CompleteClass */
      override def saveState(): String = js.native
      
      /**
        * Reset the dock model. This happens when state is loaded from JSON.
        */
      /* CompleteClass */
      override def setModel(model: typings.dockSpawn.dockspawn.DockModel): Unit = js.native
      
      /* CompleteClass */
      override def setRootNode(node: typings.dockSpawn.dockspawn.DockNode): Unit = js.native
      
      /* CompleteClass */
      override def suspendLayout(): Unit = js.native
    }
    
    @JSGlobal("dockspawn.DockManagerContext")
    @js.native
    class DockManagerContext protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.DockManagerContext {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
      
      /* CompleteClass */
      var dockManager: typings.dockSpawn.dockspawn.DockManager = js.native
      
      /* CompleteClass */
      var documentManagerView: typings.dockSpawn.dockspawn.DocumentManagerContainer = js.native
      
      /* CompleteClass */
      var model: typings.dockSpawn.dockspawn.DockModel = js.native
    }
    
    @JSGlobal("dockspawn.DockModel")
    @js.native
    class DockModel ()
      extends StObject
         with typings.dockSpawn.dockspawn.DockModel {
      
      /* CompleteClass */
      var documentManagerNode: typings.dockSpawn.dockspawn.DockNode = js.native
      
      /* CompleteClass */
      var rootNode: typings.dockSpawn.dockspawn.DockNode = js.native
    }
    
    @JSGlobal("dockspawn.DockNode")
    @js.native
    class DockNode protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.DockNode {
      def this(container: typings.dockSpawn.dockspawn.PanelContainer) = this()
      
      /* CompleteClass */
      override def detachFromParent(): Unit = js.native
    }
    
    /**
      * The document manager is then central area of the dock layout hierarchy.
      * This is where more important panels are placed (e.g. the text editor in an IDE,
      * 3D view in a modelling package etc
      */
    @JSGlobal("dockspawn.DocumentManagerContainer")
    @js.native
    class DocumentManagerContainer protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.DocumentManagerContainer {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
      
      /* CompleteClass */
      var containerType: String = js.native
      
      /* CompleteClass */
      var dockManager: typings.dockSpawn.dockspawn.DockManager = js.native
      
      /* CompleteClass */
      var element: HTMLDivElement = js.native
      
      /* CompleteClass */
      var minimumAllowedChildNodes: Double = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override def saveState(state: String): Unit = js.native
      
      /* CompleteClass */
      var selectedTab: typings.dockSpawn.dockspawn.TabPage = js.native
      
      /* CompleteClass */
      var tabHost: typings.dockSpawn.dockspawn.TabHost = js.native
      
      /* CompleteClass */
      var tabOrientation: TabStripDirection = js.native
    }
    
    @JSGlobal("dockspawn.FillDockContainer")
    @js.native
    class FillDockContainer protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.FillDockContainer {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager, tabStripDirection: TabStripDirection) = this()
      
      /* CompleteClass */
      var containerType: String = js.native
      
      /* CompleteClass */
      var dockManager: typings.dockSpawn.dockspawn.DockManager = js.native
      
      /* CompleteClass */
      var element: HTMLDivElement = js.native
      
      /* CompleteClass */
      var minimumAllowedChildNodes: Double = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var tabHost: typings.dockSpawn.dockspawn.TabHost = js.native
      
      /* CompleteClass */
      var tabOrientation: TabStripDirection = js.native
    }
    
    @JSGlobal("dockspawn.PanelContainer")
    @js.native
    class PanelContainer protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.PanelContainer {
      def this(element: HTMLElement, dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
      def this(element: HTMLElement, dockManager: typings.dockSpawn.dockspawn.DockManager, title: String) = this()
      
      /* CompleteClass */
      var height: Double = js.native
      
      /* CompleteClass */
      override def setTitle(title: String): Unit = js.native
      
      /* CompleteClass */
      override def setTitleIcon(iconName: String): Unit = js.native
      
      /* CompleteClass */
      var width: Double = js.native
    }
    
    /**
      * Tab Host control contains tabs known as TabPages.
      * The tab strip can be aligned in different orientations
      */
    @JSGlobal("dockspawn.TabHost")
    @js.native
    class TabHost ()
      extends StObject
         with typings.dockSpawn.dockspawn.TabHost {
      def this(tabStripDirection: TabStripDirection) = this()
      def this(tabStripDirection: Unit, displayCloseButton: Boolean) = this()
      def this(tabStripDirection: TabStripDirection, displayCloseButton: Boolean) = this()
      
      /* CompleteClass */
      var contentElement: HTMLDivElement = js.native
      
      /* CompleteClass */
      var displayCloseButton: Boolean = js.native
      
      /* CompleteClass */
      var hostElement: HTMLDivElement = js.native
      
      /** Set the selected TabPage. */
      /* CompleteClass */
      override def onTabPageSelected(page: typings.dockSpawn.dockspawn.TabPage): Unit = js.native
      
      /* CompleteClass */
      var pages: js.Array[typings.dockSpawn.dockspawn.TabPage] = js.native
      
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      
      /* CompleteClass */
      var separatorElement: HTMLDivElement = js.native
      
      /* CompleteClass */
      override def setActiveTab(container: typings.dockSpawn.dockspawn.PanelContainer): Unit = js.native
      
      /* CompleteClass */
      var tabListElement: HTMLDivElement = js.native
      
      /* CompleteClass */
      var tabStripDirection: TabStripDirection = js.native
    }
    
    @JSGlobal("dockspawn.TabPage")
    @js.native
    class TabPage protected ()
      extends StObject
         with typings.dockSpawn.dockspawn.TabPage {
      def this(host: typings.dockSpawn.dockspawn.TabHost, container: typings.dockSpawn.dockspawn.PanelContainer) = this()
    }
    
    @JSGlobal("dockspawn.TabStripDirection")
    @js.native
    object TabStripDirection extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.dockSpawn.dockspawn.TabStripDirection & Double] = js.native
      
      /* 1 */ val DIRECTION_BOTTOM: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_BOTTOM & Double = js.native
      
      /* 2 */ val DIRECTION_LEFT: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_LEFT & Double = js.native
      
      /* 3 */ val DIRECTION_RIGHT: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_RIGHT & Double = js.native
      
      /* 0 */ val DIRECTION_TOP: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_TOP & Double = js.native
    }
  }
}
