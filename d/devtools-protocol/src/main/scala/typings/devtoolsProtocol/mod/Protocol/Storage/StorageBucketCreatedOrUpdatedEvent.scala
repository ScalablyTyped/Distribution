package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageBucketCreatedOrUpdatedEvent extends StObject {
  
  var bucketInfo: StorageBucketInfo
}
object StorageBucketCreatedOrUpdatedEvent {
  
  inline def apply(bucketInfo: StorageBucketInfo): StorageBucketCreatedOrUpdatedEvent = {
    val __obj = js.Dynamic.literal(bucketInfo = bucketInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageBucketCreatedOrUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageBucketCreatedOrUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setBucketInfo(value: StorageBucketInfo): Self = StObject.set(x, "bucketInfo", value.asInstanceOf[js.Any])
  }
}
