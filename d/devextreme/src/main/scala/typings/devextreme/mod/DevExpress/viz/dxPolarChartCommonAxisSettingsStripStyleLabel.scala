package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettingsStripStyleLabel extends StObject {
  
  /**
    * Specifies font properties for a strip label.
    */
  var font: js.UndefOr[Font] = js.undefined
}
object dxPolarChartCommonAxisSettingsStripStyleLabel {
  
  inline def apply(): dxPolarChartCommonAxisSettingsStripStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyleLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartCommonAxisSettingsStripStyleLabel] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
