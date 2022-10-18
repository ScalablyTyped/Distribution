package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStatsResponse extends StObject {
  
  var count: long
  
  var transforms: js.Array[TransformGetTransformStatsTransformStats]
}
object TransformGetTransformStatsResponse {
  
  inline def apply(count: long, transforms: js.Array[TransformGetTransformStatsTransformStats]): TransformGetTransformStatsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStatsResponse]
  }
  
  extension [Self <: TransformGetTransformStatsResponse](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setTransforms(value: js.Array[TransformGetTransformStatsTransformStats]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsVarargs(value: TransformGetTransformStatsTransformStats*): Self = StObject.set(x, "transforms", js.Array(value*))
  }
}
