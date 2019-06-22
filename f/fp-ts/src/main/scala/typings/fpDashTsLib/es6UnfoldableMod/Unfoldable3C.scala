package typings
package fpDashTsLib.es6UnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def unfoldr[A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.es6OptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]
}

object Unfoldable3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    unfoldr: (js.Any, js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Tuple2[js.Any, js.Any]]]) => fpDashTsLib.es6HKTMod.Kind3[F, U, L, js.Any]
  ): Unfoldable3C[F, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], unfoldr = js.Any.fromFunction2(unfoldr))
  
    __obj.asInstanceOf[Unfoldable3C[F, U, L]]
  }
}

