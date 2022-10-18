package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends StObject {
  
  /**
    * Create the document referred to by the provided `DocumentReference`.
    * The operation will fail the transaction if a document exists at the
    * specified location.
    *
    * @param documentRef A reference to the document to be create.
    * @param data The object data to serialize as the document.
    * @throws Error If the provided input is not a valid Firestore document.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def create[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): Transaction = js.native
  
  /**
    * Deletes the document referred to by the provided `DocumentReference`.
    *
    * @param documentRef A reference to the document to be deleted.
    * @param precondition A Precondition to enforce for this delete.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def delete(documentRef: DocumentReference[Any]): Transaction = js.native
  def delete(documentRef: DocumentReference[Any], precondition: Precondition): Transaction = js.native
  
  /**
    * Retrieves an aggregate query result. Holds a pessimistic lock on all
    * documents that were matched by the underlying query.
    *
    * @param aggregateQuery An aggregate query to execute.
    * @return An AggregateQuerySnapshot for the retrieved data.
    */
  def get[T /* <: AggregateSpec */](aggregateQuery: AggregateQuery[T]): js.Promise[AggregateQuerySnapshot[T]] = js.native
  /**
    * Reads the document referenced by the provided `DocumentReference.`
    * Holds a pessimistic lock on the returned document.
    *
    * @param documentRef A reference to the document to be read.
    * @return A DocumentSnapshot for the read data.
    */
  def get[T](documentRef: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = js.native
  /**
    * Retrieves a query result. Holds a pessimistic lock on all returned
    * documents.
    *
    * @param query A query to execute.
    * @return A QuerySnapshot for the retrieved data.
    */
  def get[T](query: Query[T]): js.Promise[QuerySnapshot[T]] = js.native
  
  /**
    * Retrieves multiple documents from Firestore. Holds a pessimistic lock on
    * all returned documents.
    *
    * The first argument is required and must be of type `DocumentReference`
    * followed by any additional `DocumentReference` documents. If used, the
    * optional `ReadOptions` must be the last argument.
    *
    * @param {Array.<DocumentReference|ReadOptions>} documentRefsOrReadOptions
    * The `DocumentReferences` to receive, followed by an optional field
    * mask.
    * @return A Promise that resolves with an array of resulting document
    * snapshots.
    */
  def getAll[T](documentRefsOrReadOptions: (DocumentReference[T] | ReadOptions)*): js.Promise[js.Array[DocumentSnapshot[T]]] = js.native
  
  /**
    * Writes to the document referred to by the provided `DocumentReference`.
    * If the document does not exist yet, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into the existing document.
    *
    * @param documentRef A reference to the document to be set.
    * @param data An object of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @param  options.merge - If true, set() merges the values specified in its
    * data argument. Fields omitted from this set() call remain untouched. If
    * your input sets any field to an empty map, all nested fields are
    * overwritten.
    * @param options.mergeFields - If provided, set() only replaces the
    * specified field paths. Any field path that is not specified is ignored
    * and remains untouched. If your input sets any field to an empty map, all
    * nested fields are overwritten.
    * @throws Error If the provided input is not a valid Firestore document.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def set[T](documentRef: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): Transaction = js.native
  def set[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): Transaction = js.native
  
  /**
    * Updates fields in the document referred to by the provided
    * `DocumentReference`. The update will fail if applied to a document that
    * does not exist.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings or by providing FieldPath objects.
    *
    * A `Precondition` restricting this update can be specified as the last
    * argument.
    *
    * @param documentRef A reference to the document to be updated.
    * @param field The first field to update.
    * @param value The first value
    * @param fieldsOrPrecondition An alternating list of field paths and values
    * to update, optionally followed by a `Precondition` to enforce on this
    * update.
    * @throws Error If the provided input is not valid Firestore data.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference[Any], field: String, value: Any, fieldsOrPrecondition: Any*): Transaction = js.native
  def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, fieldsOrPrecondition: Any*): Transaction = js.native
  /**
    * Updates fields in the document referred to by the provided
    * `DocumentReference`. The update will fail if applied to a document that
    * does not exist.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings.
    *
    * @param documentRef A reference to the document to be updated.
    * @param data An object containing the fields and values with which to
    * update the document.
    * @param precondition A Precondition to enforce on this update.
    * @throws Error If the provided input is not valid Firestore data.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def update[T](documentRef: DocumentReference[T], data: UpdateData[T]): Transaction = js.native
  def update[T](documentRef: DocumentReference[T], data: UpdateData[T], precondition: Precondition): Transaction = js.native
}
