package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformStopTransform
  extends StObject
     with Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var transform_id: String
  
  var wait_for_checkpoint: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object TransformStopTransform {
  
  @scala.inline
  def apply(transform_id: String): TransformStopTransform = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStopTransform]
  }
  
  @scala.inline
  implicit class TransformStopTransformMutableBuilder[Self <: TransformStopTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTransform_id(value: String): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_checkpoint(value: Boolean): Self = StObject.set(x, "wait_for_checkpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_checkpointUndefined: Self = StObject.set(x, "wait_for_checkpoint", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
