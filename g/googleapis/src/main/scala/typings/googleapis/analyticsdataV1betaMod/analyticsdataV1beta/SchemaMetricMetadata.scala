package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricMetadata extends StObject {
  
  /**
    * A metric name. Useable in [Metric](#Metric)'s `name`. For example, `eventCount`.
    */
  var apiName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If reasons are specified, your access is blocked to this metric for this property. API requests from you to this property for this metric will succeed; however, the report will contain only zeros for this metric. API requests with metric filters on blocked metrics will fail. If reasons are empty, you have access to this metric. To learn more, see [Access and data-restriction management](https://support.google.com/analytics/answer/10851388).
    */
  var blockedReasons: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The display name of the category that this metrics belongs to. Similar dimensions and metrics are categorized together.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the metric is a custom metric for this property.
    */
  var customDefinition: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Still usable but deprecated names for this metric. If populated, this metric is available by either `apiName` or one of `deprecatedApiNames` for a period of time. After the deprecation period, the metric will be available only by `apiName`.
    */
  var deprecatedApiNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Description of how this metric is used and calculated.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mathematical expression for this derived metric. Can be used in [Metric](#Metric)'s `expression` field for equivalent reports. Most metrics are not expressions, and for non-expressions, this field is empty.
    */
  var expression: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this metric.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This metric's name within the Google Analytics user interface. For example, `Event count`.
    */
  var uiName: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricMetadata {
  
  inline def apply(): SchemaMetricMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricMetadata]
  }
  
  extension [Self <: SchemaMetricMetadata](x: Self) {
    
    inline def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
    
    inline def setApiNameNull: Self = StObject.set(x, "apiName", null)
    
    inline def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
    
    inline def setBlockedReasons(value: js.Array[String]): Self = StObject.set(x, "blockedReasons", value.asInstanceOf[js.Any])
    
    inline def setBlockedReasonsNull: Self = StObject.set(x, "blockedReasons", null)
    
    inline def setBlockedReasonsUndefined: Self = StObject.set(x, "blockedReasons", js.undefined)
    
    inline def setBlockedReasonsVarargs(value: String*): Self = StObject.set(x, "blockedReasons", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCustomDefinition(value: Boolean): Self = StObject.set(x, "customDefinition", value.asInstanceOf[js.Any])
    
    inline def setCustomDefinitionNull: Self = StObject.set(x, "customDefinition", null)
    
    inline def setCustomDefinitionUndefined: Self = StObject.set(x, "customDefinition", js.undefined)
    
    inline def setDeprecatedApiNames(value: js.Array[String]): Self = StObject.set(x, "deprecatedApiNames", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedApiNamesNull: Self = StObject.set(x, "deprecatedApiNames", null)
    
    inline def setDeprecatedApiNamesUndefined: Self = StObject.set(x, "deprecatedApiNames", js.undefined)
    
    inline def setDeprecatedApiNamesVarargs(value: String*): Self = StObject.set(x, "deprecatedApiNames", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionNull: Self = StObject.set(x, "expression", null)
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUiName(value: String): Self = StObject.set(x, "uiName", value.asInstanceOf[js.Any])
    
    inline def setUiNameNull: Self = StObject.set(x, "uiName", null)
    
    inline def setUiNameUndefined: Self = StObject.set(x, "uiName", js.undefined)
  }
}
