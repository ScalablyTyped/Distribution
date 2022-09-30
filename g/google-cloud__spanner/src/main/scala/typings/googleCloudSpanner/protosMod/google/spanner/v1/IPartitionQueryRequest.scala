package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.protobuf.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PartitionQueryRequest. */
trait IPartitionQueryRequest extends StObject {
  
  /** PartitionQueryRequest paramTypes */
  var paramTypes: js.UndefOr[StringDictionary[IType] | Null] = js.undefined
  
  /** PartitionQueryRequest params */
  var params: js.UndefOr[IStruct | Null] = js.undefined
  
  /** PartitionQueryRequest partitionOptions */
  var partitionOptions: js.UndefOr[IPartitionOptions | Null] = js.undefined
  
  /** PartitionQueryRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionQueryRequest sql */
  var sql: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionQueryRequest transaction */
  var transaction: js.UndefOr[ITransactionSelector | Null] = js.undefined
}
object IPartitionQueryRequest {
  
  inline def apply(): IPartitionQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartitionQueryRequest]
  }
  
  extension [Self <: IPartitionQueryRequest](x: Self) {
    
    inline def setParamTypes(value: StringDictionary[IType]): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    inline def setParamTypesNull: Self = StObject.set(x, "paramTypes", null)
    
    inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    inline def setParams(value: IStruct): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPartitionOptions(value: IPartitionOptions): Self = StObject.set(x, "partitionOptions", value.asInstanceOf[js.Any])
    
    inline def setPartitionOptionsNull: Self = StObject.set(x, "partitionOptions", null)
    
    inline def setPartitionOptionsUndefined: Self = StObject.set(x, "partitionOptions", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlNull: Self = StObject.set(x, "sql", null)
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    inline def setTransaction(value: ITransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
