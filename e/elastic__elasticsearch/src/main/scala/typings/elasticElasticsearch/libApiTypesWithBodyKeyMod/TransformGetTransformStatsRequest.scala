package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[long] = js.undefined
  
  var size: js.UndefOr[long] = js.undefined
  
  var transform_id: Names
}
object TransformGetTransformStatsRequest {
  
  inline def apply(transform_id: Names): TransformGetTransformStatsRequest = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStatsRequest]
  }
  
  extension [Self <: TransformGetTransformStatsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setFrom(value: long): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTransform_id(value: Names): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    inline def setTransform_idVarargs(value: Name*): Self = StObject.set(x, "transform_id", js.Array(value*))
  }
}
