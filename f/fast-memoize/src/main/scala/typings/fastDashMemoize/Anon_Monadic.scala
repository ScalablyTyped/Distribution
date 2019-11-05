package typings.fastDashMemoize

import typings.fastDashMemoize.fastDashMemoizeMod.Func
import typings.fastDashMemoize.fastDashMemoizeMod.MemoizeFunc
import typings.fastDashMemoize.fastDashMemoizeMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Monadic extends js.Object {
  @JSName("monadic")
  var monadic_Original: MemoizeFunc = js.native
  @JSName("variadic")
  var variadic_Original: MemoizeFunc = js.native
  def monadic[F /* <: Func */](fn: F): F = js.native
  def monadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
  def variadic[F /* <: Func */](fn: F): F = js.native
  def variadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
}

