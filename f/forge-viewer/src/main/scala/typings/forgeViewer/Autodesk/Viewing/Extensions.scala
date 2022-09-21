package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult
import typings.forgeViewer.Autodesk.Viewing.UI.ModelStructurePanel
import typings.forgeViewer.Autodesk.Viewing.UI.PropertyPanel
import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  object Multipage {
    
    @js.native
    trait MultipageExtension
      extends StObject
         with Extension {
      
      def focusFirstPage(): String = js.native
      
      def focusLastPage(): String = js.native
      
      def focusNextPage(): String = js.native
      
      def focusOnPage(pageToFocus: Any): String = js.native
      def focusOnPage(pageToFocus: Any, immediate: Boolean): String = js.native
      
      def focusPrevPage(): String = js.native
      
      var focusedPage: Any = js.native
      
      def getAllPages(): js.Array[Any] = js.native
      
      def getCurrentPageIndex(): Double = js.native
      
      def getFocusedPage(): Any = js.native
      
      def getNearestPages(): js.Array[Any] = js.native
      
      def isPageInView(page: Any): Boolean = js.native
      
      def isPageLoaded(page: Any): Boolean = js.native
      
      def loadFocusedPage(): js.Promise[Unit] = js.native
      
      var mode: String = js.native
      
      var modes: js.Array[String] = js.native
      
      var multipageTool: ToolInterface = js.native
      
      var name: String = js.native
    }
  }
  
  object PDF {
    
    type PDFExtension = Extension
    
    trait PDFLoader extends StObject {
      
      def createPDFDocument(pdf: Any): Document
      
      def getDocument(): Any
    }
    object PDFLoader {
      
      inline def apply(createPDFDocument: Any => Document, getDocument: () => Any): PDFLoader = {
        val __obj = js.Dynamic.literal(createPDFDocument = js.Any.fromFunction1(createPDFDocument), getDocument = js.Any.fromFunction0(getDocument))
        __obj.asInstanceOf[PDFLoader]
      }
      
      extension [Self <: PDFLoader](x: Self) {
        
        inline def setCreatePDFDocument(value: Any => Document): Self = StObject.set(x, "createPDFDocument", js.Any.fromFunction1(value))
        
        inline def setGetDocument(value: () => Any): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
      }
    }
  }
  
  object Snapping {
    
    trait Snapper extends StObject {
      
      def activate(): Unit
      
      def clearSnapped(): Unit
      
      def copyResults(destiny: Any): Unit
      
      def deactivate(): Unit
      
      def getArc(): Boolean
      
      def getEdge(): Any
      
      def getGeometry(): Any
      
      def getGeometryType(): Double
      
      def getIntersectPoint(): Any
      
      def getName(): String
      
      def getNames(): js.Array[String]
      
      def getPriority(): Double
      
      def getSnapResult(): SnapResult
      
      def getSnapToArc(): Boolean
      
      def getSnapToPixel(): Boolean
      
      def getVertex(): Any
      
      var indicator: SnapperIndicator
      
      def isActive(): Boolean
      
      def isSnapped(): Boolean
      
      def onMouseDown(mousePosition: X): Boolean
      
      def onMouseMove(mousePosition: X): Boolean
      
      def setArc(isArc: Boolean): Boolean
      
      def setSnapToArc(enable: Boolean): Unit
      
      def setSnapToPixel(enable: Boolean): Unit
      
      def setViewportId(vpId: Double): Unit
    }
    object Snapper {
      
      inline def apply(
        activate: () => Unit,
        clearSnapped: () => Unit,
        copyResults: Any => Unit,
        deactivate: () => Unit,
        getArc: () => Boolean,
        getEdge: () => Any,
        getGeometry: () => Any,
        getGeometryType: () => Double,
        getIntersectPoint: () => Any,
        getName: () => String,
        getNames: () => js.Array[String],
        getPriority: () => Double,
        getSnapResult: () => SnapResult,
        getSnapToArc: () => Boolean,
        getSnapToPixel: () => Boolean,
        getVertex: () => Any,
        indicator: SnapperIndicator,
        isActive: () => Boolean,
        isSnapped: () => Boolean,
        onMouseDown: X => Boolean,
        onMouseMove: X => Boolean,
        setArc: Boolean => Boolean,
        setSnapToArc: Boolean => Unit,
        setSnapToPixel: Boolean => Unit,
        setViewportId: Double => Unit
      ): Snapper = {
        val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), clearSnapped = js.Any.fromFunction0(clearSnapped), copyResults = js.Any.fromFunction1(copyResults), deactivate = js.Any.fromFunction0(deactivate), getArc = js.Any.fromFunction0(getArc), getEdge = js.Any.fromFunction0(getEdge), getGeometry = js.Any.fromFunction0(getGeometry), getGeometryType = js.Any.fromFunction0(getGeometryType), getIntersectPoint = js.Any.fromFunction0(getIntersectPoint), getName = js.Any.fromFunction0(getName), getNames = js.Any.fromFunction0(getNames), getPriority = js.Any.fromFunction0(getPriority), getSnapResult = js.Any.fromFunction0(getSnapResult), getSnapToArc = js.Any.fromFunction0(getSnapToArc), getSnapToPixel = js.Any.fromFunction0(getSnapToPixel), getVertex = js.Any.fromFunction0(getVertex), indicator = indicator.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), isSnapped = js.Any.fromFunction0(isSnapped), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), setArc = js.Any.fromFunction1(setArc), setSnapToArc = js.Any.fromFunction1(setSnapToArc), setSnapToPixel = js.Any.fromFunction1(setSnapToPixel), setViewportId = js.Any.fromFunction1(setViewportId))
        __obj.asInstanceOf[Snapper]
      }
      
      extension [Self <: Snapper](x: Self) {
        
        inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
        
        inline def setClearSnapped(value: () => Unit): Self = StObject.set(x, "clearSnapped", js.Any.fromFunction0(value))
        
        inline def setCopyResults(value: Any => Unit): Self = StObject.set(x, "copyResults", js.Any.fromFunction1(value))
        
        inline def setDeactivate(value: () => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction0(value))
        
        inline def setGetArc(value: () => Boolean): Self = StObject.set(x, "getArc", js.Any.fromFunction0(value))
        
        inline def setGetEdge(value: () => Any): Self = StObject.set(x, "getEdge", js.Any.fromFunction0(value))
        
        inline def setGetGeometry(value: () => Any): Self = StObject.set(x, "getGeometry", js.Any.fromFunction0(value))
        
        inline def setGetGeometryType(value: () => Double): Self = StObject.set(x, "getGeometryType", js.Any.fromFunction0(value))
        
        inline def setGetIntersectPoint(value: () => Any): Self = StObject.set(x, "getIntersectPoint", js.Any.fromFunction0(value))
        
        inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
        
        inline def setGetNames(value: () => js.Array[String]): Self = StObject.set(x, "getNames", js.Any.fromFunction0(value))
        
        inline def setGetPriority(value: () => Double): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
        
        inline def setGetSnapResult(value: () => SnapResult): Self = StObject.set(x, "getSnapResult", js.Any.fromFunction0(value))
        
        inline def setGetSnapToArc(value: () => Boolean): Self = StObject.set(x, "getSnapToArc", js.Any.fromFunction0(value))
        
        inline def setGetSnapToPixel(value: () => Boolean): Self = StObject.set(x, "getSnapToPixel", js.Any.fromFunction0(value))
        
        inline def setGetVertex(value: () => Any): Self = StObject.set(x, "getVertex", js.Any.fromFunction0(value))
        
        inline def setIndicator(value: SnapperIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
        
        inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
        
        inline def setIsSnapped(value: () => Boolean): Self = StObject.set(x, "isSnapped", js.Any.fromFunction0(value))
        
        inline def setOnMouseDown(value: X => Boolean): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
        
        inline def setOnMouseMove(value: X => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
        
        inline def setSetArc(value: Boolean => Boolean): Self = StObject.set(x, "setArc", js.Any.fromFunction1(value))
        
        inline def setSetSnapToArc(value: Boolean => Unit): Self = StObject.set(x, "setSnapToArc", js.Any.fromFunction1(value))
        
        inline def setSetSnapToPixel(value: Boolean => Unit): Self = StObject.set(x, "setSnapToPixel", js.Any.fromFunction1(value))
        
        inline def setSetViewportId(value: Double => Unit): Self = StObject.set(x, "setViewportId", js.Any.fromFunction1(value))
      }
    }
    
    trait SnapperIndicator extends StObject {
      
      def clearOverlays(): Unit
      
      def onCameraChange(): Unit
      
      def render(): Unit
    }
    object SnapperIndicator {
      
      inline def apply(clearOverlays: () => Unit, onCameraChange: () => Unit, render: () => Unit): SnapperIndicator = {
        val __obj = js.Dynamic.literal(clearOverlays = js.Any.fromFunction0(clearOverlays), onCameraChange = js.Any.fromFunction0(onCameraChange), render = js.Any.fromFunction0(render))
        __obj.asInstanceOf[SnapperIndicator]
      }
      
      extension [Self <: SnapperIndicator](x: Self) {
        
        inline def setClearOverlays(value: () => Unit): Self = StObject.set(x, "clearOverlays", js.Any.fromFunction0(value))
        
        inline def setOnCameraChange(value: () => Unit): Self = StObject.set(x, "onCameraChange", js.Any.fromFunction0(value))
        
        inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      }
    }
  }
  
  @js.native
  trait ViewerModelStructurePanel
    extends StObject
       with ModelStructurePanel {
    
    def createUI(): Unit = js.native
    
    def onViewerHide(event: Any): Unit = js.native
    
    def onViewerIsolate(event: Any): Unit = js.native
    
    def onViewerSelect(event: Any): Unit = js.native
    
    def onViewerShow(event: Any): Unit = js.native
    
    def removeTreeUI(model: Model): Unit = js.native
    
    def scrollToSelection(aggregatedSelection: js.Array[Any]): Unit = js.native
    
    def setHidden(nodes: js.Array[Any], model: Model, hidden: Boolean): Unit = js.native
    
    def setIsolation(isolation: js.Array[Any]): Unit = js.native
    
    def sync(): Unit = js.native
  }
  
  @js.native
  trait ViewerPropertyPanel
    extends StObject
       with PropertyPanel {
    
    var currentNodeIds: js.Array[js.Object] = js.native
  }
}
