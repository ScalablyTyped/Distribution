package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformStopTransformRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var transform_id: Name
  
  var wait_for_checkpoint: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object TransformStopTransformRequest {
  
  inline def apply(transform_id: Name): TransformStopTransformRequest = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStopTransformRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformStopTransformRequest] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransform_id(value: Name): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    inline def setWait_for_checkpoint(value: Boolean): Self = StObject.set(x, "wait_for_checkpoint", value.asInstanceOf[js.Any])
    
    inline def setWait_for_checkpointUndefined: Self = StObject.set(x, "wait_for_checkpoint", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
