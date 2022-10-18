package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Dest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformPreviewTransformRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Dest] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var transform_id: js.UndefOr[Id] = js.undefined
}
object TransformPreviewTransformRequest {
  
  inline def apply(): TransformPreviewTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformPreviewTransformRequest]
  }
  
  extension [Self <: TransformPreviewTransformRequest](x: Self) {
    
    inline def setBody(value: Dest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransform_id(value: Id): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    inline def setTransform_idUndefined: Self = StObject.set(x, "transform_id", js.undefined)
  }
}
