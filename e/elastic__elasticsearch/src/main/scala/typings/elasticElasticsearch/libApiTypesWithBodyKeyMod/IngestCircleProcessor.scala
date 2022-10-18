package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestCircleProcessor
  extends StObject
     with IngestProcessorBase {
  
  var error_distance: double
  
  var field: Field
  
  var ignore_missing: Boolean
  
  var shape_type: IngestShapeType
  
  var target_field: Field
}
object IngestCircleProcessor {
  
  inline def apply(
    error_distance: double,
    field: Field,
    ignore_missing: Boolean,
    shape_type: IngestShapeType,
    target_field: Field
  ): IngestCircleProcessor = {
    val __obj = js.Dynamic.literal(error_distance = error_distance.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], ignore_missing = ignore_missing.asInstanceOf[js.Any], shape_type = shape_type.asInstanceOf[js.Any], target_field = target_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestCircleProcessor]
  }
  
  extension [Self <: IngestCircleProcessor](x: Self) {
    
    inline def setError_distance(value: double): Self = StObject.set(x, "error_distance", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setShape_type(value: IngestShapeType): Self = StObject.set(x, "shape_type", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
  }
}
