package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.CompleteError
import typings.firebaseFirestore.anon.CompleteErrorNext
import typings.firebaseFirestore.anon.ErrorNext
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.mod.^
import typings.firebaseLogger.srcLoggerMod.LogLevelString
import typings.std.Partial
import typings.std.ReadableStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CACHE_SIZE_UNLIMITED: /* -1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CACHE_SIZE_UNLIMITED").asInstanceOf[/* -1 */ Double]

inline def addDoc[T](reference: CollectionReference[T], data: WithFieldValue[T]): js.Promise[DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentReference[T]]]

inline def arrayRemove(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]

inline def arrayUnion(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]

inline def clearIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def collection(firestore: Firestore, path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
inline def collection(reference: CollectionReference[Any], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
inline def collection(reference: DocumentReference[DocumentData], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]

inline def collectionGroup(firestore: Firestore, collectionId: String): Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query_[DocumentData]]

inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def deleteDoc(reference: DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def deleteField(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[FieldValue]

inline def disableNetwork(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def doc(firestore: Firestore, path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
inline def doc(reference: DocumentReference[Any], path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
inline def doc[T](reference: CollectionReference[T], path: String, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]
inline def doc[T](reference: CollectionReference[T], path: Unit, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]

inline def documentId(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[FieldPath]

inline def enableIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def enableIndexedDbPersistence(firestore: Firestore, persistenceSettings: PersistenceSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def enableMultiTabIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def enableNetwork(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def endAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
inline def endAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]

inline def endBefore(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
inline def endBefore(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]

inline def getDoc[T](reference: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]

inline def getDocFromCache[T](reference: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]

inline def getDocFromServer[T](reference: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]

inline def getDocs[T](query: Query_[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]

inline def getDocsFromCache[T](query: Query_[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]

inline def getDocsFromServer[T](query: Query_[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]

inline def getFirestore(): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[Firestore]
inline def getFirestore(app: FirebaseApp): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[Firestore]

inline def increment(n: Double): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[FieldValue]

inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Firestore]
inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[Firestore]

inline def limit(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]

inline def limitToLast(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]

inline def loadBundle(firestore: Firestore, bundleData: String): LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[LoadBundleTask]
inline def loadBundle(firestore: Firestore, bundleData: js.typedarray.ArrayBuffer): LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[LoadBundleTask]
inline def loadBundle(firestore: Firestore, bundleData: ReadableStream[js.typedarray.Uint8Array]): LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[LoadBundleTask]

inline def namedQuery(firestore: Firestore, name: String): js.Promise[Query_[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Query_[DocumentData] | Null]]

inline def onSnapshot[T](query: Query_[T], observer: ErrorNext[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](query: Query_[T], onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query_[T],
  onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query_[T],
  onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query_[T],
  onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](query: Query_[T], options: SnapshotListenOptions, observer: ErrorNext[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query_[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query_[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query_[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  query: Query_[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](reference: DocumentReference[T], observer: CompleteError[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](reference: DocumentReference[T], onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: DocumentReference[T],
  onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: DocumentReference[T],
  onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: DocumentReference[T],
  onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](reference: DocumentReference[T], options: SnapshotListenOptions, observer: CompleteError[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
  onError: js.Function1[/* error */ FirestoreError, Unit],
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshot[T](
  reference: DocumentReference[T],
  options: SnapshotListenOptions,
  onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
  onError: Unit,
  onCompletion: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def onSnapshotsInSync(firestore: Firestore, observer: CompleteErrorNext): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onSnapshotsInSync(firestore: Firestore, onSync: js.Function0[Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def orderBy(fieldPath: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
inline def orderBy(fieldPath: String, directionStr: OrderByDirection): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
inline def orderBy(fieldPath: FieldPath): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
inline def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]

inline def query[T](query: Query_[T], queryConstraints: QueryConstraint*): Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_[T]]

inline def queryEqual[T](left: Query_[T], right: Query_[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def refEqual[T](left: CollectionReference[T], right: CollectionReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](left: CollectionReference[T], right: DocumentReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](left: DocumentReference[T], right: CollectionReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def refEqual[T](left: DocumentReference[T], right: DocumentReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def runTransaction[T](firestore: Firestore, updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
inline def runTransaction[T](
  firestore: Firestore,
  updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
  options: TransactionOptions
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

inline def serverTimestamp(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[FieldValue]

inline def setDoc[T](reference: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def setDoc[T](reference: DocumentReference[T], data: WithFieldValue[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def snapshotEqual[T](left: DocumentSnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](left: DocumentSnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](left: QuerySnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def snapshotEqual[T](left: QuerySnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def startAfter(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
inline def startAfter(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]

inline def startAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
inline def startAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]

inline def terminate(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def updateDoc(reference: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc(reference: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc[T](reference: DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def waitForPendingWrites(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
inline def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: Any): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]

inline def writeBatch(firestore: Firestore): WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[WriteBatch_]

type AddPrefixToKeys[Prefix /* <: String */, T /* <: Record[String, Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T & string as '${Prefix}.${K}' ]:? T[K]}
  */ typings.firebaseFirestore.firebaseFirestoreStrings.AddPrefixToKeys & TopLevel[T]

type ChildUpdateFields[K /* <: String */, V] = AddPrefixToKeys[K, UpdateData[V]]

type DocumentData = /** A mapping between a field and its value. */
StringDictionary[Any]

type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @firebase/firestore.@firebase/firestore.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any]

type PartialWithFieldValue[T] = Partial[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? @firebase/firestore.@firebase/firestore.PartialWithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore.FieldValue}
  */ typings.firebaseFirestore.firebaseFirestoreStrings.PartialWithFieldValue & TopLevel[T]) | T

type Primitive = js.UndefOr[String | Double | Boolean | Null]

type UnionToIntersection[U] = Any

type Unsubscribe = js.Function0[Unit]

type UpdateData[T] = Partial[T] | (typings.firebaseFirestore.firebaseFirestoreStrings.UpdateData & TopLevel[T] & NestedUpdateFields[T]) | T

type WithFieldValue[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: @firebase/firestore.@firebase/firestore.WithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore.FieldValue}
  */ typings.firebaseFirestore.firebaseFirestoreStrings.WithFieldValue & TopLevel[T])
