package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriter extends StObject {
  
  /**
    * Commits all enqueued writes and marks the BulkWriter instance as closed.
    *
    * After calling `close()`, calling any method will throw an error. Any
    * retries scheduled as part of an `onWriteError()` handler will be run
    * before the `close()` promise resolves.
    *
    * Returns a Promise that resolves when all writes have been committed. The
    * Promise will never be rejected. Calling this method will send all
    * requests. The promise resolves immediately if there are no pending
    * writes.
    *
    * @return A promise that resolves when all enqueued writes
    * up to this point have been committed.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Create a document with the provided data. This single operation will fail
    * if a document exists at its location.
    *
    * @param documentRef A reference to the document to be
    * created.
    * @param data The object to serialize as the document.
    * @throws Error If the provided input is not a valid Firestore document.
    * @returns A promise that resolves with the result of the write. If the
    * write fails, the promise is rejected with a
    * [BulkWriterError]{@link BulkWriterError}.
    */
  def create[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): js.Promise[WriteResult] = js.native
  
  /**
    * Delete a document from the database.
    *
    * @param documentRef A reference to the document to be
    * deleted.
    * @param precondition A precondition to enforce for this
    * delete.
    * @param precondition.lastUpdateTime If set, enforces that the
    * document was last updated at lastUpdateTime. Fails the batch if the
    * document doesn't exist or was last updated at a different time.
    * @param precondition.exists If set, enforces that the target document
    * must or must not exist.
    * @returns A promise that resolves with the result of the delete. If the
    * delete fails, the promise is rejected with a
    * [BulkWriterError]{@link BulkWriterError}.
    */
  def delete(documentRef: DocumentReference[Any]): js.Promise[WriteResult] = js.native
  def delete(documentRef: DocumentReference[Any], precondition: Precondition): js.Promise[WriteResult] = js.native
  
  /**
    * Commits all writes that have been enqueued up to this point in parallel.
    *
    * Returns a Promise that resolves when all currently queued operations have
    * been committed. The Promise will never be rejected since the results for
    * each individual operation are conveyed via their individual Promises.
    *
    * The Promise resolves immediately if there are no pending writes.
    * Otherwise, the Promise waits for all previously issued writes, but it
    * does not wait for writes that were added after the method is called. If
    * you want to wait for additional writes, call `flush()` again.
    *
    * @return A promise that resolves when all enqueued writes
    * up to this point have been committed.
    */
  def flush(): js.Promise[Unit] = js.native
  
  /**
    * Attaches an error handler listener that is run every time a BulkWriter
    * operation fails.
    *
    * BulkWriter has a default error handler that retries UNAVAILABLE and
    * ABORTED errors up to a maximum of 10 failed attempts. When an error
    * handler is specified, the default error handler will be overwritten.
    *
    * @param shouldRetryCallback A callback to be called every time a BulkWriter
    * operation fails. Returning `true` will retry the operation. Returning
    * `false` will stop the retry loop.
    */
  def onWriteError(shouldRetryCallback: js.Function1[/* error */ BulkWriterError, Boolean]): Unit = js.native
  
  /**
    * Attaches a listener that is run every time a BulkWriter operation
    * successfully completes.
    *
    * @param callback A callback to be called every time a BulkWriter operation
    * successfully completes.
    */
  def onWriteResult(callback: js.Function2[/* documentRef */ DocumentReference[Any], /* result */ WriteResult, Unit]): Unit = js.native
  
  /**
    * Write to the document referred to by the provided
    * [DocumentReference]{@link DocumentReference}. If the document does not
    * exist yet, it will be created. If you pass
    * [SetOptions]{@link SetOptions}., the provided data can be merged into the
    * existing document.
    *
    * @param  documentRef A reference to the document to be
    * set.
    * @param data The object to serialize as the document.
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
    * @returns A promise that resolves with the result of the write. If the
    * write fails, the promise is rejected with a
    * [BulkWriterError]{@link BulkWriterError}.
    */
  def set[T](documentRef: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): js.Promise[WriteResult] = js.native
  def set[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): js.Promise[WriteResult] = js.native
  
  /**
    * Update fields of the document referred to by the provided
    * [DocumentReference]{@link DocumentReference}. If the document doesn't yet
    * exist, the update fails and the entire batch will be rejected.
    *
    * The update() method accepts either an object with field paths encoded as
    * keys and field values encoded as values, or a variable number of
    * arguments that alternate between field paths and field values. Nested
    * fields can be updated by providing dot-separated field path strings or by
    * providing FieldPath objects.
    *
    *
    * A Precondition restricting this update can be specified as the last
    * argument.
    *
    * @param documentRef A reference to the document to be updated.
    * @param field The first field to update.
    * @param value The first value
    * @param fieldsOrPrecondition An alternating list of field paths and values
    * to update, optionally followed a `Precondition` to enforce on this
    * update.
    * @throws Error If the provided input is not valid Firestore data;
    * @returns A promise that resolves with the result of the write. If the
    * write fails, the promise is rejected with a
    * [BulkWriterError]{@link BulkWriterError}.
    */
  def update(documentRef: DocumentReference[Any], field: String, value: Any, fieldsOrPrecondition: Any*): js.Promise[WriteResult] = js.native
  def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, fieldsOrPrecondition: Any*): js.Promise[WriteResult] = js.native
  /**
    * Update fields of the document referred to by the provided
    * [DocumentReference]{@link DocumentReference}. If the document doesn't yet
    * exist, the update fails and the entire batch will be rejected.
    *
    * The update() method accepts either an object with field paths encoded as
    * keys and field values encoded as values, or a variable number of
    * arguments that alternate between field paths and field values. Nested
    * fields can be updated by providing dot-separated field path strings or by
    * providing FieldPath objects.
    *
    *
    * A Precondition restricting this update can be specified as the last
    * argument.
    *
    * @param documentRef A reference to the document to be updated.
    * @param data An object containing the fields and values with which to
    * update the document.
    * @param precondition A Precondition to enforce on this update.
    * @throws Error If the provided input is not valid Firestore data.
    * @returns A promise that resolves with the result of the write. If the
    * write fails, the promise is rejected with a
    * [BulkWriterError]{@link BulkWriterError}.
    */
  def update[T](documentRef: DocumentReference[T], data: UpdateData[T]): js.Promise[WriteResult] = js.native
  def update[T](documentRef: DocumentReference[T], data: UpdateData[T], precondition: Precondition): js.Promise[WriteResult] = js.native
}
