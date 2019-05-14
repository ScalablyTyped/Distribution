package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  val URI: F
  def map[A, B](fa: fpDashTsLib.es6HKTMod.Type[F, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.es6HKTMod.Type[F, B]
}

object Functor1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    map: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any]
  ): Functor1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Functor1[F]]
  }
}

