package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxisConstantLineStyle
  extends StObject
     with dxChartCommonAxisSettingsConstantLineStyle {
  
  /**
    * Specifies the appearance of the labels of those constant lines that belong to the value axis.
    */
  @JSName("label")
  var label_dxChartValueAxisConstantLineStyle: js.UndefOr[dxChartValueAxisConstantLineStyleLabel] = js.undefined
}
object dxChartValueAxisConstantLineStyle {
  
  inline def apply(): dxChartValueAxisConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisConstantLineStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartValueAxisConstantLineStyle] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: dxChartValueAxisConstantLineStyleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
