package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Points extends StObject {
  
  /**
    * A list of points, which defines the shape, like `[[22,
    * 44], [44, 55], [11, 44], ...]`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.points
    */
  var points: js.UndefOr[js.Array[js.Any]] = js.undefined
  
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
  var smooth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Whether prevent the smooth process cause the line
    * out of the bounding box.
    *
    * Only works when `smooth` is `number` (bezier smooth).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape.smoothConstraint
    */
  var smoothConstraint: js.UndefOr[Boolean] = js.undefined
}
object Points {
  
  @scala.inline
  def apply(): Points = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit class PointsMutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[js.Any]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: js.Any*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setSmooth(value: Double | String): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothConstraint(value: Boolean): Self = StObject.set(x, "smoothConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothConstraintUndefined: Self = StObject.set(x, "smoothConstraint", js.undefined)
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
  }
}
