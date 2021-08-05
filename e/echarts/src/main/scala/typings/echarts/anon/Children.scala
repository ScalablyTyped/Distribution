package typings.echarts.anon

import typings.echarts.echarts.EChartOption.BaseTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  /**
    * child nodes, recursive definition, configurations are the
    * same as
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.children
    */
  var children: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Enable hyperlink jump when clicking on node.
    * It is avaliable when
    * [series-treemap.nodeClick](https://echarts.apache.org/en/option.html#series-treemap.nodeClick)
    * is `'link'`.
    *
    * See
    * [series-treemap.data.target](https://echarts.apache.org/en/option.html#series-treemap.data.target)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.link
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * The same meaning as `target` in `html` `<a>` label, See
    * [series-treemap.data.link](https://echarts.apache.org/en/option.html#series-treemap.data.link)
    * . Option values are: `'blank'` or `'self'`.
    *
    *
    * @default
    * "blank"
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.target
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.undefined
}
object Children {
  
  inline def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: js.Array[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTooltip(value: BaseTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
