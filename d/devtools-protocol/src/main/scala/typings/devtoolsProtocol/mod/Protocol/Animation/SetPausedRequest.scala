package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPausedRequest extends StObject {
  
  /**
    * Animations to set the pause state of.
    */
  var animations: js.Array[String]
  
  /**
    * Paused state to set to.
    */
  var paused: Boolean
}
object SetPausedRequest {
  
  @scala.inline
  def apply(animations: js.Array[String], paused: Boolean): SetPausedRequest = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPausedRequest]
  }
  
  @scala.inline
  implicit class SetPausedRequestMutableBuilder[Self <: SetPausedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[String]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: String*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
  }
}
