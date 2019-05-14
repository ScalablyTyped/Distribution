package typings
package fpDashTsLib.es6CategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6SemigroupoidMod.Semigroupoid3[F] {
  def id[U, A](): fpDashTsLib.es6HKTMod.Type3[F, U, A, A]
}

object Category3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any],
    id: () => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Category3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category3[F]]
  }
}

