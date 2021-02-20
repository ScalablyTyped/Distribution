package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartExplorer extends StObject {
  
  var actions: js.UndefOr[js.Array[String]] = js.native
  
  var axis: js.UndefOr[String] = js.native
  
  var keepInBounds: js.UndefOr[Boolean] = js.native
  
  var maxZoomIn: js.UndefOr[Double] = js.native
  
  var maxZoomOut: js.UndefOr[Double] = js.native
  
  var zoomDelta: js.UndefOr[Double] = js.native
}
object ChartExplorer {
  
  @scala.inline
  def apply(): ChartExplorer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartExplorer]
  }
  
  @scala.inline
  implicit class ChartExplorerMutableBuilder[Self <: ChartExplorer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setKeepInBounds(value: Boolean): Self = StObject.set(x, "keepInBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepInBoundsUndefined: Self = StObject.set(x, "keepInBounds", js.undefined)
    
    @scala.inline
    def setMaxZoomIn(value: Double): Self = StObject.set(x, "maxZoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomInUndefined: Self = StObject.set(x, "maxZoomIn", js.undefined)
    
    @scala.inline
    def setMaxZoomOut(value: Double): Self = StObject.set(x, "maxZoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomOutUndefined: Self = StObject.set(x, "maxZoomOut", js.undefined)
    
    @scala.inline
    def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
  }
}
