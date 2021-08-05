package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalValue extends StObject {
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
  
  var groupIndex: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var summaryProcess: js.UndefOr[String] = js.undefined
  
  var totalValue: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object TotalValue {
  
  inline def apply(): TotalValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalValue]
  }
  
  extension [Self <: TotalValue](x: Self) {
    
    inline def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSummaryProcess(value: String): Self = StObject.set(x, "summaryProcess", value.asInstanceOf[js.Any])
    
    inline def setSummaryProcessUndefined: Self = StObject.set(x, "summaryProcess", js.undefined)
    
    inline def setTotalValue(value: js.Any): Self = StObject.set(x, "totalValue", value.asInstanceOf[js.Any])
    
    inline def setTotalValueUndefined: Self = StObject.set(x, "totalValue", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
