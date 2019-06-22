package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def mapWithIndex[U, L, A, B](fa: fpDashTsLib.libHKTMod.Kind3[F, U, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Kind3[F, U, L, B]
}

object FunctorWithIndex3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I](
    URI: F,
    map: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    mapWithIndex: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): FunctorWithIndex3[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex3[F, I]]
  }
}

