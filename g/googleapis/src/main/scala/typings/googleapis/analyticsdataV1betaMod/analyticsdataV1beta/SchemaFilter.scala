package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilter extends StObject {
  
  /**
    * A filter for two values.
    */
  var betweenFilter: js.UndefOr[SchemaBetweenFilter] = js.undefined
  
  /**
    * The dimension name or metric name. In most methods, dimensions & metrics can be used for the first time in this field. However in a RunPivotReportRequest, this field must be additionally specified by name in the RunPivotReportRequest's dimensions or metrics.
    */
  var fieldName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A filter for in list values.
    */
  var inListFilter: js.UndefOr[SchemaInListFilter] = js.undefined
  
  /**
    * A filter for numeric or date values.
    */
  var numericFilter: js.UndefOr[SchemaNumericFilter] = js.undefined
  
  /**
    * Strings related filter.
    */
  var stringFilter: js.UndefOr[SchemaStringFilter] = js.undefined
}
object SchemaFilter {
  
  inline def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  extension [Self <: SchemaFilter](x: Self) {
    
    inline def setBetweenFilter(value: SchemaBetweenFilter): Self = StObject.set(x, "betweenFilter", value.asInstanceOf[js.Any])
    
    inline def setBetweenFilterUndefined: Self = StObject.set(x, "betweenFilter", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setInListFilter(value: SchemaInListFilter): Self = StObject.set(x, "inListFilter", value.asInstanceOf[js.Any])
    
    inline def setInListFilterUndefined: Self = StObject.set(x, "inListFilter", js.undefined)
    
    inline def setNumericFilter(value: SchemaNumericFilter): Self = StObject.set(x, "numericFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericFilterUndefined: Self = StObject.set(x, "numericFilter", js.undefined)
    
    inline def setStringFilter(value: SchemaStringFilter): Self = StObject.set(x, "stringFilter", value.asInstanceOf[js.Any])
    
    inline def setStringFilterUndefined: Self = StObject.set(x, "stringFilter", js.undefined)
  }
}
