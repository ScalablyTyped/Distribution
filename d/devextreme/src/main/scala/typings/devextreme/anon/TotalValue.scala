package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TotalValue extends StObject {
  
  var component: js.UndefOr[dxDataGrid] = js.native
  
  var groupIndex: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var summaryProcess: js.UndefOr[String] = js.native
  
  var totalValue: js.UndefOr[js.Any] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object TotalValue {
  
  @scala.inline
  def apply(): TotalValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalValue]
  }
  
  @scala.inline
  implicit class TotalValueMutableBuilder[Self <: TotalValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSummaryProcess(value: String): Self = StObject.set(x, "summaryProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryProcessUndefined: Self = StObject.set(x, "summaryProcess", js.undefined)
    
    @scala.inline
    def setTotalValue(value: js.Any): Self = StObject.set(x, "totalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalValueUndefined: Self = StObject.set(x, "totalValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
