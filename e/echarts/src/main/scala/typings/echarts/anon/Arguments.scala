package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arguments extends js.Object {
  /**
    * Parameters of `renderItem`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments
    */
  var arguments: js.UndefOr[Api] = js.native
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
  var `return`: js.UndefOr[js.Object] = js.native
  /**
    * Arc element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc
    */
  var return_arc: js.UndefOr[Scale] = js.native
  /**
    * Quadratic bezier curve or cubic bezier curve.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve
    */
  var return_bezierCurve: js.UndefOr[Style] = js.native
  /**
    * Circle element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_circle
    */
  var return_circle: js.UndefOr[Origin] = js.native
  /**
    * `group` is the only type that can contain children, so that
    * a group of elements can be positioned and transformed together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group
    */
  var return_group: js.UndefOr[Children] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image
    */
  var return_image: js.UndefOr[Ignore] = js.native
  /**
    * Line element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line
    */
  var return_line: js.UndefOr[Silent] = js.native
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
  var return_path: js.UndefOr[Id] = js.native
  /**
    * Polygon element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon
    */
  var return_polygon: js.UndefOr[Shape] = js.native
  /**
    * Polyline element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline
    */
  var return_polyline: js.UndefOr[Shape] = js.native
  /**
    * Rectangle element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect
    */
  var return_rect: js.UndefOr[Invisible] = js.native
  /**
    * Ring element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring
    */
  var return_ring: js.UndefOr[Rotation] = js.native
  /**
    * Sector element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_sector
    */
  var return_sector: js.UndefOr[Scale] = js.native
  /**
    * Text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text
    */
  var return_text: js.UndefOr[Info] = js.native
}

object Arguments {
  @scala.inline
  def apply(): Arguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arguments]
  }
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArguments(value: Api): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setReturn(value: js.Object): Self = this.set("return", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn: Self = this.set("return", js.undefined)
    @scala.inline
    def setReturn_arc(value: Scale): Self = this.set("return_arc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_arc: Self = this.set("return_arc", js.undefined)
    @scala.inline
    def setReturn_bezierCurve(value: Style): Self = this.set("return_bezierCurve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_bezierCurve: Self = this.set("return_bezierCurve", js.undefined)
    @scala.inline
    def setReturn_circle(value: Origin): Self = this.set("return_circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_circle: Self = this.set("return_circle", js.undefined)
    @scala.inline
    def setReturn_group(value: Children): Self = this.set("return_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_group: Self = this.set("return_group", js.undefined)
    @scala.inline
    def setReturn_image(value: Ignore): Self = this.set("return_image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_image: Self = this.set("return_image", js.undefined)
    @scala.inline
    def setReturn_line(value: Silent): Self = this.set("return_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_line: Self = this.set("return_line", js.undefined)
    @scala.inline
    def setReturn_path(value: Id): Self = this.set("return_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_path: Self = this.set("return_path", js.undefined)
    @scala.inline
    def setReturn_polygon(value: Shape): Self = this.set("return_polygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_polygon: Self = this.set("return_polygon", js.undefined)
    @scala.inline
    def setReturn_polyline(value: Shape): Self = this.set("return_polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_polyline: Self = this.set("return_polyline", js.undefined)
    @scala.inline
    def setReturn_rect(value: Invisible): Self = this.set("return_rect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_rect: Self = this.set("return_rect", js.undefined)
    @scala.inline
    def setReturn_ring(value: Rotation): Self = this.set("return_ring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_ring: Self = this.set("return_ring", js.undefined)
    @scala.inline
    def setReturn_sector(value: Scale): Self = this.set("return_sector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_sector: Self = this.set("return_sector", js.undefined)
    @scala.inline
    def setReturn_text(value: Info): Self = this.set("return_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_text: Self = this.set("return_text", js.undefined)
  }
  
}

