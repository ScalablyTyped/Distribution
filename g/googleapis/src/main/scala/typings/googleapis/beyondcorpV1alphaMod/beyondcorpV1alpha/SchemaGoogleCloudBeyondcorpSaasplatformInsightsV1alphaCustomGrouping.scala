package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaCustomGrouping extends StObject {
  
  /**
    * Optional. Filterable parameters to be added to the grouping clause. Available fields could be fetched by calling insight list and get APIs in `BASIC` view. `=` is the only comparison operator supported. `AND` is the only logical operator supported. Usage: field_filter="fieldName1=fieldVal1 AND fieldName2=fieldVal2". NOTE: Only `AND` conditions are allowed. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for the filtering the corresponding fields in this filter field. (These expressions are based on the filter language described at https://google.aip.dev/160).
    */
  var fieldFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Fields to be used for grouping. NOTE: Use the `filter_alias` from `Insight.Metadata.Field` message for declaring the fields to be grouped-by here.
    */
  var groupFields: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaCustomGrouping {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaCustomGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaCustomGrouping]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaCustomGrouping](x: Self) {
    
    inline def setFieldFilter(value: String): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
    
    inline def setFieldFilterNull: Self = StObject.set(x, "fieldFilter", null)
    
    inline def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
    
    inline def setGroupFields(value: js.Array[String]): Self = StObject.set(x, "groupFields", value.asInstanceOf[js.Any])
    
    inline def setGroupFieldsNull: Self = StObject.set(x, "groupFields", null)
    
    inline def setGroupFieldsUndefined: Self = StObject.set(x, "groupFields", js.undefined)
    
    inline def setGroupFieldsVarargs(value: String*): Self = StObject.set(x, "groupFields", js.Array(value*))
  }
}
