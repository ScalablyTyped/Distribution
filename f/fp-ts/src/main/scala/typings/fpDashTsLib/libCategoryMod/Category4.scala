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
    compose: (fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    id: () => fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
  ): Category4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category4[F]]
  }
}

