package typings.firebaseStorageTypes.mod

import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTask extends StObject {
  
  def cancel(): Boolean = js.native
  
  def `catch`(onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
  
  def on(event: TaskEvent): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: js.Function1[/* a */ FirebaseStorageError, Any]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: js.Function1[/* a */ FirebaseStorageError, Any],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: Null,
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    error: Unit,
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ FirebaseStorageError, Any]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Null,
    error: js.Function1[/* a */ FirebaseStorageError, Any],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: Unit, complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Unit, error: js.Function1[/* a */ FirebaseStorageError, Any]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Unit,
    error: js.Function1[/* a */ FirebaseStorageError, Any],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Unit, error: Null, complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Unit, error: Unit, complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: js.Function1[/* a */ FirebaseStorageError, Any]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: js.Function1[/* a */ FirebaseStorageError, Any],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: Null,
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: StorageObserver[UploadTaskSnapshot],
    error: Unit,
    complete: Unsubscribe
  ): js.Function = js.native
  
  def pause(): Boolean = js.native
  
  def resume(): Boolean = js.native
  
  var snapshot: UploadTaskSnapshot = js.native
  
  def `then`(): js.Promise[Any] = js.native
  def `then`(onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Promise[Any] = js.native
  def `then`(
    onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
    onRejected: js.Function1[/* error */ FirebaseStorageError, Any]
  ): js.Promise[Any] = js.native
  def `then`(onFulfilled: Null, onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
  def `then`(onFulfilled: Unit, onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
}
