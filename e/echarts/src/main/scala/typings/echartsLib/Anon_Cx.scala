package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cx extends js.Object {
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_circle.shape.cx
    */
  var cx: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_circle.shape.cy
    */
  var cy: js.UndefOr[scala.Double] = js.undefined
  /**
    * Outside radius.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_circle.shape.r
    */
  var r: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Cx {
  @scala.inline
  def apply(
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    r: scala.Int | scala.Double = null
  ): Anon_Cx = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cx]
  }
}

