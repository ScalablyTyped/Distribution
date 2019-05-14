package typings
package fpDashTsLib.es6MonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO[M]
  extends fpDashTsLib.es6MonadMod.Monad[M] {
  def fromIO[A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6HKTMod.HKT[M, A]
}

object MonadIO {
  @scala.inline
  def apply[M](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.HKT[M, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[M, js.Any]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    chain: (fpDashTsLib.es6HKTMod.HKT[M, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[M, js.Any]]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    fromIO: fpDashTsLib.es6IOMod.IO[js.Any] => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.HKT[M, js.Any]
  ): MonadIO[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO[M]]
  }
}

