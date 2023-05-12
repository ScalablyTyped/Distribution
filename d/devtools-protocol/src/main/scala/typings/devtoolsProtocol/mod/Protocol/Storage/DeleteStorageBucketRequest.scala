package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStorageBucketRequest extends StObject {
  
  var bucket: StorageBucket
}
object DeleteStorageBucketRequest {
  
  inline def apply(bucket: StorageBucket): DeleteStorageBucketRequest = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStorageBucketRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStorageBucketRequest] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: StorageBucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
  }
}
