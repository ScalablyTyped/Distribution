package typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.CacheSizeBytes
import typings.firebaseFirestore.anon.Instantiable
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.`25`
import typings.firebaseFirestore.anon.`26`
import typings.firebaseFirestore.anon.`27`
import typings.firebaseFirestore.anon.`28`
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.MemoryCacheSettings
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.MemoryEagerGarbageCollector_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.MemoryLocalCache_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.MemoryLruGarbageCollector_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.PersistentCacheSettings
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.PersistentLocalCache_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.PersistentMultipleTabManager_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.PersistentSingleTabManagerSettings
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiCacheConfigMod.PersistentSingleTabManager_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiIndexConfigurationMod.IndexConfiguration
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.^
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiReferenceImplMod.SnapshotListenOptions
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiReferenceImplMod.Unsubscribe
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSettingsMod.PersistenceSettings
import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreFirestoreClientMod.FirestoreClient
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryFilterConstraint
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryNonFilterConstraint
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CACHE_SIZE_UNLIMITED: /* -1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CACHE_SIZE_UNLIMITED").asInstanceOf[/* -1 */ Double]

inline def addDoc[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  data: WithFieldValue[T]
): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]]

inline def aggregateFieldEqual(
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Any],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Any]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateFieldEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def and(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]

inline def arrayRemove(elements: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def arrayUnion(elements: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def average(field: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null]]
inline def average(field: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double | Null]]

inline def cast[T](obj: js.Object, constructor: Instantiable[T]): T | scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_cast")(obj.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T | scala.Nothing]

inline def clearIndexedDbPersistence(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def collection(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
inline def collection(
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[Any],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
inline def collection(
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]

inline def collectionGroup(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
  collectionId: String
): Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query[DocumentData]]

inline def connectFirestoreEmulator(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
  host: String,
  port: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def connectFirestoreEmulator(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
  host: String,
  port: Double,
  options: MockUserToken
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def count(): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double]]

inline def debugAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_debugAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]

inline def deleteDoc(
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any]
): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def deleteField(): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def disableNetwork(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def doc(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
inline def doc(
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
inline def doc[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  path: String,
  pathSegments: String*
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
inline def doc[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  path: Unit,
  pathSegments: String*
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]

inline def documentId(): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath]

inline def enableIndexedDbPersistence(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def enableIndexedDbPersistence(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  persistenceSettings: PersistenceSettings
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def enableMultiTabIndexedDbPersistence(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def enableNetwork(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
inline def endAt(
  snapshot: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]

inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
inline def endBefore(
  snapshot: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]

inline def ensureFirestoreConfigured(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): FirestoreClient = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFirestoreConfigured")(firestore.asInstanceOf[js.Any]).asInstanceOf[FirestoreClient]

inline def executeWrite(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  mutations: js.Array[Mutation]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeWrite")(firestore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def getAggregateFromServer[T /* <: AggregateSpec */](query: Query_[Any], aggregateSpec: T): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAggregateFromServer")(query.asInstanceOf[js.Any], aggregateSpec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]]]

inline def getCountFromServer(query: Query_[Any]): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`25`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`25`]]]

inline def getDoc[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]

inline def getDocFromCache[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]

inline def getDocFromServer[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]

inline def getDocs[T](query: Query[T]): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]

inline def getDocsFromCache[T](query: Query[T]): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]

inline def getDocsFromServer[T](query: Query[T]): js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]

inline def getFirestore(): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore]
inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore]
inline def getFirestore(app: FirebaseApp, databaseId: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore]
inline def getFirestore(databaseId: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore]

inline def increment(n: Double): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore]
inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore]

inline def isBase64Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBase64Available")().asInstanceOf[Boolean]

inline def limit(limit: Double): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]

inline def limitToLast(limit: Double): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryLimitConstraint]

