package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Partition. */
trait IPartition extends StObject {
  
  /** Partition partitionToken */
  var partitionToken: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
}
object IPartition {
  
  inline def apply(): IPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartition]
  }
  
  extension [Self <: IPartition](x: Self) {
    
    inline def setPartitionToken(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    inline def setPartitionTokenNull: Self = StObject.set(x, "partitionToken", null)
    
    inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
  }
}
