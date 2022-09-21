package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadata extends StObject {
  
  /**
    * Output only. List of aggregation types available for insight.
    */
  var aggregations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Category of the insight.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Common name of the insight.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. List of fields available for insight.
    */
  var fields: js.UndefOr[
    js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField]
  ] = js.undefined
  
  /**
    * Output only. List of groupings available for insight.
    */
  var groups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Sub-Category of the insight.
    */
  var subCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Type of the insight. It is metadata describing whether the insight is a metric (e.g. count) or a report (e.g. list, status).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadata {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadata](x: Self) {
    
    inline def setAggregations(value: js.Array[String]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsNull: Self = StObject.set(x, "aggregations", null)
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: String*): Self = StObject.set(x, "aggregations", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFields(value: js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsNull: Self = StObject.set(x, "groups", null)
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setSubCategory(value: String): Self = StObject.set(x, "subCategory", value.asInstanceOf[js.Any])
    
    inline def setSubCategoryNull: Self = StObject.set(x, "subCategory", null)
    
    inline def setSubCategoryUndefined: Self = StObject.set(x, "subCategory", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
