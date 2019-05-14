package typings
package fpDashTsLib.es6CategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6SemigroupoidMod.Semigroupoid2[F] {
  def id[A](): fpDashTsLib.es6HKTMod.Type2[F, A, A]
}

object Category2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    id: () => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any]
  ): Category2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category2[F]]
  }
}

