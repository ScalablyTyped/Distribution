package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.spanner.v1.TransactionOptions.IPartitionedDml
import typings.googleCloudSpanner.protosMod.google.spanner.v1.TransactionOptions.IReadOnly
import typings.googleCloudSpanner.protosMod.google.spanner.v1.TransactionOptions.IReadWrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TransactionOptions. */
trait ITransactionOptions extends StObject {
  
  /** TransactionOptions partitionedDml */
  var partitionedDml: js.UndefOr[IPartitionedDml | Null] = js.undefined
  
  /** TransactionOptions readOnly */
  var readOnly: js.UndefOr[IReadOnly | Null] = js.undefined
  
  /** TransactionOptions readWrite */
  var readWrite: js.UndefOr[IReadWrite | Null] = js.undefined
}
object ITransactionOptions {
  
  inline def apply(): ITransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionOptions]
  }
  
  extension [Self <: ITransactionOptions](x: Self) {
    
    inline def setPartitionedDml(value: IPartitionedDml): Self = StObject.set(x, "partitionedDml", value.asInstanceOf[js.Any])
    
    inline def setPartitionedDmlNull: Self = StObject.set(x, "partitionedDml", null)
    
    inline def setPartitionedDmlUndefined: Self = StObject.set(x, "partitionedDml", js.undefined)
    
    inline def setReadOnly(value: IReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReadWrite(value: IReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    inline def setReadWriteNull: Self = StObject.set(x, "readWrite", null)
    
    inline def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
