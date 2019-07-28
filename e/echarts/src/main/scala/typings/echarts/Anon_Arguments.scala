package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arguments extends js.Object {
  /**
    * Parameters of `renderItem`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments
    */
  var arguments: js.UndefOr[Anon_Api] = js.undefined
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
  var `return`: js.UndefOr[js.Object] = js.undefined
  /**
    * Arc element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc
    */
  var return_arc: js.UndefOr[Anon_IdIgnoreInfoInvisibleNameOriginPosition] = js.undefined
  /**
    * Quadratic bezier curve or cubic bezier curve.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve
    */
  var return_bezierCurve: js.UndefOr[Anon_IdIgnoreInfoInvisibleNameOriginPositionRotationScaleShape] = js.undefined
  /**
    * Circle element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_circle
    */
  var return_circle: js.UndefOr[Anon_IdIgnoreInfoInvisibleName] = js.undefined
  /**
    * `group` is the only type that can contain children, so that
    * a group of elements can be positioned and transformed together.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group
    */
  var return_group: js.UndefOr[Anon_Children] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image
    */
  var return_image: js.UndefOr[Anon_IdIgnore] = js.undefined
  /**
    * Line element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line
    */
  var return_line: js.UndefOr[Anon_IdIgnoreInfoInvisibleNameOriginPositionRotationScale] = js.undefined
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
  var return_path: js.UndefOr[Anon_Id] = js.undefined
  /**
    * Polygon element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon
    */
  var return_polygon: js.UndefOr[Anon_IdIgnoreInfoInvisibleNameOriginPositionRotation] = js.undefined
  /**
    * Polyline element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline
    */
  var return_polyline: js.UndefOr[Anon_IdIgnoreInfoInvisibleNameOriginPositionRotation] = js.undefined
  /**
    * Rectangle element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect
    */
  var return_rect: js.UndefOr[Anon_IdIgnoreInfoInvisible] = js.undefined
  /**
    * Ring element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_ring
    */
  var return_ring: js.UndefOr[Anon_IdIgnoreInfoInvisibleNameOrigin] = js.undefined
  /**
    * Sector element.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_sector
    */
  var return_sector: js.UndefOr[Anon_IdIgnoreInfoInvisibleNameOriginPosition] = js.undefined
  /**
    * Text block.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text
    */
  var return_text: js.UndefOr[Anon_IdIgnoreInfo] = js.undefined
}

object Anon_Arguments {
  @scala.inline
  def apply(
    arguments: Anon_Api = null,
    `return`: js.Object = null,
    return_arc: Anon_IdIgnoreInfoInvisibleNameOriginPosition = null,
    return_bezierCurve: Anon_IdIgnoreInfoInvisibleNameOriginPositionRotationScaleShape = null,
    return_circle: Anon_IdIgnoreInfoInvisibleName = null,
    return_group: Anon_Children = null,
    return_image: Anon_IdIgnore = null,
    return_line: Anon_IdIgnoreInfoInvisibleNameOriginPositionRotationScale = null,
    return_path: Anon_Id = null,
    return_polygon: Anon_IdIgnoreInfoInvisibleNameOriginPositionRotation = null,
    return_polyline: Anon_IdIgnoreInfoInvisibleNameOriginPositionRotation = null,
    return_rect: Anon_IdIgnoreInfoInvisible = null,
    return_ring: Anon_IdIgnoreInfoInvisibleNameOrigin = null,
    return_sector: Anon_IdIgnoreInfoInvisibleNameOriginPosition = null,
    return_text: Anon_IdIgnoreInfo = null
  ): Anon_Arguments = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (`return` != null) __obj.updateDynamic("return")(`return`)
    if (return_arc != null) __obj.updateDynamic("return_arc")(return_arc)
    if (return_bezierCurve != null) __obj.updateDynamic("return_bezierCurve")(return_bezierCurve)
    if (return_circle != null) __obj.updateDynamic("return_circle")(return_circle)
    if (return_group != null) __obj.updateDynamic("return_group")(return_group)
    if (return_image != null) __obj.updateDynamic("return_image")(return_image)
    if (return_line != null) __obj.updateDynamic("return_line")(return_line)
    if (return_path != null) __obj.updateDynamic("return_path")(return_path)
    if (return_polygon != null) __obj.updateDynamic("return_polygon")(return_polygon)
    if (return_polyline != null) __obj.updateDynamic("return_polyline")(return_polyline)
    if (return_rect != null) __obj.updateDynamic("return_rect")(return_rect)
    if (return_ring != null) __obj.updateDynamic("return_ring")(return_ring)
    if (return_sector != null) __obj.updateDynamic("return_sector")(return_sector)
    if (return_text != null) __obj.updateDynamic("return_text")(return_text)
    __obj.asInstanceOf[Anon_Arguments]
  }
}

