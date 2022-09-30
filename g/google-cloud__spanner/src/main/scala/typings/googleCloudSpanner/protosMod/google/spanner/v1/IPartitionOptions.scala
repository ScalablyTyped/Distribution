package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PartitionOptions. */
trait IPartitionOptions extends StObject {
  
  /** PartitionOptions maxPartitions */
  var maxPartitions: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** PartitionOptions partitionSizeBytes */
  var partitionSizeBytes: js.UndefOr[Double | ^ | String | Null] = js.undefined
}
object IPartitionOptions {
  
  inline def apply(): IPartitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartitionOptions]
  }
  
  extension [Self <: IPartitionOptions](x: Self) {
    
    inline def setMaxPartitions(value: Double | ^ | String): Self = StObject.set(x, "maxPartitions", value.asInstanceOf[js.Any])
    
    inline def setMaxPartitionsNull: Self = StObject.set(x, "maxPartitions", null)
    
    inline def setMaxPartitionsUndefined: Self = StObject.set(x, "maxPartitions", js.undefined)
    
    inline def setPartitionSizeBytes(value: Double | ^ | String): Self = StObject.set(x, "partitionSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setPartitionSizeBytesNull: Self = StObject.set(x, "partitionSizeBytes", null)
    
    inline def setPartitionSizeBytesUndefined: Self = StObject.set(x, "partitionSizeBytes", js.undefined)
  }
}
