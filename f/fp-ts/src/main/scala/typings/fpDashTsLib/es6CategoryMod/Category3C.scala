package typings
package fpDashTsLib.es6CategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category3C[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U]
  extends fpDashTsLib.es6SemigroupoidMod.Semigroupoid3C[F, U] {
  def id[A](): fpDashTsLib.es6HKTMod.Type3[F, U, A, A]
}

object Category3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */, U](
    URI: F,
    _U: U,
    compose: (fpDashTsLib.es6HKTMod.Type3[F, U, js.Any, js.Any], fpDashTsLib.es6HKTMod.Type3[F, U, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, U, js.Any, js.Any],
    id: () => fpDashTsLib.es6HKTMod.Type3[F, U, js.Any, js.Any]
  ): Category3C[F, U] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category3C[F, U]]
  }
}

