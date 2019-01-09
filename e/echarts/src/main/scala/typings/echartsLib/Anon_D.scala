package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_D extends js.Object {
  /**
    * Alias of
    * [pathData](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.pathData)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.d
    */
  var d: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.height
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * If
    * [width](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.y)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.layout
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * .
    *
    * For example, `'M0,0 L0,-20 L30,-20 C42,-20 38,-1
    * 50,-1 L70,-1 L70,0 Z'`。
    *
    * If
    * [width](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.y)
    * specified, `pathData` will be transformed to fit
    * the defined rect.
    * If they are not specified, do not do that.
    *
    * [layout](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.layout)
    * can be used to specify the transform strategy.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.pathData
    */
  var pathData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.x
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path.shape.y
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

