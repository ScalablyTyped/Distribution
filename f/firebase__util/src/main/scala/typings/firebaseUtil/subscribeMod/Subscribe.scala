package typings.firebaseUtil.subscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe[T] extends js.Object {
  def apply(): Unsubscribe = js.native
  def apply(next: NextFn[T]): Unsubscribe = js.native
  def apply(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
  def apply(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
  def apply(observer: PartialObserver[T]): Unsubscribe = js.native
}

