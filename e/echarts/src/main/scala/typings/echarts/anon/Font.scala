package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  /**
    * Color filled in this element.
    *
    *
    * @default
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.fill
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * Font size, font type, font weight, font color, follow
    * the form of
    * [css font](https://developer.mozilla.org/en-US/docs/Web/CSS/font)
    * .
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.return_text.style)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.font
    */
  var font: js.UndefOr[String] = js.native
  /**
    * Width of stroke.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.lineWidth
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * Width of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * color of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.shadowColor
    */
  var shadowColor: js.UndefOr[Double] = js.native
  /**
    * X offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Y offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * Color of stroke.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.stroke
    */
  var stroke: js.UndefOr[String] = js.native
  /**
    * Text content. `\n` can be used as a line break.
    *
    *
    * @default
    * ''
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.text
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Text horizontal alignment.
    * Optional values: `'left'`, `'center'`, `'right'`.
    *
    * `'left'` means the left side of the text block is
    * specified by the
    * [style.x](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.x)
    * , while `'right'` means the right side of the text
    * block is specified by
    * [style.y](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.y)
    * .
    *
    *
    * @default
    * "left"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.textAlign
    */
  var textAlign: js.UndefOr[String] = js.native
  /**
    * Text vertical alignment.
    * Optional values: `'top'`, `'middle'`, `'bottom'`.
    *
    * More attributes in `style` (for example,
    * [rich text](https://echarts.apache.org/en/tutorial.html#Rich%20Text)
    * ), see the `style` related attributes in
    * [zrender/graphic/Displayable](https://ecomfe.github.io/zrender-doc/public/api.html#zrenderdisplayable)
    * .
    *
    * Notice, the attribute names of the `style` of graphic
    * elements is derived from `zrender`, which may be
    * different from the attribute names in `echarts label`,
    * `echarts itemStyle`, etc.,
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
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.textVerticalAlign
    */
  var textVerticalAlign: js.UndefOr[String] = js.native
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.x
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text.style.y
    */
  var y: js.UndefOr[Double] = js.native
}

object Font {
  @scala.inline
  def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    @scala.inline
    def setShadowColor(value: Double): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextVerticalAlign(value: String): Self = this.set("textVerticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextVerticalAlign: Self = this.set("textVerticalAlign", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

