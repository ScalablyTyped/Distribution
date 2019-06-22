package typings
package fpDashTsLib.es6MonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO3[M /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6MonadMod.Monad3[M] {
  def fromIO[U, L, A](fa: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6HKTMod.Kind3[M, U, L, A]
}

object MonadIO3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    fromIO: fpDashTsLib.es6IOMod.IO[js.Any] => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]
  ): MonadIO3[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO3[M]]
  }
}

