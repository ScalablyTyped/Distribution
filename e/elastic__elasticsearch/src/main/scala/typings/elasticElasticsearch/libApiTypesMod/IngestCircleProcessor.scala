package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestCircleProcessor
  extends StObject
     with IngestProcessorBase {
  
  var error_distance: double
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var shape_type: IngestShapeType
  
  var target_field: js.UndefOr[Field] = js.undefined
}
object IngestCircleProcessor {
  
  inline def apply(error_distance: double, field: Field, shape_type: IngestShapeType): IngestCircleProcessor = {
    val __obj = js.Dynamic.literal(error_distance = error_distance.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], shape_type = shape_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestCircleProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestCircleProcessor] (val x: Self) extends AnyVal {
    
    inline def setError_distance(value: double): Self = StObject.set(x, "error_distance", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setShape_type(value: IngestShapeType): Self = StObject.set(x, "shape_type", value.asInstanceOf[js.Any])
    
    inline def setTarget_field(value: Field): Self = StObject.set(x, "target_field", value.asInstanceOf[js.Any])
    
    inline def setTarget_fieldUndefined: Self = StObject.set(x, "target_field", js.undefined)
  }
}
