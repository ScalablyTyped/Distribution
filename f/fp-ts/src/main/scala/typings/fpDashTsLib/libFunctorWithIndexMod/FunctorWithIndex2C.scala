package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def mapWithIndex[A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object FunctorWithIndex2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L](
    URI: F,
    _L: L,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function2[/* i */ I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ]
  ): FunctorWithIndex2C[F, I, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("mapWithIndex")(mapWithIndex)
    __obj.asInstanceOf[FunctorWithIndex2C[F, I, L]]
  }
}

