package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex1[F /* <: fpDashTsLib.libHKTMod.URIS */, I]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def mapWithIndex[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Type[F, B]
}

object FunctorWithIndex1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, I](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function2[/* i */ I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ]
  ): FunctorWithIndex1[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndex1[F, I]]
  }
}

