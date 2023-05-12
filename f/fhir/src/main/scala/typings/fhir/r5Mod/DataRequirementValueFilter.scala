package typings.fhir.r5Mod

import typings.fhir.fhirStrings.eb
import typings.fhir.fhirStrings.eq
import typings.fhir.fhirStrings.ge
import typings.fhir.fhirStrings.gt
import typings.fhir.fhirStrings.le
import typings.fhir.fhirStrings.lt
import typings.fhir.fhirStrings.sa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequirementValueFilter
  extends StObject
     with Element {
  
  var _comparator: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _searchParam: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * The comparator to be used to determine whether the value is matching.
    */
  var comparator: js.UndefOr[eq | gt | lt | ge | le | sa | eb] = js.undefined
  
  /**
    * The path attribute contains a [Simple FHIR Subset](fhirpath.html#simple) that allows path traversal, but not calculation.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * A search parameter defined on the specified type of the DataRequirement, and which searches on elements of a type compatible with the type of the valueFilter.value[x] for the filter.
    */
  var searchParam: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the filter.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the filter.
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The value of the filter.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
}
object DataRequirementValueFilter {
  
  inline def apply(): DataRequirementValueFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRequirementValueFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRequirementValueFilter] (val x: Self) extends AnyVal {
    
    inline def setComparator(value: eq | gt | lt | ge | le | sa | eb): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
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
    
    inline def set_comparator(value: Element): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    inline def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_searchParam(value: Element): Self = StObject.set(x, "_searchParam", value.asInstanceOf[js.Any])
    
    inline def set_searchParamUndefined: Self = StObject.set(x, "_searchParam", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
  }
}
