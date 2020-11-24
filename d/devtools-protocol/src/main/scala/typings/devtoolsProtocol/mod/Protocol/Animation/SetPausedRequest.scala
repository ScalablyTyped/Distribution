package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPausedRequest extends js.Object {
  
  /**
    * Animations to set the pause state of.
    */
  var animations: js.Array[String] = js.native
  
  /**
    * Paused state to set to.
    */
  var paused: Boolean = js.native
}
object SetPausedRequest {
  
  @scala.inline
  def apply(animations: js.Array[String], paused: Boolean): SetPausedRequest = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPausedRequest]
  }
  
  @scala.inline
  implicit class SetPausedRequestOps[Self <: SetPausedRequest] (val x: Self) extends AnyVal {
    
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
    def setAnimationsVarargs(value: String*): Self = this.set("animations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: js.Array[String]): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
  }
}
