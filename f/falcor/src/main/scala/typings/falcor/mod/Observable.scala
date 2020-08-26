package typings.falcor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor", "Observable")
@js.native
class Observable[T] () extends js.Object {
  /**
    * The forEach method is a synonym for {@link Observable.prototype.subscribe} and triggers the execution of the Observable, causing the values within to be pushed to a callback.
    * An Observable is like a pipe of water that is closed.
    * When forEach is called, we open the valve and the values within are pushed at us.
    * These values can be received using either callbacks or an {@link Observer} object.
    */
  def forEach(): Subscription = js.native
  def forEach(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
  def forEach(onNext: js.UndefOr[scala.Nothing], onError: ObservableOnErrorCallback): Subscription = js.native
  def forEach(
    onNext: js.UndefOr[scala.Nothing],
    onError: ObservableOnErrorCallback,
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
  def forEach(onNext: ObservableOnNextCallback[T]): Subscription = js.native
  def forEach(
    onNext: ObservableOnNextCallback[T],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
  def forEach(onNext: ObservableOnNextCallback[T], onError: ObservableOnErrorCallback): Subscription = js.native
  def forEach(
    onNext: ObservableOnNextCallback[T],
    onError: ObservableOnErrorCallback,
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
  /**
    * The subscribe method is a synonym for {@link Observable.prototype.forEach} and triggers the execution of the Observable, causing the values within to be pushed to a callback.
    * An Observable is like a pipe of water that is closed.
    * When forEach is called, we open the valve and the values within are pushed at us.  These values can be received using either callbacks or an {@link Observer} object.
    */
  def subscribe(): Subscription = js.native
  def subscribe(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
  def subscribe(onNext: js.UndefOr[scala.Nothing], onError: ObservableOnErrorCallback): Subscription = js.native
  def subscribe(
    onNext: js.UndefOr[scala.Nothing],
    onError: ObservableOnErrorCallback,
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
  def subscribe(onNext: ObservableOnNextCallback[T]): Subscription = js.native
  def subscribe(
    onNext: ObservableOnNextCallback[T],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
  def subscribe(onNext: ObservableOnNextCallback[T], onError: ObservableOnErrorCallback): Subscription = js.native
  def subscribe(
    onNext: ObservableOnNextCallback[T],
    onError: ObservableOnErrorCallback,
    onCompleted: ObservableOnCompletedCallback
  ): Subscription = js.native
}

