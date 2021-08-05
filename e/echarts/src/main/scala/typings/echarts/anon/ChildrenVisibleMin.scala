package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenVisibleMin extends StObject {
  
  /**
    * Children will not be shown when area size of a node is smaller
    * than this value (unit: px square).
    *
    * This can hide the details of nodes when the rectangular area
    * is not large enough.
    * When users zoom nodes, the child node would show if the area
    * is larger than this threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `childrenVisibleMin` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.childrenVisibleMin
    */
  var childrenVisibleMin: js.UndefOr[Double] = js.undefined
  
  /**
    * A color list for a level.
    * Each node in the level will obtain a color from the color
    * list (the rule see
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * ).
    * It is empty by default, which means the global color list
    * will be used.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `color` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.color
    */
  var color: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * It indicates the range of tranparent rate (color alpha) for
    * nodes in a level . The range of values is 0 ~ 1.
    *
    * For example, `colorAlpha` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorAlpha` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.colorAlpha
    */
  var colorAlpha: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Specify the rule according to which each node obtain color
    * from
    * [color list](https://echarts.apache.org/en/option.html#series-treemap.levels.color)
    * . Optional values:
    *
    * + `'value'`:
    *
    * Map
    * [series-treemap.data.value](https://echarts.apache.org/en/option.html#series-treemap.data.value)
    * to color.
    *
    * In this way, the color of each node indicate its value.
    *
    * [visualDimension](https://echarts.apache.org/en/option.html#series-treemap.levels.visualDimension)
    * can be used to specify which dimension of
    * [data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * is used to perform visual mapping.
    *
    * + `'index'`:
    *
    * Map the `index` (ordinal number) of nodes to color.
    * Namely, in a level, the first node is mapped to the first
    * color of
    * [color list](https://echarts.apache.org/en/option.html#series-treemap.levels.color)
    * , and the second node gets the second color.
    *
    * In this way, adjacent nodes are distinguished by color.
    *
    * + `'id'`:
    *
    * Map
    * [series-treemap.data.id](https://echarts.apache.org/en/option.html#series-treemap.data.id)
    * to color.
    *
    * Since `id` is used to identify node, if user call `setOption`
    * to modify the tree, each node will remain the original color
    * before and after `setOption` called. See this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=treemap-obama&edit=1&reset=1)
    * .
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorMappingBy` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * "index"
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy
    */
  var colorMappingBy: js.UndefOr[String] = js.undefined
  
  /**
    * It indicates the range of saturation (color alpha) for nodes
    * in a level . The range of values is 0 ~ 1.
    *
    * For example, `colorSaturation` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorSaturation` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.colorSaturation
    */
  var colorSaturation: js.UndefOr[Double] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.emphasis
    */
  var emphasis: js.UndefOr[UpperLabel] = js.undefined
  
  /**
    *
    * > Tps: In treemap, `itemStyle` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColorSaturation] = js.undefined
  
  /**
    * `label` decribes the style of the label in each node.
    *
    * > Tps: In treemap, `label` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.label
    */
  var label: js.UndefOr[Ellipsis] = js.undefined
  
  /**
    * `upperLabel` is used to specify whether show label when the
    * node has children. When
    * [upperLabel.show](https://echarts.apache.org/en/option.html#series-treemap.upperLabel.show)
    * is set as `true`, the feature that "show parent label" is
    * enabled.
    *
    * The same as
    * [series-treemap.label](https://echarts.apache.org/en/option.html#series-treemap.label)
    * , the option `upperLabel` can be placed at the root of
    * [series-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * directly, or in
    * [series-treemap.level](https://echarts.apache.org/en/option.html#series-treemap.level)
    * , or in each item of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * .
    *
    * Specifically,
    * [series-treemap.label](https://echarts.apache.org/en/option.html#series-treemap.label)
    * specifies the style when a node is a leaf, while `upperLabel`
    * specifies the style when a node has children, in which case
    * the label is displayed in the inner top of the node.
    *
    * See:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.levels)
    *
    * > Tps: In treemap, `label` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.upperLabel
    */
  var upperLabel: js.UndefOr[TextShadowColor] = js.undefined
  
  /**
    * A node will not be shown when its area size is smaller than
    * this value (unit: px square).
    *
    * In this way, tiny nodes will be hidden, otherwise they will
    * huddle together.
    * When user zoom the treemap, the area size will increase and
    * the rectangle will be shown if the area size is larger than
    * this threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visibleMin` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.visibleMin
    */
  var visibleMin: js.UndefOr[Double] = js.undefined
  
  /**
    * `treemap` is able to map any dimensions of data to visual.
    *
    * The value of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * can be an array.
    * And each item of the array represents a "dimension".
    * `visualDimension` specifies the dimension on which visual
    * mapping will be performed.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visualDimension` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.visualDimension
    */
  var visualDimension: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.visualMax
    */
  var visualMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels.visualMin
    */
  var visualMin: js.UndefOr[Double] = js.undefined
}
object ChildrenVisibleMin {
  
