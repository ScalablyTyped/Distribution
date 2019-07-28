package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CxCy extends js.Object {
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_ring.shape.cx
    */
  var cx: js.UndefOr[Double] = js.undefined
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_ring.shape.cy
    */
  var cy: js.UndefOr[Double] = js.undefined
  /**
    * Outside radius.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_ring.shape.r
    */
  var r: js.UndefOr[Double] = js.undefined
  /**
    * Inside radius.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_ring.shape.r0
    */
  var r0: js.UndefOr[Double] = js.undefined
}

object Anon_CxCy {
  @scala.inline
  def apply(cx: Int | Double = null, cy: Int | Double = null, r: Int | Double = null, r0: Int | Double = null): Anon_CxCy = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (r0 != null) __obj.updateDynamic("r0")(r0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CxCy]
  }
}

