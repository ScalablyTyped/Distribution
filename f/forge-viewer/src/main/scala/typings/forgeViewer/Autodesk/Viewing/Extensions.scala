package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult
import typings.forgeViewer.Autodesk.Viewing.UI.PropertyPanel
import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  object Snapping {
    
    trait Snapper extends StObject {
      
      def activate(): Unit
      
      def clearSnapped(): Unit
      
      def copyResults(destiny: js.Any): Unit
      
      def deactivate(): Unit
      
      def getEdge(): js.Any
      
      def getGeometry(): js.Any
      
      def getSnapResult(): SnapResult
      
      def getVertex(): js.Any
      
      var indicator: SnapperIndicator
      
      def isActive(): Boolean
      
      def isSnapped(): Boolean
      
      def onMouseMove(mousePosition: X): Boolean
    }
    object Snapper {
      
      inline def apply(
        activate: () => Unit,
        clearSnapped: () => Unit,
        copyResults: js.Any => Unit,
        deactivate: () => Unit,
        getEdge: () => js.Any,
        getGeometry: () => js.Any,
        getSnapResult: () => SnapResult,
        getVertex: () => js.Any,
        indicator: SnapperIndicator,
        isActive: () => Boolean,
        isSnapped: () => Boolean,
        onMouseMove: X => Boolean
      ): Snapper = {
        val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), clearSnapped = js.Any.fromFunction0(clearSnapped), copyResults = js.Any.fromFunction1(copyResults), deactivate = js.Any.fromFunction0(deactivate), getEdge = js.Any.fromFunction0(getEdge), getGeometry = js.Any.fromFunction0(getGeometry), getSnapResult = js.Any.fromFunction0(getSnapResult), getVertex = js.Any.fromFunction0(getVertex), indicator = indicator.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), isSnapped = js.Any.fromFunction0(isSnapped), onMouseMove = js.Any.fromFunction1(onMouseMove))
        __obj.asInstanceOf[Snapper]
      }
      
      extension [Self <: Snapper](x: Self) {
        
        inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
        
        inline def setClearSnapped(value: () => Unit): Self = StObject.set(x, "clearSnapped", js.Any.fromFunction0(value))
        
        inline def setCopyResults(value: js.Any => Unit): Self = StObject.set(x, "copyResults", js.Any.fromFunction1(value))
        
        inline def setDeactivate(value: () => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction0(value))
        
        inline def setGetEdge(value: () => js.Any): Self = StObject.set(x, "getEdge", js.Any.fromFunction0(value))
        
        inline def setGetGeometry(value: () => js.Any): Self = StObject.set(x, "getGeometry", js.Any.fromFunction0(value))
        
        inline def setGetSnapResult(value: () => SnapResult): Self = StObject.set(x, "getSnapResult", js.Any.fromFunction0(value))
        
        inline def setGetVertex(value: () => js.Any): Self = StObject.set(x, "getVertex", js.Any.fromFunction0(value))
        
        inline def setIndicator(value: SnapperIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
        
        inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
        
        inline def setIsSnapped(value: () => Boolean): Self = StObject.set(x, "isSnapped", js.Any.fromFunction0(value))
        
        inline def setOnMouseMove(value: X => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
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
  trait ViewerPropertyPanel
    extends StObject
       with PropertyPanel {
    
    var currentNodeIds: js.Array[js.Object] = js.native
  }
}
