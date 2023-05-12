package typings.firebaseFirestore.distFirestoreSrcApiMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.CacheSizeBytes
import typings.firebaseFirestore.anon.Complete
import typings.firebaseFirestore.anon.Error
import typings.firebaseFirestore.anon.Instantiable
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.Next
import typings.firebaseFirestore.anon.`0`
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.MemoryCacheSettings
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.MemoryEagerGarbageCollector_
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.MemoryLocalCache_
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.MemoryLruGarbageCollector_
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.PersistentCacheSettings
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.PersistentLocalCache_
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.PersistentMultipleTabManager_
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.PersistentSingleTabManagerSettings
import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.PersistentSingleTabManager_
import typings.firebaseFirestore.distFirestoreSrcApiIndexConfigurationMod.IndexConfiguration
import typings.firebaseFirestore.distFirestoreSrcApiMod.^
import typings.firebaseFirestore.distFirestoreSrcApiReferenceImplMod.SnapshotListenOptions
import typings.firebaseFirestore.distFirestoreSrcApiReferenceImplMod.Unsubscribe
import typings.firebaseFirestore.distFirestoreSrcApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.distFirestoreSrcApiSettingsMod.PersistenceSettings
import typings.firebaseFirestore.distFirestoreSrcCoreFirestoreClientMod.FirestoreClient
import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFilterConstraint
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryNonFilterConstraint
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CACHE_SIZE_UNLIMITED: /* -1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CACHE_SIZE_UNLIMITED").asInstanceOf[/* -1 */ Double]

inline def addDoc[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  data: WithFieldValue[T]
): js.Promise[
typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]]

inline def aggregateFieldEqual(
  left: typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Any],
  right: typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Any]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateFieldEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
  left: typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T],
  right: typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def and(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]

inline def arrayRemove(elements: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def arrayUnion(elements: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def average(field: String): typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null]]
inline def average(field: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null]]

inline def cast[T](obj: js.Object, constructor: Instantiable[T]): T | scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_cast")(obj.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T | scala.Nothing]

