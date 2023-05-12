package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Add a new document to specified `CollectionReference` with the given data,
  * assigning it a document ID automatically.
  *
  * The result of this write will only be reflected in document reads that occur
  * after the returned promise resolves. If the client is offline, the
  * write fails. If you would like to see local modifications or buffer writes
  * until the client is online, use the full Firestore SDK.
  *
  * @param reference - A reference to the collection to add this document to.
  * @param data - An Object containing the data for the new document.
  * @throws Error - If the provided input is not a valid Firestore document.
  * @returns A `Promise` resolved with a `DocumentReference` pointing to the
  * newly created document after it has been written to the backend.
  */ inline def addDoc(t: Any, e: Any): js.Promise[Dn] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Dn]]

/**
  * Compares two 'AggregateField` instances for equality.
  *
  * @param left Compare this AggregateField to the `right`.
  * @param right Compare this AggregateField to the `left`.
  * @internal TODO (sum/avg) remove when public
  */ inline def aggregateFieldEqual(t: Any, e: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateFieldEqual")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Compares two `AggregateQuerySnapshot` instances for equality.
  *
  * Two `AggregateQuerySnapshot` instances are considered "equal" if they have
  * underlying queries that compare equal, and the same data.
  *
  * @param left - The first `AggregateQuerySnapshot` to compare.
  * @param right - The second `AggregateQuerySnapshot` to compare.
  *
  * @returns `true` if the objects are "equal", as defined above, or `false`
  * otherwise.
  */ inline def aggregateQuerySnapshotEqual(t: Any, e: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Creates a new {@link QueryCompositeFilterConstraint} that is a conjunction of
  * the given filter constraints. A conjunction filter includes a document if it
  * satisfies all of the given filters.
  *
  * @param queryConstraints - Optional. The list of
  * {@link QueryFilterConstraint}s to perform a conjunction for. These must be
  * created with calls to {@link where}, {@link or}, or {@link and}.
  * @returns The newly created {@link QueryCompositeFilterConstraint}.
  */ inline def and(t: Any*): Ar = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Ar]

/**
  * Returns a special value that can be used with {@link (setDoc:1)} or {@link
  * updateDoc:1} that tells the server to remove the given elements from any
  * array value that already exists on the server. All instances of each element
  * specified will be removed from the array. If the field being modified is not
  * already an array it will be overwritten with an empty array.
  *
  * @param elements - The elements to remove from the array.
  * @returns The `FieldValue` sentinel for use in a call to `setDoc()` or
  * `updateDoc()`
  */ inline def arrayRemove(t: Any*): er = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[er]

/**
  * Returns a special value that can be used with {@link @firebase/firestore/lite#(setDoc:1)} or {@link
  * @firebase/firestore/lite#(updateDoc:1)} that tells the server to union the given elements with any array
  * value that already exists on the server. Each specified element that doesn't
  * already exist in the array will be added to the end. If the field being
  * modified is not already an array it will be overwritten with an array
  * containing exactly the specified elements.
  *
  * @param elements - The elements to union into the array.
  * @returns The `FieldValue` sentinel for use in a call to `setDoc()` or
  * `updateDoc()`.
  */ inline def arrayUnion(t: Any*): tr = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[tr]

/**
  * Create an AggregateField object that can be used to compute the average of
  * a specified field over a range of documents in the result set of a query.
  * @param field Specifies the field to average across the result set.
  * @internal TODO (sum/avg) remove when public
  */ inline def average(t: Any): Vn = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(t.asInstanceOf[js.Any]).asInstanceOf[Vn]

inline def collection(t: Any, e: Any, n: Any*): Fn = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).`++`(n.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Fn]

/**
  * Creates and returns a new `Query` instance that includes all documents in the
  * database that are contained in a collection or subcollection with the
  * given `collectionId`.
  *
  * @param firestore - A reference to the root `Firestore` instance.
  * @param collectionId - Identifies the collections to query over. Every
  * collection or subcollection with this ID as the last segment of its path
  * will be included. Cannot contain a slash.
  * @returns The created `Query`.
  */ inline def collectionGroup(t: Any, e: Any): Nn = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Nn]

