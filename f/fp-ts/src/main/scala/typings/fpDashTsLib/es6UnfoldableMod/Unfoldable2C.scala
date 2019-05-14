package typings
package fpDashTsLib.es6UnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def unfoldr[A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.es6OptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.es6HKTMod.Type2[F, L, A]
}

object Unfoldable2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    unfoldr: (js.Any, js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Tuple2[js.Any, js.Any]]]) => fpDashTsLib.es6HKTMod.Type2[F, L, js.Any]
  ): Unfoldable2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], unfoldr = js.Any.fromFunction2(unfoldr))
  
    __obj.asInstanceOf[Unfoldable2C[F, L]]
  }
}

