package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageBucketInfo extends StObject {
  
  var bucket: StorageBucket
  
  var durability: StorageBucketsDurability
  
  var expiration: TimeSinceEpoch
  
  var id: String
  
  var persistent: Boolean
  
  /**
    * Storage quota (bytes).
    */
  var quota: Double
}
object StorageBucketInfo {
  
  inline def apply(
    bucket: StorageBucket,
    durability: StorageBucketsDurability,
    expiration: TimeSinceEpoch,
    id: String,
    persistent: Boolean,
    quota: Double
  ): StorageBucketInfo = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], durability = durability.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], quota = quota.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageBucketInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageBucketInfo] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: StorageBucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setDurability(value: StorageBucketsDurability): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: TimeSinceEpoch): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
  }
}
