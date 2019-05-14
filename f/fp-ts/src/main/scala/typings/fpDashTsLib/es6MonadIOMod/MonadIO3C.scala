package typings
package fpDashTsLib.es6MonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO3C[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6MonadMod.Monad3C[M, U, L] {
  def fromIO[A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6HKTMod.Type3[M, U, L, A]
}

object MonadIO3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    URI: M,
    _L: L,
    _U: U,
    ap: (fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any]]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any],
    fromIO: fpDashTsLib.es6IOMod.IO[js.Any] => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type3[M, U, L, js.Any]
  ): MonadIO3C[M, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO3C[M, U, L]]
  }
}

