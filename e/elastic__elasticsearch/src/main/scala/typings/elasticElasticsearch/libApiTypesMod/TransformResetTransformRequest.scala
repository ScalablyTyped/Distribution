package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformResetTransformRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var transform_id: Id
}
object TransformResetTransformRequest {
  
  inline def apply(transform_id: Id): TransformResetTransformRequest = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResetTransformRequest]
  }
  
  extension [Self <: TransformResetTransformRequest](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setTransform_id(value: Id): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
  }
}
