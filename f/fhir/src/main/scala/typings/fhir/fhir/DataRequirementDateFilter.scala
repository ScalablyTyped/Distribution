package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What dates/date ranges are expected
  */
trait DataRequirementDateFilter
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * The date-valued attribute of the filter
    */
  var path: String
  
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
}
object DataRequirementDateFilter {
  
  inline def apply(path: String): DataRequirementDateFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementDateFilter]
  }
  
  extension [Self <: DataRequirementDateFilter](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValueDateTime(value: dateTime): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDuration(value: Duration): Self = StObject.set(x, "valueDuration", value.asInstanceOf[js.Any])
    
    inline def setValueDurationUndefined: Self = StObject.set(x, "valueDuration", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
  }
}
