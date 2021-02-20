package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStartedEvent extends StObject {
  
  /**
    * Animation that was started.
    */
  var animation: typings.devtoolsProtocol.mod.Protocol.Animation.Animation = js.native
}
object AnimationStartedEvent {
  
  @scala.inline
  def apply(animation: typings.devtoolsProtocol.mod.Protocol.Animation.Animation): AnimationStartedEvent = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStartedEvent]
  }
  
  @scala.inline
  implicit class AnimationStartedEventMutableBuilder[Self <: AnimationStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: typings.devtoolsProtocol.mod.Protocol.Animation.Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
