package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libMonadMod.Monad1[M] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Kind[M, A]
}

object MonadIO1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Kind[M, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind[M, js.Any]) => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind[M, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Any]]) => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    fromIO: fpDashTsLib.libIOMod.IO[js.Any] => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind[M, js.Any]
  ): MonadIO1[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[MonadIO1[M]]
  }
}

