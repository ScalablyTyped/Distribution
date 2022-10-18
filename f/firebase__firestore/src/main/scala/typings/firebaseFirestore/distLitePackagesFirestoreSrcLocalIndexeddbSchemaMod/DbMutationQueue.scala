package typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbMutationQueue extends StObject {
  
  /**
    * An identifier for the highest numbered batch that has been acknowledged
    * by the server. All MutationBatches in this queue with batchIds less
    * than or equal to this value are considered to have been acknowledged by
    * the server.
    *
    * NOTE: this is deprecated and no longer used by the code.
    */
  var lastAcknowledgedBatchId: Double
  
  /**
    * A stream token that was previously sent by the server.
    *
    * See StreamingWriteRequest in datastore.proto for more details about
    * usage.
    *
    * After sending this token, earlier tokens may not be used anymore so
    * only a single stream token is retained.
    *
    * NOTE: this is deprecated and no longer used by the code.
    */
  var lastStreamToken: String
  
  /**
    * The normalized user ID to which this queue belongs.
    */
  var userId: String
}
object DbMutationQueue {
  
  inline def apply(lastAcknowledgedBatchId: Double, lastStreamToken: String, userId: String): DbMutationQueue = {
    val __obj = js.Dynamic.literal(lastAcknowledgedBatchId = lastAcknowledgedBatchId.asInstanceOf[js.Any], lastStreamToken = lastStreamToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbMutationQueue]
  }
  
  extension [Self <: DbMutationQueue](x: Self) {
    
    inline def setLastAcknowledgedBatchId(value: Double): Self = StObject.set(x, "lastAcknowledgedBatchId", value.asInstanceOf[js.Any])
    
    inline def setLastStreamToken(value: String): Self = StObject.set(x, "lastStreamToken", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
