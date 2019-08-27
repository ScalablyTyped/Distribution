package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis
    */
  var emphasis: js.UndefOr[
    Anon_ItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColorShadowOffsetX
  ] = js.undefined
  /**
    * When is no content in breadcrumb, this minimal width need
    * to be set up.
    *
    *
    * @default
    * 25
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emptyItemWidth
    */
  var emptyItemWidth: js.UndefOr[Double] = js.undefined
  /**
    * The height of breadcrumb.
    *
    *
    * @default
    * 22
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.height
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.itemStyle
    */
  var itemStyle: js.UndefOr[
    Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColorShadowOffsetX
  ] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.left
    */
  var left: js.UndefOr[Double | String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.right
    */
  var right: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to show the breadcrumb.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.top
    */
  var top: js.UndefOr[Double | String] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: Double | String = null,
    emphasis: Anon_ItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColorShadowOffsetX = null,
    emptyItemWidth: Int | Double = null,
    height: Int | Double = null,
    itemStyle: Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColorShadowOffsetX = null,
    left: Double | String = null,
    right: Double | String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    top: Double | String = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (emptyItemWidth != null) __obj.updateDynamic("emptyItemWidth")(emptyItemWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

