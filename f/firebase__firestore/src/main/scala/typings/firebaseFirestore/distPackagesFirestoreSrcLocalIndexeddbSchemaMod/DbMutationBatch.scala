package typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbMutationBatch extends StObject {
  
  /**
    * A list of "mutations" that represent a partial base state from when this
    * write batch was initially created. During local application of the write
    * batch, these baseMutations are applied prior to the real writes in order
    * to override certain document fields from the remote document cache. This
    * is necessary in the case of non-idempotent writes (e.g. `increment()`
    * transforms) to make sure that the local view of the modified documents
    * doesn't flicker if the remote document cache receives the result of the
    * non-idempotent write before the write is removed from the queue.
    *
    * These mutations are never sent to the backend.
    */
  var baseMutations: js.UndefOr[js.Array[Write]] = js.undefined
  
  /**
    * An identifier for this batch, allocated using an auto-generated key.
    */
  var batchId: BatchId
  
  /**
    * The local write time of the batch, stored as milliseconds since the
    * epoch.
    */
  var localWriteTimeMs: Double
  
  /**
    * A list of mutations to apply. All mutations will be applied atomically.
    *
    * Mutations are serialized via toMutation().
    */
  var mutations: js.Array[Write]
  
  /**
    * The normalized user ID to which this batch belongs.
    */
  var userId: String
}
object DbMutationBatch {
  
  inline def apply(batchId: BatchId, localWriteTimeMs: Double, mutations: js.Array[Write], userId: String): DbMutationBatch = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], localWriteTimeMs = localWriteTimeMs.asInstanceOf[js.Any], mutations = mutations.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbMutationBatch]
  }
  
  extension [Self <: DbMutationBatch](x: Self) {
    
    inline def setBaseMutations(value: js.Array[Write]): Self = StObject.set(x, "baseMutations", value.asInstanceOf[js.Any])
    
    inline def setBaseMutationsUndefined: Self = StObject.set(x, "baseMutations", js.undefined)
    
    inline def setBaseMutationsVarargs(value: Write*): Self = StObject.set(x, "baseMutations", js.Array(value*))
    
    inline def setBatchId(value: BatchId): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setLocalWriteTimeMs(value: Double): Self = StObject.set(x, "localWriteTimeMs", value.asInstanceOf[js.Any])
    
    inline def setMutations(value: js.Array[Write]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsVarargs(value: Write*): Self = StObject.set(x, "mutations", js.Array(value*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
