package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonD extends js.Object {
  /**
    * Alias of
    * [pathData](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.pathData)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.d
    */
  var d: js.UndefOr[String] = js.undefined
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * If
    * [width](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y)
    * specified, `pathData` will be transformed to fit
    * the defined rect.
    *
    * `layout` can be used to specify the transform strategy.
    *
    * Optional value:
    *
    * + `'center'`: Keep aspect ratio, put the path in
    * the center of the rect, expand as far as possible
    * but never overflow.
    * + `'cover'`: Transform the path according to the
    * aspect ratio of the rect, fill the rect and do not
    * overflow.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.layout
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * .
    *
    * For example, `'M0,0 L0,-20 L30,-20 C42,-20 38,-1
    * 50,-1 L70,-1 L70,0 Z'`。
    *
    * If
    * [width](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y)
    * specified, `pathData` will be transformed to fit
    * the defined rect.
    * If they are not specified, do not do that.
    *
    * [layout](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.layout)
    * can be used to specify the transform strategy.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.pathData
    */
  var pathData: js.UndefOr[String] = js.undefined
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnonD {
  @scala.inline
  def apply(
    d: String = null,
    height: Int | Double = null,
    layout: String = null,
    pathData: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnonD = {
    val __obj = js.Dynamic.literal()
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (pathData != null) __obj.updateDynamic("pathData")(pathData.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonD]
  }
}

