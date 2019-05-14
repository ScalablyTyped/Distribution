package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmphasisLineStyle extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis
    */
  var emphasis: js.UndefOr[Anon_LineStyleAnonColorCurvenessOpacityShadowBlurShadowColorShadowOffsetX] = js.undefined
  /**
    * The line stlye of edge.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessOpacityShadowBlurShadowColorShadowOffsetX] = js.undefined
  /**
    * The
    * [name of source node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.name)
    * of edge
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.source
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The
    * [name of target node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.name)
    * of edge
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.target
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of edge, which decides the width of edge.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object Anon_EmphasisLineStyle {
  @scala.inline
  def apply(
    emphasis: Anon_LineStyleAnonColorCurvenessOpacityShadowBlurShadowColorShadowOffsetX = null,
    lineStyle: Anon_ColorCurvenessOpacityShadowBlurShadowColorShadowOffsetX = null,
    source: java.lang.String = null,
    target: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): Anon_EmphasisLineStyle = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmphasisLineStyle]
  }
}

