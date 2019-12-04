package typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbMutationBatch")
@js.native
class DbMutationBatch protected () extends js.Object {
  def this(
    /**
    * The normalized user ID to which this batch belongs.
    */
  userId: String,
    /**
    * An identifier for this batch, allocated using an auto-generated key.
    */
  batchId: BatchId,
    /**
    * The local write time of the batch, stored as milliseconds since the
    * epoch.
    */
  localWriteTimeMs: Double,
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
  baseMutations: js.UndefOr[scala.Nothing],
    /**
    * A list of mutations to apply. All mutations will be applied atomically.
    *
    * Mutations are serialized via JsonProtoSerializer.toMutation().
    */
  mutations: js.Array[Write]
  ) = this()
  def this(
    /**
    * The normalized user ID to which this batch belongs.
    */
  userId: String,
    /**
    * An identifier for this batch, allocated using an auto-generated key.
    */
  batchId: BatchId,
    /**
    * The local write time of the batch, stored as milliseconds since the
    * epoch.
    */
  localWriteTimeMs: Double,
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
  baseMutations: js.Array[Write],
    /**
    * A list of mutations to apply. All mutations will be applied atomically.
    *
    * Mutations are serialized via JsonProtoSerializer.toMutation().
    */
  mutations: js.Array[Write]
  ) = this()
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
  var baseMutations: js.UndefOr[js.Array[Write]] = js.native
  /**
    * An identifier for this batch, allocated using an auto-generated key.
    */
  var batchId: BatchId = js.native
  /**
    * The local write time of the batch, stored as milliseconds since the
    * epoch.
    */
  var localWriteTimeMs: Double = js.native
  /**
    * A list of mutations to apply. All mutations will be applied atomically.
    *
    * Mutations are serialized via JsonProtoSerializer.toMutation().
    */
  var mutations: js.Array[Write] = js.native
  /**
    * The normalized user ID to which this batch belongs.
    */
  var userId: String = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbMutationBatch")
@js.native
object DbMutationBatch extends js.Object {
  /** Keys are automatically assigned via the userId, batchId properties. */
  var keyPath: String = js.native
  /** Name of the IndexedDb object store.  */
  var store: String = js.native
  /** The index name for lookup of mutations by user. */
  var userMutationsIndex: String = js.native
  /** The user mutations index is keyed by [userId, batchId] pairs. */
  var userMutationsKeyPath: js.Array[String] = js.native
}

