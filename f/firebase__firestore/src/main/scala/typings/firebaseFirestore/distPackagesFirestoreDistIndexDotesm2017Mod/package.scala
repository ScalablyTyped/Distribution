package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod.^
import typings.firebaseFirestore.firebaseFirestoreInts.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
  * Constant used to indicate the LRU garbage collection should be disabled.
  * Set this value as the `cacheSizeBytes` on the settings passed to the
  * {@link Firestore} instance.
  */ inline def CACHE_SIZE_UNLIMITED: `-1` = ^.asInstanceOf[js.Dynamic].selectDynamic("CACHE_SIZE_UNLIMITED").asInstanceOf[`-1`]

/**
  * Add a new document to specified `CollectionReference` with the given data,
  * assigning it a document ID automatically.
  *
  * @param reference - A reference to the collection to add this document to.
  * @param data - An Object containing the data for the new document.
  * @returns A `Promise` resolved with a `DocumentReference` pointing to the
  * newly created document after it has been written to the backend (Note that it
  * won't resolve while you're offline).
  */ inline def addDoc(t: Any, e: Any): js.Promise[lh] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[lh]]

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
  */ inline def and(t: Any*): bl = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[bl]

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
  */ inline def arrayRemove(t: Any*): il = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[il]

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
  */ inline def arrayUnion(t: Any*): sl = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[sl]

/**
  * Create an AggregateField object that can be used to compute the average of
  * a specified field over a range of documents in the result set of a query.
  * @param field Specifies the field to average across the result set.
  * @internal TODO (sum/avg) remove when public
  */ inline def average(t: Any): Bh = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(t.asInstanceOf[js.Any]).asInstanceOf[Bh]

