package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageBucketDeletedEvent extends StObject {
  
  var bucketId: String
}
object StorageBucketDeletedEvent {
  
  inline def apply(bucketId: String): StorageBucketDeletedEvent = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageBucketDeletedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageBucketDeletedEvent] (val x: Self) extends AnyVal {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
  }
}
