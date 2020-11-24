package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveAnimationRequest extends js.Object {
  
  /**
    * Animation id.
    */
  var animationId: String = js.native
}
object ResolveAnimationRequest {
  
  @scala.inline
  def apply(animationId: String): ResolveAnimationRequest = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveAnimationRequest]
  }
  
  @scala.inline
  implicit class ResolveAnimationRequestOps[Self <: ResolveAnimationRequest] (val x: Self) extends AnyVal {
    
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
    def setAnimationId(value: String): Self = this.set("animationId", value.asInstanceOf[js.Any])
  }
}
