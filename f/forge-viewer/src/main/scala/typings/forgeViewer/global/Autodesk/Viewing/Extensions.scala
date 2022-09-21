package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult
import typings.forgeViewer.Autodesk.Viewing.Private.Viewer3DImpl
import typings.forgeViewer.anon.AddEventListener
import typings.forgeViewer.anon.EnableBrowserNavigation
import typings.forgeViewer.anon.ForceSnapEdges
import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  @JSGlobal("Autodesk.Viewing.Extensions")
  @js.native
  val ^ : js.Any = js.native
  
  object Multipage {
    
    object Events {
      
      @JSGlobal("Autodesk.Viewing.Extensions.Multipage.Events.FocusedPageChanged")
      @js.native
      val FocusedPageChanged: /* "focusedPageChanged" */ String = js.native
      
      @JSGlobal("Autodesk.Viewing.Extensions.Multipage.Events.PageLoaded")
      @js.native
      val PageLoaded: /* "pageLoaded" */ String = js.native
    }
    
    @JSGlobal("Autodesk.Viewing.Extensions.Multipage.MultipageExtension")
    @js.native
    open class MultipageExtension protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Viewing.Extensions.Multipage.MultipageExtension {
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D, options: Any) = this()
    }
  }
  
  object PDF {
    
    @JSGlobal("Autodesk.Viewing.Extensions.PDF.PDFExtension")
    @js.native
    open class PDFExtension protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Viewing.Extension {
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D, options: EnableBrowserNavigation) = this()
    }
    
    @JSGlobal("Autodesk.Viewing.Extensions.PDF.PDFLoader")
    @js.native
    open class PDFLoader protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Viewing.Extensions.PDF.PDFLoader {
      def this(parent: Viewer3DImpl) = this()
      
      /* CompleteClass */
      override def createPDFDocument(pdf: Any): typings.forgeViewer.Autodesk.Viewing.Document = js.native
      
      /* CompleteClass */
      override def getDocument(): Any = js.native
    }
  }
  
  object Snapping {
    
    @JSGlobal("Autodesk.Viewing.Extensions.Snapping.Snapper")
    @js.native
    open class Snapper protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.Viewing.Extensions.Snapping.Snapper {
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
      def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D, options: ForceSnapEdges) = this()
      
      /* CompleteClass */
      override def activate(): Unit = js.native
      
      /* CompleteClass */
      override def clearSnapped(): Unit = js.native
      
      /* CompleteClass */
      override def copyResults(destiny: Any): Unit = js.native
      
      /* CompleteClass */
      override def deactivate(): Unit = js.native
      
      /* CompleteClass */
      override def getArc(): Boolean = js.native
      
      /* CompleteClass */
      override def getEdge(): Any = js.native
      
      /* CompleteClass */
      override def getGeometry(): Any = js.native
      
      /* CompleteClass */
      override def getGeometryType(): Double = js.native
      
      /* CompleteClass */
      override def getIntersectPoint(): Any = js.native
      
      /* CompleteClass */
      override def getName(): String = js.native
      
      /* CompleteClass */
      override def getNames(): js.Array[String] = js.native
      
      /* CompleteClass */
      override def getPriority(): Double = js.native
      
      /* CompleteClass */
      override def getSnapResult(): SnapResult = js.native
      
      /* CompleteClass */
      override def getSnapToArc(): Boolean = js.native
      
      /* CompleteClass */
      override def getSnapToPixel(): Boolean = js.native
      
      /* CompleteClass */
      override def getVertex(): Any = js.native
      
      /* CompleteClass */
      var indicator: typings.forgeViewer.Autodesk.Viewing.Extensions.Snapping.SnapperIndicator = js.native
      
      /* CompleteClass */
      override def isActive(): Boolean = js.native
      
      /* CompleteClass */
      override def isSnapped(): Boolean = js.native
      
      /* CompleteClass */
      override def onMouseDown(mousePosition: X): Boolean = js.native
      
      /* CompleteClass */
      override def onMouseMove(mousePosition: X): Boolean = js.native
      
      /* CompleteClass */
      override def setArc(isArc: Boolean): Boolean = js.native
      
      /* CompleteClass */
      override def setSnapToArc(enable: Boolean): Unit = js.native
      
      /* CompleteClass */
      override def setSnapToPixel(enable: Boolean): Unit = js.native
      
      /* CompleteClass */
      override def setViewportId(vpId: Double): Unit = js.native
    }
    
    @JSGlobal("Autodesk.Viewing.Extensions.Snapping.SnapperIndicator")
    @js.native
    open class SnapperIndicator protected ()
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
  
  @JSGlobal("Autodesk.Viewing.Extensions.ViewerModelStructurePanel")
  @js.native
  open class ViewerModelStructurePanel protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Extensions.ViewerModelStructurePanel {
    def this(options: AddEventListener) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Extensions.ViewerPropertyPanel")
  @js.native
  open class ViewerPropertyPanel protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Extensions.ViewerPropertyPanel {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.GuiViewer3D) = this()
  }
  
  inline def generateDefaultViewerHandlerOptions(viewer: typings.forgeViewer.Autodesk.Viewing.GuiViewer3D): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDefaultViewerHandlerOptions")(viewer.asInstanceOf[js.Any]).asInstanceOf[Any]
}
