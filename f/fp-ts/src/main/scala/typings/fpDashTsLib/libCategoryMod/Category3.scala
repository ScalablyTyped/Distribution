package typings
package fpDashTsLib.libCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libSemigroupoidMod.Semigroupoid3[F] {
  def id[U, A](): fpDashTsLib.libHKTMod.Type3[F, U, A, A]
}

object Category3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    compose: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    id: js.Function0[fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]]
  ): Category3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compose")(compose)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Category3[F]]
  }
}

