package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PartitionReadRequest. */
trait IPartitionReadRequest extends StObject {
  
  /** PartitionReadRequest columns */
  var columns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** PartitionReadRequest index */
  var index: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionReadRequest keySet */
  var keySet: js.UndefOr[IKeySet | Null] = js.undefined
  
  /** PartitionReadRequest partitionOptions */
  var partitionOptions: js.UndefOr[IPartitionOptions | Null] = js.undefined
  
  /** PartitionReadRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionReadRequest table */
  var table: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionReadRequest transaction */
  var transaction: js.UndefOr[ITransactionSelector | Null] = js.undefined
}
object IPartitionReadRequest {
  
  inline def apply(): IPartitionReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartitionReadRequest]
  }
  
  extension [Self <: IPartitionReadRequest](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKeySet(value: IKeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
    
    inline def setKeySetNull: Self = StObject.set(x, "keySet", null)
    
    inline def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
    
    inline def setPartitionOptions(value: IPartitionOptions): Self = StObject.set(x, "partitionOptions", value.asInstanceOf[js.Any])
    
    inline def setPartitionOptionsNull: Self = StObject.set(x, "partitionOptions", null)
    
    inline def setPartitionOptionsUndefined: Self = StObject.set(x, "partitionOptions", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTransaction(value: ITransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
