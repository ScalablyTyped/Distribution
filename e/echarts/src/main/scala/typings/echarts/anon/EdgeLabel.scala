package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeLabel extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.edgeLabel
    */
  var edgeLabel: js.UndefOr[FontSize] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}
object EdgeLabel {
  
  @scala.inline
  def apply(): EdgeLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLabel]
  }
  
  @scala.inline
  implicit class EdgeLabelMutableBuilder[Self <: EdgeLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeLabel(value: FontSize): Self = StObject.set(x, "edgeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeLabelUndefined: Self = StObject.set(x, "edgeLabel", js.undefined)
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: Distance): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
