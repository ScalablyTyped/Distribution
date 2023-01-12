package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlCategory extends StObject {
  
  var category_id: ulong
  
  var examples: js.Array[String]
  
  var grok_pattern: js.UndefOr[String] = js.undefined
  
  var job_id: Id
  
  var max_matching_length: ulong
  
  var mlcategory: String
  
  var num_matches: js.UndefOr[long] = js.undefined
  
  var p: js.UndefOr[String] = js.undefined
  
  var partition_field_name: js.UndefOr[String] = js.undefined
  
  var partition_field_value: js.UndefOr[String] = js.undefined
  
  var preferred_to_categories: js.UndefOr[js.Array[Id]] = js.undefined
  
  var regex: String
  
  var result_type: String
  
  var terms: String
}
object MlCategory {
  
  inline def apply(
    category_id: ulong,
    examples: js.Array[String],
    job_id: Id,
    max_matching_length: ulong,
    mlcategory: String,
    regex: String,
    result_type: String,
    terms: String
  ): MlCategory = {
    val __obj = js.Dynamic.literal(category_id = category_id.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], max_matching_length = max_matching_length.asInstanceOf[js.Any], mlcategory = mlcategory.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], result_type = result_type.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlCategory] (val x: Self) extends AnyVal {
    
    inline def setCategory_id(value: ulong): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: js.Array[String]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesVarargs(value: String*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setGrok_pattern(value: String): Self = StObject.set(x, "grok_pattern", value.asInstanceOf[js.Any])
    
    inline def setGrok_patternUndefined: Self = StObject.set(x, "grok_pattern", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setMax_matching_length(value: ulong): Self = StObject.set(x, "max_matching_length", value.asInstanceOf[js.Any])
    
    inline def setMlcategory(value: String): Self = StObject.set(x, "mlcategory", value.asInstanceOf[js.Any])
    
    inline def setNum_matches(value: long): Self = StObject.set(x, "num_matches", value.asInstanceOf[js.Any])
    
    inline def setNum_matchesUndefined: Self = StObject.set(x, "num_matches", js.undefined)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPartition_field_name(value: String): Self = StObject.set(x, "partition_field_name", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_nameUndefined: Self = StObject.set(x, "partition_field_name", js.undefined)
    
    inline def setPartition_field_value(value: String): Self = StObject.set(x, "partition_field_value", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_valueUndefined: Self = StObject.set(x, "partition_field_value", js.undefined)
    
    inline def setPreferred_to_categories(value: js.Array[Id]): Self = StObject.set(x, "preferred_to_categories", value.asInstanceOf[js.Any])
    
    inline def setPreferred_to_categoriesUndefined: Self = StObject.set(x, "preferred_to_categories", js.undefined)
    
    inline def setPreferred_to_categoriesVarargs(value: Id*): Self = StObject.set(x, "preferred_to_categories", js.Array(value*))
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
  }
}
