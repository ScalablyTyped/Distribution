package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex[F, I]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def mapWithIndex[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.HKT[F, B]
}

object FunctorWithIndex {
  @scala.inline
  def apply[F, I](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function2[/* i */ I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): FunctorWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndex[F, I]]
  }
}

