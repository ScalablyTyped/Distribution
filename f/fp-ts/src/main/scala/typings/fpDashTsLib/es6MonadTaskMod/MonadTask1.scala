package typings
package fpDashTsLib.es6MonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask1[M /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6MonadMod.Monad1[M] {
  def fromTask[A](fa: fpDashTsLib.es6TaskMod.Task[A]): fpDashTsLib.es6HKTMod.Kind[M, A]
}

object MonadTask1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.Kind[M, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind[M, js.Any]) => fpDashTsLib.es6HKTMod.Kind[M, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind[M, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind[M, js.Any]]) => fpDashTsLib.es6HKTMod.Kind[M, js.Any],
    fromTask: fpDashTsLib.es6TaskMod.Task[js.Any] => fpDashTsLib.es6HKTMod.Kind[M, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[M, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind[M, js.Any]
  ): MonadTask1[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadTask1[M]]
  }
}

