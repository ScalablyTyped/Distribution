package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex4[F /* <: fpDashTsLib.libHKTMod.URIS4 */, I]
  extends fpDashTsLib.libFunctorMod.Functor4[F] {
  def mapWithIndex[X, U, L, A, B](fa: fpDashTsLib.libHKTMod.Type4[F, X, U, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Type4[F, X, U, L, B]
}

object FunctorWithIndex4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */, I](
    URI: F,
    map: (fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    mapWithIndex: (fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function2[/* i */ I, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
  ): FunctorWithIndex4[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
  
    __obj.asInstanceOf[FunctorWithIndex4[F, I]]
  }
}

