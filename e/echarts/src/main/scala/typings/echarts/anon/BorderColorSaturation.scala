package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorSaturation extends StObject {
  
  /**
    * The border color and gap color of a node.
    *
    *
    * @default
    * "#fff',"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * The color saturation of a border or gap.
    * The value range is between 0 ~ 1.
    *
    * Tips:
    *
    * When `borderColorSaturation` is set, the `borderColor`
    * is disabled, and, instead, the final border color is
    * calculated based on the color of this node (this color
    * could be sepcified explicitly or inherited from its parent
    * node) and mixing with `borderColorSaturation`.
    *
    * In this way, a effect can be implemented: different sections
    * have different hue of gap color repectively, which makes
    * users easy to distinguish both sections and levels.
    *
    * **How to avoid confusion by setting border/gap of node**
    *
    * If all of the border/gaps are set with the same color,
    * confusion might occur when rectangulars in different
    * levels display at the same time.
    *
    * See the
    * [example](https://echarts.apache.org/examples/en/editor.html?c=doc-example/treemap-borderColor&edit=1&reset=1)
    *
    * Noticed that the child rectangles in the red area are
    * in the deeper level than rectangles that are saparated
    * by white gap.
    * So in the red area, basically we set gap color with red,
    * and use `borderColorSaturation` to lift the saturation.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderColorSaturation
    */
  var borderColorSaturation: js.UndefOr[String] = js.undefined
  
  /**
    * The border width of a node.
    * There is no border when it is set as `0`.
    *
    * Tip, gaps between child nodes are specified by
    * [gapWidth](https://echarts.apache.org/en/option.html#series-treemap.levels.gapWidth)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The color of a node. It use global palette
    * [option.color](https://echarts.apache.org/en/option.html#color)
    * by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The tranparent rate of a node, the range is between 0
    * ~ 1.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.colorAlpha
    */
  var colorAlpha: js.UndefOr[Double] = js.undefined
  
  /**
    * The color saturation of a node.
    * The range is between 0 ~ 1.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.colorSaturation
    */
  var colorSaturation: js.UndefOr[Double] = js.undefined
  
  /**
    * Gaps between child nodes.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.gapWidth
    */
  var gapWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Stroke color of each rect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.strokeColor
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Stroke width of each rect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.strokeWidth
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object BorderColorSaturation {
  
  @scala.inline
  def apply(): BorderColorSaturation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorSaturation]
  }
  
  @scala.inline
  implicit class BorderColorSaturationMutableBuilder[Self <: BorderColorSaturation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorSaturation(value: String): Self = StObject.set(x, "borderColorSaturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorSaturationUndefined: Self = StObject.set(x, "borderColorSaturation", js.undefined)
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAlpha(value: Double): Self = StObject.set(x, "colorAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAlphaUndefined: Self = StObject.set(x, "colorAlpha", js.undefined)
    
    @scala.inline
    def setColorSaturation(value: Double): Self = StObject.set(x, "colorSaturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSaturationUndefined: Self = StObject.set(x, "colorSaturation", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGapWidth(value: Double): Self = StObject.set(x, "gapWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapWidthUndefined: Self = StObject.set(x, "gapWidth", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
