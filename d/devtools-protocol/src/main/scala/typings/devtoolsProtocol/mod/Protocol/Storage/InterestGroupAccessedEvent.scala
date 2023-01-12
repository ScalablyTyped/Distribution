package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterestGroupAccessedEvent extends StObject {
  
  var accessTime: TimeSinceEpoch
  
  var name: String
  
  var ownerOrigin: String
  
  var `type`: InterestGroupAccessType
}
object InterestGroupAccessedEvent {
  
  inline def apply(accessTime: TimeSinceEpoch, name: String, ownerOrigin: String, `type`: InterestGroupAccessType): InterestGroupAccessedEvent = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerOrigin = ownerOrigin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterestGroupAccessedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterestGroupAccessedEvent] (val x: Self) extends AnyVal {
    
    inline def setAccessTime(value: TimeSinceEpoch): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
    
    inline def setType(value: InterestGroupAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
