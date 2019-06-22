package typings
package fpDashTsLib.es6MonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO2C[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, L]
  extends fpDashTsLib.es6MonadMod.Monad2C[M, L] {
  def fromIO[A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6HKTMod.Kind2[M, L, A]
}

object MonadIO2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: M,
    _L: L,
    ap: (fpDashTsLib.es6HKTMod.Kind2[M, L, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any]]) => fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any],
    fromIO: fpDashTsLib.es6IOMod.IO[js.Any] => fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind2[M, L, js.Any]
  ): MonadIO2C[M, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO2C[M, L]]
  }
}

