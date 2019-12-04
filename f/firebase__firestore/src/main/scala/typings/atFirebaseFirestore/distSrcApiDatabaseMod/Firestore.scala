package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseFirestore.Anon_Delete
import typings.atFirebaseFirestore.distSrcApiObserverMod.PartialObserver
import typings.atFirebaseFirestore.distSrcApiObserverMod.Unsubscribe
import typings.atFirebaseFirestore.distSrcApiUserUnderscoreDataUnderscoreConverterMod.UserDataConverter
import typings.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseId
import typings.atFirebaseFirestore.distSrcCoreFirestoreUnderscoreClientMod.FirestoreClient
import typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirebaseFirestore
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atFirebaseAppDashTypes.privateMod.FirebaseService because var conflicts: INTERNAL, app. Inlined  */ @JSImport("@firebase/firestore/dist/src/api/database", "Firestore")
@js.native
class Firestore protected () extends FirebaseFirestore {
  def this(databaseIdOrApp: FirebaseApp) = this()
  def this(databaseIdOrApp: FirestoreDatabase) = this()
  @JSName("INTERNAL")
  var INTERNAL_Firestore: Anon_Delete = js.native
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

