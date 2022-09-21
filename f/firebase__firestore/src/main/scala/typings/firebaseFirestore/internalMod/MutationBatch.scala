package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch of mutations that will be sent as one unit to the backend.
  */
@js.native
trait MutationBatch extends StObject {
  
  /**
    * Computes the local view for all provided documents given the mutations in
    * this batch. Returns a `DocumentKey` to `Mutation` map which can be used to
    * replace all the mutation applications.
    */
  def applyToLocalDocumentSet(documentMap: OverlayedDocumentMap, documentsWithoutRemoteVersion: DocumentKeySet): MutationMap = js.native
  
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
  
  def keys(): DocumentKeySet = js.native
  
  var localWriteTime: Timestamp = js.native
  
  var mutations: js.Array[Mutation] = js.native
}
