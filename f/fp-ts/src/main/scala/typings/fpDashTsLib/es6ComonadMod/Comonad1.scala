package typings
package fpDashTsLib.es6ComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ExtendMod.Extend1[F] {
  def extract[A](ca: fpDashTsLib.es6HKTMod.Kind[F, A]): A
}

object Comonad1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    extend: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    extract: fpDashTsLib.es6HKTMod.Kind[F, js.Any] => js.Any,
    map: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Comonad1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad1[F]]
  }
}

