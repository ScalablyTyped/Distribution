package typings.atFirebaseStorageDashTypes.atFirebaseStorageDashTypesMod

import typings.atFirebaseUtil.distSrcSubscribeMod.Observer
import typings.atFirebaseUtil.distSrcSubscribeMod.Unsubscribe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTask extends js.Object {
  var snapshot: UploadTaskSnapshot = js.native
  def cancel(): Boolean = js.native
  def `catch`(onRejected: js.Function1[/* a */ Error, _]): js.Promise[_] = js.native
  def on(event: TaskEvent): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: js.Function1[/* a */ Error, _]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: js.Function1[/* a */ Error, _],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: Null,
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ Error, _]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Null,
    error: js.Function1[/* a */ Error, _],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Observer[UploadTaskSnapshot]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Observer[UploadTaskSnapshot],
    error: js.Function1[/* a */ Error, _]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Observer[UploadTaskSnapshot],
    error: js.Function1[/* a */ Error, _],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Observer[UploadTaskSnapshot], error: Null, complete: Unsubscribe): js.Function = js.native
  def pause(): Boolean = js.native
  def resume(): Boolean = js.native
  def `then`(): js.Promise[_] = js.native
  def `then`(onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Promise[_] = js.native
  def `then`(
    onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _],
    onRejected: js.Function1[/* a */ Error, _]
  ): js.Promise[_] = js.native
  def `then`(onFulfilled: Null, onRejected: js.Function1[/* a */ Error, _]): js.Promise[_] = js.native
}

