package typings.echarts.echartsNs

import typings.zrender.zrenderNs.LinearGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graphic extends js.Object {
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  var LinearGradient: typings.zrender.zrenderNs.LinearGradient
  /**
    * Clip the given points by the given rectangular.
    *
    * @param {number[][]} points The points to be clipped,
    *     like [[23, 44], [12, 15], ...].
    * @param {ERectangle} rect The rectangular that is used to clip points.
    */
  def clipPointsByRect(points: js.Array[js.Array[Double]], rect: ERectangle): js.Array[js.Array[Double]]
  /**
    * Clip the first input rectangular by the second input rectangular.
    *
    * @param {ERectangle} targetRect The rectangular to be clipped.
    * @param {ERectangle} rect The rectangular that is used to clip
    *     targetRect.
    */
  def clipRectByRect(targetRect: ERectangle, rect: ERectangle): ERectangle
}

object Graphic {
  @scala.inline
  def apply(
    LinearGradient: LinearGradient,
    clipPointsByRect: (js.Array[js.Array[Double]], ERectangle) => js.Array[js.Array[Double]],
    clipRectByRect: (ERectangle, ERectangle) => ERectangle
  ): Graphic = {
    val __obj = js.Dynamic.literal(LinearGradient = LinearGradient, clipPointsByRect = js.Any.fromFunction2(clipPointsByRect), clipRectByRect = js.Any.fromFunction2(clipRectByRect))
  
    __obj.asInstanceOf[Graphic]
  }
}

