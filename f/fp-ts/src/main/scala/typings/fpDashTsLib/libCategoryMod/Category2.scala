package typings
package fpDashTsLib.libCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libSemigroupoidMod.Semigroupoid2[F] {
  def id[A](): fpDashTsLib.libHKTMod.Kind2[F, A, A]
}

object Category2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    compose: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    id: () => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
  ): Category2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category2[F]]
  }
}

