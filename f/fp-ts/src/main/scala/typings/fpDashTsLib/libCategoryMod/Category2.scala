package typings
package fpDashTsLib.libCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libSemigroupoidMod.Semigroupoid2[F] {
  def id[A](): fpDashTsLib.libHKTMod.Type2[F, A, A]
}

object Category2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    compose: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    id: js.Function0[fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]]
  ): Category2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = compose, id = id)
  
    __obj.asInstanceOf[Category2[F]]
  }
}

