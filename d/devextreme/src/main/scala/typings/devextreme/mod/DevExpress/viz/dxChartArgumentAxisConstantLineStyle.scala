package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartArgumentAxisConstantLineStyle
  extends StObject
     with dxChartCommonAxisSettingsConstantLineStyle {
  
  /**
    * Specifies the appearance of the labels of those constant lines that belong to the argument axis.
    */
  @JSName("label")
  var label_dxChartArgumentAxisConstantLineStyle: js.UndefOr[dxChartArgumentAxisConstantLineStyleLabel] = js.undefined
}
object dxChartArgumentAxisConstantLineStyle {
  
  inline def apply(): dxChartArgumentAxisConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisConstantLineStyle]
  }
  
  extension [Self <: dxChartArgumentAxisConstantLineStyle](x: Self) {
    
    inline def setLabel(value: dxChartArgumentAxisConstantLineStyleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
