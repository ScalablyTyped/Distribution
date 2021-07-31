package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryProcess extends StObject {
  
  var summaryProcess: js.UndefOr[String] = js.undefined
  
  var totalValue: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object SummaryProcess {
  
  @scala.inline
  def apply(): SummaryProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryProcess]
  }
  
  @scala.inline
  implicit class SummaryProcessMutableBuilder[Self <: SummaryProcess] (val x: Self) extends AnyVal {
    
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
