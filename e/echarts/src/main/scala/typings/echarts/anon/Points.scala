package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Points extends js.Object {
  
  /**
    * A list of points, which defines the shape, like `[[22,
    * 44], [44, 55], [11, 44], ...]`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.points
    */
  var points: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Whether smooth the line.
    *
    * + If the value is number, bezier interpolation is
    * used, and the value specified the level of smooth,
    * which is in the range of `[0, 1]`.
    * + If the value is `'spline'`, Catmull-Rom spline
    * interpolation is used.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.smooth
    */
  var smooth: js.UndefOr[Double | String] = js.native
  
  /**
    * Whether prevent the smooth process cause the line
    * out of the bounding box.
    *
    * Only works when `smooth` is `number` (bezier smooth).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.smoothConstraint
    */
  var smoothConstraint: js.UndefOr[Boolean] = js.native
}
object Points {
  
  @scala.inline
  def apply(): Points = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit class PointsOps[Self <: Points] (val x: Self) extends AnyVal {
    
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
    def setPointsVarargs(value: js.Any*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[_]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setSmooth(value: Double | String): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setSmoothConstraint(value: Boolean): Self = this.set("smoothConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothConstraint: Self = this.set("smoothConstraint", js.undefined)
  }
}
