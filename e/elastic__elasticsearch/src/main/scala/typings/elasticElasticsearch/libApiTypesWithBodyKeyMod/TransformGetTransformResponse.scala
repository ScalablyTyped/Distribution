package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformResponse extends StObject {
  
  var count: long
  
  var transforms: js.Array[TransformGetTransformTransformSummary]
}
object TransformGetTransformResponse {
  
  inline def apply(count: long, transforms: js.Array[TransformGetTransformTransformSummary]): TransformGetTransformResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformGetTransformResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setTransforms(value: js.Array[TransformGetTransformTransformSummary]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsVarargs(value: TransformGetTransformTransformSummary*): Self = StObject.set(x, "transforms", js.Array(value*))
  }
}
