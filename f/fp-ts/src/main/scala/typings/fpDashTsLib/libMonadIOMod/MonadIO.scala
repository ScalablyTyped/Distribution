package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO[M]
  extends fpDashTsLib.libMonadMod.Monad[M] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.HKT[M, A]
}

object MonadIO {
  @scala.inline
  def apply[M](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.HKT[M, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.HKT[M, js.Any]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    chain: (fpDashTsLib.libHKTMod.HKT[M, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    fromIO: fpDashTsLib.libIOMod.IO[js.Any] => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.HKT[M, js.Any]
  ): MonadIO[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO[M]]
  }
}

