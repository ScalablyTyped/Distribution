package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad[F]
  extends fpDashTsLib.libExtendMod.Extend[F] {
  def extract[A](ca: fpDashTsLib.libHKTMod.HKT[F, A]): A
}

object Comonad {
  @scala.inline
  def apply[F](
    URI: F,
    extend: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    extract: fpDashTsLib.libHKTMod.HKT[F, js.Any] => js.Any,
    map: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any]
  ): Comonad[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad[F]]
  }
}

