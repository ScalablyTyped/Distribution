package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult
import typings.forgeViewer.Autodesk.Viewing.UI.ContentSize
import typings.forgeViewer.Autodesk.Viewing.UI.DockingPanelOptions
import typings.forgeViewer.Autodesk.Viewing.UI.ResizeOptions
import typings.forgeViewer.Autodesk.Viewing.UI.ScrollContainerOptions
import typings.forgeViewer.anon.ForceSnapEdges
import typings.forgeViewer.anon.X
import typings.std.ClientRect
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  object Snapping {
    
    @JSGlobal("Autodesk.Viewing.Extensions.Snapping.Snapper")
    @js.native
    class Snapper protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Viewing.Extensions.Snapping.Snapper {
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D, options: ForceSnapEdges) = this()
      
      /* CompleteClass */
      override def activate(): Unit = js.native
      
      /* CompleteClass */
      override def clearSnapped(): Unit = js.native
      
      /* CompleteClass */
      override def copyResults(destiny: js.Any): Unit = js.native
      
      /* CompleteClass */
      override def deactivate(): Unit = js.native
      
      /* CompleteClass */
      override def getEdge(): js.Any = js.native
      
      /* CompleteClass */
      override def getGeometry(): js.Any = js.native
      
      /* CompleteClass */
      override def getSnapResult(): SnapResult = js.native
      
      /* CompleteClass */
      override def getVertex(): js.Any = js.native
      
      /* CompleteClass */
      var indicator: typings.forgeViewer.Autodesk.Viewing.Extensions.Snapping.SnapperIndicator = js.native
      
      /* CompleteClass */
      override def isActive(): Boolean = js.native
      
      /* CompleteClass */
      override def isSnapped(): Boolean = js.native
      
      /* CompleteClass */
      override def onMouseMove(mousePosition: X): Boolean = js.native
    }
    
    @JSGlobal("Autodesk.Viewing.Extensions.Snapping.SnapperIndicator")
    @js.native
    class SnapperIndicator protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Viewing.Extensions.Snapping.SnapperIndicator {
      def this(
        viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D,
        snapper: typings.forgeViewer.Autodesk.Viewing.Extensions.Snapping.Snapper
      ) = this()
      
      /* CompleteClass */
      override def clearOverlays(): Unit = js.native
      
      /* CompleteClass */
      override def onCameraChange(): Unit = js.native
      
      /* CompleteClass */
      override def render(): Unit = js.native
    }
  }
  
  @JSGlobal("Autodesk.Viewing.Extensions.ViewerPropertyPanel")
  @js.native
  class ViewerPropertyPanel protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Extensions.ViewerPropertyPanel {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.GuiViewer3D) = this()
    
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
}
