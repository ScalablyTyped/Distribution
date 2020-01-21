package typings.firebaseFirestore.persistentStreamMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.connectionMod.Connection
import typings.firebaseFirestore.credentialsMod.CredentialsProvider
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.serializerMod.JsonProtoSerializer
import typings.firebaseFirestore.typesMod.ProtoByteString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/persistent_stream", "PersistentWriteStream")
@js.native
class PersistentWriteStream protected ()
  extends PersistentStream[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteRequest */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteResponse */ js.Any, 
      WriteStreamListener
    ] {
  def this(
    queue: AsyncQueue,
    connection: Connection,
    credentials: CredentialsProvider,
    serializer: JsonProtoSerializer,
    listener: WriteStreamListener
  ) = this()
  var handshakeComplete_ : js.Any = js.native
  /**
    * The last received stream token from the server, used to acknowledge which
    * responses the client has processed. Stream tokens are opaque checkpoint
    * markers whose only real value is their inclusion in the next request.
    *
    * PersistentWriteStream manages propagating this value from responses to the
    * next request.
    */
  var lastStreamToken: ProtoByteString = js.native
  var serializer: js.Any = js.native
  /**
    * Tracks whether or not a handshake has been successfully exchanged and
    * the stream is ready to accept mutations.
    */
  def handshakeComplete(): Boolean = js.native
  /**
    * Sends an initial streamToken to the server, performing the handshake
    * required to make the StreamingWrite RPC work. Subsequent
    * calls should wait until onHandshakeComplete was called.
    */
  def writeHandshake(): Unit = js.native
  /** Sends a group of mutations to the Firestore backend to apply. */
  def writeMutations(mutations: js.Array[Mutation]): Unit = js.native
}

