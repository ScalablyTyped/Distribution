package typings.firebase.mod.default.firestore

import typings.firebase.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "default.firestore.Query")
@js.native
class Query[T] protected () extends StObject {
  
  /**
    * Creates and returns a new Query that ends at the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to end this query at, in order
    * of the query's order by.
    * @return The created Query.
    */
  def endAt(fieldValues: js.Any*): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  /**
    * Creates and returns a new Query that ends at the provided document
    * (inclusive). The end position is relative to the order of the query. The
    * document must contain all of the fields provided in the orderBy of this
    * query.
    *
    * @param snapshot The snapshot of the document to end at.
    * @return The created Query.
    */
  def endAt(snapshot: typings.firebase.mod.firebase.firestore.DocumentSnapshot[_]): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
  /**
    * Creates and returns a new Query that ends before the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to end this query before, in order
    * of the query's order by.
    * @return The created Query.
    */
  def endBefore(fieldValues: js.Any*): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  /**
    * Creates and returns a new Query that ends before the provided document
    * (exclusive). The end position is relative to the order of the query. The
    * document must contain all of the fields provided in the orderBy of this
    * query.
    *
    * @param snapshot The snapshot of the document to end before.
    * @return The created Query.
    */
  def endBefore(snapshot: typings.firebase.mod.firebase.firestore.DocumentSnapshot[_]): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
  /**
    * The `Firestore` for the Firestore database (useful for performing
    * transactions, etc.).
    */
  val firestore: typings.firebase.mod.firebase.firestore.Firestore = js.native
  
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
  def get(): js.Promise[typings.firebase.mod.firebase.firestore.QuerySnapshot[T]] = js.native
  def get(options: typings.firebase.mod.firebase.firestore.GetOptions): js.Promise[typings.firebase.mod.firebase.firestore.QuerySnapshot[T]] = js.native
  
  /**
    * Returns true if this `Query` is equal to the provided one.
    *
    * @param other The `Query` to compare against.
    * @return true if this `Query` is equal to the provided one.
    */
  def isEqual(other: typings.firebase.mod.firebase.firestore.Query[T]): Boolean = js.native
  
  /**
    * Creates and returns a new Query that only returns the first matching
    * documents.
    *
    * @param limit The maximum number of items to return.
    * @return The created Query.
    */
  def limit(limit: Double): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
  /**
    * Creates and returns a new Query that only returns the last matching
    * documents.
    *
    * You must specify at least one `orderBy` clause for `limitToLast` queries,
    * otherwise an exception will be thrown during execution.
    *
    * @param limit The maximum number of items to return.
    * @return The created Query.
    */
  def limitToLast(limit: Double): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
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
  def onSnapshot(observer: Next[T]): js.Function0[Unit] = js.native
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
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebase.mod.firebase.firestore.FirestoreError, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebase.mod.firebase.firestore.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
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
  def onSnapshot(options: typings.firebase.mod.firebase.firestore.SnapshotListenOptions, observer: Next[T]): js.Function0[Unit] = js.native
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
  def onSnapshot(
    options: typings.firebase.mod.firebase.firestore.SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: typings.firebase.mod.firebase.firestore.SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: typings.firebase.mod.firebase.firestore.SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebase.mod.firebase.firestore.FirestoreError, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: typings.firebase.mod.firebase.firestore.SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebase.mod.firebase.firestore.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebase.mod.firebase.firestore.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  
  /**
    * Creates and returns a new Query that's additionally sorted by the
    * specified field, optionally in descending order instead of ascending.
    *
    * @param fieldPath The field to sort by.
    * @param directionStr Optional direction to sort by (`asc` or `desc`). If
    * not specified, order will be ascending.
    * @return The created Query.
    */
  def orderBy(fieldPath: String): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  def orderBy(fieldPath: String, directionStr: typings.firebase.mod.firebase.firestore.OrderByDirection): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  def orderBy(fieldPath: typings.firebase.mod.firebase.firestore.FieldPath): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  def orderBy(
    fieldPath: typings.firebase.mod.firebase.firestore.FieldPath,
    directionStr: typings.firebase.mod.firebase.firestore.OrderByDirection
  ): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
  /**
    * Creates and returns a new Query that starts after the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to start this query after, in order
    * of the query's order by.
    * @return The created Query.
    */
  def startAfter(fieldValues: js.Any*): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  /**
    * Creates and returns a new Query that starts after the provided document
    * (exclusive). The starting position is relative to the order of the query.
    * The document must contain all of the fields provided in the orderBy of
    * this query.
    *
    * @param snapshot The snapshot of the document to start after.
    * @return The created Query.
    */
  def startAfter(snapshot: typings.firebase.mod.firebase.firestore.DocumentSnapshot[_]): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
  /**
    * Creates and returns a new Query that starts at the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to start this query at, in order
    * of the query's order by.
    * @return The created Query.
    */
  def startAt(fieldValues: js.Any*): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  /**
    * Creates and returns a new Query that starts at the provided document
    * (inclusive). The starting position is relative to the order of the query.
    * The document must contain all of the fields provided in the `orderBy` of
    * this query.
    *
    * @param snapshot The snapshot of the document to start at.
    * @return The created Query.
    */
  def startAt(snapshot: typings.firebase.mod.firebase.firestore.DocumentSnapshot[_]): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
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
  def where(fieldPath: String, opStr: typings.firebase.mod.firebase.firestore.WhereFilterOp, value: js.Any): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  def where(
    fieldPath: typings.firebase.mod.firebase.firestore.FieldPath,
    opStr: typings.firebase.mod.firebase.firestore.WhereFilterOp,
    value: js.Any
  ): typings.firebase.mod.firebase.firestore.Query[T] = js.native
  
  /**
    * Applies a custom data converter to this Query, allowing you to use your
    * own custom model objects with Firestore. When you call get() on the
    * returned Query, the provided converter will convert between Firestore
    * data and your custom type U.
    *
    * @param converter Converts objects to and from Firestore.
    * @return A Query<U> that uses the provided converter.
    */
  def withConverter[U](converter: typings.firebase.mod.firebase.firestore.FirestoreDataConverter[U]): typings.firebase.mod.firebase.firestore.Query[U] = js.native
}
