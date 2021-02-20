package typings.dockSpawn

import typings.dockSpawn.dockspawn.TabStripDirection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dockspawn {
    
    @JSGlobal("dockspawn.Dialog")
    @js.native
    class Dialog protected ()
      extends typings.dockSpawn.dockspawn.Dialog {
      def this(
        panel: typings.dockSpawn.dockspawn.PanelContainer,
        dockManager: typings.dockSpawn.dockspawn.DockManager
      ) = this()
    }
    object Dialog {
      
      /* static member */
      @JSGlobal("dockspawn.Dialog.fromElement")
      @js.native
      def fromElement(id: String, dockManager: typings.dockSpawn.dockspawn.DockManager): typings.dockSpawn.dockspawn.Dialog = js.native
    }
    
    /**
      * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
      * It owns an HTMLDivElement inside which all panels are docked.
      * Initially the document manager takes up the central space and acts as the root node.
      */
    @JSGlobal("dockspawn.DockManager")
    @js.native
    class DockManager protected ()
      extends typings.dockSpawn.dockspawn.DockManager {
      def this(element: HTMLDivElement) = this()
    }
    
    @JSGlobal("dockspawn.DockManagerContext")
    @js.native
    class DockManagerContext protected ()
      extends typings.dockSpawn.dockspawn.DockManagerContext {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
    }
    
    @JSGlobal("dockspawn.DockModel")
    @js.native
    class DockModel ()
      extends typings.dockSpawn.dockspawn.DockModel
    
    @JSGlobal("dockspawn.DockNode")
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
    @JSGlobal("dockspawn.DocumentManagerContainer")
    @js.native
    class DocumentManagerContainer protected ()
      extends typings.dockSpawn.dockspawn.DocumentManagerContainer {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
    }
    
    @JSGlobal("dockspawn.FillDockContainer")
    @js.native
    class FillDockContainer protected ()
      extends typings.dockSpawn.dockspawn.FillDockContainer {
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager) = this()
      def this(dockManager: typings.dockSpawn.dockspawn.DockManager, tabStripDirection: TabStripDirection) = this()
    }
    
    @JSGlobal("dockspawn.PanelContainer")
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
    @JSGlobal("dockspawn.TabHost")
    @js.native
    class TabHost ()
      extends typings.dockSpawn.dockspawn.TabHost {
      def this(tabStripDirection: TabStripDirection) = this()
      def this(tabStripDirection: js.UndefOr[scala.Nothing], displayCloseButton: Boolean) = this()
      def this(tabStripDirection: TabStripDirection, displayCloseButton: Boolean) = this()
    }
    
    @JSGlobal("dockspawn.TabPage")
    @js.native
    class TabPage protected ()
      extends typings.dockSpawn.dockspawn.TabPage {
      def this(host: typings.dockSpawn.dockspawn.TabHost, container: typings.dockSpawn.dockspawn.PanelContainer) = this()
    }
    
    @JSGlobal("dockspawn.TabStripDirection")
    @js.native
    object TabStripDirection extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.dockSpawn.dockspawn.TabStripDirection with Double] = js.native
      
      /* 1 */ val DIRECTION_BOTTOM: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_BOTTOM with Double = js.native
      
      /* 2 */ val DIRECTION_LEFT: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_LEFT with Double = js.native
      
      /* 3 */ val DIRECTION_RIGHT: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_RIGHT with Double = js.native
      
      /* 0 */ val DIRECTION_TOP: typings.dockSpawn.dockspawn.TabStripDirection.DIRECTION_TOP with Double = js.native
    }
  }
}
