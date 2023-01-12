package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformPreviewTransformResponse[TTransform] extends StObject {
  
  var generated_dest_index: IndicesIndexState
  
  var preview: js.Array[TTransform]
}
object TransformPreviewTransformResponse {
  
  inline def apply[TTransform](generated_dest_index: IndicesIndexState, preview: js.Array[TTransform]): TransformPreviewTransformResponse[TTransform] = {
    val __obj = js.Dynamic.literal(generated_dest_index = generated_dest_index.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformPreviewTransformResponse[TTransform]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformPreviewTransformResponse[?], TTransform] (val x: Self & TransformPreviewTransformResponse[TTransform]) extends AnyVal {
    
    inline def setGenerated_dest_index(value: IndicesIndexState): Self = StObject.set(x, "generated_dest_index", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: js.Array[TTransform]): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewVarargs(value: TTransform*): Self = StObject.set(x, "preview", js.Array(value*))
  }
}
