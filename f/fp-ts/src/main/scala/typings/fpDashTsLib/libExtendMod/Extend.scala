package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def extend[A, B](ea: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], B]): fpDashTsLib.libHKTMod.HKT[F, B]
}

object Extend {
  @scala.inline
  def apply[F](
    URI: F,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): Extend[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Extend[F]]
  }
}

