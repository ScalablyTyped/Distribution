package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.charts.TextOverflow
import typings.devextreme.mod.DevExpress.common.charts.WordWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettingsTitle extends StObject {
  
  /**
    * Aligns the axis title to the left, center, or right of the axis.
    */
  var alignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Specifies font properties for the axis title.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Adds a pixel-measured empty space between the axis title and axis labels.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies what to do with the axis title when it overflows the allocated space after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[TextOverflow] = js.undefined
  
  /**
    * Specifies how to wrap the axis title if it does not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrap] = js.undefined
}
object dxChartCommonAxisSettingsTitle {
  
  inline def apply(): dxChartCommonAxisSettingsTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartCommonAxisSettingsTitle] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: HorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setTextOverflow(value: TextOverflow): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setWordWrap(value: WordWrap): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
