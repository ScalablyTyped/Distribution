package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformStartTransformRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var transform_id: Id
}
object TransformStartTransformRequest {
  
  inline def apply(transform_id: Id): TransformStartTransformRequest = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStartTransformRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformStartTransformRequest] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransform_id(value: Id): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
  }
}
