package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartValueAxisConstantLinesLabel
  extends StObject
     with dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  
  /**
    * Specifies the text to be displayed in a constant line label.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxPolarChartValueAxisConstantLinesLabel {
  
  inline def apply(): dxPolarChartValueAxisConstantLinesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxisConstantLinesLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartValueAxisConstantLinesLabel] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
