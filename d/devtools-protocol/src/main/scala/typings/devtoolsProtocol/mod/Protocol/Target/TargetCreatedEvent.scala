package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetCreatedEvent extends StObject {
  
  var targetInfo: TargetInfo
}
object TargetCreatedEvent {
  
  inline def apply(targetInfo: TargetInfo): TargetCreatedEvent = {
    val __obj = js.Dynamic.literal(targetInfo = targetInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCreatedEvent]
  }
  
  extension [Self <: TargetCreatedEvent](x: Self) {
    
    inline def setTargetInfo(value: TargetInfo): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
  }
}
