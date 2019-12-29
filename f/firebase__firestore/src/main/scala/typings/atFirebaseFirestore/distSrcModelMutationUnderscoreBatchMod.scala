package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.atFirebaseFirestoreNumbers.`-1`
import typings.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp
import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
import typings.atFirebaseFirestore.distSrcCoreTypesMod.ProtoByteString
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentVersionMap
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.MaybeDocumentMap
import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcModelMutationMod.Mutation
import typings.atFirebaseFirestore.distSrcModelMutationMod.MutationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation_batch", JSImport.Namespace)
@js.native
object distSrcModelMutationUnderscoreBatchMod extends js.Object {
  @js.native
  class MutationBatch protected () extends js.Object {
    /**
      * @param batchId The unique ID of this mutation batch.
      * @param localWriteTime The original write time of this mutation.
      * @param baseMutations Mutations that are used to populate the base
      * values when this mutation is applied locally. This can be used to locally
      * overwrite values that are persisted in the remote document cache. Base
      * mutations are never sent to the backend.
      * @param mutations The user-provided mutations in this mutation batch.
      * User-provided mutations are applied both locally and remotely on the
      * backend.
      */
    def this(
      batchId: BatchId,
      localWriteTime: Timestamp,
      baseMutations: js.Array[Mutation],
      mutations: js.Array[Mutation]
    ) = this()
    var baseMutations: js.Array[Mutation] = js.native
    var batchId: BatchId = js.native
    var localWriteTime: Timestamp = js.native
    var mutations: js.Array[Mutation] = js.native
    /**
      * Computes the local view for all provided documents given the mutations in
      * this batch.
      */
    def applyToLocalDocumentSet(maybeDocs: MaybeDocumentMap): MaybeDocumentMap = js.native
    def applyToLocalView(docKey: DocumentKey): MaybeDocument | Null = js.native
    /**
      * Computes the local view of a document given all the mutations in this
      * batch.
      *
      * @param docKey The key of the document to apply mutations to.
      * @param maybeDoc The document to apply mutations to.
      */
    def applyToLocalView(docKey: DocumentKey, maybeDoc: MaybeDocument): MaybeDocument | Null = js.native
    def applyToRemoteDocument(docKey: DocumentKey, maybeDoc: Null, batchResult: MutationBatchResult): MaybeDocument | Null = js.native
    /**
      * Applies all the mutations in this MutationBatch to the specified document
      * to create a new remote document
      *
      * @param docKey The key of the document to apply mutations to.
      * @param maybeDoc The document to apply mutations to.
      * @param batchResult The result of applying the MutationBatch to the
      * backend.
      */
    def applyToRemoteDocument(docKey: DocumentKey, maybeDoc: MaybeDocument, batchResult: MutationBatchResult): MaybeDocument | Null = js.native
    def isEqual(other: MutationBatch): Boolean = js.native
    def keys(): DocumentKeySet = js.native
  }
  
  @js.native
  class MutationBatchResult protected () extends js.Object {
    val batch: MutationBatch = js.native
    val commitVersion: SnapshotVersion = js.native
    /**
      * A pre-computed mapping from each mutated document to the resulting
      * version.
      */
    val docVersions: DocumentVersionMap = js.native
    val mutationResults: js.Array[MutationResult] = js.native
    val streamToken: ProtoByteString = js.native
  }
  
  val BATCHID_UNKNOWN: `-1` = js.native
  /* static members */
  @js.native
  object MutationBatchResult extends js.Object {
    /**
      * Creates a new MutationBatchResult for the given batch and results. There
      * must be one result for each mutation in the batch. This static factory
      * caches a document=>version mapping (docVersions).
      */
    def from(
      batch: MutationBatch,
      commitVersion: SnapshotVersion,
      results: js.Array[MutationResult],
      streamToken: ProtoByteString
    ): MutationBatchResult = js.native
  }
  
}

