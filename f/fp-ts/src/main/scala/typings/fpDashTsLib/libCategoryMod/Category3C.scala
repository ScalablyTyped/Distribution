package typings
package fpDashTsLib.libCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U]
  extends fpDashTsLib.libSemigroupoidMod.Semigroupoid3C[F, U] {
  def id[A](): fpDashTsLib.libHKTMod.Type3[F, U, A, A]
}

object Category3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U](
    URI: F,
    _U: U,
    compose: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, js.Any, js.Any]
    ],
    id: js.Function0[fpDashTsLib.libHKTMod.Type3[F, U, js.Any, js.Any]]
  ): Category3C[F, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_U")(_U.asInstanceOf[js.Any])
    __obj.updateDynamic("compose")(compose)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Category3C[F, U]]
  }
}

