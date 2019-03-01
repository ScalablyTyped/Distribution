package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def mapWithIndex[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object FunctorWithIndex3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function2[/* i */ I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): FunctorWithIndex3[F, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("mapWithIndex")(mapWithIndex)
    __obj.asInstanceOf[FunctorWithIndex3[F, I]]
  }
}

