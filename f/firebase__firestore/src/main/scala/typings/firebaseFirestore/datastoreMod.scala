package typings.firebaseFirestore

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.credentialsMod.CredentialsProvider
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.persistentStreamMod.PersistentListenStream
import typings.firebaseFirestore.persistentStreamMod.PersistentWriteStream
import typings.firebaseFirestore.persistentStreamMod.WatchStreamListener
import typings.firebaseFirestore.persistentStreamMod.WriteStreamListener
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastoreMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/remote/datastore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/remote/datastore", "Datastore")
  @js.native
  abstract class Datastore () extends StObject {
    
    def terminate(): Unit = js.native
  }
  
  inline def invokeBatchGetDocumentsRpc(datastore: Datastore, keys: js.Array[DocumentKey]): js.Promise[js.Array[Document]] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeBatchGetDocumentsRpc")(datastore.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Document]]]
  
  inline def invokeCommitRpc(datastore: Datastore, mutations: js.Array[Mutation]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeCommitRpc")(datastore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def invokeRunQueryRpc(datastore: Datastore, query: Query): js.Promise[js.Array[Document]] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeRunQueryRpc")(datastore.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Document]]]
  
  inline def newDatastore(
    authCredentials: CredentialsProvider[User],
    appCheckCredentials: CredentialsProvider[String],
    connection: Connection,
    serializer: JsonProtoSerializer
  ): Datastore = (^.asInstanceOf[js.Dynamic].applyDynamic("newDatastore")(authCredentials.asInstanceOf[js.Any], appCheckCredentials.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Datastore]
  
  inline def newPersistentWatchStream(datastore: Datastore, queue: AsyncQueue, listener: WatchStreamListener): PersistentListenStream = (^.asInstanceOf[js.Dynamic].applyDynamic("newPersistentWatchStream")(datastore.asInstanceOf[js.Any], queue.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[PersistentListenStream]
  
  inline def newPersistentWriteStream(datastore: Datastore, queue: AsyncQueue, listener: WriteStreamListener): PersistentWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("newPersistentWriteStream")(datastore.asInstanceOf[js.Any], queue.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[PersistentWriteStream]
}
