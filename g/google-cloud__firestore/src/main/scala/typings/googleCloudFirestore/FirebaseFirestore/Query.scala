package typings.googleCloudFirestore.FirebaseFirestore

import typings.googleCloudFirestore.anon.Count
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[T] extends StObject {
  
  /**
    * Returns a query that counts the documents in the result set of this
    * query.
    *
    * The returned query, when executed, counts the documents in the result set
    * of this query without actually downloading the documents.
    *
    * Using the returned query to count the documents is efficient because only
    * the final count, not the documents' data, is downloaded. The returned
    * query can even count the documents if the result set would be
    * prohibitively large to download entirely (e.g. thousands of documents).
    *
    * @return a query that counts the documents in the result set of this
    * query. The count can be retrieved from `snapshot.data().count`, where
    * `snapshot` is the `AggregateQuerySnapshot` resulting from running the
    * returned query.
    */
  def count(): AggregateQuery[Count] = js.native
  
  /**
    * Creates and returns a new Query that ends at the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to end this query at, in order
    * of the query's order by.
    * @return The created Query.
    */
  def endAt(fieldValues: Any*): Query[T] = js.native
  /**
    * Creates and returns a new Query that ends at the provided document
    * (inclusive). The end position is relative to the order of the query. The
    * document must contain all of the fields provided in the orderBy of this
    * query.
    *
    * @param snapshot The snapshot of the document to end at.
    * @return The created Query.
    */
  def endAt(snapshot: DocumentSnapshot[Any]): Query[T] = js.native
  
  /**
    * Creates and returns a new Query that ends before the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to end this query before, in order
    * of the query's order by.
    * @return The created Query.
    */
  def endBefore(fieldValues: Any*): Query[T] = js.native
  /**
    * Creates and returns a new Query that ends before the provided document
    * (exclusive). The end position is relative to the order of the query. The
    * document must contain all of the fields provided in the orderBy of this
    * query.
    *
    * @param snapshot The snapshot of the document to end before.
    * @return The created Query.
    */
  def endBefore(snapshot: DocumentSnapshot[Any]): Query[T] = js.native
  
  /**
    * The `Firestore` for the Firestore database (useful for performing
    * transactions, etc.).
    */
  val firestore: Firestore = js.native
  
  /**
    * Executes the query and returns the results as a `QuerySnapshot`.
    *
    * @return A Promise that will be resolved with the results of the Query.
    */
  def get(): js.Promise[QuerySnapshot[T]] = js.native
  
  /**
    * Returns true if this `Query` is equal to the provided one.
    *
    * @param other The `Query` to compare against.
    * @return true if this `Query` is equal to the provided one.
    */
  def isEqual(other: Query[T]): Boolean = js.native
  
  /**
    * Creates and returns a new Query that only returns the first matching
    * documents.
    *
    * This function returns a new (immutable) instance of the Query (rather
    * than modify the existing instance) to impose the limit.
    *
    * @param limit The maximum number of items to return.
    * @return The created Query.
    */
  def limit(limit: Double): Query[T] = js.native
  
  /**
    * Creates and returns a new Query that only returns the last matching
    * documents.
    *
    * You must specify at least one orderBy clause for limitToLast queries,
    * otherwise an exception will be thrown during execution.
    *
    * Results for limitToLast queries cannot be streamed via the `stream()`
    * API.
    *
    * @param limit The maximum number of items to return.
    * @return The created Query.
    */
  def limitToLast(limit: Double): Query[T] = js.native
  
  /**
    * Specifies the offset of the returned results.
    *
    * This function returns a new (immutable) instance of the Query (rather
    * than modify the existing instance) to impose the offset.
    *
    * @param offset The offset to apply to the Query results.
    * @return The created Query.
    */
  def offset(offset: Double): Query[T] = js.native
  
  /**
    * Attaches a listener for `QuerySnapshot `events.
    *
    * @param onNext A callback to be called every time a new `QuerySnapshot`
    * is available.
    * @param onError A callback to be called if the listen fails or is
    * cancelled. No further callbacks will occur.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): js.Function0[Unit] = js.native
  
  /**
    * Creates and returns a new Query that's additionally sorted by the
    * specified field, optionally in descending order instead of ascending.
    *
    * This function returns a new (immutable) instance of the Query (rather
    * than modify the existing instance) to impose the order.
    *
    * @param fieldPath The field to sort by.
    * @param directionStr Optional direction to sort by ('asc' or 'desc'). If
    * not specified, order will be ascending.
    * @return The created Query.
    */
  def orderBy(fieldPath: String): Query[T] = js.native
  def orderBy(fieldPath: String, directionStr: OrderByDirection): Query[T] = js.native
  def orderBy(fieldPath: FieldPath): Query[T] = js.native
  def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): Query[T] = js.native
  
  /**
    * Creates and returns a new Query instance that applies a field mask to
    * the result and returns only the specified subset of fields. You can
    * specify a list of field paths to return, or use an empty list to only
    * return the references of matching documents.
    *
    * Queries that contain field masks cannot be listened to via `onSnapshot()`
    * listeners.
    *
    * This function returns a new (immutable) instance of the Query (rather
    * than modify the existing instance) to impose the field mask.
    *
    * @param field The field paths to return.
    * @return The created Query.
    */
  def select(field: (String | FieldPath)*): Query[DocumentData] = js.native
  
  /**
    * Creates and returns a new Query that starts after the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to start this query after, in order
    * of the query's order by.
    * @return The created Query.
    */
  def startAfter(fieldValues: Any*): Query[T] = js.native
  /**
    * Creates and returns a new Query that starts after the provided document
    * (exclusive). The starting position is relative to the order of the query.
    * The document must contain all of the fields provided in the orderBy of
    * this query.
    *
    * @param snapshot The snapshot of the document to start after.
    * @return The created Query.
    */
  def startAfter(snapshot: DocumentSnapshot[Any]): Query[T] = js.native
  
  /**
    * Creates and returns a new Query that starts at the provided fields
    * relative to the order of the query. The order of the field values
    * must match the order of the order by clauses of the query.
    *
    * @param fieldValues The field values to start this query at, in order
    * of the query's order by.
    * @return The created Query.
    */
  def startAt(fieldValues: Any*): Query[T] = js.native
  /**
    * Creates and returns a new Query that starts at the provided document
    * (inclusive). The starting position is relative to the order of the query.
    * The document must contain all of the fields provided in the orderBy of
    * this query.
    *
    * @param snapshot The snapshot of the document to start after.
    * @return The created Query.
    */
  def startAt(snapshot: DocumentSnapshot[Any]): Query[T] = js.native
  
  /*
    * Executes the query and returns the results as Node Stream.
    *
    * @return A stream of QueryDocumentSnapshot.
    */
  def stream(): ReadableStream = js.native
  
  /**
    * Creates and returns a new Query with the additional filter that documents
    * must contain the specified field and that its value should satisfy the
    * relation constraint provided.
    *
    * This function returns a new (immutable) instance of the Query (rather
    * than modify the existing instance) to impose the filter.
    *
    * @param fieldPath The path to compare
    * @param opStr The operation string (e.g "<", "<=", "==", ">", ">=").
    * @param value The value for comparison
    * @return The created Query.
    */
  def where(fieldPath: String, opStr: WhereFilterOp, value: Any): Query[T] = js.native
  def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: Any): Query[T] = js.native
  /**
    * Creates and returns a new [Query]{@link Query} with the additional filter
    * that documents should satisfy the relation constraint provided. Documents
    * must contain the field specified in the filter.
    *
    * This function returns a new (immutable) instance of the Query (rather than
    * modify the existing instance) to impose the filter.
    *
    * @param {Filter} filter A filter to apply to the Query.
    * @returns {Query} The created Query.
    */
  def where(filter: Filter): Query[T] = js.native
  
  def withConverter(converter: Null): Query[DocumentData] = js.native
  /**
    * Applies a custom data converter to this Query, allowing you to use your
    * own custom model objects with Firestore. When you call get() on the
    * returned Query, the provided converter will convert between Firestore
    * data and your custom type U.
    *
    * @param converter Converts objects to and from Firestore. Passing in
    * `null` removes the current converter.
    * @return A Query<U> that uses the provided converter.
    */
  def withConverter[U](converter: FirestoreDataConverter[U]): Query[U] = js.native
}
