package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetCreatedEvent extends StObject {
  
  var targetInfo: TargetInfo = js.native
}
object TargetCreatedEvent {
  
  @scala.inline
  def apply(targetInfo: TargetInfo): TargetCreatedEvent = {
    val __obj = js.Dynamic.literal(targetInfo = targetInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCreatedEvent]
  }
  
  @scala.inline
  implicit class TargetCreatedEventMutableBuilder[Self <: TargetCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetInfo(value: TargetInfo): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
  }
}
