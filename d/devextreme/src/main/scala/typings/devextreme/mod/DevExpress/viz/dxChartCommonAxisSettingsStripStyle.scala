package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettingsStripStyle extends StObject {
  
  /**
    * Configures the appearance of strip labels.
    */
  var label: js.UndefOr[dxChartCommonAxisSettingsStripStyleLabel] = js.undefined
  
  /**
    * Generates a pixel-measured empty space between the left/right border of a strip and the strip label.
    */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Generates a pixel-measured empty space between the top/bottom border of a strip and the strip label.
    */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
}
object dxChartCommonAxisSettingsStripStyle {
  
  inline def apply(): dxChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartCommonAxisSettingsStripStyle] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: dxChartCommonAxisSettingsStripStyleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPaddingLeftRight(value: Double): Self = StObject.set(x, "paddingLeftRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftRightUndefined: Self = StObject.set(x, "paddingLeftRight", js.undefined)
    
    inline def setPaddingTopBottom(value: Double): Self = StObject.set(x, "paddingTopBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopBottomUndefined: Self = StObject.set(x, "paddingTopBottom", js.undefined)
  }
}
