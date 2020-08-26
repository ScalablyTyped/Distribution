package typings.dockSpawn

import typings.dockSpawn.dockspawn.TabStripDirection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object dockspawn extends js.Object {
    @js.native
    class Dialog protected ()
      extends typings.dockSpawn.dockspawn.Dialog {
      def this(
        panel: typings.dockSpawn.dockspawn.PanelContainer,
        dockManager: typings.dockSpawn.dockspawn.DockManager
      ) = this()
    }
    
    /**
      * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
      * It owns an HTMLDivElement inside which all panels are docked.
      * Initially the document manager takes up the central space and acts as the root node.
      */
    @js.native
    class DockManager protected ()
      extends typings.dockSpawn.dockspawn.DockManager {
      def this(element: HTMLDivElement) = this()
    }
    
    @js.native
    class DockManagerContext protected ()
      extends typings.dockSpawn.dockspawn.DockManagerContext {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
    }
    
    @js.native
    class DockModel ()
      extends typings.dockSpawn.dockspawn.DockModel
    
    @js.native
    class DockNode protected ()
      extends typings.dockSpawn.dockspawn.DockNode {
      def this(container: typings.dockSpawn.dockspawn.PanelContainer) = this()
    }
    
    /**
      * The document manager is then central area of the dock layout hierarchy.
      * This is where more important panels are placed (e.g. the text editor in an IDE,
      * 3D view in a modelling package etc
      */
    @js.native
    class DocumentManagerContainer protected ()
      extends typings.dockSpawn.dockspawn.DocumentManagerContainer {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
    }
    
    @js.native
    class FillDockContainer protected ()
      extends typings.dockSpawn.dockspawn.FillDockContainer {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager, tabStripDirection: TabStripDirection) = this()
    }
    
    @js.native
    class PanelContainer protected ()
      extends typings.dockSpawn.dockspawn.PanelContainer {
      def this(element: HTMLElement, dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
      def this(element: HTMLElement, dockManager: typings.dockSpawn.dockspawn.DockManager, title: String) = this()
    }
    
    /**
      * Tab Host control contains tabs known as TabPages.
      * The tab strip can be aligned in different orientations
      */
    @js.native
    class TabHost ()
      extends typings.dockSpawn.dockspawn.TabHost {
      def this(tabStripDirection: TabStripDirection) = this()
      def this(tabStripDirection: js.UndefOr[scala.Nothing], displayCloseButton: Boolean) = this()
      def this(tabStripDirection: TabStripDirection, displayCloseButton: Boolean) = this()
    }
    
    @js.native
    class TabPage protected ()
      extends typings.dockSpawn.dockspawn.TabPage {
      def this(host: typings.dockSpawn.dockspawn.TabHost, container: typings.dockSpawn.dockspawn.PanelContainer) = this()
    }
    
    /* static members */
    @js.native
    object Dialog extends js.Object {
      def fromElement(id: String, dockManager: typings.dockSpawn.dockspawn.DockManager): typings.dockSpawn.dockspawn.Dialog = js.native
    }
    
    @js.native
    object TabStripDirection extends js.Object {
      /* 1 */ val DIRECTION_BOTTOM: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_BOTTOM with Double = js.native
      /* 2 */ val DIRECTION_LEFT: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_LEFT with Double = js.native
      /* 3 */ val DIRECTION_RIGHT: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_RIGHT with Double = js.native
      /* 0 */ val DIRECTION_TOP: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_TOP with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.dockSpawn.dockspawn.TabStripDirection with Double] = js.native
    }
    
  }
  
}

