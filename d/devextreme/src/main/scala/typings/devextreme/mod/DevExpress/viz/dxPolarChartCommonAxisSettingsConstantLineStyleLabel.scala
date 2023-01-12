package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettingsConstantLineStyleLabel extends StObject {
  
  /**
    * Specifies font properties for a constant line label.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Indicates whether or not to display labels for the axis constant lines.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  
  inline def apply(): dxPolarChartCommonAxisSettingsConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsConstantLineStyleLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartCommonAxisSettingsConstantLineStyleLabel] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
