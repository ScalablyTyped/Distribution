package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ShadowOffsetXShadowBlurColorOrigin extends js.Object {
  /**
    * Fill color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides single
    * colors.
    * >
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.line.areaStyle)
    *
    *
    * @default
    * "#000"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.areaStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.areaStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.native
  /**
    * Origin position of area.
    *
    * By default, the area between axis line and data will be the
    * area to be filled.
    * This config enables you to fill data to the max or min of
    * the axis data.
    *
    * Valid values include: `'auto'` (default), `'start'`, `'end'`.
    *
    * + `'auto'` to fill between axis line to data;
    * + `'start'` to fill between min axis value (when not `inverse`)
    * to data;
    * + `'end'` to fill between max axis value (when not `inverse`)
    * to data;
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.areaStyle.origin
    */
  var origin: js.UndefOr[java.lang.String] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.line.areaStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.areaStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.areaStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.areaStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.areaStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.native
}

