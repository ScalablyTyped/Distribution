package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartArgumentAxisConstantLinesLabel
  extends StObject
     with dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  
  /**
    * Specifies the text to be displayed in a constant line label.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxPolarChartArgumentAxisConstantLinesLabel {
  
  inline def apply(): dxPolarChartArgumentAxisConstantLinesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisConstantLinesLabel]
  }
  
  extension [Self <: dxPolarChartArgumentAxisConstantLinesLabel](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
