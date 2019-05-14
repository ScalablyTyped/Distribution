package typings
package fpDashTsLib.es6ChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ApplyMod.Apply1[F] {
  def chain[A, B](fa: fpDashTsLib.es6HKTMod.Type[F, A], f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Type[F, B]]): fpDashTsLib.es6HKTMod.Type[F, B]
}

object Chain1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.Type[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type[F, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type[F, js.Any]]) => fpDashTsLib.es6HKTMod.Type[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, js.Any]
  ): Chain1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain1[F]]
  }
}

