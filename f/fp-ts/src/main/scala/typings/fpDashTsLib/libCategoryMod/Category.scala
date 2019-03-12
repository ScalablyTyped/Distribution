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
    compose: (fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any],
    id: () => fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
  ): Category[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category[F]]
  }
}

