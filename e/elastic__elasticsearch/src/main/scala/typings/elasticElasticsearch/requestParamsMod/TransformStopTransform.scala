package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformStopTransform extends Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var transform_id: String = js.native
  
  var wait_for_checkpoint: js.UndefOr[Boolean] = js.native
  
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}
object TransformStopTransform {
  
  @scala.inline
  def apply(transform_id: String): TransformStopTransform = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStopTransform]
  }
  
  @scala.inline
  implicit class TransformStopTransformOps[Self <: TransformStopTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransform_id(value: String): Self = this.set("transform_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWait_for_checkpoint(value: Boolean): Self = this.set("wait_for_checkpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_for_checkpoint: Self = this.set("wait_for_checkpoint", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = this.set("wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_for_completion: Self = this.set("wait_for_completion", js.undefined)
  }
}
