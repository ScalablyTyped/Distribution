package typings.googleCloudFirestore.FirebaseFirestore

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def create[T](documentRef: DocumentReference[T], data: T): Transaction = js.native
  
  /**
    * Deletes the document referred to by the provided `DocumentReference`.
    *
    * @param documentRef A reference to the document to be deleted.
    * @param precondition A Precondition to enforce for this delete.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def delete(documentRef: DocumentReference[_]): Transaction = js.native
  def delete(documentRef: DocumentReference[_], precondition: Precondition): Transaction = js.native
  
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
  
  def set[T](documentRef: DocumentReference[T], data: T): Transaction = js.native
  /**
    * Writes to the document referred to by the provided `DocumentReference`.
    * If the document does not exist yet, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into the existing document.
    *
    * @param documentRef A reference to the document to be set.
    * @param data An object of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def set[T](documentRef: DocumentReference[T], data: Partial[T], options: SetOptions): Transaction = js.native
  
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
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference[_], data: UpdateData): Transaction = js.native
  def update(documentRef: DocumentReference[_], data: UpdateData, precondition: Precondition): Transaction = js.native
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
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference[_], field: String, value: js.Any, fieldsOrPrecondition: js.Any*): Transaction = js.native
  def update(documentRef: DocumentReference[_], field: FieldPath, value: js.Any, fieldsOrPrecondition: js.Any*): Transaction = js.native
}
