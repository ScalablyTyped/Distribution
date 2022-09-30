package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PartitionQueryRequest. */
trait IPartitionQueryRequest extends StObject {
  
  /** PartitionQueryRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** PartitionQueryRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionQueryRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** PartitionQueryRequest partitionCount */
  var partitionCount: js.UndefOr[Double | String | Null] = js.undefined
  
  /** PartitionQueryRequest structuredQuery */
  var structuredQuery: js.UndefOr[IStructuredQuery | Null] = js.undefined
}
object IPartitionQueryRequest {
  
  inline def apply(): IPartitionQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartitionQueryRequest]
  }
  
  extension [Self <: IPartitionQueryRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPartitionCount(value: Double | String): Self = StObject.set(x, "partitionCount", value.asInstanceOf[js.Any])
    
    inline def setPartitionCountNull: Self = StObject.set(x, "partitionCount", null)
    
    inline def setPartitionCountUndefined: Self = StObject.set(x, "partitionCount", js.undefined)
    
    inline def setStructuredQuery(value: IStructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryNull: Self = StObject.set(x, "structuredQuery", null)
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
  }
}
