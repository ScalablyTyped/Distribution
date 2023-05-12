package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreAggregateMod.Aggregate
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.distPackagesFirestoreSrcRemotePersistentStreamMod.PersistentListenStream
import typings.firebaseFirestore.distPackagesFirestoreSrcRemotePersistentStreamMod.PersistentWriteStream
import typings.firebaseFirestore.distPackagesFirestoreSrcRemotePersistentStreamMod.WatchStreamListener
import typings.firebaseFirestore.distPackagesFirestoreSrcRemotePersistentStreamMod.WriteStreamListener
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcRemoteDatastoreMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/datastore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/remote/datastore", "Datastore")
  @js.native
  open class Datastore () extends StObject {
    
    var serializer: JsonProtoSerializer = js.native
    
    def terminate(): Unit = js.native
  }
  
  inline def invokeBatchGetDocumentsRpc(datastore: Datastore, keys: js.Array[DocumentKey]): js.Promise[js.Array[Document]] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeBatchGetDocumentsRpc")(datastore.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Document]]]
  
  inline def invokeCommitRpc(datastore: Datastore, mutations: js.Array[Mutation]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeCommitRpc")(datastore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def invokeRunAggregationQueryRpc(datastore: Datastore, query: Query, aggregates: js.Array[Aggregate]): js.Promise[ApiClientObjectMap[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeRunAggregationQueryRpc")(datastore.asInstanceOf[js.Any], query.asInstanceOf[js.Any], aggregates.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiClientObjectMap[Value]]]
  
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
