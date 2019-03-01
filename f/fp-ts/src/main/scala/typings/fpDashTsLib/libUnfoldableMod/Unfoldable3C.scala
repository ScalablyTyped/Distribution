package typings
package fpDashTsLib.libUnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def unfoldr[A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.libOptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Unfoldable3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    unfoldr: js.Function2[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Tuple2[js.Any, js.Any]]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ]
  ): Unfoldable3C[F, U, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("_U")(_U.asInstanceOf[js.Any])
    __obj.updateDynamic("unfoldr")(unfoldr)
    __obj.asInstanceOf[Unfoldable3C[F, U, L]]
  }
}

