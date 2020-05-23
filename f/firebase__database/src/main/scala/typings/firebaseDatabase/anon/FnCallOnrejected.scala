package typings.firebaseDatabase.anon

import typings.firebaseDatabase.referenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOnrejected extends js.Object {
  def apply[TResult](): js.Promise[Reference | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Reference | TResult] = js.native
}

