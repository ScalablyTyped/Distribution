package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  /**
    * Distance between asdf component and the bottom side of the
    * container.
    *
    * `bottom` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis
    */
  var emphasis: js.UndefOr[`26`] = js.native
  /**
    * When is no content in breadcrumb, this minimal width need
    * to be set up.
    *
    *
    * @default
    * 25
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emptyItemWidth
    */
  var emptyItemWidth: js.UndefOr[Double] = js.native
  /**
    * The height of breadcrumb.
    *
    *
    * @default
    * 22
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.height
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.itemStyle
    */
  var itemStyle: js.UndefOr[TextStyle] = js.native
  /**
    * Distance between asdf component and the left side of the
    * container.
    *
    * `left` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`; and it can also be `'left'`, `'center'`, or `'right'`.
    *
    * If the `left` value is set to be `'left'`, `'center'`, or
    * `'right'`, then the component will be aligned automatically
    * based on position.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.left
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Distance between asdf component and the right side of the
    * container.
    *
    * `right` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.right
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to show the breadcrumb.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.show
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Distance between asdf component and the top side of the container.
    *
    * `top` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`; and it can also be `'top'`, `'middle'`, or `'bottom'`.
    *
    * If the `left` value is set to be `'top'`, `'middle'`, or
    * `'bottom'`, then the component will be aligned automatically
    * based on position.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.top
    */
  var top: js.UndefOr[Double | String] = js.native
}

object Bottom {
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setEmphasis(value: `26`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setEmptyItemWidth(value: Double): Self = this.set("emptyItemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyItemWidth: Self = this.set("emptyItemWidth", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setItemStyle(value: TextStyle): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

