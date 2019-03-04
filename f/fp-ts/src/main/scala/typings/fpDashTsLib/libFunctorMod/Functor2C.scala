package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def map[A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object Functor2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ]
  ): Functor2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], map = map)
  
    __obj.asInstanceOf[Functor2C[F, L]]
  }
}

