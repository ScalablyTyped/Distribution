package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAxisSettingsStripStyle extends StObject {
  
  /**
    * An object defining the configuration properties for a strip label style.
    */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyleLabel] = js.undefined
}
object dxPolarChartCommonAxisSettingsStripStyle {
  
  inline def apply(): dxPolarChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartCommonAxisSettingsStripStyle] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: dxPolarChartCommonAxisSettingsStripStyleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
