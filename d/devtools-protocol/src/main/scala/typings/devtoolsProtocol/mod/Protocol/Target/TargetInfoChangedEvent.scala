package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetInfoChangedEvent extends StObject {
  
  var targetInfo: TargetInfo
}
object TargetInfoChangedEvent {
  
  inline def apply(targetInfo: TargetInfo): TargetInfoChangedEvent = {
    val __obj = js.Dynamic.literal(targetInfo = targetInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfoChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetInfoChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setTargetInfo(value: TargetInfo): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
  }
}
