package typings
package fpDashTsLib.es6CategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category[F]
  extends fpDashTsLib.es6SemigroupoidMod.Semigroupoid[F] {
  def id[A](): fpDashTsLib.es6HKTMod.HKT2[F, A, A]
}

object Category {
  @scala.inline
  def apply[F](
    URI: F,
    compose: (fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any], fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any],
    id: () => fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any]
  ): Category[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = js.Any.fromFunction0(id))
  
    __obj.asInstanceOf[Category[F]]
  }
}

