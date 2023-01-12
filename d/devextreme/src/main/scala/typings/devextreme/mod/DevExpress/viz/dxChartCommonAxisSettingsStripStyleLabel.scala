package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettingsStripStyleLabel extends StObject {
  
  /**
    * Specifies font properties for strip labels.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Aligns strip labels in the horizontal direction.
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Aligns strip labels in the vertical direction.
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment] = js.undefined
}
object dxChartCommonAxisSettingsStripStyleLabel {
  
  inline def apply(): dxChartCommonAxisSettingsStripStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyleLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartCommonAxisSettingsStripStyleLabel] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(value: HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
