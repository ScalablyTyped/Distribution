package typings.firebaseFirestore

import typings.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.modelMutationMod.MutationResult
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.remotePersistentStreamMod.PersistentListenStream
import typings.firebaseFirestore.remotePersistentStreamMod.PersistentWriteStream
import typings.firebaseFirestore.remotePersistentStreamMod.WatchStreamListener
import typings.firebaseFirestore.remotePersistentStreamMod.WriteStreamListener
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/datastore", JSImport.Namespace)
@js.native
object remoteDatastoreMod extends js.Object {
  @js.native
  class Datastore protected () extends js.Object {
    def this(
      queue: AsyncQueue,
      connection: Connection,
      credentials: CredentialsProvider,
      serializer: JsonProtoSerializer
    ) = this()
    var connection: js.Any = js.native
    var credentials: js.Any = js.native
    /** Gets an auth token and invokes the provided RPC. */
    var invokeRPC: js.Any = js.native
    /** Gets an auth token and invokes the provided RPC with streamed results. */
    var invokeStreamingRPC: js.Any = js.native
    var queue: js.Any = js.native
    var serializer: js.Any = js.native
    def commit(mutations: js.Array[Mutation]): js.Promise[js.Array[MutationResult]] = js.native
    def lookup(keys: js.Array[DocumentKey]): js.Promise[js.Array[MaybeDocument]] = js.native
    def newPersistentWatchStream(listener: WatchStreamListener): PersistentListenStream = js.native
    def newPersistentWriteStream(listener: WriteStreamListener): PersistentWriteStream = js.native
  }
  
}

