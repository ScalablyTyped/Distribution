package typings
package fpDashTsLib.es6ChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain[F]
  extends fpDashTsLib.es6ApplyMod.Apply[F] {
  def chain[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, A], f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, B]]): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object Chain {
  @scala.inline
  def apply[F](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.HKT[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    chain: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[F, js.Any]]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Chain[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Chain[F]]
  }
}

