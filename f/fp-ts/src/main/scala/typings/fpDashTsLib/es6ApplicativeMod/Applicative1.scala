package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ApplyMod.Apply1[F] {
  def of[A](a: A): fpDashTsLib.es6HKTMod.Type[F, A]
}

object Applicative1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Type[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type[F, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type[F, js.Any]
  ): Applicative1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative1[F]]
  }
}

