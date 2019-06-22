package typings
package fpDashTsLib.es6CategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6SemigroupoidMod.Semigroupoid4[F] {
  def id[X, U, A](): fpDashTsLib.es6HKTMod.Kind4[F, X, U, A, A]
}

object Category4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any],
    id: () => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Category4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category4[F]]
  }
}

