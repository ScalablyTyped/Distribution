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
    compose: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    id: () => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Category3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category3[F]]
  }
}

