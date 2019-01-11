package typings
package atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTask extends js.Object {
  var snapshot: UploadTaskSnapshot = js.native
  def cancel(): scala.Boolean = js.native
  def `catch`(onRejected: js.Function1[/* a */ stdLib.Error, _]): js.Promise[_] = js.native
  def on(event: TaskEvent): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[UploadTaskSnapshot]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[UploadTaskSnapshot],
    error: js.Function1[/* a */ stdLib.Error, _]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[UploadTaskSnapshot],
    error: js.Function1[/* a */ stdLib.Error, _],
    complete: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[UploadTaskSnapshot],
    error: scala.Null,
    complete: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: js.Function1[/* a */ stdLib.Error, _]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: js.Function1[/* a */ stdLib.Error, _],
    complete: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: scala.Null,
    complete: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: scala.Null, error: js.Function1[/* a */ stdLib.Error, _]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: scala.Null,
    error: js.Function1[/* a */ stdLib.Error, _],
    complete: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: scala.Null,
    error: scala.Null,
    complete: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): js.Function = js.native
  def pause(): scala.Boolean = js.native
  def resume(): scala.Boolean = js.native
  def `then`(): js.Promise[_] = js.native
  def `then`(onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Promise[_] = js.native
  def `then`(
    onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _],
    onRejected: js.Function1[/* a */ stdLib.Error, _]
  ): js.Promise[_] = js.native
  def `then`(onFulfilled: scala.Null, onRejected: js.Function1[/* a */ stdLib.Error, _]): js.Promise[_] = js.native
}

