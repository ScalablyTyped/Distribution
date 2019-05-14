package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthShow extends js.Object {
  /**
    * The length of pointer which could be absolute value and also
    * the percentage relative to
    * [radius](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.radius)
    * .
    *
    *
    * @default
    * '80%'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.pointer.length
    */
  var length: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether to show the pointer.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.pointer.show
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The width of pointer.
    *
    *
    * @default
    * 8
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.pointer.width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_LengthShow {
  @scala.inline
  def apply(
    length: scala.Double | java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_LengthShow = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LengthShow]
  }
}

