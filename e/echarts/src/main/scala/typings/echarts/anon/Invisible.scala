package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invisible extends js.Object {
  /**
    * id is used to specifying element when willing to update
    * it. id can be ignored if you do not need it.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Whether the element is totally ignored (neither render
    * nor listen events).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.ignore
    */
  var ignore: js.UndefOr[Boolean] = js.undefined
  /**
    * User defined data, can be visited in event listeners.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.return_rect)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.info
    */
  var info: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the element is visible.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.invisible
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  /**
    * See
    * [diffChildrenByName](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.diffChildrenByName)
    * 。
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.origin
    */
  var origin: js.UndefOr[Double] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.position
    */
  var position: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.rotation
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [1, 1]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.scale
    */
  var scale: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape
    */
  var shape: js.UndefOr[R] = js.undefined
  /**
    * Whether response to mouse events / touch events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * More attributes in `style` (for example,
    * [rich text](https://echarts.apache.org/en/tutorial.html#Rich%20Text)
    * ), see the `style` related attributes in
    * [zrender/graphic/Displayable](https://ecomfe.github.io/zrender-doc/public/api.html#zrenderdisplayable)
    * .
    *
    * Notice, the attribute names of the `style` of graphic
    * elements is derived from `zrender`, which may be different
    * from the attribute names in `echarts label`, `echarts
    * itemStyle`, etc.,
    * although they have the same meaning. For example:
    *
    * + [itemStyle.color](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.fill`
    * + [itemStyle.borderColor](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.stroke`
    * + [label.color](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.textFill`
    * + [label.textBorderColor](https://echarts.apache.org/en/option.html#series-scatter.label.textBorderColor)
    * => `style.textStroke`
    * + ...
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.style
    */
  var style: js.UndefOr[Fill] = js.undefined
  /**
    * Empahsis style of the graphic element, whose structure
    * is the same as
    * [style](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.style)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.styleEmphasis
    */
  var styleEmphasis: js.UndefOr[js.Object] = js.undefined
  /**
    * Must be specified when define a graphic element at the
    * first time.
    *
    * Optional values:
    *
    * [image](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image)
    * ,
    * [text](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text)
    * ,
    * [circle](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_circle)
    * ,
    * [sector](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_sector)
    * ,
    * [ring](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring)
    * ,
    * [polygon](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon)
    * ,
    * [polyline](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline)
    * ,
    * [rect](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect)
    * ,
    * [line](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line)
    * ,
    * [bezierCurve](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve)
    * ,
    * [arc](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc)
    * ,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * ,
    *
    *
    * @default
    * "rect"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Define the overlap relationship between graphic elements.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.z2
    */
  var z2: js.UndefOr[Double] = js.undefined
}

object Invisible {
  @scala.inline
  def apply(
    id: String = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    info: js.Any = null,
    invisible: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    origin: js.UndefOr[Double] = js.undefined,
    position: js.Array[_] = null,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: js.Array[_] = null,
    shape: R = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    style: Fill = null,
    styleEmphasis: js.Object = null,
    `type`: String = null,
    z2: js.UndefOr[Double] = js.undefined
  ): Invisible = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.get.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(origin)) __obj.updateDynamic("origin")(origin.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleEmphasis != null) __obj.updateDynamic("styleEmphasis")(styleEmphasis.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(z2)) __obj.updateDynamic("z2")(z2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invisible]
  }
}

