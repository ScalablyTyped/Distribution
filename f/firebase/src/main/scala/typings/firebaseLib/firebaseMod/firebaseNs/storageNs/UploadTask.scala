package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTask extends js.Object {
  var snapshot: UploadTaskSnapshot = js.native
  def cancel(): scala.Boolean = js.native
  def `catch`(onRejected: js.Function1[/* a */ nodeLib.Error, _]): js.Promise[_] = js.native
  def on(event: TaskEvent): coreDashJsLib.Function = js.native
  def on(event: TaskEvent, nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error]): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: js.Function1[/* a */ nodeLib.Error, _]
  ): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: js.Function1[/* a */ nodeLib.Error, _],
    complete: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: scala.Null,
    complete: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): coreDashJsLib.Function = js.native
  def on(event: TaskEvent, nextOrObserver: js.Function1[/* a */ coreDashJsLib.Object, _]): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ coreDashJsLib.Object, _],
    error: js.Function1[/* a */ nodeLib.Error, _]
  ): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ coreDashJsLib.Object, _],
    error: js.Function1[/* a */ nodeLib.Error, _],
    complete: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ coreDashJsLib.Object, _],
    error: scala.Null,
    complete: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): coreDashJsLib.Function = js.native
  def on(event: TaskEvent, nextOrObserver: scala.Null, error: js.Function1[/* a */ nodeLib.Error, _]): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: scala.Null,
    error: js.Function1[/* a */ nodeLib.Error, _],
    complete: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): coreDashJsLib.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: scala.Null,
    error: scala.Null,
    complete: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): coreDashJsLib.Function = js.native
  def pause(): scala.Boolean = js.native
  def resume(): scala.Boolean = js.native
  def `then`(): js.Promise[_] = js.native
  def `then`(onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Promise[_] = js.native
  def `then`(
    onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _],
    onRejected: js.Function1[/* a */ nodeLib.Error, _]
  ): js.Promise[_] = js.native
  def `then`(onFulfilled: scala.Null, onRejected: js.Function1[/* a */ nodeLib.Error, _]): js.Promise[_] = js.native
}

