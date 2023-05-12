package typings.firebaseStorage.mod

import typings.firebaseUtil.mod.Subscribe
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTask extends StObject {
  
  /**
    * Cancels a running task. Has no effect on a complete or failed task.
    * @returns True if the cancel had an effect.
    */
  def cancel(): Boolean = js.native
  
  /**
    * Equivalent to calling `then(null, onRejected)`.
    */
  def `catch`(onRejected: js.Function1[/* error */ StorageError, Any]): js.Promise[Any] = js.native
  
  /**
    * Listens for events on this task.
    *
    * Events have three callback functions (referred to as `next`, `error`, and
    * `complete`).
    *
    * If only the event is passed, a function that can be used to register the
    * callbacks is returned. Otherwise, the callbacks are passed after the event.
    *
    * Callbacks can be passed either as three separate arguments <em>or</em> as the
    * `next`, `error`, and `complete` properties of an object. Any of the three
    * callbacks is optional, as long as at least one is specified. In addition,
    * when you add your callbacks, you get a function back. You can call this
    * function to unregister the associated callbacks.
    *
    * @example **Pass callbacks separately or in an object.**
    * ```javascript
    * var next = function(snapshot) {};
    * var error = function(error) {};
    * var complete = function() {};
    *
    * // The first example.
    * uploadTask.on(
    *     firebase.storage.TaskEvent.STATE_CHANGED,
    *     next,
    *     error,
    *     complete);
    *
    * // This is equivalent to the first example.
    * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, {
    *   'next': next,
    *   'error': error,
    *   'complete': complete
    * });
    *
    * // This is equivalent to the first example.
    * var subscribe = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
    * subscribe(next, error, complete);
    *
    * // This is equivalent to the first example.
    * var subscribe = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
    * subscribe({
    *   'next': next,
    *   'error': error,
    *   'complete': complete
    * });
    * ```
    *
    * @example **Any callback is optional.**
    * ```javascript
    * // Just listening for completion, this is legal.
    * uploadTask.on(
    *     firebase.storage.TaskEvent.STATE_CHANGED,
    *     null,
    *     null,
    *     function() {
    *       console.log('upload complete!');
    *     });
    *
    * // Just listening for progress/state changes, this is legal.
    * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, function(snapshot) {
    *   var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
    *   console.log(percent + "% done");
    * });
    *
    * // This is also legal.
    * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, {
    *   'complete': function() {
    *     console.log('upload complete!');
    *   }
    * });
    * ```
    *
    * @example **Use the returned function to remove callbacks.**
    * ```javascript
    * var unsubscribe = uploadTask.on(
    *     firebase.storage.TaskEvent.STATE_CHANGED,
    *     function(snapshot) {
    *       var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
    *       console.log(percent + "% done");
    *       // Stop after receiving one update.
    *       unsubscribe();
    *     });
    *
    * // This code is equivalent to the above.
    * var handle = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
    * unsubscribe = handle(function(snapshot) {
    *   var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
    *   console.log(percent + "% done");
    *   // Stop after receiving one update.
    *   unsubscribe();
    * });
    * ```
    *
    * @param event - The type of event to listen for.
    * @param nextOrObserver -
    *     The `next` function, which gets called for each item in
    *     the event stream, or an observer object with some or all of these three
    *     properties (`next`, `error`, `complete`).
    * @param error - A function that gets called with a `StorageError`
    *     if the event stream ends due to an error.
    * @param completed - A function that gets called if the
    *     event stream ends normally.
    * @returns
    *     If only the event argument is passed, returns a function you can use to
    *     add callbacks (see the examples above). If more than just the event
    *     argument is passed, returns a function you can call to unregister the
    *     callbacks.
    */
  def on(event: TaskEvent): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: js.Function1[/* a */ StorageError, Any]
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: js.Function1[/* a */ StorageError, Any],
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: Null,
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: Unit,
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ StorageError, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Null,
    error: js.Function1[/* a */ StorageError, Any],
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: Unit, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: Unit, error: js.Function1[/* a */ StorageError, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Unit,
    error: js.Function1[/* a */ StorageError, Any],
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: Unit, error: Null, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: Unit, error: Unit, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(event: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: js.Function1[/* a */ StorageError, Any]
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: js.Function1[/* a */ StorageError, Any],
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: Null,
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: Unit,
    complete: Unsubscribe
  ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
  
  /**
    * Pauses a currently running task. Has no effect on a paused or failed task.
    * @returns True if the operation took effect, false if ignored.
    */
  def pause(): Boolean = js.native
  
  /**
    * Resumes a paused task. Has no effect on a currently running or failed task.
    * @returns True if the operation took effect, false if ignored.
    */
  def resume(): Boolean = js.native
  
  /**
    * A snapshot of the current task state.
    */
  var snapshot: UploadTaskSnapshot = js.native
  
  /**
    * This object behaves like a Promise, and resolves with its snapshot data
    * when the upload completes.
    * @param onFulfilled - The fulfillment callback. Promise chaining works as normal.
    * @param onRejected - The rejection callback.
    */
  def `then`(): js.Promise[Any] = js.native
  def `then`(onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Promise[Any] = js.native
  def `then`(
    onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    onRejected: js.Function1[/* error */ StorageError, Any]
  ): js.Promise[Any] = js.native
  def `then`(onFulfilled: Null, onRejected: js.Function1[/* error */ StorageError, Any]): js.Promise[Any] = js.native
  def `then`(onFulfilled: Unit, onRejected: js.Function1[/* error */ StorageError, Any]): js.Promise[Any] = js.native
}
