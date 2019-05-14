package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def map[U, L, A, B](fa: fpDashTsLib.es6HKTMod.Type3[F, U, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.es6HKTMod.Type3[F, U, L, B]
}

object Functor3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Functor3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Functor3[F]]
  }
}

