package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameSilentStyleScaleInvisibleRotationInfoZ2 extends js.Object {
  /**
    * id is used to specifying element when willing to update
    * it. id can be ignored if you do not need it.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the element is totally ignored (neither render
    * nor listen events).
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.ignore
    */
  var ignore: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * User defined data, can be visited in event listeners.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.return_polyline)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.info
    */
  var info: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the element is visible.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.invisible
    */
  var invisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * See
    * [diffChildrenByName](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.diffChildrenByName)
    * 。
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.origin
    */
  var origin: js.UndefOr[scala.Double] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.position
    */
  var position: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.rotation
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [1, 1]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.scale
    */
  var scale: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.shape
    */
  var shape: js.UndefOr[Anon_Points] = js.undefined
  /**
    * Whether response to mouse events / touch events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * More attributes in `style` (for example,
    * [rich text](https://ecomfe.github.io/echarts-doc/public/en/tutorial.html#Rich%20Text)
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
    * + [itemStyle.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.color)
    * => `style.fill`
    * + [itemStyle.borderColor](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.color)
    * => `style.stroke`
    * + [label.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.color)
    * => `style.textFill`
    * + [label.textBorderColor](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label.textBorderColor)
    * => `style.textStroke`
    * + ...
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.style
    */
  var style: js.UndefOr[Anon_ShadowOffsetXStroke] = js.undefined
  /**
    * Empahsis style of the graphic element, whose structure
    * is the same as
    * [style](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon.style)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.styleEmphasis
    */
  var styleEmphasis: js.UndefOr[js.Object] = js.undefined
  /**
    * Must be specified when define a graphic element at the
    * first time.
    *
    * Optional values:
    *
    * [image](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_image)
    * ,
    * [text](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_text)
    * ,
    * [circle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_circle)
    * ,
    * [sector](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_sector)
    * ,
    * [ring](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_ring)
    * ,
    * [polygon](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polygon)
    * ,
    * [polyline](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline)
    * ,
    * [rect](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_rect)
    * ,
    * [line](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line)
    * ,
    * [bezierCurve](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve)
    * ,
    * [arc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_arc)
    * ,
    * [group](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_group)
    * ,
    *
    *
    * @default
    * "polyline"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define the overlap relationship between graphic elements.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_polyline.z2
    */
  var z2: js.UndefOr[scala.Double] = js.undefined
}

