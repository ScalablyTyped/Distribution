package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDetectorRead extends StObject {
  
  var by_field_name: js.UndefOr[Field] = js.undefined
  
  var custom_rules: js.UndefOr[js.Array[MlDetectionRule]] = js.undefined
  
  var detector_description: js.UndefOr[String] = js.undefined
  
  var detector_index: js.UndefOr[integer] = js.undefined
  
  var exclude_frequent: js.UndefOr[MlExcludeFrequent] = js.undefined
  
  var field_name: js.UndefOr[Field] = js.undefined
  
  var function: String
  
  var over_field_name: js.UndefOr[Field] = js.undefined
  
  var partition_field_name: js.UndefOr[Field] = js.undefined
  
  var use_null: js.UndefOr[Boolean] = js.undefined
}
object MlDetectorRead {
  
  inline def apply(function: String): MlDetectorRead = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDetectorRead]
  }
  
  extension [Self <: MlDetectorRead](x: Self) {
    
    inline def setBy_field_name(value: Field): Self = StObject.set(x, "by_field_name", value.asInstanceOf[js.Any])
    
    inline def setBy_field_nameUndefined: Self = StObject.set(x, "by_field_name", js.undefined)
    
    inline def setCustom_rules(value: js.Array[MlDetectionRule]): Self = StObject.set(x, "custom_rules", value.asInstanceOf[js.Any])
    
    inline def setCustom_rulesUndefined: Self = StObject.set(x, "custom_rules", js.undefined)
    
    inline def setCustom_rulesVarargs(value: MlDetectionRule*): Self = StObject.set(x, "custom_rules", js.Array(value*))
    
    inline def setDetector_description(value: String): Self = StObject.set(x, "detector_description", value.asInstanceOf[js.Any])
    
    inline def setDetector_descriptionUndefined: Self = StObject.set(x, "detector_description", js.undefined)
    
    inline def setDetector_index(value: integer): Self = StObject.set(x, "detector_index", value.asInstanceOf[js.Any])
    
    inline def setDetector_indexUndefined: Self = StObject.set(x, "detector_index", js.undefined)
    
    inline def setExclude_frequent(value: MlExcludeFrequent): Self = StObject.set(x, "exclude_frequent", value.asInstanceOf[js.Any])
    
    inline def setExclude_frequentUndefined: Self = StObject.set(x, "exclude_frequent", js.undefined)
    
    inline def setField_name(value: Field): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    inline def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setOver_field_name(value: Field): Self = StObject.set(x, "over_field_name", value.asInstanceOf[js.Any])
    
    inline def setOver_field_nameUndefined: Self = StObject.set(x, "over_field_name", js.undefined)
    
    inline def setPartition_field_name(value: Field): Self = StObject.set(x, "partition_field_name", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_nameUndefined: Self = StObject.set(x, "partition_field_name", js.undefined)
    
    inline def setUse_null(value: Boolean): Self = StObject.set(x, "use_null", value.asInstanceOf[js.Any])
    
    inline def setUse_nullUndefined: Self = StObject.set(x, "use_null", js.undefined)
  }
}