  inline def apply(): ChildrenVisibleMin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenVisibleMin]
  }
  
  extension [Self <: ChildrenVisibleMin](x: Self) {
    
    inline def setChildrenVisibleMin(value: Double): Self = StObject.set(x, "childrenVisibleMin", value.asInstanceOf[js.Any])
    
    inline def setChildrenVisibleMinUndefined: Self = StObject.set(x, "childrenVisibleMin", js.undefined)
    
    inline def setColor(value: js.Array[js.Any]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorAlpha(value: js.Array[js.Any]): Self = StObject.set(x, "colorAlpha", value.asInstanceOf[js.Any])
    
    inline def setColorAlphaUndefined: Self = StObject.set(x, "colorAlpha", js.undefined)
    
    inline def setColorAlphaVarargs(value: js.Any*): Self = StObject.set(x, "colorAlpha", js.Array(value :_*))
    
    inline def setColorMappingBy(value: String): Self = StObject.set(x, "colorMappingBy", value.asInstanceOf[js.Any])
    
    inline def setColorMappingByUndefined: Self = StObject.set(x, "colorMappingBy", js.undefined)
    
    inline def setColorSaturation(value: Double): Self = StObject.set(x, "colorSaturation", value.asInstanceOf[js.Any])
    
    inline def setColorSaturationUndefined: Self = StObject.set(x, "colorSaturation", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: js.Any*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setEmphasis(value: UpperLabel): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
    
    inline def setItemStyle(value: BorderColorSaturation): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLabel(value: Ellipsis): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setUpperLabel(value: TextShadowColor): Self = StObject.set(x, "upperLabel", value.asInstanceOf[js.Any])
    
    inline def setUpperLabelUndefined: Self = StObject.set(x, "upperLabel", js.undefined)
    
    inline def setVisibleMin(value: Double): Self = StObject.set(x, "visibleMin", value.asInstanceOf[js.Any])
    
    inline def setVisibleMinUndefined: Self = StObject.set(x, "visibleMin", js.undefined)
    
    inline def setVisualDimension(value: Double): Self = StObject.set(x, "visualDimension", value.asInstanceOf[js.Any])
    
    inline def setVisualDimensionUndefined: Self = StObject.set(x, "visualDimension", js.undefined)
    
    inline def setVisualMax(value: Double): Self = StObject.set(x, "visualMax", value.asInstanceOf[js.Any])
    
    inline def setVisualMaxUndefined: Self = StObject.set(x, "visualMax", js.undefined)
    
    inline def setVisualMin(value: Double): Self = StObject.set(x, "visualMin", value.asInstanceOf[js.Any])
    
    inline def setVisualMinUndefined: Self = StObject.set(x, "visualMin", js.undefined)
  }
}
