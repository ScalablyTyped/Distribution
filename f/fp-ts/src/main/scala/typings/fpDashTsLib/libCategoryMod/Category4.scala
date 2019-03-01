package typings
package fpDashTsLib.libCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libSemigroupoidMod.Semigroupoid4[F] {
  def id[X, U, A](): fpDashTsLib.libHKTMod.Type4[F, X, U, A, A]
}

object Category4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    compose: js.Function2[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    id: js.Function0[fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]]
  ): Category4[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compose")(compose)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Category4[F]]
  }
}

