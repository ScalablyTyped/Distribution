package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.axis.INumeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeAxis
  extends StObject
     with INumeric {
  
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[Any] = js.undefined
}
object ITimeAxis {
  
  inline def apply(): ITimeAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeAxis]
  }
  
  extension [Self <: ITimeAxis](x: Self) {
    
    inline def setDateFormat(value: Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setFromDate(value: Any): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setStep(value: Array): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setToDate(value: Any): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
  }
}
