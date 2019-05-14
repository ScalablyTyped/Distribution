package typings
package fpDashTsLib.es6MonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask[M]
  extends fpDashTsLib.es6MonadMod.Monad[M] {
  def fromTask[A](fa: fpDashTsLib.es6TaskMod.Task[A]): fpDashTsLib.es6HKTMod.HKT[M, A]
}

object MonadTask {
  @scala.inline
  def apply[M](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.HKT[M, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[M, js.Any]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    chain: (fpDashTsLib.es6HKTMod.HKT[M, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[M, js.Any]]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    fromTask: fpDashTsLib.es6TaskMod.Task[js.Any] => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.HKT[M, js.Any]
  ): MonadTask[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadTask[M]]
  }
}

