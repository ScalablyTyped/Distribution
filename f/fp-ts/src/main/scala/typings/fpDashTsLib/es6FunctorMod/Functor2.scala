package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  val URI: F
  def map[L, A, B](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.es6HKTMod.Kind2[F, L, B]
}

object Functor2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Functor2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Functor2[F]]
  }
}

