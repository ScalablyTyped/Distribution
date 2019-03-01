package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorComposition[F, G] extends js.Object {
  def map[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, B]]
}

object FunctorComposition {
  @scala.inline
  def apply[F, G](
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]]
    ]
  ): FunctorComposition[F, G] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[FunctorComposition[F, G]]
  }
}

