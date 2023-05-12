package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.Seconds
import typings.firebaseFirestore.anon.`21`
import typings.firebaseFirestore.distLiteInternalMod.^
import typings.firebaseFirestore.firebaseFirestoreStrings.NULL_VALUE
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addDoc[T](reference: CollectionReference[T], data: WithFieldValue[T]): js.Promise[DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentReference[T]]]

inline def aggregateFieldEqual(left: AggregateField[Any], right: AggregateField[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateFieldEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def and(queryConstraints: QueryFilterConstraint*): QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryCompositeFilterConstraint]

inline def arrayRemove(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]

inline def arrayUnion(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]

inline def average(field: String): AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double | Null]]
inline def average(field: FieldPath): AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double | Null]]

inline def collection(firestore: Firestore, path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
inline def collection(reference: CollectionReference[Any], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
inline def collection(reference: DocumentReference[DocumentData], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]

inline def collectionGroup(firestore: Firestore, collectionId: String): Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query_[DocumentData]]

inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def count(): AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[AggregateField[Double]]

inline def deleteDoc(reference: DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def deleteField(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[FieldValue]

inline def doc(firestore: Firestore, path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
inline def doc(reference: DocumentReference[Any], path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
inline def doc[T](reference: CollectionReference[T], path: String, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]
inline def doc[T](reference: CollectionReference[T], path: Unit, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]

inline def documentId(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[FieldPath]

inline def endAt(fieldValues: Any*): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryEndAtConstraint]
inline def endAt(snapshot: DocumentSnapshot[Any]): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryEndAtConstraint]

inline def endBefore(fieldValues: Any*): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryEndAtConstraint]
inline def endBefore(snapshot: DocumentSnapshot[Any]): QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryEndAtConstraint]

inline def getAggregate[T /* <: AggregateSpec */](query: Query_[Any], aggregateSpec: T): js.Promise[AggregateQuerySnapshot[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAggregate")(query.asInstanceOf[js.Any], aggregateSpec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AggregateQuerySnapshot[T]]]

inline def getCount(query: Query_[Any]): js.Promise[AggregateQuerySnapshot[`21`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[`21`]]]

inline def getDoc[T](reference: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]

inline def getDocs[T](query: Query_[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]

inline def getFirestore(): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[Firestore]
inline def getFirestore(app: FirebaseApp): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[Firestore]
inline def getFirestore(app: FirebaseApp, databaseId: String): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[Firestore]
inline def getFirestore(databaseId: String): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[Firestore]

inline def increment(n: Double): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[FieldValue]

inline def initializeFirestore(app: FirebaseApp, settings: Settings): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Firestore]
inline def initializeFirestore(app: FirebaseApp, settings: Settings, databaseId: String): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[Firestore]

inline def limit(limit: Double): QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryLimitConstraint]

inline def limitToLast(limit: Double): QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryLimitConstraint]

inline def or(queryConstraints: QueryFilterConstraint*): QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryCompositeFilterConstraint]

inline def orderBy(fieldPath: String): QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryOrderByConstraint]
inline def orderBy(fieldPath: String, directionStr: OrderByDirection): QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryOrderByConstraint]
inline def orderBy(fieldPath: FieldPath): QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryOrderByConstraint]
inline def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryOrderByConstraint]

inline def query[T](
  query: Query_[T],
  compositeFilter: QueryCompositeFilterConstraint,
  queryConstraints: QueryNonFilterConstraint*
): Query_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(query.asInstanceOf[js.Any], compositeFilter.asInstanceOf[js.Any])).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Query_[T]]
inline def query[T](query: Query_[T], queryConstraints: QueryConstraint*): Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_[T]]

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

inline def startAfter(fieldValues: Any*): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryStartAtConstraint]
inline def startAfter(snapshot: DocumentSnapshot[Any]): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryStartAtConstraint]

inline def startAt(fieldValues: Any*): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryStartAtConstraint]
inline def startAt(snapshot: DocumentSnapshot[Any]): QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryStartAtConstraint]

inline def sum(field: String): AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double]]
inline def sum(field: FieldPath): AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double]]

