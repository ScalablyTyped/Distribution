package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L] extends js.Object {
  val URI: F
  val _L: L
  val _U: U
  def contramap[A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object Contravariant3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    URI: F,
    _L: L,
    _U: U,
    contramap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ]
  ): Contravariant3C[F, U, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("_U")(_U.asInstanceOf[js.Any])
    __obj.updateDynamic("contramap")(contramap)
    __obj.asInstanceOf[Contravariant3C[F, U, L]]
  }
}

