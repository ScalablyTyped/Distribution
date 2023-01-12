package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.LabelOverlap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettingsLabel extends StObject {
  
  /**
    * Specifies font properties for axis labels.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Specifies the spacing between an axis and its labels in pixels.
    */
  var indentFromAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * Decides how to arrange axis labels when there is not enough space to keep all of them.
    */
  var overlappingBehavior: js.UndefOr[LabelOverlap] = js.undefined
  
  /**
    * Indicates whether or not axis labels are visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxPolarChartCommonAxisSettingsLabel {
  
  inline def apply(): dxPolarChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartCommonAxisSettingsLabel] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setIndentFromAxis(value: Double): Self = StObject.set(x, "indentFromAxis", value.asInstanceOf[js.Any])
    
    inline def setIndentFromAxisUndefined: Self = StObject.set(x, "indentFromAxis", js.undefined)
    
    inline def setOverlappingBehavior(value: LabelOverlap): Self = StObject.set(x, "overlappingBehavior", value.asInstanceOf[js.Any])
    
    inline def setOverlappingBehaviorUndefined: Self = StObject.set(x, "overlappingBehavior", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