inline def cast(t: Any, e: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_cast")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Any]

/**
  * Clears the persistent storage. This includes pending writes and cached
  * documents.
  *
  * Must be called while the {@link Firestore} instance is not started (after the app is
  * terminated or when the app is first initialized). On startup, this function
  * must be called before other functions (other than {@link
  * initializeFirestore} or {@link (getFirestore:1)})). If the {@link Firestore}
  * instance is still running, the promise will be rejected with the error code
  * of `failed-precondition`.
  *
  * Note: `clearIndexedDbPersistence()` is primarily intended to help write
  * reliable tests that use Cloud Firestore. It uses an efficient mechanism for
  * dropping existing data but does not attempt to securely overwrite or
  * otherwise make cached data unrecoverable. For applications that are sensitive
  * to the disclosure of cached data in between user sessions, we strongly
  * recommend not enabling persistence at all.
  *
  * @param firestore - The {@link Firestore} instance to clear persistence for.
  * @returns A `Promise` that is resolved when the persistent storage is
  * cleared. Otherwise, the promise is rejected with an error.
  */ inline def clearIndexedDbPersistence(t: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

inline def collection(t: Any, e: Any, n: Any*): dh = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).`++`(n.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[dh]

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
  */ inline def collectionGroup(t: Any, e: Any): fh = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[fh]

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
inline def connectFirestoreEmulator(t: Any, e: Any, n: Any, s: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Create an AggregateField object that can be used to compute the count of
  * documents in the result set of a query.
  * @internal TODO (sum/avg) remove when public
  */ inline def count(): Bh = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Bh]

/**
  * Fails if the given assertion condition is false, throwing an Error with the
  * given message if it did.
  *
  * The code of callsites invoking this function are stripped out in production
  * builds. Any side-effects of code within the debugAssert() invocation will not
  * happen in this case.
  *
  * @internal
  */ inline def debugAssert(t: Any, e: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_debugAssert")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Deletes the document referred to by the specified `DocumentReference`.
  *
  * @param reference - A reference to the document to delete.
  * @returns A Promise resolved once the document has been successfully
  * deleted from the backend (note that it won't resolve while you're offline).
  */ inline def deleteDoc(t: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

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
  */ inline def deleteField(): tl = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[tl]

/**
  * Disables network usage for this instance. It can be re-enabled via {@link
  * enableNetwork}. While the network is disabled, any snapshot listeners,
  * `getDoc()` or `getDocs()` calls will return results from cache, and any write
  * operations will be queued until the network is restored.
  *
  * @returns A `Promise` that is resolved once the network has been disabled.
  */ inline def disableNetwork(t: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(t.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def doc(t: Any, e: Any, n: Any*): lh = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).`++`(n.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[lh]

/**
  * Returns a special sentinel `FieldPath` to refer to the ID of a document.
  * It can be used in queries to sort or filter by the document ID.
  */ inline def documentId(): Uh = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[Uh]

/**
  * Attempts to enable persistent storage, if possible.
  *
  * Must be called before any other functions (other than
  * {@link initializeFirestore}, {@link (getFirestore:1)} or
  * {@link clearIndexedDbPersistence}.
  *
  * If this fails, `enableIndexedDbPersistence()` will reject the promise it
  * returns. Note that even after this failure, the {@link Firestore} instance will
  * remain usable, however offline persistence will be disabled.
  *
  * There are several reasons why this can fail, which can be identified by
  * the `code` on the error.
  *
  *   * failed-precondition: The app is already open in another browser tab.
  *   * unimplemented: The browser is incompatible with the offline
  *     persistence implementation.
  *
  * @param firestore - The {@link Firestore} instance to enable persistence for.
  * @param persistenceSettings - Optional settings object to configure
  * persistence.
  * @returns A `Promise` that represents successfully enabling persistent storage.
  * @deprecated This function will be removed in a future major release. Instead, set
  * `FirestoreSettings.cache` to an instance of `IndexedDbLocalCache` to
  * turn on IndexedDb cache. Calling this function when `FirestoreSettings.cache`
  * is already specified will throw an exception.
  */ inline def enableIndexedDbPersistence(t: Any, e: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Any]

/**
  * Attempts to enable multi-tab persistent storage, if possible. If enabled
  * across all tabs, all operations share access to local persistence, including
  * shared execution of queries and latency-compensated local document updates
  * across all connected instances.
  *
  * If this fails, `enableMultiTabIndexedDbPersistence()` will reject the promise
  * it returns. Note that even after this failure, the {@link Firestore} instance will
  * remain usable, however offline persistence will be disabled.
  *
  * There are several reasons why this can fail, which can be identified by
  * the `code` on the error.
  *
  *   * failed-precondition: The app is already open in another browser tab and
  *     multi-tab is not enabled.
  *   * unimplemented: The browser is incompatible with the offline
  *     persistence implementation.
  *
  * @param firestore - The {@link Firestore} instance to enable persistence for.
  * @returns A `Promise` that represents successfully enabling persistent
  * storage.
  * @deprecated This function will be removed in a future major release. Instead, set
  * `FirestoreSettings.cache` to an instance of `IndexedDbLocalCache` to
  * turn on indexeddb cache. Calling this function when `FirestoreSettings.cache`
  * is already specified will throw an exception.
  */ inline def enableMultiTabIndexedDbPersistence(t: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(t.asInstanceOf[js.Any]).asInstanceOf[Any]

/**
  * Re-enables use of the network for this {@link Firestore} instance after a prior
  * call to {@link disableNetwork}.
  *
  * @returns A `Promise` that is resolved once the network has been enabled.
  */ inline def enableNetwork(t: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(t.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def endAt(t: Any*): Fl = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Fl]

inline def endBefore(t: Any*): Fl = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Fl]

/**
  * @internal
  */ inline def ensureFirestoreConfigured(t: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFirestoreConfigured")(t.asInstanceOf[js.Any]).asInstanceOf[Any]

/**
  * Locally writes `mutations` on the async queue.
  * @internal
  */ inline def executeWrite(t: Any, e: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeWrite")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

/**
  * Calculates the specified aggregations over the documents in the result
  * set of the given query, without actually downloading the documents.
  *
  * Using this function to perform aggregations is efficient because only the
  * final aggregation values, not the documents' data, is downloaded. This
  * function can even perform aggregations of the documents if the result set
  * would be prohibitively large to download entirely (e.g. thousands of documents).
  *
  * The result received from the server is presented, unaltered, without
  * considering any local state. That is, documents in the local cache are not
  * taken into consideration, neither are local modifications not yet
  * synchronized with the server. Previously-downloaded results, if any, are not
  * used: every request using this source necessarily involves a round trip to
  * the server.
  *
  * @param query The query whose result set to aggregate over.
  * @param aggregateSpec An `AggregateSpec` object that specifies the aggregates
  * to perform over the result set. The AggregateSpec specifies aliases for each
  * aggregate, which can be used to retrieve the aggregate result.
  * @example
  * ```typescript
  * const aggregateSnapshot = await getAggregateFromServer(query, {
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
  */ inline def getAggregateFromServer(t: Any, e: Any): js.Promise[Lh_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAggregateFromServer")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Lh_]]

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
  * The result received from the server is presented, unaltered, without
  * considering any local state. That is, documents in the local cache are not
  * taken into consideration, neither are local modifications not yet
  * synchronized with the server. Previously-downloaded results, if any, are not
  * used: every request using this source necessarily involves a round trip to
  * the server.
  *
  * @param query - The query whose result set size to calculate.
  * @returns A Promise that will be resolved with the count; the count can be
  * retrieved from `snapshot.data().count`, where `snapshot` is the
  * `AggregateQuerySnapshot` to which the returned Promise resolves.
  */ inline def getCountFromServer(t: Any): js.Promise[Lh_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Lh_]]

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
  * Reads the document referred to by this `DocumentReference`.
  *
  * Note: `getDoc()` attempts to provide up-to-date data when possible by waiting
  * for data from the server, but it may return cached data or fail if you are
  * offline and the server cannot be reached. To specify this behavior, invoke
  * {@link getDocFromCache} or {@link getDocFromServer}.
  *
  * @param reference - The reference of the document to fetch.
  * @returns A Promise resolved with a `DocumentSnapshot` containing the
  * current document contents.
  */ inline def getDoc(t: Any): js.Promise[nf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[nf]]

/**
  * Reads the document referred to by this `DocumentReference` from cache.
  * Returns an error if the document is not currently cached.
  *
  * @returns A `Promise` resolved with a `DocumentSnapshot` containing the
  * current document contents.
  */ inline def getDocFromCache(t: Any): js.Promise[nf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[nf]]

/**
  * Reads the document referred to by this `DocumentReference` from the server.
  * Returns an error if the network is not available.
  *
  * @returns A `Promise` resolved with a `DocumentSnapshot` containing the
  * current document contents.
  */ inline def getDocFromServer(t: Any): js.Promise[nf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[nf]]

/**
  * Executes the query and returns the results as a `QuerySnapshot`.
  *
  * Note: `getDocs()` attempts to provide up-to-date data when possible by
  * waiting for data from the server, but it may return cached data or fail if
  * you are offline and the server cannot be reached. To specify this behavior,
  * invoke {@link getDocsFromCache} or {@link getDocsFromServer}.
  *
  * @returns A `Promise` that will be resolved with the results of the query.
  */ inline def getDocs(t: Any): js.Promise[rf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[rf]]

/**
  * Executes the query and returns the results as a `QuerySnapshot` from cache.
  * Returns an empty result set if no documents matching the query are currently
  * cached.
  *
  * @returns A `Promise` that will be resolved with the results of the query.
  */ inline def getDocsFromCache(t: Any): js.Promise[rf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[rf]]

/**
  * Executes the query and returns the results as a `QuerySnapshot` from the
  * server. Returns an error if the network is not available.
  *
  * @returns A `Promise` that will be resolved with the results of the query.
  */ inline def getDocsFromServer(t: Any): js.Promise[rf] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[rf]]

inline def getFirestore(e: Any, n: Any): typings.firebaseFirestore.distPackagesFirestoreSrcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcMod.Firestore]

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
  */ inline def increment(t: Any): rl = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(t.asInstanceOf[js.Any]).asInstanceOf[rl]

/**
  * Initializes a new instance of {@link Firestore} with the provided settings.
  * Can only be called before any other function, including
  * {@link (getFirestore:1)}. If the custom settings are empty, this function is
  * equivalent to calling {@link (getFirestore:1)}.
  *
  * @param app - The {@link @firebase/app#FirebaseApp} with which the {@link Firestore} instance will
  * be associated.
  * @param settings - A settings object to configure the {@link Firestore} instance.
  * @param databaseId - The name of database.
  * @returns A newly initialized {@link Firestore} instance.
  */ inline def initializeFirestore(t: Any, e: Any, n: Any): typings.firebaseFirestore.distPackagesFirestoreSrcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcMod.Firestore]

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
/** Converts a Base64 encoded string to a binary string. */
/** True if and only if the Base64 conversion functions are available. */
inline def isBase64Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBase64Available")().asInstanceOf[Boolean]

/**
  * Creates a {@link QueryLimitConstraint} that only returns the first matching
  * documents.
  *
  * @param limit - The maximum number of items to return.
  * @returns The created {@link QueryLimitConstraint}.
  */ inline def limit(t: Any): xl = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(t.asInstanceOf[js.Any]).asInstanceOf[xl]

/**
  * Creates a {@link QueryLimitConstraint} that only returns the last matching
  * documents.
  *
  * You must specify at least one `orderBy` clause for `limitToLast` queries,
  * otherwise an exception will be thrown during execution.
  *
  * @param limit - The maximum number of items to return.
  * @returns The created {@link QueryLimitConstraint}.
  */ inline def limitToLast(t: Any): xl = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(t.asInstanceOf[js.Any]).asInstanceOf[xl]

/**
  * Loads a Firestore bundle into the local cache.
  *
  * @param firestore - The {@link Firestore} instance to load bundles for.
  * @param bundleData - An object representing the bundle to be loaded. Valid
  * objects are `ArrayBuffer`, `ReadableStream<Uint8Array>` or `string`.
  *
  * @returns A `LoadBundleTask` object, which notifies callers with progress
  * updates, and completion or error events. It can be used as a
  * `Promise<LoadBundleTaskProgress>`.
  */ inline def loadBundle(t: Any, e: Any): Th = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Th]

/**
  * @internal
  */ inline def logWarn(t: Any, e: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logWarn")(scala.List(t.asInstanceOf[js.Any]).`++`(e.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]

/**
  * Creates an instance of `MemoryEagerGarbageCollector`. This is also the
  * default garbage collector unless it is explicitly specified otherwise.
  */ inline def memoryEagerGarbageCollector(): bf = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryEagerGarbageCollector")().asInstanceOf[bf]

/**
  * Creates an instance of `MemoryLocalCache`. The instance can be set to
  * `FirestoreSettings.cache` to tell the SDK which cache layer to use.
  */ inline def memoryLocalCache(t: Any): vf = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")(t.asInstanceOf[js.Any]).asInstanceOf[vf]

/**
  * Creates an instance of `MemoryLruGarbageCollector`.
  *
  * A target size can be specified as part of the setting parameter. The
  * collector will start deleting documents once the cache size exceeds
  * the given size. The default cache size is 40MB (40 * 1024 * 1024 bytes).
  */ inline def memoryLruGarbageCollector(t: Any): Vf_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")(t.asInstanceOf[js.Any]).asInstanceOf[Vf_]

/**
  * Reads a Firestore {@link Query} from local cache, identified by the given
  * name.
  *
  * The named queries are packaged  into bundles on the server side (along
  * with resulting documents), and loaded to local cache using `loadBundle`. Once
  * in local cache, use this method to extract a {@link Query} by name.
  *
  * @param firestore - The {@link Firestore} instance to read the query from.
  * @param name - The name of the query.
  * @returns A `Promise` that is resolved with the Query or `null`.
  */ inline def namedQuery(t: Any, e: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def onSnapshot(t: Any, e: Any*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(scala.List(t.asInstanceOf[js.Any]).`++`(e.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Unit]]

inline def onSnapshotsInSync(t: Any, e: Any): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]

/**
  * Creates a new {@link QueryCompositeFilterConstraint} that is a disjunction of
  * the given filter constraints. A disjunction filter includes a document if it
  * satisfies any of the given filters.
  *
  * @param queryConstraints - Optional. The list of
  * {@link QueryFilterConstraint}s to perform a disjunction for. These must be
  * created with calls to {@link where}, {@link or}, or {@link and}.
  * @returns The newly created {@link QueryCompositeFilterConstraint}.
  */ inline def or(t: Any*): bl = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[bl]

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
  */ inline def orderBy(t: Any): Dl = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(t.asInstanceOf[js.Any]).asInstanceOf[Dl]
inline def orderBy(t: Any, e: String): Dl = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Dl]

/**
  * Creates an instance of `PersistentLocalCache`. The instance can be set to
  * `FirestoreSettings.cache` to tell the SDK which cache layer to use.
  */ inline def persistentLocalCache(t: Any): Pf = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")(t.asInstanceOf[js.Any]).asInstanceOf[Pf]

/**
  * Creates an instance of `PersistentMultipleTabManager`.
  */ inline def persistentMultipleTabManager(): kf = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentMultipleTabManager")().asInstanceOf[kf]

/**
  * Creates an instance of `PersistentSingleTabManager`.
  *
  * @param settings Configures the created tab manager.
  */ inline def persistentSingleTabManager(t: Any): Nf_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")(t.asInstanceOf[js.Any]).asInstanceOf[Nf_]

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
  */ inline def serverTimestamp(): nl = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[nl]

inline def setDoc(t: Any, e: Any, n: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

/**
  * @license
  * Copyright 2021 Google LLC
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
  */ inline def setIndexConfiguration(t: Any, e: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Any]

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

inline def startAfter(t: Any*): Ml = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Ml]

inline def startAt(t: Any*): Ml = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(t.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Ml]

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
  * Create an AggregateField object that can be used to compute the sum of
  * a specified field over a range of documents in the result set of a query.
  * @param field Specifies the field to sum across the result set.
  * @internal TODO (sum/avg) remove when public
  */ inline def sum(t: Any): Bh = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(t.asInstanceOf[js.Any]).asInstanceOf[Bh]

/**
  * Terminates the provided {@link Firestore} instance.
  *
  * After calling `terminate()` only the `clearIndexedDbPersistence()` function
  * may be used. Any other function will throw a `FirestoreError`.
  *
  * To restart after termination, create a new instance of FirebaseFirestore with
  * {@link (getFirestore:1)}.
  *
  * Termination does not cancel any pending writes, and any promises that are
  * awaiting a response from the server will not be resolved. If you have
  * persistence enabled, the next time you start this instance, it will resume
  * sending these writes to the server.
  *
  * Note: Under normal circumstances, calling `terminate()` is not required. This
  * function is useful only when you want to force this instance to release all
  * of its resources or in combination with `clearIndexedDbPersistence()` to
  * ensure that all local state is destroyed between test runs.
  *
  * @returns A `Promise` that is resolved when the instance has been successfully
  * terminated.
  */ inline def terminate(t: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(t.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def updateDoc(t: Any, e: Any, n: Any, s: Any*): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).`++`(s.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Any]]

/**
  * Validates that two boolean options are not set at the same time.
  * @internal
  */ inline def validateIsNotUsedTogether(t: Any, e: Any, n: Any, s: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Waits until all currently pending writes for the active user have been
  * acknowledged by the backend.
  *
  * The returned promise resolves immediately if there are no outstanding writes.
  * Otherwise, the promise waits for all previously issued writes (including
  * those written in a previous app session), but it does not wait for writes
  * that were added after the function is called. If you want to wait for
  * additional writes, call `waitForPendingWrites()` again.
  *
  * Any outstanding `waitForPendingWrites()` promises are rejected during user
  * changes.
  *
  * @returns A `Promise` which resolves when all currently pending writes have been
  * acknowledged by the backend.
  */ inline def waitForPendingWrites(t: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

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
  */ inline def where(t: Any, e: Any, n: Any): vl = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(t.asInstanceOf[js.Any], e.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[vl]

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
  * Creates a write batch, used for performing multiple writes as a single
  * atomic operation. The maximum number of writes allowed in a single {@link WriteBatch}
  * is 500.
  *
  * Unlike transactions, write batches are persisted offline and therefore are
  * preferable when you don't need to condition your writes on read data.
  *
  * @returns A {@link WriteBatch} that can be used to atomically execute multiple
  * writes.
  */ inline def writeBatch(t: Any): Ff = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(t.asInstanceOf[js.Any]).asInstanceOf[Ff]

/**
  * A `QueryConstraint` is used to narrow the set of documents returned by a
  * Firestore query. `QueryConstraint`s are created by invoking {@link where},
  * {@link orderBy}, {@link (startAt:1)}, {@link (startAfter:1)}, {@link
  * (endBefore:1)}, {@link (endAt:1)}, {@link limit}, {@link limitToLast} and
  * can then be passed to {@link (query:1)} to create a new query instance that
  * also contains this `QueryConstraint`.
  */ type Al = El

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
  */ type sf = nf
