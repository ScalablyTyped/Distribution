package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequirementDateFilter
  extends StObject
     with Element {
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _searchParam: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * The path attribute contains a [Simple FHIR Subset](fhirpath.html#simple) that allows path traversal, but not calculation.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * A date parameter that refers to a search parameter defined on the specified type of the DataRequirement, and which searches on elements of type date, dateTime, Period, Schedule, or Timing.
    */
  var searchParam: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration before now.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration before now.
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration before now.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
}
object DataRequirementDateFilter {
  
  inline def apply(): DataRequirementDateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRequirementDateFilter]
  }
  
  extension [Self <: DataRequirementDateFilter](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSearchParam(value: String): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDuration(value: Duration): Self = StObject.set(x, "valueDuration", value.asInstanceOf[js.Any])
    
    inline def setValueDurationUndefined: Self = StObject.set(x, "valueDuration", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_searchParam(value: Element): Self = StObject.set(x, "_searchParam", value.asInstanceOf[js.Any])
    
    inline def set_searchParamUndefined: Self = StObject.set(x, "_searchParam", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
  }
}
