package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxisTitle
  extends StObject
     with dxChartCommonAxisSettingsTitle {
  
  /**
    * Specifies the text of the axis title.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxChartValueAxisTitle {
  
  inline def apply(): dxChartValueAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisTitle]
  }
  
  extension [Self <: dxChartValueAxisTitle](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
