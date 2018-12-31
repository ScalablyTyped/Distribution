package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ReturnbezierCurve extends js.Object {
  /**
    * Parameters of `renderItem`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments
    */
  var arguments: js.UndefOr[Anon_Api] = js.native
  /**
    * `renderItem` should returns graphic element definitions.
    * Each graphic element is an object. See
    * [graphic](https://ecomfe.github.io/echarts-doc/public/en/option.html#graphic.elements)
    * for detailed info.
    * (But width\\height\\top\\bottom is not supported here)
    *
    * If nothing should be rendered in this data item, just returns
    * nothing.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem)
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return
    */
  var `return`: js.UndefOr[js.Object] = js.native
  /**
    * Arc element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc
    */
  var return_arc: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotationInfo] = js.native
  /**
    * Quadratic bezier curve or cubic bezier curve.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve
    */
  var return_bezierCurve: js.UndefOr[Anon_NameSilent] = js.native
  /**
    * Circle element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_circle
    */
  var return_circle: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotation] = js.native
  /**
    * `group` is the only type that can contain children, so that
    * a group of elements can be positioned and transformed together.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group
    */
  var return_group: js.UndefOr[Anon_ChildrenName] = js.native
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image
    */
  var return_image: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotationInfoZ2IdOriginStyleEmphasis] = js.native
  /**
    * Line element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line
    */
  var return_line: js.UndefOr[Anon_NameSilentStyle] = js.native
  /**
    * Use
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * to describe a path.
    * Can be used to draw icons or any other shapes fitting the
    * specified size by auto transforming.
    *
    * See examples:
    * [icons](https://ecomfe.github.io/echarts-examples/public/editor.html?c=custom-calendar-icon)
    * and
    * [shapes](https://ecomfe.github.io/echarts-examples/public/editor.html?c=custom-gantt-flight)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_path
    */
  var return_path: js.UndefOr[Anon_NameSilentStyleScale] = js.native
  /**
    * Polygon element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon
    */
  var return_polygon: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotationInfoZ2] = js.native
  /**
    * Polyline element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline
    */
  var return_polyline: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotationInfoZ2] = js.native
  /**
    * Rectangle element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect
    */
  var return_rect: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotationInfoZ2IdOrigin] = js.native
  /**
    * Ring element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_ring
    */
  var return_ring: js.UndefOr[Anon_NameSilentStyleScaleInvisible] = js.native
  /**
    * Sector element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_sector
    */
  var return_sector: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotationInfo] = js.native
  /**
    * Text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text
    */
  var return_text: js.UndefOr[Anon_NameSilentStyleScaleInvisibleRotationInfoZ2Id] = js.native
}

