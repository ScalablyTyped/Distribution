package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryProcess extends StObject {
  
  var summaryProcess: js.UndefOr[String] = js.undefined
  
  var totalValue: js.UndefOr[Any] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object SummaryProcess {
  
  inline def apply(): SummaryProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryProcess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SummaryProcess] (val x: Self) extends AnyVal {
    
    inline def setSummaryProcess(value: String): Self = StObject.set(x, "summaryProcess", value.asInstanceOf[js.Any])
    
    inline def setSummaryProcessUndefined: Self = StObject.set(x, "summaryProcess", js.undefined)
    
    inline def setTotalValue(value: Any): Self = StObject.set(x, "totalValue", value.asInstanceOf[js.Any])
    
    inline def setTotalValueUndefined: Self = StObject.set(x, "totalValue", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