inline def loadBundle(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  bundleData: String
): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.LoadBundleTask]
inline def loadBundle(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  bundleData: js.typedarray.ArrayBuffer
): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.LoadBundleTask]
inline def loadBundle(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  bundleData: ReadableStream[js.typedarray.Uint8Array]
): typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.LoadBundleTask]

inline def logWarn(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logWarn")(scala.List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]

inline def memoryEagerGarbageCollector(): MemoryEagerGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryEagerGarbageCollector")().asInstanceOf[MemoryEagerGarbageCollector_]

inline def memoryLocalCache(): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")().asInstanceOf[MemoryLocalCache_]
inline def memoryLocalCache(settings: MemoryCacheSettings): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLocalCache_]

inline def memoryLruGarbageCollector(): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")().asInstanceOf[MemoryLruGarbageCollector_]
inline def memoryLruGarbageCollector(settings: CacheSizeBytes): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLruGarbageCollector_]

inline def namedQuery(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  name: String
): js.Promise[Query[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Query[DocumentData] | Null]]

inline def onSnapshot[T](query: Query[T], observer: `26`[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](query: Query[T], options: SnapshotListenOptions, observer: `26`[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  observer: `27`[T]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  observer: `27`[T]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: js.Function1[
  /* error */ typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError, 
  Unit
],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[
  /* snapshot */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
  Unit
],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def onSnapshotsInSync(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  observer: `28`
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshotsInSync(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  onSync: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def or(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint]

inline def orderBy(fieldPath: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
inline def orderBy(fieldPath: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]
inline def orderBy(
  fieldPath: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
  directionStr: OrderByDirection
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryOrderByConstraint]

inline def persistentLocalCache(): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")().asInstanceOf[PersistentLocalCache_]
inline def persistentLocalCache(settings: PersistentCacheSettings): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentLocalCache_]

inline def persistentMultipleTabManager(): PersistentMultipleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentMultipleTabManager")().asInstanceOf[PersistentMultipleTabManager_]

inline def persistentSingleTabManager(): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")().asInstanceOf[PersistentSingleTabManager_]
inline def persistentSingleTabManager(settings: PersistentSingleTabManagerSettings): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentSingleTabManager_]

inline def query[T](
  query: Query[T],
  compositeFilter: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryCompositeFilterConstraint,
  queryConstraints: QueryNonFilterConstraint*
): Query[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(query.asInstanceOf[js.Any], compositeFilter.asInstanceOf[js.Any])).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Query[T]]
inline def query[T](
  query: Query[T],
  queryConstraints: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraint*
): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]

inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def refEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def runTransaction[T](
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  updateFunction: js.Function1[
  /* transaction */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiTransactionMod.Transaction, 
  js.Promise[T]
]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
inline def runTransaction[T](
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  updateFunction: js.Function1[
  /* transaction */ typings.firebaseFirestore.distLitePackagesFirestoreSrcApiTransactionMod.Transaction, 
  js.Promise[T]
],
  options: TransactionOptions
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

inline def serverTimestamp(): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]

inline def setDoc[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  data: PartialWithFieldValue[T],
  options: SetOptions
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def setDoc[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  data: WithFieldValue[T]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def setIndexConfiguration(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  configuration: IndexConfiguration
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def setIndexConfiguration(
  firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore,
  json: String
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](
  left: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
  right: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
inline def startAfter(
  snapshot: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]

inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]
inline def startAt(
  snapshot: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryStartAtConstraint]

inline def sum(field: String): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double]]
inline def sum(field: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField[Double]]

inline def terminate(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def updateDoc(
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
  field: String,
  value: Any,
  moreFieldsAndValues: Any*
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc(
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
  field: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
  value: Any,
  moreFieldsAndValues: Any*
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc[T](
  reference: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
  data: UpdateData[T]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def waitForPendingWrites(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]
inline def where(
  fieldPath: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
  opStr: WhereFilterOp,
  value: Any
): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryFieldFilterConstraint]

inline def writeBatch(firestore: typings.firebaseFirestore.distLitePackagesFirestoreSrcApiDatabaseMod.Firestore): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
