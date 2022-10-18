package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiTimestampMod.Timestamp
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelCollectionsMod.DocumentVersionMap_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelCollectionsMod.MutationMap
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelCollectionsMod.OverlayedDocumentMap
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentMod.MutableDocument
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelFieldMaskMod.FieldMask
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelMutationMod.MutationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcModelMutationBatchMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/model/mutation_batch", "MutationBatch")
  @js.native
  open class MutationBatch protected () extends StObject {
    /**
      * @param batchId - The unique ID of this mutation batch.
      * @param localWriteTime - The original write time of this mutation.
      * @param baseMutations - Mutations that are used to populate the base
      * values when this mutation is applied locally. This can be used to locally
      * overwrite values that are persisted in the remote document cache. Base
      * mutations are never sent to the backend.
      * @param mutations - The user-provided mutations in this mutation batch.
      * User-provided mutations are applied both locally and remotely on the
      * backend.
      */
    def this(
      batchId: BatchId,
      localWriteTime: Timestamp,
      baseMutations: js.Array[Mutation],
      mutations: js.Array[Mutation]
    ) = this()
    
    /**
      * Computes the local view for all provided documents given the mutations in
      * this batch. Returns a `DocumentKey` to `Mutation` map which can be used to
      * replace all the mutation applications.
      */
    def applyToLocalDocumentSet(documentMap: OverlayedDocumentMap, documentsWithoutRemoteVersion: DocumentKeySet_): MutationMap = js.native
    
    /**
      * Computes the local view of a document given all the mutations in this
      * batch.
      *
      * @param document - The document to apply mutations to.
      * @param mutatedFields - Fields that have been updated before applying this mutation batch.
      * @returns A `FieldMask` representing all the fields that are mutated.
      */
    def applyToLocalView(document: MutableDocument): FieldMask | Null = js.native
    def applyToLocalView(document: MutableDocument, mutatedFields: FieldMask): FieldMask | Null = js.native
    
    /**
      * Applies all the mutations in this MutationBatch to the specified document
      * to compute the state of the remote document
      *
      * @param document - The document to apply mutations to.
      * @param batchResult - The result of applying the MutationBatch to the
      * backend.
      */
    def applyToRemoteDocument(document: MutableDocument, batchResult: MutationBatchResult): Unit = js.native
    
    var baseMutations: js.Array[Mutation] = js.native
    
    var batchId: BatchId = js.native
    
    def isEqual(other: MutationBatch): Boolean = js.native
    
    def keys(): DocumentKeySet_ = js.native
    
    var localWriteTime: Timestamp = js.native
    
    var mutations: js.Array[Mutation] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/model/mutation_batch", "MutationBatchResult")
  @js.native
  /* private */ open class MutationBatchResult () extends StObject {
    
    val batch: MutationBatch = js.native
    
    val commitVersion: SnapshotVersion = js.native
    
    /**
      * A pre-computed mapping from each mutated document to the resulting
      * version.
      */
    val docVersions: DocumentVersionMap_ = js.native
    
    val mutationResults: js.Array[MutationResult] = js.native
  }
  /* static members */
  object MutationBatchResult {
    
    @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/model/mutation_batch", "MutationBatchResult")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MutationBatchResult for the given batch and results. There
      * must be one result for each mutation in the batch. This static factory
      * caches a document=&gt;version mapping (docVersions).
      */
    inline def from(batch: MutationBatch, commitVersion: SnapshotVersion, results: js.Array[MutationResult]): MutationBatchResult = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(batch.asInstanceOf[js.Any], commitVersion.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[MutationBatchResult]
  }
}
