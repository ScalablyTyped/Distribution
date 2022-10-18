package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PartitionQueryResponse. */
trait IPartitionQueryResponse extends StObject {
  
  /** PartitionQueryResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionQueryResponse partitions */
  var partitions: js.UndefOr[js.Array[ICursor] | Null] = js.undefined
}
object IPartitionQueryResponse {
  
  inline def apply(): IPartitionQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartitionQueryResponse]
  }
  
  extension [Self <: IPartitionQueryResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartitions(value: js.Array[ICursor]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsNull: Self = StObject.set(x, "partitions", null)
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: ICursor*): Self = StObject.set(x, "partitions", js.Array(value*))
  }
}
