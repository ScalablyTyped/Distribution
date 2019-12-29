package typings.atEmotionMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/memoize", JSImport.Namespace)
@js.native
object atEmotionMemoizeMod extends js.Object {
  def default[T](fn: Fn[T]): Fn[T] = js.native
  type Fn[T] = js.Function1[/* key */ String, T]
}

