package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  /**
    * A list of children, each item is a declaration of an
    * element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.children
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * In
    * [custom series](https://echarts.apache.org/en/option.html#series-custom)
    * , when `diffChildrenByName` is set as `true`, for each
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * returned from
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * , "diff" will be performed to its
    * [children](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.children)
    * according to the
    * [name](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.name)
    * attribute of each graphic elements.
    * Here "diff" means that map the coming graphic elements
    * to the existing graphic elements when repainting according
    * to `name`, which enables the transition animation if
    * data is modified.
    *
    * But notice that the operation is performance consuming,
    * do not use it for large data amount.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.diffChildrenByName
    */
  var diffChildrenByName: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify height of this `group`.
    *
    * This height is only used for the positioning of its children.
    *
    * When height is `0`, children can also be positioned according
    * to its parent using `top: 'middle'`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.height
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * id is used to specifying element when willing to update
    * it. id can be ignored if you do not need it.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Whether the element is totally ignored (neither render
    * nor listen events).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.ignore
    */
  var ignore: js.UndefOr[Boolean] = js.undefined
  /**
    * User defined data, can be visited in event listeners.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.return_group)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.info
    */
  var info: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the element is visible.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.invisible
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
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.name
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
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.origin
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
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.position
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
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.rotation
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
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.scale
    */
  var scale: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Whether response to mouse events / touch events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Empahsis style of the graphic element, whose structure
    * is the same as
    * [style](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.style)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.styleEmphasis
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
    * "group"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Specify width of this `group`.
    *
    * This width is only used for the positioning of its children.
    *
    * When width is `0`, children can also be positioned according
    * to its parent using `left: 'center'`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.width
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Define the overlap relationship between graphic elements.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group.z2
    */
  var z2: js.UndefOr[Double] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[_] = null,
    diffChildrenByName: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    id: String = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    info: js.Any = null,
    invisible: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    origin: Int | Double = null,
    position: js.Array[_] = null,
    rotation: Int | Double = null,
    scale: js.Array[_] = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    styleEmphasis: js.Object = null,
    `type`: String = null,
    width: Int | Double = null,
    z2: Int | Double = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(diffChildrenByName)) __obj.updateDynamic("diffChildrenByName")(diffChildrenByName.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (styleEmphasis != null) __obj.updateDynamic("styleEmphasis")(styleEmphasis.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z2 != null) __obj.updateDynamic("z2")(z2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

