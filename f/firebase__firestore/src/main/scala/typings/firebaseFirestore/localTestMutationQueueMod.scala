package typings.firebaseFirestore

import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.coreTypesMod.BatchId
import typings.firebaseFirestore.localMutationQueueMod.MutationQueue
import typings.firebaseFirestore.localPersistenceMod.Persistence
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelMutationBatchMod.MutationBatch
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.utilByteStringMod.ByteString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/test_mutation_queue", JSImport.Namespace)
@js.native
object localTestMutationQueueMod extends js.Object {
  @js.native
  class TestMutationQueue protected () extends js.Object {
    def this(persistence: Persistence, queue: MutationQueue) = this()
    var persistence: Persistence = js.native
    var queue: MutationQueue = js.native
    def acknowledgeBatch(batch: MutationBatch, streamToken: ByteString): js.Promise[Unit] = js.native
    def addMutationBatch(mutations: js.Array[Mutation]): js.Promise[MutationBatch] = js.native
    def checkEmpty(): js.Promise[Boolean] = js.native
    def countBatches(): js.Promise[Double] = js.native
    def getAllMutationBatches(): js.Promise[js.Array[MutationBatch]] = js.native
    def getAllMutationBatchesAffectingDocumentKey(documentKey: DocumentKey): js.Promise[js.Array[MutationBatch]] = js.native
    def getAllMutationBatchesAffectingDocumentKeys(documentKeys: DocumentKeySet_): js.Promise[js.Array[MutationBatch]] = js.native
    def getAllMutationBatchesAffectingQuery(query: Query): js.Promise[js.Array[MutationBatch]] = js.native
    def getLastStreamToken(): js.Promise[ByteString] = js.native
    def getNextMutationBatchAfterBatchId(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    def lookupMutationBatch(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    def removeMutationBatch(batch: MutationBatch): js.Promise[Unit] = js.native
    def setLastStreamToken(streamToken: ByteString): js.Promise[Unit] = js.native
  }
  
}

