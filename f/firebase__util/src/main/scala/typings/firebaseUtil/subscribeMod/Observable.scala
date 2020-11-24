package typings.firebaseUtil.subscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable[T] extends js.Object {
  
  def subscribe(): Unsubscribe = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: CompleteFn): Unsubscribe = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: ErrorFn): Unsubscribe = js.native
  def subscribe(next: js.UndefOr[scala.Nothing], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
  def subscribe(next: NextFn[T]): Unsubscribe = js.native
  def subscribe(next: NextFn[T], error: js.UndefOr[scala.Nothing], complete: CompleteFn): Unsubscribe = js.native
  def subscribe(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
  def subscribe(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
  def subscribe(observer: PartialObserver[T]): Unsubscribe = js.native
  @JSName("subscribe")
  var subscribe_Original: Subscribe[T] = js.native
}
