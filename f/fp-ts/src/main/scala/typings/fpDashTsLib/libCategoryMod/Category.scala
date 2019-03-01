package typings
package fpDashTsLib.libCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category[F]
  extends fpDashTsLib.libSemigroupoidMod.Semigroupoid[F] {
  def id[A](): fpDashTsLib.libHKTMod.HKT2[F, A, A]
}

object Category {
  @scala.inline
  def apply[F](
    URI: F,
    compose: js.Function2[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ],
    id: js.Function0[fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]]
  ): Category[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compose")(compose)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Category[F]]
  }
}

