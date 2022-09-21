package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.RelativePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettingsConstantLineStyleLabel extends StObject {
  
  /**
    * Specifies font properties for constant line labels.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Specifies the position of constant line labels on the chart plot.
    */
  var position: js.UndefOr[RelativePosition] = js.undefined
  
  /**
    * Makes constant line labels visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxChartCommonAxisSettingsConstantLineStyleLabel {
  
  inline def apply(): dxChartCommonAxisSettingsConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsConstantLineStyleLabel]
  }
  
  extension [Self <: dxChartCommonAxisSettingsConstantLineStyleLabel](x: Self) {
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setPosition(value: RelativePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