/**
  * Modify this instance to communicate with the Cloud Firestore emulator.
  *
  * Note: This must be called before this instance has been used to do any
  * operations.
  *
  * @param firestore - The `Firestore` instance to configure to connect to the
  * emulator.
  * @param host - the emulator host (ex: localhost).
  * @param port - the emulator port (ex: 9000).
  * @param options.mockUserToken - the mock auth token to use for unit testing
  * Security Rules.
  */ inline def connectFirestoreEmulator(t: Any, e: Any, n: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def connectFirestoreEmulator(t: Any, e: Any, n: Any, r: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Create an AggregateField object that can be used to compute the count of
  * documents in the result set of a query.
  * @internal TODO (sum/avg) remove when public
  */ inline def count(): Vn = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Vn]

/**
  * Deletes the document referred to by the specified `DocumentReference`.
  *
  * The deletion will only be reflected in document reads that occur after the
  * returned promise resolves. If the client is offline, the
  * delete fails. If you would like to see local modifications or buffer writes
  * until the client is online, use the full Firestore SDK.
  *
  * @param reference - A reference to the document to delete.
  * @returns A `Promise` resolved once the document has been successfully
  * deleted from the backend.
  */ inline def deleteDoc(t: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
  * @license
  * Copyright 2020 Google LLC
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
  * Returns a sentinel for use with {@link @firebase/firestore/lite#(updateDoc:1)} or
  * {@link @firebase/firestore/lite#(setDoc:1)} with `{merge: true}` to mark a field for deletion.
  */ inline def deleteField(): Jn_ = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[Jn_]

inline def doc(t: Any, e: Any, n: Any*): Dn = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).`++`(n.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Dn]

/**
  * Returns a special sentinel `FieldPath` to refer to the ID of a document.
  * It can be used in queries to sort or filter by the document ID.
  */ inline def documentId(): Mn = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[Mn]

inline def endAt(t: Any*): Or_ = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Or_]

inline def endBefore(t: Any*): Or_ = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Or_]

/**
  * Calculates the specified aggregations over the documents in the result
  * set of the given query, without actually downloading the documents.
  *
  * Using this function to perform aggregations is efficient because only the
  * final aggregation values, not the documents' data, is downloaded. This
  * function can even perform aggregations of the documents if the result set
  * would be prohibitively large to download entirely (e.g. thousands of documents).
  *
  * @param query The query whose result set to aggregate over.
  * @param aggregateSpec An `AggregateSpec` object that specifies the aggregates
  * to perform over the result set. The AggregateSpec specifies aliases for each
  * aggregate, which can be used to retrieve the aggregate result.
  * @example
  * ```typescript
  * const aggregateSnapshot = await getAggregate(query, {
  *   countOfDocs: count(),
  *   totalHours: sum('hours'),
  *   averageScore: average('score')
  * });
  *
  * const countOfDocs: number = aggregateSnapshot.data().countOfDocs;
  * const totalHours: number = aggregateSnapshot.data().totalHours;
  * const averageScore: number | null = aggregateSnapshot.data().averageScore;
  * ```
  * @internal TODO (sum/avg) remove when public
  */ inline def getAggregate(t: Any, e: Any): js.Promise[n] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAggregate")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[n]]

/**
  * @license
  * Copyright 2022 Google LLC
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
  * Calculates the number of documents in the result set of the given query,
  * without actually downloading the documents.
  *
  * Using this function to count the documents is efficient because only the
  * final count, not the documents' data, is downloaded. This function can even
  * count the documents if the result set would be prohibitively large to
  * download entirely (e.g. thousands of documents).
  *
  * @param query - The query whose result set size to calculate.
  * @returns A Promise that will be resolved with the count; the count can be
  * retrieved from `snapshot.data().count`, where `snapshot` is the
  * `AggregateQuerySnapshot` to which the returned Promise resolves.
  */ inline def getCount(t: Any): js.Promise[n] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[n]]

/**
  * Reads the document referred to by the specified document reference.
  *
  * All documents are directly fetched from the server, even if the document was
  * previously read or modified. Recent modifications are only reflected in the
  * retrieved `DocumentSnapshot` if they have already been applied by the
  * backend. If the client is offline, the read fails. If you like to use
  * caching or see local modifications, please use the full Firestore SDK.
  *
  * @param reference - The reference of the document to fetch.
  * @returns A Promise resolved with a `DocumentSnapshot` containing the current
  * document contents.
  */ inline def getDoc(t: Any): js.Promise[mr] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[mr]]

/**
  * Executes the query and returns the results as a {@link QuerySnapshot}.
  *
  * All queries are executed directly by the server, even if the the query was
  * previously executed. Recent modifications are only reflected in the retrieved
  * results if they have already been applied by the backend. If the client is
  * offline, the operation fails. To see previously cached result and local
  * modifications, use the full Firestore SDK.
  *
  * @param query - The `Query` to execute.
  * @returns A Promise that will be resolved with the results of the query.
  */ inline def getDocs(t: Any): js.Promise[yr] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[yr]]

