package typings.firebaseFirestore.apiDatabaseMod

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.AnonDelete
import typings.firebaseFirestore.apiObserverMod.PartialObserver
import typings.firebaseFirestore.apiObserverMod.Unsubscribe
import typings.firebaseFirestore.apiUserDataConverterMod.UserDataConverter
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.coreFirestoreClientMod.FirestoreClient
import typings.firebaseFirestore.mod.FirebaseApp
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import typings.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.firebaseAppTypes.privateMod.FirebaseService because var conflicts: INTERNAL, app. Inlined  */ @JSImport("@firebase/firestore/dist/src/api/database", "Firestore")
@js.native
class Firestore protected () extends FirebaseFirestore {
  def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
  @JSName("INTERNAL")
  var INTERNAL_Firestore: AnonDelete = js.native
  var _credentials: js.Any = js.native
  val _dataConverter: UserDataConverter = js.native
  val _databaseId: DatabaseId = js.native
  val _firebaseApp: js.Any = js.native
  var _firestoreClient: js.Any = js.native
  val _persistenceKey: js.Any = js.native
  val _queue: AsyncQueue = js.native
  var _settings: js.Any = js.native
  var configureClient: js.Any = js.native
  var createDataConverter: js.Any = js.native
  var makeDatabaseInfo: js.Any = js.native
  var onSnapshotsInSyncInternal: js.Any = js.native
  def _areTimestampsInSnapshotsEnabled(): Boolean = js.native
  def _isTerminated(): Boolean = js.native
  @JSName("app")
  def app_MFirestore(): FirebaseApp = js.native
  def ensureClientConfigured(): FirestoreClient = js.native
  def onSnapshotsInSync(observer: PartialObserver[Unit]): Unsubscribe = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/api/database", "Firestore")
@js.native
object Firestore extends js.Object {
  var databaseIdFromApp: js.Any = js.native
  def logLevel(): LogLevel = js.native
  def setLogLevel(level: LogLevel): Unit = js.native
}

