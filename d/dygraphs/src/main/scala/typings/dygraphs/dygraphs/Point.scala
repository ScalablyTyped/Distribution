package typings.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Point structure.
  *
  * xval_* and yval_* are the original unscaled data values,
  * while x_* and y_* are scaled to the range (0.0-1.0) for plotting.
  * yval_stacked is the cumulative Y value used for stacking graphs,
  * and bottom/top/minus/plus are used for error bar graphs.
  */
@js.native
trait Point extends js.Object {
  
  var annotation: js.UndefOr[Annotation] = js.native
  
  var idx: Double = js.native
  
  var name: String = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xval: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var y_bottom: js.UndefOr[Double] = js.native
  
  var y_stacked: js.UndefOr[Double] = js.native
  
  var y_top: js.UndefOr[Double] = js.native
  
  var yval: js.UndefOr[Double] = js.native
  
  var yval_minus: js.UndefOr[Double] = js.native
  
  var yval_plus: js.UndefOr[Double] = js.native
  
  var yval_stacked: js.UndefOr[Double] = js.native
}
object Point {
  
  @scala.inline
  def apply(idx: Double, name: String): Point = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotation(value: Annotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXval(value: Double): Self = this.set("xval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXval: Self = this.set("xval", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setY_bottom(value: Double): Self = this.set("y_bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY_bottom: Self = this.set("y_bottom", js.undefined)
    
    @scala.inline
    def setY_stacked(value: Double): Self = this.set("y_stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY_stacked: Self = this.set("y_stacked", js.undefined)
    
    @scala.inline
    def setY_top(value: Double): Self = this.set("y_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY_top: Self = this.set("y_top", js.undefined)
    
    @scala.inline
    def setYval(value: Double): Self = this.set("yval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYval: Self = this.set("yval", js.undefined)
    
    @scala.inline
    def setYval_minus(value: Double): Self = this.set("yval_minus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYval_minus: Self = this.set("yval_minus", js.undefined)
    
    @scala.inline
    def setYval_plus(value: Double): Self = this.set("yval_plus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYval_plus: Self = this.set("yval_plus", js.undefined)
    
    @scala.inline
    def setYval_stacked(value: Double): Self = this.set("yval_stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYval_stacked: Self = this.set("yval_stacked", js.undefined)
  }
}