inline def terminate(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def updateDoc(reference: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc(reference: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
inline def updateDoc[T](reference: DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryFieldFilterConstraint]
inline def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: Any): QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryFieldFilterConstraint]

inline def writeBatch(firestore: Firestore): WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[WriteBatch_]

/**
  * Describes a map whose keys are active target ids. We do not care about the type of the
  * values.
  */
type ActiveTargets = SortedMap[TargetId, Any]

type AggregateFieldType = AggregateField[Double | Null]

type AggregateSpec = StringDictionary[AggregateFieldType]

type ApiClientObjectMap[T] = StringDictionary[T]

type AuthTokenFactory = js.Function0[String]

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * BatchID is a locally assigned ID for a batch of mutations that have been
  * applied.
  */
type BatchId = Double

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  V extends std.Record<string, unknown> ? @firebase/firestore.@firebase/firestore/dist/lite/internal.AddPrefixToKeys<K, @firebase/firestore.@firebase/firestore/dist/lite/internal.UpdateData<V>> : never
  }}}
  */
type ChildUpdateFields[K /* <: String */, V] = AddPrefixToKeys[K, UpdateData[V]]

/**
  * A randomly-generated key assigned to each Firestore instance at startup.
  */
type ClientId = String

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
type Comparator[K] = js.Function2[/* key1 */ K, /* key2 */ K, Double]

/**
  * A Listener for credential change events. The listener should fetch a new
  * token and may need to invalidate other state if the current user has also
  * changed.
  */
type CredentialChangeListener[T] = js.Function1[/* credential */ T, js.Promise[Unit]]

type DocumentComparator = js.Function2[/* doc1 */ Document2, /* doc2 */ Document2, Double]

type DocumentData = /** A mapping between a field and its value. */
StringDictionary[Any]

type DocumentKeyMap[T] = ObjectMap[DocumentKey, T]

type DocumentKeySet = SortedSet[DocumentKey]

type DocumentMap = SortedMap[DocumentKey, Document2]

type DocumentVersionMap = SortedMap[DocumentKey, SnapshotVersion]

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
type FulfilledHandler[T, R] = (js.Function1[/* result */ T, R | PersistencePromise[R]]) | Null

type ListenSequenceNumber = Double

type MapValue = typings.firebaseFirestore.distLiteInternalMod.firestoreV1ApiClientInterfaces.MapValue

/** Miscellaneous collection types / constants. */
type MutableDocumentMap = SortedMap[DocumentKey, MutableDocument]

type MutationMap = DocumentKeyMap[Mutation]

type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @firebase/firestore.@firebase/firestore/dist/lite/internal.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any]

type OverlayMap = DocumentKeyMap[Overlay]

type OverlayedDocumentMap = DocumentKeyMap[OverlayedDocument]

type PartialWithFieldValue[T] = Partial[T] | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @firebase/firestore.@firebase/firestore/dist/lite/internal.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @firebase/firestore.@firebase/firestore/dist/lite/internal.PartialWithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore/dist/lite/internal.FieldValue} : never */ js.Any)

type Primitive = js.UndefOr[String | Double | Boolean | Null]

type RejectedHandler[R] = (js.Function1[/* reason */ js.Error, R | PersistencePromise[R]]) | Null

type Rejector = js.Function1[/* error */ js.Error, Unit]

type Resolver[T] = js.Function1[/* value */ js.UndefOr[T], Unit]

type StructuredQuery = typings.firebaseFirestore.distLiteInternalMod.firestoreV1ApiClientInterfaces.StructuredQuery

/**
  * A locally-assigned ID used to refer to a target being watched via the
  * Watch service.
  */
type TargetId = Double

type Timestamp2 = String | Seconds

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @firebase/firestore.@firebase/firestore/dist/lite/internal.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @firebase/firestore.@firebase/firestore/dist/lite/internal.UpdateData<T[K]> | @firebase/firestore.@firebase/firestore/dist/lite/internal.FieldValue} & @firebase/firestore.@firebase/firestore/dist/lite/internal.NestedUpdateFields<T> : std.Partial<T>
  }}}
  */
type UpdateData[T] = T

type Value = typings.firebaseFirestore.distLiteInternalMod.firestoreV1ApiClientInterfaces.Value

type ValueNullValue = NULL_VALUE

type WithFieldValue[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @firebase/firestore.@firebase/firestore/dist/lite/internal.Primitive ? T : T extends {} ? {[ K in keyof T ]: @firebase/firestore.@firebase/firestore/dist/lite/internal.WithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore/dist/lite/internal.FieldValue} : never */ js.Any)
