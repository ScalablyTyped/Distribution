package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EmptyItemWidth extends js.Object {
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
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.native
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleAnonShadowOffsetXBorderTypeTextStyle] = js.native
  /**
    * When is no content in breadcrumb, this minimal width need
    * to be set up.
    *
    *
    * @default
    * 25
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emptyItemWidth
    */
  var emptyItemWidth: js.UndefOr[scala.Double] = js.native
  /**
    * The height of breadcrumb.
    *
    *
    * @default
    * 22
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.height
    */
  var height: js.UndefOr[scala.Double] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_ShadowOffsetXBorderTypeTextStyle] = js.native
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
  var left: js.UndefOr[scala.Double | java.lang.String] = js.native
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
  var right: js.UndefOr[scala.Double | java.lang.String] = js.native
  /**
    * Whether to show the breadcrumb.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.show
    */
  var show: js.UndefOr[scala.Boolean] = js.native
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
  var top: js.UndefOr[scala.Double | java.lang.String] = js.native
}

