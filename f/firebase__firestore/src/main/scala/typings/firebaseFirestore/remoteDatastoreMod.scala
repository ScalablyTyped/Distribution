package typings.firebaseFirestore

import typings.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.authUserMod.User
import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.remotePersistentStreamMod.PersistentListenStream
import typings.firebaseFirestore.remotePersistentStreamMod.PersistentWriteStream
import typings.firebaseFirestore.remotePersistentStreamMod.WatchStreamListener
import typings.firebaseFirestore.remotePersistentStreamMod.WriteStreamListener
import typings.firebaseFirestore.srcRemoteConnectionMod.Connection
import typings.firebaseFirestore.srcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteDatastoreMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/datastore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/datastore", "Datastore")
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
