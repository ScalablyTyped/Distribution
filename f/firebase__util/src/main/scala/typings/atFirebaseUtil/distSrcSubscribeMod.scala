package typings.atFirebaseUtil

import typings.atFirebaseUtil.distSrcSubscribeMod.CompleteFn
import typings.atFirebaseUtil.distSrcSubscribeMod.ErrorFn
import typings.atFirebaseUtil.distSrcSubscribeMod.Executor
import typings.atFirebaseUtil.distSrcSubscribeMod.NextFn
import typings.atFirebaseUtil.distSrcSubscribeMod.Observer
import typings.atFirebaseUtil.distSrcSubscribeMod.PartialObserver
import typings.atFirebaseUtil.distSrcSubscribeMod.Subscribe
import typings.atFirebaseUtil.distSrcSubscribeMod.Unsubscribe
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/subscribe", JSImport.Namespace)
@js.native
object distSrcSubscribeMod extends js.Object {
  @js.native
  trait Observable[T] extends js.Object {
    @JSName("subscribe")
    var subscribe_Original: Subscribe[T] = js.native
    def subscribe(): Unsubscribe = js.native
    def subscribe(next: NextFn[T]): Unsubscribe = js.native
    def subscribe(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
    def subscribe(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def subscribe(observer: PartialObserver[T]): Unsubscribe = js.native
  }
  
  @js.native
  trait Observer[T] extends js.Object {
    @JSName("complete")
    var complete_Original: CompleteFn = js.native
    @JSName("error")
    var error_Original: ErrorFn = js.native
    @JSName("next")
    var next_Original: NextFn[T] = js.native
    def complete(): Unit = js.native
    def error(error: Error): Unit = js.native
    def next(value: T): Unit = js.native
  }
  
  @js.native
  trait Subscribe[T] extends js.Object {
    def apply(): Unsubscribe = js.native
    def apply(next: NextFn[T]): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def apply(observer: PartialObserver[T]): Unsubscribe = js.native
  }
  
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: ErrorFn): js.Function = js.native
  def createSubscribe[T](executor: Executor[T]): Subscribe[T] = js.native
  def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = js.native
  type CompleteFn = js.Function0[Unit]
  type ErrorFn = js.Function1[/* error */ Error, Unit]
  type Executor[T] = js.Function1[/* observer */ Observer[T], Unit]
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  type PartialObserver[T] = Partial[Observer[T]]
  type Unsubscribe = js.Function0[Unit]
}