inline def getFirestore(e: Any, n: Any): typings.firebaseFirestore.distLitePackagesFirestoreLiteMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreLiteMod.Firestore]

/**
  * Returns a special value that can be used with {@link @firebase/firestore/lite#(setDoc:1)} or {@link
  * @firebase/firestore/lite#(updateDoc:1)} that tells the server to increment the field's current value by
  * the given value.
  *
  * If either the operand or the current field value uses floating point
  * precision, all arithmetic follows IEEE 754 semantics. If both values are
  * integers, values outside of JavaScript's safe number range
  * (`Number.MIN_SAFE_INTEGER` to `Number.MAX_SAFE_INTEGER`) are also subject to
  * precision loss. Furthermore, once processed by the Firestore backend, all
  * integer operations are capped between -2^63 and 2^63-1.
  *
  * If the current field value is not of type `number`, or if the field does not
  * yet exist, the transformation sets the field to the given value.
  *
  * @param n - The value to increment by.
  * @returns The `FieldValue` sentinel for use in a call to `setDoc()` or
  * `updateDoc()`
  */ inline def increment(t: Any): nr = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(t.asInstanceOf[js.Any]).asInstanceOf[nr]

inline def initializeFirestore(t: Any, e: Any, n: Any): typings.firebaseFirestore.distLitePackagesFirestoreLiteMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreLiteMod.Firestore]

/**
  * Creates a {@link QueryLimitConstraint} that only returns the first matching
  * documents.
  *
  * @param limit - The maximum number of items to return.
  * @returns The created {@link QueryLimitConstraint}.
  */ inline def limit(t: Any): Dr = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(t.asInstanceOf[js.Any]).asInstanceOf[Dr]

/**
  * Creates a {@link QueryLimitConstraint} that only returns the last matching
  * documents.
  *
  * You must specify at least one `orderBy` clause for `limitToLast` queries,
  * otherwise an exception will be thrown during execution.
  *
  * @param limit - The maximum number of items to return.
  * @returns The created {@link QueryLimitConstraint}.
  */ inline def limitToLast(t: Any): Dr = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(t.asInstanceOf[js.Any]).asInstanceOf[Dr]

/**
  * Creates a new {@link QueryCompositeFilterConstraint} that is a disjunction of
  * the given filter constraints. A disjunction filter includes a document if it
  * satisfies any of the given filters.
  *
  * @param queryConstraints - Optional. The list of
  * {@link QueryFilterConstraint}s to perform a disjunction for. These must be
  * created with calls to {@link where}, {@link or}, or {@link and}.
  * @returns The newly created {@link QueryCompositeFilterConstraint}.
  */ inline def or(t: Any*): Ar = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Ar]

/**
  * Creates a {@link QueryOrderByConstraint} that sorts the query result by the
  * specified field, optionally in descending order instead of ascending.
  *
  * Note: Documents that do not contain the specified field will not be present
  * in the query result.
  *
  * @param fieldPath - The field to sort by.
  * @param directionStr - Optional direction to sort by ('asc' or 'desc'). If
  * not specified, order will be ascending.
  * @returns The created {@link QueryOrderByConstraint}.
  */ inline def orderBy(t: Any): Vr_ = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(t.asInstanceOf[js.Any]).asInstanceOf[Vr_]
inline def orderBy(t: Any, e: String): Vr_ = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Vr_]

inline def query(t: Any, e: Any, n: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).`++`(n.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]

