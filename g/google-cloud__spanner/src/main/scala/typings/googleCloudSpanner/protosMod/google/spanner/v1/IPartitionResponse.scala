package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PartitionResponse. */
trait IPartitionResponse extends StObject {
  
  /** PartitionResponse partitions */
  var partitions: js.UndefOr[js.Array[IPartition] | Null] = js.undefined
  
  /** PartitionResponse transaction */
  var transaction: js.UndefOr[ITransaction | Null] = js.undefined
}
object IPartitionResponse {
  
  inline def apply(): IPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartitionResponse]
  }
  
  extension [Self <: IPartitionResponse](x: Self) {
    
    inline def setPartitions(value: js.Array[IPartition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsNull: Self = StObject.set(x, "partitions", null)
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: IPartition*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTransaction(value: ITransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
