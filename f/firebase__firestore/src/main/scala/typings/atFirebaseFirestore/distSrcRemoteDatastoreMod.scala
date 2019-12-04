package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcApiCredentialsMod.CredentialsProvider
import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcModelMutationMod.Mutation
import typings.atFirebaseFirestore.distSrcModelMutationMod.MutationResult
import typings.atFirebaseFirestore.distSrcRemoteConnectionMod.Connection
import typings.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.PersistentListenStream
import typings.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.PersistentWriteStream
import typings.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.WatchStreamListener
import typings.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.WriteStreamListener
import typings.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/datastore", JSImport.Namespace)
@js.native
object distSrcRemoteDatastoreMod extends js.Object {
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

