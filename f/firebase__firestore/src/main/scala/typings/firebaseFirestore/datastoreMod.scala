package typings.firebaseFirestore

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.connectionMod.Connection
import typings.firebaseFirestore.credentialsMod.CredentialsProvider
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.mutationMod.MutationResult
import typings.firebaseFirestore.persistentStreamMod.PersistentListenStream
import typings.firebaseFirestore.persistentStreamMod.PersistentWriteStream
import typings.firebaseFirestore.persistentStreamMod.WatchStreamListener
import typings.firebaseFirestore.persistentStreamMod.WriteStreamListener
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.serializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/remote/datastore", JSImport.Namespace)
@js.native
object datastoreMod extends js.Object {
  @js.native
  class Datastore () extends js.Object {
    @JSName("_")
    var _underscore: js.Any = js.native
  }
  
  def invokeBatchGetDocumentsRpc(datastore: Datastore, keys: js.Array[DocumentKey]): js.Promise[js.Array[MaybeDocument]] = js.native
  def invokeCommitRpc(datastore: Datastore, mutations: js.Array[Mutation]): js.Promise[js.Array[MutationResult]] = js.native
  def invokeRunQueryRpc(datastore: Datastore, query: Query): js.Promise[js.Array[Document]] = js.native
  def newDatastore(connection: Connection, credentials: CredentialsProvider, serializer: JsonProtoSerializer): Datastore = js.native
  def newPersistentWatchStream(datastore: Datastore, queue: AsyncQueue, listener: WatchStreamListener): PersistentListenStream = js.native
  def newPersistentWriteStream(datastore: Datastore, queue: AsyncQueue, listener: WriteStreamListener): PersistentWriteStream = js.native
}

