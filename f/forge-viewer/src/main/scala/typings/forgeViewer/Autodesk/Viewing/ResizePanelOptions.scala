package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.UI.DockingPanel
import typings.forgeViewer.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizePanelOptions extends StObject {
  
  var dimensions: js.UndefOr[Height] = js.undefined
  
  var dockingPanels: js.UndefOr[js.Array[DockingPanel]] = js.undefined
  
  var viewer: js.UndefOr[Viewer3D] = js.undefined
}
object ResizePanelOptions {
  
  inline def apply(): ResizePanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizePanelOptions]
  }
  
  extension [Self <: ResizePanelOptions](x: Self) {
    
    inline def setDimensions(value: Height): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDockingPanels(value: js.Array[DockingPanel]): Self = StObject.set(x, "dockingPanels", value.asInstanceOf[js.Any])
    
    inline def setDockingPanelsUndefined: Self = StObject.set(x, "dockingPanels", js.undefined)
    
    inline def setDockingPanelsVarargs(value: DockingPanel*): Self = StObject.set(x, "dockingPanels", js.Array(value*))
    
    inline def setViewer(value: Viewer3D): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    
    inline def setViewerUndefined: Self = StObject.set(x, "viewer", js.undefined)
  }
}
