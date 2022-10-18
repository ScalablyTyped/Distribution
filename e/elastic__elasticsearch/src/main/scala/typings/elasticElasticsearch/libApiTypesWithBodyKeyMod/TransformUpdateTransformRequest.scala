package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformUpdateTransformRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Meta] = js.undefined
  
  var defer_validation: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var transform_id: Id
}
object TransformUpdateTransformRequest {
  
  inline def apply(transform_id: Id): TransformUpdateTransformRequest = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformUpdateTransformRequest]
  }
  
  extension [Self <: TransformUpdateTransformRequest](x: Self) {
    
    inline def setBody(value: Meta): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDefer_validation(value: Boolean): Self = StObject.set(x, "defer_validation", value.asInstanceOf[js.Any])
    
    inline def setDefer_validationUndefined: Self = StObject.set(x, "defer_validation", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransform_id(value: Id): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
  }
}
