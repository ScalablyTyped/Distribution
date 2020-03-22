package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArguments extends js.Object {
  /**
    * Parameters of `renderItem`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments
    */
  var arguments: js.UndefOr[AnonApi] = js.undefined
  /**
    * `renderItem` should returns graphic element definitions.
    * Each graphic element is an object. See
    * [graphic](https://echarts.apache.org/en/option.html#graphic.elements)
    * for detailed info.
    * (But width\\height\\top\\bottom is not supported here)
    *
    * If nothing should be rendered in this data item, just returns
    * nothing.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem)
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return
    */
  var `return`: js.UndefOr[js.Object] = js.undefined
  /**
    * Arc element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc
    */
  var return_arc: js.UndefOr[AnonScale] = js.undefined
  /**
    * Quadratic bezier curve or cubic bezier curve.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve
    */
  var return_bezierCurve: js.UndefOr[AnonStyle] = js.undefined
  /**
    * Circle element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_circle
    */
  var return_circle: js.UndefOr[AnonOrigin] = js.undefined
  /**
    * `group` is the only type that can contain children, so that
    * a group of elements can be positioned and transformed together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group
    */
  var return_group: js.UndefOr[AnonChildren] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image
    */
  var return_image: js.UndefOr[AnonIgnore] = js.undefined
  /**
    * Line element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line
    */
  var return_line: js.UndefOr[AnonSilent] = js.undefined
  /**
    * Use
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * to describe a path.
    * Can be used to draw icons or any other shapes fitting the
    * specified size by auto transforming.
    *
    * See examples:
    * [icons](https://echarts.apache.org/examples/en/editor.html?c=custom-calendar-icon)
    * and
    * [shapes](https://echarts.apache.org/examples/en/editor.html?c=custom-gantt-flight)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path
    */
  var return_path: js.UndefOr[AnonId] = js.undefined
  /**
    * Polygon element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon
    */
  var return_polygon: js.UndefOr[AnonShape] = js.undefined
  /**
    * Polyline element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline
    */
  var return_polyline: js.UndefOr[AnonShape] = js.undefined
  /**
    * Rectangle element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect
    */
  var return_rect: js.UndefOr[AnonInvisible] = js.undefined
  /**
    * Ring element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring
    */
  var return_ring: js.UndefOr[AnonRotation] = js.undefined
  /**
    * Sector element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_sector
    */
  var return_sector: js.UndefOr[AnonScale] = js.undefined
  /**
    * Text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text
    */
  var return_text: js.UndefOr[AnonInfo] = js.undefined
}

object AnonArguments {
  @scala.inline
  def apply(
    arguments: AnonApi = null,
    `return`: js.Object = null,
    return_arc: AnonScale = null,
    return_bezierCurve: AnonStyle = null,
    return_circle: AnonOrigin = null,
    return_group: AnonChildren = null,
    return_image: AnonIgnore = null,
    return_line: AnonSilent = null,
    return_path: AnonId = null,
    return_polygon: AnonShape = null,
    return_polyline: AnonShape = null,
    return_rect: AnonInvisible = null,
    return_ring: AnonRotation = null,
    return_sector: AnonScale = null,
    return_text: AnonInfo = null
  ): AnonArguments = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (`return` != null) __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    if (return_arc != null) __obj.updateDynamic("return_arc")(return_arc.asInstanceOf[js.Any])
    if (return_bezierCurve != null) __obj.updateDynamic("return_bezierCurve")(return_bezierCurve.asInstanceOf[js.Any])
    if (return_circle != null) __obj.updateDynamic("return_circle")(return_circle.asInstanceOf[js.Any])
    if (return_group != null) __obj.updateDynamic("return_group")(return_group.asInstanceOf[js.Any])
    if (return_image != null) __obj.updateDynamic("return_image")(return_image.asInstanceOf[js.Any])
    if (return_line != null) __obj.updateDynamic("return_line")(return_line.asInstanceOf[js.Any])
    if (return_path != null) __obj.updateDynamic("return_path")(return_path.asInstanceOf[js.Any])
    if (return_polygon != null) __obj.updateDynamic("return_polygon")(return_polygon.asInstanceOf[js.Any])
    if (return_polyline != null) __obj.updateDynamic("return_polyline")(return_polyline.asInstanceOf[js.Any])
    if (return_rect != null) __obj.updateDynamic("return_rect")(return_rect.asInstanceOf[js.Any])
    if (return_ring != null) __obj.updateDynamic("return_ring")(return_ring.asInstanceOf[js.Any])
    if (return_sector != null) __obj.updateDynamic("return_sector")(return_sector.asInstanceOf[js.Any])
    if (return_text != null) __obj.updateDynamic("return_text")(return_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArguments]
  }
}