/**
  * Returns true if the provided queries point to the same collection and apply
  * the same constraints.
  *
  * @param left - A `Query` to compare.
  * @param right - A `Query` to compare.
  * @returns true if the references point to the same location in the same
  * Firestore database.
  */ inline def queryEqual(t: Any, e: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Returns true if the provided references are equal.
  *
  * @param left - A reference to compare.
  * @param right - A reference to compare.
  * @returns true if the references point to the same location in the same
  * Firestore database.
  */ inline def refEqual(t: Any, e: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Executes the given `updateFunction` and then attempts to commit the changes
  * applied within the transaction. If any document read within the transaction
  * has changed, Cloud Firestore retries the `updateFunction`. If it fails to
  * commit after 5 attempts, the transaction fails.
  *
  * The maximum number of writes allowed in a single transaction is 500.
  *
  * @param firestore - A reference to the Firestore database to run this
  * transaction against.
  * @param updateFunction - The function to execute within the transaction
  * context.
  * @param options - An options object to configure maximum number of attempts to
  * commit.
  * @returns If the transaction completed successfully or was explicitly aborted
  * (the `updateFunction` returned a failed promise), the promise returned by the
  * `updateFunction `is returned here. Otherwise, if the transaction failed, a
  * rejected promise with the corresponding failure error is returned.
  */ inline def runTransaction(t: Any, e: Any, n: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

/**
  * Returns a sentinel used with {@link @firebase/firestore/lite#(setDoc:1)} or {@link @firebase/firestore/lite#(updateDoc:1)} to
  * include a server-generated timestamp in the written data.
  */ inline def serverTimestamp(): Zn = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[Zn]

inline def setDoc(t: Any, e: Any, n: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

/**
  * Sets the verbosity of Cloud Firestore logs (debug, error, or silent).
  *
  * @param logLevel - The verbosity you set for activity and error logging. Can
  *   be any of the following values:
  *
  *   <ul>
  *     <li>`debug` for the most verbose logging level, primarily for
  *     debugging.</li>
  *     <li>`error` to log errors only.</li>
  *     <li><code>`silent` to turn off logging.</li>
  *   </ul>
  */ inline def setLogLevel(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Returns true if the provided snapshots are equal.
  *
  * @param left - A snapshot to compare.
  * @param right - A snapshot to compare.
  * @returns true if the snapshots are equal.
  */ inline def snapshotEqual(t: Any, e: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def startAfter(t: Any*): xr = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[xr]

inline def startAt(t: Any*): xr = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[xr]

inline def sum(t: Any): Vn = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(t.asInstanceOf[js.Any]).asInstanceOf[Vn]

/**
  * Terminates the provided `Firestore` instance.
  *
  * After calling `terminate()` only the `clearIndexedDbPersistence()` functions
  * may be used. Any other function will throw a `FirestoreError`. Termination
  * does not cancel any pending writes, and any promises that are awaiting a
  * response from the server will not be resolved.
  *
  * To restart after termination, create a new instance of `Firestore` with
  * {@link (getFirestore:1)}.
  *
  * Note: Under normal circumstances, calling `terminate()` is not required. This
  * function is useful only when you want to force this instance to release all of
  * its resources or in combination with {@link clearIndexedDbPersistence} to
  * ensure that all local state is destroyed between test runs.
  *
  * @param firestore - The `Firestore` instance to terminate.
  * @returns A `Promise` that is resolved when the instance has been successfully
  * terminated.
  */ inline def terminate(t: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(t.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def updateDoc(t: Any, e: Any, n: Any, r: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).`++`(r.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]

/**
  * Creates a {@link QueryFieldFilterConstraint} that enforces that documents
  * must contain the specified field and that the value should satisfy the
  * relation constraint provided.
  *
  * @param fieldPath - The path to compare
  * @param opStr - The operation string (e.g "&lt;", "&lt;=", "==", "&lt;",
  *   "&lt;=", "!=").
  * @param value - The value for comparison
  * @returns The created {@link QueryFieldFilterConstraint}.
  */ inline def where(t: Any, e: Any, n: Any): Ir = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Ir]

/**
  * Creates a write batch, used for performing multiple writes as a single
  * atomic operation. The maximum number of writes allowed in a single WriteBatch
  * is 500.
  *
  * The result of these writes will only be reflected in document reads that
  * occur after the returned promise resolves. If the client is offline, the
  * write fails. If you would like to see local modifications or buffer writes
  * until the client is online, use the full Firestore SDK.
  *
  * @returns A `WriteBatch` that can be used to atomically execute multiple
  * writes.
  */ inline def writeBatch(t: Any): ls = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(t.asInstanceOf[js.Any]).asInstanceOf[ls]

/**
  * A `QueryConstraint` is used to narrow the set of documents returned by a
  * Firestore query. `QueryConstraint`s are created by invoking {@link where},
  * {@link orderBy}, {@link (startAt:1)}, {@link (startAfter:1)}, {@link
  * (endBefore:1)}, {@link (endAt:1)}, {@link limit}, {@link limitToLast} and
  * can then be passed to {@link (query:1)} to create a new query instance that
  * also contains this `QueryConstraint`.
  */ type br = vr

/**
  * A `QueryDocumentSnapshot` contains data read from a document in your
  * Firestore database as part of a query. The document is guaranteed to exist
  * and its data can be extracted with `.data()` or `.get(<field>)` to get a
  * specific field.
  *
  * A `QueryDocumentSnapshot` offers the same API surface as a
  * `DocumentSnapshot`. Since query results contain only existing documents, the
  * `exists` property will always be true and `data()` will never return
  * 'undefined'.
  */ type pr = mr
