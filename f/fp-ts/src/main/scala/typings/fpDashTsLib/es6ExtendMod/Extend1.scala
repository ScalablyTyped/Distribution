package typings
package fpDashTsLib.es6ExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FunctorMod.Functor1[F] {
  def extend[A, B](
    ea: fpDashTsLib.es6HKTMod.Kind[F, A],
    f: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, A], B]
  ): fpDashTsLib.es6HKTMod.Kind[F, B]
}

object Extend1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    extend: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Extend1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend1[F]]
  }
}

