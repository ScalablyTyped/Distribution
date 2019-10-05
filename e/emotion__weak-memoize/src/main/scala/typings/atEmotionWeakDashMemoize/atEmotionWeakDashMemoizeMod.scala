package typings.atEmotionWeakDashMemoize

import typings.atEmotionWeakDashMemoize.atEmotionWeakDashMemoizeMod.UnaryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/weak-memoize", JSImport.Namespace)
@js.native
object atEmotionWeakDashMemoizeMod extends js.Object {
  def default[Arg /* <: js.Object */, Return](func: UnaryFn[Arg, Return]): UnaryFn[Arg, Return] = js.native
  type UnaryFn[Arg, Return] = js.Function1[/* arg */ Arg, Return]
}

