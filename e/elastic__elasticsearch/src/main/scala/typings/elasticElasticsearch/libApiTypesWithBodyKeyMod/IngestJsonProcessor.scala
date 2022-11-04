package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestJsonProcessor
  extends StObject
     with IngestProcessorBase {
  
  var add_to_root: js.UndefOr[Boolean] = js.undefined
  
  var add_to_root_conflict_strategy: js.UndefOr[IngestJsonProcessorConflictStrategy] = js.undefined
  
  var allow_duplicate_keys: js.UndefOr[Boolean] = js.undefined
  
  var field: Field
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestJsonProcessor {
  
  inline def apply(field: Field): IngestJsonProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestJsonProcessor]
  }
  
  extension [Self <: IngestJsonProcessor](x: Self) {
    
    inline def setAdd_to_root(value: Boolean): Self = StObject.set(x, "add_to_root", value.asInstanceOf[js.Any])
    
    inline def setAdd_to_rootUndefined: Self = StObject.set(x, "add_to_root", js.undefined)
    
    inline def setAdd_to_root_conflict_strategy(value: IngestJsonProcessorConflictStrategy): Self = StObject.set(x, "add_to_root_conflict_strategy", value.asInstanceOf[js.Any])
    
    inline def setAdd_to_root_conflict_strategyUndefined: Self = StObject.set(x, "add_to_root_conflict_strategy", js.undefined)
    
    inline def setAllow_duplicate_keys(value: Boolean): Self = StObject.set(x, "allow_duplicate_keys", value.asInstanceOf[js.Any])
    
    inline def setAllow_duplicate_keysUndefined: Self = StObject.set(x, "allow_duplicate_keys", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
