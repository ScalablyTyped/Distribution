package typings.firebaseDatabase.anon

import typings.firebaseDatabase.referenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOnfulfilledOnrejected extends js.Object {
  def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Reference, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Reference, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
}

