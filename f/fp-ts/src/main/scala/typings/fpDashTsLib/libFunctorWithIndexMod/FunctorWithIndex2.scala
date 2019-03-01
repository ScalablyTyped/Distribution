package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def mapWithIndex[L, A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

object FunctorWithIndex2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ]
  ): FunctorWithIndex2[F, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("mapWithIndex")(mapWithIndex)
    __obj.asInstanceOf[FunctorWithIndex2[F, I]]
  }
}

