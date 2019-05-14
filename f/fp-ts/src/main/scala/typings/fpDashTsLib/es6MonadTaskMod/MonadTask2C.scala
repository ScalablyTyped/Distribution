package typings
package fpDashTsLib.es6MonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask2C[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6MonadMod.Monad2C[M, L] {
  def fromTask[A](fa: fpDashTsLib.es6TaskMod.Task[A]): fpDashTsLib.es6HKTMod.Type2[M, L, A]
}

object MonadTask2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: M,
    _L: L,
    ap: (fpDashTsLib.es6HKTMod.Type2[M, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type2[M, L, js.Any]) => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type2[M, L, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type2[M, L, js.Any]]) => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any],
    fromTask: fpDashTsLib.es6TaskMod.Task[js.Any] => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type2[M, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[M, L, js.Any]
  ): MonadTask2C[M, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadTask2C[M, L]]
  }
}

