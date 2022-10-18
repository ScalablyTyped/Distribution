package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsFieldSelection extends StObject {
  
  var feature_type: js.UndefOr[String] = js.undefined
  
  var is_included: Boolean
  
  var is_required: Boolean
  
  var mapping_types: js.Array[String]
  
  var name: Field
  
  var reason: js.UndefOr[String] = js.undefined
}
object MlDataframeAnalyticsFieldSelection {
  
  inline def apply(is_included: Boolean, is_required: Boolean, mapping_types: js.Array[String], name: Field): MlDataframeAnalyticsFieldSelection = {
    val __obj = js.Dynamic.literal(is_included = is_included.asInstanceOf[js.Any], is_required = is_required.asInstanceOf[js.Any], mapping_types = mapping_types.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsFieldSelection]
  }
  
  extension [Self <: MlDataframeAnalyticsFieldSelection](x: Self) {
    
    inline def setFeature_type(value: String): Self = StObject.set(x, "feature_type", value.asInstanceOf[js.Any])
    
    inline def setFeature_typeUndefined: Self = StObject.set(x, "feature_type", js.undefined)
    
    inline def setIs_included(value: Boolean): Self = StObject.set(x, "is_included", value.asInstanceOf[js.Any])
    
    inline def setIs_required(value: Boolean): Self = StObject.set(x, "is_required", value.asInstanceOf[js.Any])
    
    inline def setMapping_types(value: js.Array[String]): Self = StObject.set(x, "mapping_types", value.asInstanceOf[js.Any])
    
    inline def setMapping_typesVarargs(value: String*): Self = StObject.set(x, "mapping_types", js.Array(value*))
    
    inline def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
