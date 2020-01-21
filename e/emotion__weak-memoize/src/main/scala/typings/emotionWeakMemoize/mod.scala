package typings.emotionWeakMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/weak-memoize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[Arg /* <: js.Object */, Return](func: UnaryFn[Arg, Return]): UnaryFn[Arg, Return] = js.native
  type UnaryFn[Arg, Return] = js.Function1[/* arg */ Arg, Return]
}

