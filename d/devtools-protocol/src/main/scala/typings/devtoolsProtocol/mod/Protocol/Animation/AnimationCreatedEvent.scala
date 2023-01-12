package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationCreatedEvent extends StObject {
  
  /**
    * Id of the animation that was created.
    */
  var id: String
}
object AnimationCreatedEvent {
  
  inline def apply(id: String): AnimationCreatedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationCreatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationCreatedEvent] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
