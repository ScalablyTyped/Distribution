package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestEnrichProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var max_matches: js.UndefOr[integer] = js.undefined
  
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  var policy_name: String
  
  var shape_relation: js.UndefOr[GeoShapeRelation] = js.undefined
  
  var target_field: Field
}
object IngestEnrichProcessor {
  
  inline def apply(field: Field, policy_name: String, target_field: Field): IngestEnrichProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], policy_name = policy_name.asInstanceOf[js.Any], target_field = target_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestEnrichProcessor]
  }
  
  extension [Self <: IngestEnrichProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setMax_matches(value: integer): Self = StObject.set(x, "max_matches", value.asInstanceOf[js.Any])
    
    inline def setMax_matchesUndefined: Self = StObject.set(x, "max_matches", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setPolicy_name(value: String): Self = StObject.set(x, "policy_name", value.asInstanceOf[js.Any])
    
    inline def setShape_relation(value: GeoShapeRelation): Self = StObject.set(x, "shape_relation", value.asInstanceOf[js.Any])
    
    inline def setShape_relationUndefined: Self = StObject.set(x, "shape_relation", js.undefined)
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
  }
}
