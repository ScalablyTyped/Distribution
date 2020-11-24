package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartExplorer extends js.Object {
  
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
  implicit class ChartExplorerOps[Self <: ChartExplorer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setKeepInBounds(value: Boolean): Self = this.set("keepInBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepInBounds: Self = this.set("keepInBounds", js.undefined)
    
    @scala.inline
    def setMaxZoomIn(value: Double): Self = this.set("maxZoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoomIn: Self = this.set("maxZoomIn", js.undefined)
    
    @scala.inline
    def setMaxZoomOut(value: Double): Self = this.set("maxZoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoomOut: Self = this.set("maxZoomOut", js.undefined)
    
    @scala.inline
    def setZoomDelta(value: Double): Self = this.set("zoomDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomDelta: Self = this.set("zoomDelta", js.undefined)
  }
}
