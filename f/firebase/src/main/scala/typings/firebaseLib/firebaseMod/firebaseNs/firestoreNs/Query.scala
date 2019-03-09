package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  /**
    * The `Firestore` for the Firestore database (useful for performing
    * transactions, etc.).
    */
  val firestore: Firestore = js.native
  /**
    * Creates and returns a new Query that ends at the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to end this query at, in order
    * of the query's order by.
    * @return The created Query.
    */
  def endAt(fieldValues: js.Any*): Query = js.native
  /**
    * Creates and returns a new Query that ends at the provided document
    * (inclusive). The end position is relative to the order of the query. The
    * document must contain all of the fields provided in the orderBy of this
    * query.
    *
    * @param snapshot The snapshot of the document to end at.
    * @return The created Query.
    */
  def endAt(snapshot: DocumentSnapshot): Query = js.native
  /**
    * Creates and returns a new Query that ends before the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to end this query before, in order
    * of the query's order by.
    * @return The created Query.
    */
  def endBefore(fieldValues: js.Any*): Query = js.native
  /**
    * Creates and returns a new Query that ends before the provided document
    * (exclusive). The end position is relative to the order of the query. The
    * document must contain all of the fields provided in the orderBy of this
    * query.
    *
    * @param snapshot The snapshot of the document to end before.
    * @return The created Query.
    */
  def endBefore(snapshot: DocumentSnapshot): Query = js.native
  /**
    * Executes the query and returns the results as a `QuerySnapshot`.
    *
    * Note: By default, get() attempts to provide up-to-date data when possible
    * by waiting for data from the server, but it may return cached data or fail
    * if you are offline and the server cannot be reached. This behavior can be
    * altered via the `GetOptions` parameter.
    *
    * @param options An object to configure the get behavior.
    * @return A Promise that will be resolved with the results of the Query.
    */
  def get(): js.Promise[QuerySnapshot] = js.native
  def get(options: GetOptions): js.Promise[QuerySnapshot] = js.native
  /**
    * Returns true if this `Query` is equal to the provided one.
    *
    * @param other The `Query` to compare against.
    * @return true if this `Query` is equal to the provided one.
    */
  def isEqual(other: Query): scala.Boolean = js.native
  /**
    * Creates and returns a new Query where the results are limited to the
    * specified number of documents.
    *
    * @param limit The maximum number of items to return.
    * @return The created Query.
    */
  def limit(limit: scala.Double): Query = js.native
  /**
    * Attaches a listener for QuerySnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks. The listener can be cancelled by
    * calling the function that is returned when `onSnapshot` is called.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
    *
    * @param observer A single object containing `next` and `error` callbacks.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(observer: firebaseLib.Anon_CompleteErrorNext): js.Function0[scala.Unit] = js.native
  /**
    * Attaches a listener for QuerySnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks. The listener can be cancelled by
    * calling the function that is returned when `onSnapshot` is called.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
    *
    * @param onNext A callback to be called every time a new `QuerySnapshot`
    * is available.
    * @param onError A callback to be called if the listen fails or is
    * cancelled. No further callbacks will occur.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(onNext: js.Function1[/* snapshot */ QuerySnapshot, scala.Unit]): js.Function0[scala.Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot, scala.Unit],
    onError: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot, scala.Unit],
    onError: js.Function1[/* error */ nodeLib.Error, scala.Unit],
    onCompletion: js.Function0[scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  /**
    * Attaches a listener for QuerySnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks. The listener can be cancelled by
    * calling the function that is returned when `onSnapshot` is called.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
    *
    * @param options Options controlling the listen behavior.
    * @param observer A single object containing `next` and `error` callbacks.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(options: SnapshotListenOptions, observer: firebaseLib.Anon_CompleteErrorNext): js.Function0[scala.Unit] = js.native
  /**
    * Attaches a listener for QuerySnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks. The listener can be cancelled by
    * calling the function that is returned when `onSnapshot` is called.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
    *
    * @param options Options controlling the listen behavior.
    * @param onNext A callback to be called every time a new `QuerySnapshot`
    * is available.
    * @param onError A callback to be called if the listen fails or is
    * cancelled. No further callbacks will occur.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(options: SnapshotListenOptions, onNext: js.Function1[/* snapshot */ QuerySnapshot, scala.Unit]): js.Function0[scala.Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ QuerySnapshot, scala.Unit],
    onError: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ QuerySnapshot, scala.Unit],
    onError: js.Function1[/* error */ nodeLib.Error, scala.Unit],
    onCompletion: js.Function0[scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def orderBy(fieldPath: FieldPath): Query = js.native
  def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): Query = js.native
  /**
    * Creates and returns a new Query that's additionally sorted by the
    * specified field, optionally in descending order instead of ascending.
    *
    * @param fieldPath The field to sort by.
    * @param directionStr Optional direction to sort by (`asc` or `desc`). If
    * not specified, order will be ascending.
    * @return The created Query.
    */
  def orderBy(fieldPath: java.lang.String): Query = js.native
  def orderBy(fieldPath: java.lang.String, directionStr: OrderByDirection): Query = js.native
  /**
    * Creates and returns a new Query that starts after the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to start this query after, in order
    * of the query's order by.
    * @return The created Query.
    */
  def startAfter(fieldValues: js.Any*): Query = js.native
  /**
    * Creates and returns a new Query that starts after the provided document
    * (exclusive). The starting position is relative to the order of the query.
    * The document must contain all of the fields provided in the orderBy of
    * this query.
    *
    * @param snapshot The snapshot of the document to start after.
    * @return The created Query.
    */
  def startAfter(snapshot: DocumentSnapshot): Query = js.native
  /**
    * Creates and returns a new Query that starts at the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to start this query at, in order
    * of the query's order by.
    * @return The created Query.
    */
  def startAt(fieldValues: js.Any*): Query = js.native
  /**
    * Creates and returns a new Query that starts at the provided document
    * (inclusive). The starting position is relative to the order of the query.
    * The document must contain all of the fields provided in the `orderBy` of
    * this query.
    *
    * @param snapshot The snapshot of the document to start at.
    * @return The created Query.
    */
  def startAt(snapshot: DocumentSnapshot): Query = js.native
  def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: js.Any): Query = js.native
  /**
    * Creates and returns a new Query with the additional filter that documents
    * must contain the specified field and the value should satisfy the
    * relation constraint provided.
    *
    * @param fieldPath The path to compare
    * @param opStr The operation string (e.g "<", "<=", "==", ">", ">=").
    * @param value The value for comparison
    * @return The created Query.
    */
  def where(fieldPath: java.lang.String, opStr: WhereFilterOp, value: js.Any): Query = js.native
}

