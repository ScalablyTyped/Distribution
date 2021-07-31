package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelLineStyle extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.label
    */
  var label: js.UndefOr[FontSize] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}
object LabelLineStyle {
  
  @scala.inline
  def apply(): LabelLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLineStyle]
  }
  
  @scala.inline
  implicit class LabelLineStyleMutableBuilder[Self <: LabelLineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: FontSize): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
