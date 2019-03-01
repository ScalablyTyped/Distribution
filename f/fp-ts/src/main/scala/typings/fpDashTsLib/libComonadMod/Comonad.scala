package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad[F]
  extends fpDashTsLib.libExtendMod.Extend[F] {
  def extract[A](ca: fpDashTsLib.libHKTMod.HKT[F, A]): A
}

object Comonad {
  @scala.inline
  def apply[F](
    URI: F,
    extend: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    extract: js.Function1[fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): Comonad[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("extract")(extract)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Comonad[F]]
  }
}