inline def clearIndexedDbPersistence(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def collection(
  firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
inline def collection(
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[Any],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
inline def collection(
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]

inline def collectionGroup(
  firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
  collectionId: String
): Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query[DocumentData]]

inline def connectFirestoreEmulator(
  firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
  host: String,
  port: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def connectFirestoreEmulator(
  firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
  host: String,
  port: Double,
  options: MockUserToken
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def count(): typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double]]

inline def debugAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_debugAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]

inline def deleteDoc(reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def deleteField(): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def disableNetwork(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def doc(
  firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
inline def doc(
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
inline def doc[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
inline def doc[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  path: Unit,
  pathSegments: String*
): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]

inline def documentId(): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath]

inline def enableIndexedDbPersistence(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def enableIndexedDbPersistence(
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  persistenceSettings: PersistenceSettings
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def enableMultiTabIndexedDbPersistence(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def enableNetwork(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
inline def endAt(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]

inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
inline def endBefore(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]

inline def ensureFirestoreConfigured(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): FirestoreClient = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFirestoreConfigured")(firestore.asInstanceOf[js.Any]).asInstanceOf[FirestoreClient]

inline def executeWrite(
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  mutations: js.Array[Mutation]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeWrite")(firestore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def getAggregateFromServer[T /* <: AggregateSpec */](query: Query_[Any], aggregateSpec: T): js.Promise[
typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAggregateFromServer")(query.asInstanceOf[js.Any], aggregateSpec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]]]

inline def getCountFromServer(query: Query_[Any]): js.Promise[
typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`0`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`0`]]]

inline def getDoc[T](reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]

inline def getDocFromCache[T](reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]

inline def getDocFromServer[T](reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]

inline def getDocs[T](query: Query[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]

inline def getDocsFromCache[T](query: Query[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]

inline def getDocsFromServer[T](query: Query[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]

inline def getFirestore(): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
inline def getFirestore(app: FirebaseApp, databaseId: String): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
inline def getFirestore(databaseId: String): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]

inline def increment(n: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]

inline def isBase64Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBase64Available")().asInstanceOf[Boolean]

inline def limit(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]

inline def limitToLast(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]

inline def loadBundle(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, bundleData: String): typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask]
inline def loadBundle(
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  bundleData: js.typedarray.ArrayBuffer
): typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask]
inline def loadBundle(
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  bundleData: ReadableStream[js.typedarray.Uint8Array]
): typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask]

inline def logWarn(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logWarn")(scala.List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]

inline def memoryEagerGarbageCollector(): MemoryEagerGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryEagerGarbageCollector")().asInstanceOf[MemoryEagerGarbageCollector_]

inline def memoryLocalCache(): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")().asInstanceOf[MemoryLocalCache_]
inline def memoryLocalCache(settings: MemoryCacheSettings): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLocalCache_]

inline def memoryLruGarbageCollector(): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")().asInstanceOf[MemoryLruGarbageCollector_]
inline def memoryLruGarbageCollector(settings: CacheSizeBytes): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLruGarbageCollector_]

inline def namedQuery(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, name: String): js.Promise[Query[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Query[DocumentData] | Null]]

inline def onSnapshot[T](query: Query[T], observer: Complete[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](query: Query[T], options: SnapshotListenOptions, observer: Complete[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  observer: Error[T]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  observer: Error[T]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def onSnapshotsInSync(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, observer: Next): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshotsInSync(
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  onSync: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def or(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]

inline def orderBy(fieldPath: String): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
inline def orderBy(fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
inline def orderBy(
  fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
  directionStr: OrderByDirection
): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]

inline def persistentLocalCache(): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")().asInstanceOf[PersistentLocalCache_]
inline def persistentLocalCache(settings: PersistentCacheSettings): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentLocalCache_]

inline def persistentMultipleTabManager(): PersistentMultipleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentMultipleTabManager")().asInstanceOf[PersistentMultipleTabManager_]

inline def persistentSingleTabManager(): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")().asInstanceOf[PersistentSingleTabManager_]
inline def persistentSingleTabManager(settings: PersistentSingleTabManagerSettings): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentSingleTabManager_]

inline def query[T](
  query: Query[T],
  compositeFilter: typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint,
  queryConstraints: QueryNonFilterConstraint*
): Query[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(query.asInstanceOf[js.Any], compositeFilter.asInstanceOf[js.Any])).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Query[T]]
inline def query[T](
  query: Query[T],
  queryConstraints: typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint*
): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]

inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def refEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def runTransaction[T](
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  updateFunction: js.Function1[
  /* transaction */ typings.firebaseFirestore.distFirestoreSrcApiTransactionMod.Transaction, 
  js.Promise[T]
]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
inline def runTransaction[T](
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  updateFunction: js.Function1[
  /* transaction */ typings.firebaseFirestore.distFirestoreSrcApiTransactionMod.Transaction, 
  js.Promise[T]
],
  options: TransactionOptions
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

inline def serverTimestamp(): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def setDoc[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  data: PartialWithFieldValue[T],
  options: SetOptions
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def setDoc[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  data: WithFieldValue[T]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def setIndexConfiguration(
  firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
  configuration: IndexConfiguration
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def setIndexConfiguration(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, json: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
  right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
  right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
  right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
  right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
inline def startAfter(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]

inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
inline def startAt(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]

inline def sum(field: String): typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double]]
inline def sum(field: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double]]

inline def terminate(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def updateDoc(
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
  field: String,
  value: Any,
  moreFieldsAndValues: Any*
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc(
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
  field: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
  value: Any,
  moreFieldsAndValues: Any*
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc[T](
  reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  data: UpdateData[T]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def waitForPendingWrites(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
inline def where(
  fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
  opStr: WhereFilterOp,
  value: Any
): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]

inline def writeBatch(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
