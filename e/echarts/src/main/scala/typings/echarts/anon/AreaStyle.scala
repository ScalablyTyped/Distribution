package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaStyle extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[Opacity] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}
object AreaStyle {
  
  @scala.inline
  def apply(): AreaStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaStyle]
  }
  
  @scala.inline
  implicit class AreaStyleMutableBuilder[Self <: AreaStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaStyle(value: Opacity): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: BorderRadius): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
