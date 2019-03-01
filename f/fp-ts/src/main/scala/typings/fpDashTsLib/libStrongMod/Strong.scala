package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong[F]
  extends fpDashTsLib.libProfunctorMod.Profunctor[F] {
  def first[A, B, C](pab: fpDashTsLib.libHKTMod.HKT2[F, A, B]): fpDashTsLib.libHKTMod.HKT2[F, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[A, B, C](pab: fpDashTsLib.libHKTMod.HKT2[F, B, C]): fpDashTsLib.libHKTMod.HKT2[F, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong {
  @scala.inline
  def apply[F](
    URI: F,
    first: js.Function1[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ],
    promap: js.Function3[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ],
    second: js.Function1[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ]
  ): Strong[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("promap")(promap)
    __obj.updateDynamic("second")(second)
    __obj.asInstanceOf[Strong[F]]
  }
}

