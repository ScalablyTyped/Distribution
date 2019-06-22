package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ApplyMod.Apply2[F] {
  def of[L, A](a: A): fpDashTsLib.es6HKTMod.Kind2[F, L, A]
}

object Applicative2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Applicative2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative2[F]]
  }
}

